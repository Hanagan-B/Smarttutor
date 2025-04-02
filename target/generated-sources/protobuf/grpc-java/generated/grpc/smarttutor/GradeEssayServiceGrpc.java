package generated.grpc.smarttutor;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: Smarttutor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GradeEssayServiceGrpc {

  private GradeEssayServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartTutor.GradeEssayService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.smarttutor.Essay,
      generated.grpc.smarttutor.EssayGraded> getStudentEssayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StudentEssay",
      requestType = generated.grpc.smarttutor.Essay.class,
      responseType = generated.grpc.smarttutor.EssayGraded.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.smarttutor.Essay,
      generated.grpc.smarttutor.EssayGraded> getStudentEssayMethod() {
    io.grpc.MethodDescriptor<generated.grpc.smarttutor.Essay, generated.grpc.smarttutor.EssayGraded> getStudentEssayMethod;
    if ((getStudentEssayMethod = GradeEssayServiceGrpc.getStudentEssayMethod) == null) {
      synchronized (GradeEssayServiceGrpc.class) {
        if ((getStudentEssayMethod = GradeEssayServiceGrpc.getStudentEssayMethod) == null) {
          GradeEssayServiceGrpc.getStudentEssayMethod = getStudentEssayMethod =
              io.grpc.MethodDescriptor.<generated.grpc.smarttutor.Essay, generated.grpc.smarttutor.EssayGraded>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StudentEssay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.smarttutor.Essay.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.smarttutor.EssayGraded.getDefaultInstance()))
              .setSchemaDescriptor(new GradeEssayServiceMethodDescriptorSupplier("StudentEssay"))
              .build();
        }
      }
    }
    return getStudentEssayMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GradeEssayServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GradeEssayServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GradeEssayServiceStub>() {
        @java.lang.Override
        public GradeEssayServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GradeEssayServiceStub(channel, callOptions);
        }
      };
    return GradeEssayServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GradeEssayServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GradeEssayServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GradeEssayServiceBlockingStub>() {
        @java.lang.Override
        public GradeEssayServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GradeEssayServiceBlockingStub(channel, callOptions);
        }
      };
    return GradeEssayServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GradeEssayServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GradeEssayServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GradeEssayServiceFutureStub>() {
        @java.lang.Override
        public GradeEssayServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GradeEssayServiceFutureStub(channel, callOptions);
        }
      };
    return GradeEssayServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     *for stream of a big file
     *This service helps Students improve their writing abilities
     * </pre>
     */
    default io.grpc.stub.StreamObserver<generated.grpc.smarttutor.Essay> studentEssay(
        io.grpc.stub.StreamObserver<generated.grpc.smarttutor.EssayGraded> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStudentEssayMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GradeEssayService.
   */
  public static abstract class GradeEssayServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GradeEssayServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GradeEssayService.
   */
  public static final class GradeEssayServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GradeEssayServiceStub> {
    private GradeEssayServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GradeEssayServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GradeEssayServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *for stream of a big file
     *This service helps Students improve their writing abilities
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.smarttutor.Essay> studentEssay(
        io.grpc.stub.StreamObserver<generated.grpc.smarttutor.EssayGraded> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getStudentEssayMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GradeEssayService.
   */
  public static final class GradeEssayServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GradeEssayServiceBlockingStub> {
    private GradeEssayServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GradeEssayServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GradeEssayServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GradeEssayService.
   */
  public static final class GradeEssayServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GradeEssayServiceFutureStub> {
    private GradeEssayServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GradeEssayServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GradeEssayServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STUDENT_ESSAY = 0;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STUDENT_ESSAY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.studentEssay(
              (io.grpc.stub.StreamObserver<generated.grpc.smarttutor.EssayGraded>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getStudentEssayMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              generated.grpc.smarttutor.Essay,
              generated.grpc.smarttutor.EssayGraded>(
                service, METHODID_STUDENT_ESSAY)))
        .build();
  }

  private static abstract class GradeEssayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GradeEssayServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.smarttutor.Smarttutor.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GradeEssayService");
    }
  }

  private static final class GradeEssayServiceFileDescriptorSupplier
      extends GradeEssayServiceBaseDescriptorSupplier {
    GradeEssayServiceFileDescriptorSupplier() {}
  }

  private static final class GradeEssayServiceMethodDescriptorSupplier
      extends GradeEssayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GradeEssayServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GradeEssayServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GradeEssayServiceFileDescriptorSupplier())
              .addMethod(getStudentEssayMethod())
              .build();
        }
      }
    }
    return result;
  }
}
