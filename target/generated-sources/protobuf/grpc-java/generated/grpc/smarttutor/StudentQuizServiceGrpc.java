package generated.grpc.smarttutor;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: Smarttutor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StudentQuizServiceGrpc {

  private StudentQuizServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartTutor.StudentQuizService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.smarttutor.QuizQuestions,
      generated.grpc.smarttutor.QuizAnswers> getSmartQuizMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SmartQuiz",
      requestType = generated.grpc.smarttutor.QuizQuestions.class,
      responseType = generated.grpc.smarttutor.QuizAnswers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.smarttutor.QuizQuestions,
      generated.grpc.smarttutor.QuizAnswers> getSmartQuizMethod() {
    io.grpc.MethodDescriptor<generated.grpc.smarttutor.QuizQuestions, generated.grpc.smarttutor.QuizAnswers> getSmartQuizMethod;
    if ((getSmartQuizMethod = StudentQuizServiceGrpc.getSmartQuizMethod) == null) {
      synchronized (StudentQuizServiceGrpc.class) {
        if ((getSmartQuizMethod = StudentQuizServiceGrpc.getSmartQuizMethod) == null) {
          StudentQuizServiceGrpc.getSmartQuizMethod = getSmartQuizMethod =
              io.grpc.MethodDescriptor.<generated.grpc.smarttutor.QuizQuestions, generated.grpc.smarttutor.QuizAnswers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SmartQuiz"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.smarttutor.QuizQuestions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.smarttutor.QuizAnswers.getDefaultInstance()))
              .setSchemaDescriptor(new StudentQuizServiceMethodDescriptorSupplier("SmartQuiz"))
              .build();
        }
      }
    }
    return getSmartQuizMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentQuizServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentQuizServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentQuizServiceStub>() {
        @java.lang.Override
        public StudentQuizServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentQuizServiceStub(channel, callOptions);
        }
      };
    return StudentQuizServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentQuizServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentQuizServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentQuizServiceBlockingStub>() {
        @java.lang.Override
        public StudentQuizServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentQuizServiceBlockingStub(channel, callOptions);
        }
      };
    return StudentQuizServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentQuizServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentQuizServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentQuizServiceFutureStub>() {
        @java.lang.Override
        public StudentQuizServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentQuizServiceFutureStub(channel, callOptions);
        }
      };
    return StudentQuizServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<generated.grpc.smarttutor.QuizQuestions> smartQuiz(
        io.grpc.stub.StreamObserver<generated.grpc.smarttutor.QuizAnswers> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSmartQuizMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StudentQuizService.
   */
  public static abstract class StudentQuizServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StudentQuizServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StudentQuizService.
   */
  public static final class StudentQuizServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StudentQuizServiceStub> {
    private StudentQuizServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentQuizServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentQuizServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<generated.grpc.smarttutor.QuizQuestions> smartQuiz(
        io.grpc.stub.StreamObserver<generated.grpc.smarttutor.QuizAnswers> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSmartQuizMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StudentQuizService.
   */
  public static final class StudentQuizServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StudentQuizServiceBlockingStub> {
    private StudentQuizServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentQuizServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentQuizServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StudentQuizService.
   */
  public static final class StudentQuizServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StudentQuizServiceFutureStub> {
    private StudentQuizServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentQuizServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentQuizServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SMART_QUIZ = 0;

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
        case METHODID_SMART_QUIZ:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.smartQuiz(
              (io.grpc.stub.StreamObserver<generated.grpc.smarttutor.QuizAnswers>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSmartQuizMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              generated.grpc.smarttutor.QuizQuestions,
              generated.grpc.smarttutor.QuizAnswers>(
                service, METHODID_SMART_QUIZ)))
        .build();
  }

  private static abstract class StudentQuizServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentQuizServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.smarttutor.Smarttutor.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentQuizService");
    }
  }

  private static final class StudentQuizServiceFileDescriptorSupplier
      extends StudentQuizServiceBaseDescriptorSupplier {
    StudentQuizServiceFileDescriptorSupplier() {}
  }

  private static final class StudentQuizServiceMethodDescriptorSupplier
      extends StudentQuizServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentQuizServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StudentQuizServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentQuizServiceFileDescriptorSupplier())
              .addMethod(getSmartQuizMethod())
              .build();
        }
      }
    }
    return result;
  }
}
