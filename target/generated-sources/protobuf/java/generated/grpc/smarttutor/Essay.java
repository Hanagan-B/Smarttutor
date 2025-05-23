// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Smarttutor.proto

package generated.grpc.smarttutor;

/**
 * <pre>
 * message identifying the essay
 * </pre>
 *
 * Protobuf type {@code SmartTutor.Essay}
 */
public final class Essay extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SmartTutor.Essay)
    EssayOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Essay.newBuilder() to construct.
  private Essay(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Essay() {
    partEssay_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Essay();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.grpc.smarttutor.Smarttutor.internal_static_SmartTutor_Essay_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.grpc.smarttutor.Smarttutor.internal_static_SmartTutor_Essay_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.grpc.smarttutor.Essay.class, generated.grpc.smarttutor.Essay.Builder.class);
  }

  public static final int PARTESSAY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object partEssay_ = "";
  /**
   * <code>string partEssay = 1;</code>
   * @return The partEssay.
   */
  @java.lang.Override
  public java.lang.String getPartEssay() {
    java.lang.Object ref = partEssay_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      partEssay_ = s;
      return s;
    }
  }
  /**
   * <code>string partEssay = 1;</code>
   * @return The bytes for partEssay.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPartEssayBytes() {
    java.lang.Object ref = partEssay_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      partEssay_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(partEssay_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, partEssay_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(partEssay_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, partEssay_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof generated.grpc.smarttutor.Essay)) {
      return super.equals(obj);
    }
    generated.grpc.smarttutor.Essay other = (generated.grpc.smarttutor.Essay) obj;

    if (!getPartEssay()
        .equals(other.getPartEssay())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARTESSAY_FIELD_NUMBER;
    hash = (53 * hash) + getPartEssay().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.grpc.smarttutor.Essay parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.smarttutor.Essay parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.smarttutor.Essay parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.smarttutor.Essay parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.smarttutor.Essay parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.smarttutor.Essay parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.smarttutor.Essay parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.smarttutor.Essay parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static generated.grpc.smarttutor.Essay parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static generated.grpc.smarttutor.Essay parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.smarttutor.Essay parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.smarttutor.Essay parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(generated.grpc.smarttutor.Essay prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * message identifying the essay
   * </pre>
   *
   * Protobuf type {@code SmartTutor.Essay}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SmartTutor.Essay)
      generated.grpc.smarttutor.EssayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.grpc.smarttutor.Smarttutor.internal_static_SmartTutor_Essay_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.grpc.smarttutor.Smarttutor.internal_static_SmartTutor_Essay_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.grpc.smarttutor.Essay.class, generated.grpc.smarttutor.Essay.Builder.class);
    }

    // Construct using generated.grpc.smarttutor.Essay.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      partEssay_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.grpc.smarttutor.Smarttutor.internal_static_SmartTutor_Essay_descriptor;
    }

    @java.lang.Override
    public generated.grpc.smarttutor.Essay getDefaultInstanceForType() {
      return generated.grpc.smarttutor.Essay.getDefaultInstance();
    }

    @java.lang.Override
    public generated.grpc.smarttutor.Essay build() {
      generated.grpc.smarttutor.Essay result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.grpc.smarttutor.Essay buildPartial() {
      generated.grpc.smarttutor.Essay result = new generated.grpc.smarttutor.Essay(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(generated.grpc.smarttutor.Essay result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.partEssay_ = partEssay_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof generated.grpc.smarttutor.Essay) {
        return mergeFrom((generated.grpc.smarttutor.Essay)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.grpc.smarttutor.Essay other) {
      if (other == generated.grpc.smarttutor.Essay.getDefaultInstance()) return this;
      if (!other.getPartEssay().isEmpty()) {
        partEssay_ = other.partEssay_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              partEssay_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object partEssay_ = "";
    /**
     * <code>string partEssay = 1;</code>
     * @return The partEssay.
     */
    public java.lang.String getPartEssay() {
      java.lang.Object ref = partEssay_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        partEssay_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string partEssay = 1;</code>
     * @return The bytes for partEssay.
     */
    public com.google.protobuf.ByteString
        getPartEssayBytes() {
      java.lang.Object ref = partEssay_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        partEssay_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string partEssay = 1;</code>
     * @param value The partEssay to set.
     * @return This builder for chaining.
     */
    public Builder setPartEssay(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      partEssay_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string partEssay = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartEssay() {
      partEssay_ = getDefaultInstance().getPartEssay();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string partEssay = 1;</code>
     * @param value The bytes for partEssay to set.
     * @return This builder for chaining.
     */
    public Builder setPartEssayBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      partEssay_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:SmartTutor.Essay)
  }

  // @@protoc_insertion_point(class_scope:SmartTutor.Essay)
  private static final generated.grpc.smarttutor.Essay DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.grpc.smarttutor.Essay();
  }

  public static generated.grpc.smarttutor.Essay getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Essay>
      PARSER = new com.google.protobuf.AbstractParser<Essay>() {
    @java.lang.Override
    public Essay parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Essay> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Essay> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.grpc.smarttutor.Essay getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

