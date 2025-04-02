package generated.grpc.smarttutor;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: Smarttutor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReviewContentServiceGrpc {

  private ReviewContentServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartTutor.ReviewContentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.smarttutor.RequestContent,
      generated.grpc.smarttutor.ContentReply> getReviewContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReviewContent",
      requestType = generated.grpc.smarttutor.RequestContent.class,
      responseType = generated.grpc.smarttutor.ContentReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.smarttutor.RequestContent,
      generated.grpc.smarttutor.ContentReply> getReviewContentMethod() {
    io.grpc.MethodDescriptor<generated.grpc.smarttutor.RequestContent, generated.grpc.smarttutor.ContentReply> getReviewContentMethod;
    if ((getReviewContentMethod = ReviewContentServiceGrpc.getReviewContentMethod) == null) {
      synchronized (ReviewContentServiceGrpc.class) {
        if ((getReviewContentMethod = ReviewContentServiceGrpc.getReviewContentMethod) == null) {
          ReviewContentServiceGrpc.getReviewContentMethod = getReviewContentMethod =
              io.grpc.MethodDescriptor.<generated.grpc.smarttutor.RequestContent, generated.grpc.smarttutor.ContentReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReviewContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.smarttutor.RequestContent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.smarttutor.ContentReply.getDefaultInstance()))
              .setSchemaDescriptor(new ReviewContentServiceMethodDescriptorSupplier("ReviewContent"))
              .build();
        }
      }
    }
    return getReviewContentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReviewContentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReviewContentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReviewContentServiceStub>() {
        @java.lang.Override
        public ReviewContentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReviewContentServiceStub(channel, callOptions);
        }
      };
    return ReviewContentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReviewContentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReviewContentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReviewContentServiceBlockingStub>() {
        @java.lang.Override
        public ReviewContentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReviewContentServiceBlockingStub(channel, callOptions);
        }
      };
    return ReviewContentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReviewContentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReviewContentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReviewContentServiceFutureStub>() {
        @java.lang.Override
        public ReviewContentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReviewContentServiceFutureStub(channel, callOptions);
        }
      };
    return ReviewContentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void reviewContent(generated.grpc.smarttutor.RequestContent request,
        io.grpc.stub.StreamObserver<generated.grpc.smarttutor.ContentReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReviewContentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ReviewContentService.
   */
  public static abstract class ReviewContentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ReviewContentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ReviewContentService.
   */
  public static final class ReviewContentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ReviewContentServiceStub> {
    private ReviewContentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReviewContentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReviewContentServiceStub(channel, callOptions);
    }

    /**
     */
    public void reviewContent(generated.grpc.smarttutor.RequestContent request,
        io.grpc.stub.StreamObserver<generated.grpc.smarttutor.ContentReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReviewContentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ReviewContentService.
   */
  public static final class ReviewContentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ReviewContentServiceBlockingStub> {
    private ReviewContentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReviewContentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReviewContentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<generated.grpc.smarttutor.ContentReply> reviewContent(
        generated.grpc.smarttutor.RequestContent request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReviewContentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ReviewContentService.
   */
  public static final class ReviewContentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ReviewContentServiceFutureStub> {
    private ReviewContentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReviewContentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReviewContentServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_REVIEW_CONTENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REVIEW_CONTENT:
          serviceImpl.reviewContent((generated.grpc.smarttutor.RequestContent) request,
              (io.grpc.stub.StreamObserver<generated.grpc.smarttutor.ContentReply>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getReviewContentMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              generated.grpc.smarttutor.RequestContent,
              generated.grpc.smarttutor.ContentReply>(
                service, METHODID_REVIEW_CONTENT)))
        .build();
  }

  private static abstract class ReviewContentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReviewContentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.smarttutor.Smarttutor.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReviewContentService");
    }
  }

  private static final class ReviewContentServiceFileDescriptorSupplier
      extends ReviewContentServiceBaseDescriptorSupplier {
    ReviewContentServiceFileDescriptorSupplier() {}
  }

  private static final class ReviewContentServiceMethodDescriptorSupplier
      extends ReviewContentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReviewContentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReviewContentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReviewContentServiceFileDescriptorSupplier())
              .addMethod(getReviewContentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
