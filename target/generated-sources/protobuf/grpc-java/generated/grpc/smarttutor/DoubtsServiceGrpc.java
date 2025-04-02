package generated.grpc.smarttutor;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * SmartTutor manages the.
 * 
 * The question service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: Smarttutor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DoubtsServiceGrpc {

  private DoubtsServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartTutor.DoubtsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.smarttutor.RequestQuestion,
      generated.grpc.smarttutor.SmartAnswer> getStudentQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StudentQuestion",
      requestType = generated.grpc.smarttutor.RequestQuestion.class,
      responseType = generated.grpc.smarttutor.SmartAnswer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.smarttutor.RequestQuestion,
      generated.grpc.smarttutor.SmartAnswer> getStudentQuestionMethod() {
    io.grpc.MethodDescriptor<generated.grpc.smarttutor.RequestQuestion, generated.grpc.smarttutor.SmartAnswer> getStudentQuestionMethod;
    if ((getStudentQuestionMethod = DoubtsServiceGrpc.getStudentQuestionMethod) == null) {
      synchronized (DoubtsServiceGrpc.class) {
        if ((getStudentQuestionMethod = DoubtsServiceGrpc.getStudentQuestionMethod) == null) {
          DoubtsServiceGrpc.getStudentQuestionMethod = getStudentQuestionMethod =
              io.grpc.MethodDescriptor.<generated.grpc.smarttutor.RequestQuestion, generated.grpc.smarttutor.SmartAnswer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StudentQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.smarttutor.RequestQuestion.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.smarttutor.SmartAnswer.getDefaultInstance()))
              .setSchemaDescriptor(new DoubtsServiceMethodDescriptorSupplier("StudentQuestion"))
              .build();
        }
      }
    }
    return getStudentQuestionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DoubtsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoubtsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoubtsServiceStub>() {
        @java.lang.Override
        public DoubtsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoubtsServiceStub(channel, callOptions);
        }
      };
    return DoubtsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DoubtsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoubtsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoubtsServiceBlockingStub>() {
        @java.lang.Override
        public DoubtsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoubtsServiceBlockingStub(channel, callOptions);
        }
      };
    return DoubtsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DoubtsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoubtsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoubtsServiceFutureStub>() {
        @java.lang.Override
        public DoubtsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoubtsServiceFutureStub(channel, callOptions);
        }
      };
    return DoubtsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * SmartTutor manages the.
   * 
   * The question service definition.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * This service will allow the user to get a reply for a question
     * </pre>
     */
    default void studentQuestion(generated.grpc.smarttutor.RequestQuestion request,
        io.grpc.stub.StreamObserver<generated.grpc.smarttutor.SmartAnswer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStudentQuestionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DoubtsService.
   * <pre>
   * SmartTutor manages the.
   * 
   * The question service definition.
   * </pre>
   */
  public static abstract class DoubtsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DoubtsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DoubtsService.
   * <pre>
   * SmartTutor manages the.
   * 
   * The question service definition.
   * </pre>
   */
  public static final class DoubtsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DoubtsServiceStub> {
    private DoubtsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoubtsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoubtsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * This service will allow the user to get a reply for a question
     * </pre>
     */
    public void studentQuestion(generated.grpc.smarttutor.RequestQuestion request,
        io.grpc.stub.StreamObserver<generated.grpc.smarttutor.SmartAnswer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStudentQuestionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DoubtsService.
   * <pre>
   * SmartTutor manages the.
   * 
   * The question service definition.
   * </pre>
   */
  public static final class DoubtsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DoubtsServiceBlockingStub> {
    private DoubtsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoubtsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoubtsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * This service will allow the user to get a reply for a question
     * </pre>
     */
    public generated.grpc.smarttutor.SmartAnswer studentQuestion(generated.grpc.smarttutor.RequestQuestion request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStudentQuestionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DoubtsService.
   * <pre>
   * SmartTutor manages the.
   * 
   * The question service definition.
   * </pre>
   */
  public static final class DoubtsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DoubtsServiceFutureStub> {
    private DoubtsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoubtsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoubtsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * This service will allow the user to get a reply for a question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.smarttutor.SmartAnswer> studentQuestion(
        generated.grpc.smarttutor.RequestQuestion request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStudentQuestionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STUDENT_QUESTION = 0;

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
        case METHODID_STUDENT_QUESTION:
          serviceImpl.studentQuestion((generated.grpc.smarttutor.RequestQuestion) request,
              (io.grpc.stub.StreamObserver<generated.grpc.smarttutor.SmartAnswer>) responseObserver);
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
          getStudentQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              generated.grpc.smarttutor.RequestQuestion,
              generated.grpc.smarttutor.SmartAnswer>(
                service, METHODID_STUDENT_QUESTION)))
        .build();
  }

  private static abstract class DoubtsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DoubtsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.smarttutor.Smarttutor.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DoubtsService");
    }
  }

  private static final class DoubtsServiceFileDescriptorSupplier
      extends DoubtsServiceBaseDescriptorSupplier {
    DoubtsServiceFileDescriptorSupplier() {}
  }

  private static final class DoubtsServiceMethodDescriptorSupplier
      extends DoubtsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DoubtsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DoubtsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DoubtsServiceFileDescriptorSupplier())
              .addMethod(getStudentQuestionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
