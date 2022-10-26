package com.evellyn.lottery.stubs.player;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: player-service/player.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PlayerServiceGrpc {

  private PlayerServiceGrpc() {}

  public static final String SERVICE_NAME = "com.evellyn.lottery.stubs.player.PlayerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.evellyn.lottery.stubs.player.PlayerRequest,
      com.evellyn.lottery.stubs.player.PlayerResponse> getGetPlayerDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPlayerDetails",
      requestType = com.evellyn.lottery.stubs.player.PlayerRequest.class,
      responseType = com.evellyn.lottery.stubs.player.PlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.evellyn.lottery.stubs.player.PlayerRequest,
      com.evellyn.lottery.stubs.player.PlayerResponse> getGetPlayerDetailsMethod() {
    io.grpc.MethodDescriptor<com.evellyn.lottery.stubs.player.PlayerRequest, com.evellyn.lottery.stubs.player.PlayerResponse> getGetPlayerDetailsMethod;
    if ((getGetPlayerDetailsMethod = PlayerServiceGrpc.getGetPlayerDetailsMethod) == null) {
      synchronized (PlayerServiceGrpc.class) {
        if ((getGetPlayerDetailsMethod = PlayerServiceGrpc.getGetPlayerDetailsMethod) == null) {
          PlayerServiceGrpc.getGetPlayerDetailsMethod = getGetPlayerDetailsMethod =
              io.grpc.MethodDescriptor.<com.evellyn.lottery.stubs.player.PlayerRequest, com.evellyn.lottery.stubs.player.PlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPlayerDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evellyn.lottery.stubs.player.PlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evellyn.lottery.stubs.player.PlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerServiceMethodDescriptorSupplier("getPlayerDetails"))
              .build();
        }
      }
    }
    return getGetPlayerDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.evellyn.lottery.stubs.file.FileUploadRequest,
      com.evellyn.lottery.stubs.file.FileUploadResponse> getUploadPhotoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uploadPhoto",
      requestType = com.evellyn.lottery.stubs.file.FileUploadRequest.class,
      responseType = com.evellyn.lottery.stubs.file.FileUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.evellyn.lottery.stubs.file.FileUploadRequest,
      com.evellyn.lottery.stubs.file.FileUploadResponse> getUploadPhotoMethod() {
    io.grpc.MethodDescriptor<com.evellyn.lottery.stubs.file.FileUploadRequest, com.evellyn.lottery.stubs.file.FileUploadResponse> getUploadPhotoMethod;
    if ((getUploadPhotoMethod = PlayerServiceGrpc.getUploadPhotoMethod) == null) {
      synchronized (PlayerServiceGrpc.class) {
        if ((getUploadPhotoMethod = PlayerServiceGrpc.getUploadPhotoMethod) == null) {
          PlayerServiceGrpc.getUploadPhotoMethod = getUploadPhotoMethod =
              io.grpc.MethodDescriptor.<com.evellyn.lottery.stubs.file.FileUploadRequest, com.evellyn.lottery.stubs.file.FileUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "uploadPhoto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evellyn.lottery.stubs.file.FileUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.evellyn.lottery.stubs.file.FileUploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerServiceMethodDescriptorSupplier("uploadPhoto"))
              .build();
        }
      }
    }
    return getUploadPhotoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlayerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerServiceStub>() {
        @java.lang.Override
        public PlayerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerServiceStub(channel, callOptions);
        }
      };
    return PlayerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlayerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerServiceBlockingStub>() {
        @java.lang.Override
        public PlayerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerServiceBlockingStub(channel, callOptions);
        }
      };
    return PlayerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlayerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlayerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlayerServiceFutureStub>() {
        @java.lang.Override
        public PlayerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlayerServiceFutureStub(channel, callOptions);
        }
      };
    return PlayerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PlayerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPlayerDetails(com.evellyn.lottery.stubs.player.PlayerRequest request,
        io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.player.PlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayerDetailsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.file.FileUploadRequest> uploadPhoto(
        io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.file.FileUploadResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadPhotoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPlayerDetailsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.evellyn.lottery.stubs.player.PlayerRequest,
                com.evellyn.lottery.stubs.player.PlayerResponse>(
                  this, METHODID_GET_PLAYER_DETAILS)))
          .addMethod(
            getUploadPhotoMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.evellyn.lottery.stubs.file.FileUploadRequest,
                com.evellyn.lottery.stubs.file.FileUploadResponse>(
                  this, METHODID_UPLOAD_PHOTO)))
          .build();
    }
  }

  /**
   */
  public static final class PlayerServiceStub extends io.grpc.stub.AbstractAsyncStub<PlayerServiceStub> {
    private PlayerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPlayerDetails(com.evellyn.lottery.stubs.player.PlayerRequest request,
        io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.player.PlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayerDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.file.FileUploadRequest> uploadPhoto(
        io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.file.FileUploadResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadPhotoMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class PlayerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PlayerServiceBlockingStub> {
    private PlayerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.evellyn.lottery.stubs.player.PlayerResponse getPlayerDetails(com.evellyn.lottery.stubs.player.PlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayerDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PlayerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PlayerServiceFutureStub> {
    private PlayerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlayerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.evellyn.lottery.stubs.player.PlayerResponse> getPlayerDetails(
        com.evellyn.lottery.stubs.player.PlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayerDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PLAYER_DETAILS = 0;
  private static final int METHODID_UPLOAD_PHOTO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PlayerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PlayerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PLAYER_DETAILS:
          serviceImpl.getPlayerDetails((com.evellyn.lottery.stubs.player.PlayerRequest) request,
              (io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.player.PlayerResponse>) responseObserver);
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
        case METHODID_UPLOAD_PHOTO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadPhoto(
              (io.grpc.stub.StreamObserver<com.evellyn.lottery.stubs.file.FileUploadResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PlayerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlayerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.evellyn.lottery.stubs.player.Player.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PlayerService");
    }
  }

  private static final class PlayerServiceFileDescriptorSupplier
      extends PlayerServiceBaseDescriptorSupplier {
    PlayerServiceFileDescriptorSupplier() {}
  }

  private static final class PlayerServiceMethodDescriptorSupplier
      extends PlayerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PlayerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PlayerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlayerServiceFileDescriptorSupplier())
              .addMethod(getGetPlayerDetailsMethod())
              .addMethod(getUploadPhotoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
