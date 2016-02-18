package com.bludee;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;

public class DiscardServerHandler extends ChannelHandlerAdapter{
	@Override
	public void channelRead(ChannelHandlerContext ctx,Object msg)
	{
		System.out.println("a>"+System.currentTimeMillis()+">>>>>>>>>"+ctx.channel().id().toString());
		ctx.write(msg);
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) {
		ctx.flush();
		System.out.println("b1>"+System.currentTimeMillis());
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx,Throwable cause){
		cause.printStackTrace();
		ctx.close();
	}
}
