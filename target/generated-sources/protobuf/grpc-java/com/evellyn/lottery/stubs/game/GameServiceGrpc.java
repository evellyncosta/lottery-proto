package com.evellyn.lottery.stubs.game;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.1)",
    comments = "Source: game-management-service/game.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GameServiceGrpc {

  private GameServiceGrpc() {}

  public static final String SERVICE_NAME = "com.evellyn.lottery.stubs.game.GameService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.evellyn.lottery.stubs.game.GameRequest,
      com.evellyn.lottery.stubs.game.GameResponse> getGetGamesByPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getGamesByPlayer",
      requestType = com.evellyn.lottery.stubs.game.GameRequest.class,
      responseType = com.evellyn.lottery.stubs.game.GameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evellyn.lottery.stubs.game.GameRequest,
      com.evellyn.lottery.stubs.game.GameResponse> getGetGamesByPlayerMethod() {
    io.grpc.MethodDescriptor<com.evellyn.lottery.stubs.game.GameRequest, com.evellyn.lottery.stubs.game.GameResponse> getGetGamesByPlayerMethod;
    if ((getGetGamesByPlayerMethod = GameServiceGrpc.getGetGamesByPlayerMethod) == null) {
      synchronized (GameServiceGrpc.class) {
        if ((getGetGamesByPlayerMethod = GameServiceGrpc.getGetGamesByPlayerMethod) == null) {
          GameServiceGrpc.getGetGamesByPlayerMethod = getGetGamesByPlayerMethod =
              io.grpc.MethodDescriptor.<com.evellyn.lottery.stubs.game.GameRequest, com.evellyn.lottery.stubs.game.GameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getGamesByPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evellyn.lottery.stubs.game.GameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evellyn.lottery.stubs.game.GameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GameServiceMethodDescriptorSupplier("getGamesByPlayer"))
              .build();
        }
      }
    }
    return getGetGamesByPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.evellyn.lottery.stubs.game.DrawNumbersResponse> getDrawNumbersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "drawNumbers",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.evellyn.lottery.stubs.game.DrawNumbersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.evellyn.lottery.stubs.game.DrawNumbersResponse> getDrawNumbersMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.evellyn.lottery.stubs.game.DrawNumbersResponse> getDrawNumbersMethod;
    if ((getDrawNumbersMethod = GameServiceGrpc.getDrawNumbersMethod) == null) {
      synchronized (GameServiceGrpc.class) {
        if ((getDrawNumbersMethod = GameServiceGrpc.getDrawNumbersMethod) == null) {
          GameServiceGrpc.getDrawNumbersMethod = getDrawNumbersMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.evellyn.lottery.stubs.game.DrawNumbersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "drawNumbers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evellyn.lottery.stubs.game.DrawNumbersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GameServiceMethodDescriptorSupplier("drawNumbers"))
              .build();
        }
      }
    }
    return getDrawNumbersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evellyn.lottery.stubs.game.Bet,
      com.evellyn.lottery.stubs.game.Cupom> getDoBetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doBet",
      requestType = com.evellyn.lottery.stubs.game.Bet.class,
      responseType = com.evellyn.lottery.stubs.game.Cupom.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.evellyn.lottery.stubs.game.Bet,
      com.evellyn.lottery.stubs.game.Cupom> getDoBetMethod() {
    io.grpc.MethodDescriptor<com.evellyn.lottery.stubs.game.Bet, com.evellyn.lottery.stubs.game.Cupom> getDoBetMethod;
    if ((getDoBetMethod = GameServiceGrpc.getDoBetMethod) == null) {
      synchronized (GameServiceGrpc.class) {
        if ((getDoBetMethod = GameServiceGrpc.getDoBetMethod) == null) {
          GameServiceGrpc.getDoBetMethod = getDoBetMethod =
              io.grpc.MethodDescriptor.<com.evellyn.lottery.stubs.game.Bet, com.evellyn.lottery.stubs.game.Cupom>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doBet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evellyn.lottery.stubs.game.Bet.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evellyn.lottery.stubs.game.Cupom.getDefaultInstance()))
              .setSchemaDescriptor(new GameServiceMethodDescriptorSupplier("doBet"))
              .build();
        }
      }
    }
    return getDoBetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GameServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GameServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GameServiceStub>() {
        @java.lang.Override
        public GameServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GameServiceStub(channel, callOptions);
        }
      };
    return GameServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GameServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GameServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GameServiceBlockingStub>() {
        @java.lang.Override
        public GameServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GameServiceBlockingStub(channel, callOptions);
        }
      };
    return GameServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GameServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GameServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GameServiceFutureStub>() {
        @java.lang.Override
        public GameServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GameServiceFutureStub(channel, callOptions);
        }
      };
    return GameServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GameServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getGamesByPlayer(com.evellyn.lottery.stubs.game.GameRequest request,
        io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.game.GameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGamesByPlayerMethod(), responseObserver);
    }

    /**
     */
    public void drawNumbers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.game.DrawNumbersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDrawNumbersMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.game.Bet> doBet(
        io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.game.Cupom> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getDoBetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGamesByPlayerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.evellyn.lottery.stubs.game.GameRequest,
                com.evellyn.lottery.stubs.game.GameResponse>(
                  this, METHODID_GET_GAMES_BY_PLAYER)))
          .addMethod(
            getDrawNumbersMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.evellyn.lottery.stubs.game.DrawNumbersResponse>(
                  this, METHODID_DRAW_NUMBERS)))
          .addMethod(
            getDoBetMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.evellyn.lottery.stubs.game.Bet,
                com.evellyn.lottery.stubs.game.Cupom>(
                  this, METHODID_DO_BET)))
          .build();
    }
  }

  /**
   */
  public static final class GameServiceStub extends io.grpc.stub.AbstractAsyncStub<GameServiceStub> {
    private GameServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GameServiceStub(channel, callOptions);
    }

    /**
     */
    public void getGamesByPlayer(com.evellyn.lottery.stubs.game.GameRequest request,
        io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.game.GameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGamesByPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void drawNumbers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.game.DrawNumbersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getDrawNumbersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.game.Bet> doBet(
        io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.game.Cupom> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getDoBetMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GameServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GameServiceBlockingStub> {
    private GameServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GameServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.evellyn.lottery.stubs.game.GameResponse getGamesByPlayer(com.evellyn.lottery.stubs.game.GameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGamesByPlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.evellyn.lottery.stubs.game.DrawNumbersResponse> drawNumbers(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getDrawNumbersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GameServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GameServiceFutureStub> {
    private GameServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GameServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GameServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evellyn.lottery.stubs.game.GameResponse> getGamesByPlayer(
        com.evellyn.lottery.stubs.game.GameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGamesByPlayerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GAMES_BY_PLAYER = 0;
  private static final int METHODID_DRAW_NUMBERS = 1;
  private static final int METHODID_DO_BET = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GameServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GameServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GAMES_BY_PLAYER:
          serviceImpl.getGamesByPlayer((com.evellyn.lottery.stubs.game.GameRequest) request,
              (io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.game.GameResponse>) responseObserver);
          break;
        case METHODID_DRAW_NUMBERS:
          serviceImpl.drawNumbers((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.game.DrawNumbersResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DO_BET:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.doBet(
              (io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.game.Cupom>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GameServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.evellyn.lottery.stubs.game.GameOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GameService");
    }
  }

  private static final class GameServiceFileDescriptorSupplier
      extends GameServiceBaseDescriptorSupplier {
    GameServiceFileDescriptorSupplier() {}
  }

  private static final class GameServiceMethodDescriptorSupplier
      extends GameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GameServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GameServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GameServiceFileDescriptorSupplier())
              .addMethod(getGetGamesByPlayerMethod())
              .addMethod(getDrawNumbersMethod())
              .addMethod(getDoBetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
