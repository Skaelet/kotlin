// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf enum {@code org.jetbrains.kotlin.backend.common.serialization.proto.ModalityKind}
 *
 * <pre>
 * It is ModalityKind to not clash with Modality in descriptor metadata.
 * </pre>
 */
public enum ModalityKind
    implements org.jetbrains.kotlin.protobuf.Internal.EnumLite {
  /**
   * <code>FINAL_MODALITY = 1;</code>
   */
  FINAL_MODALITY(0, 1),
  /**
   * <code>SEALED_MODALITY = 2;</code>
   */
  SEALED_MODALITY(1, 2),
  /**
   * <code>OPEN_MODALITY = 3;</code>
   */
  OPEN_MODALITY(2, 3),
  /**
   * <code>ABSTRACT_MODALITY = 4;</code>
   */
  ABSTRACT_MODALITY(3, 4),
  ;

  /**
   * <code>FINAL_MODALITY = 1;</code>
   */
  public static final int FINAL_MODALITY_VALUE = 1;
  /**
   * <code>SEALED_MODALITY = 2;</code>
   */
  public static final int SEALED_MODALITY_VALUE = 2;
  /**
   * <code>OPEN_MODALITY = 3;</code>
   */
  public static final int OPEN_MODALITY_VALUE = 3;
  /**
   * <code>ABSTRACT_MODALITY = 4;</code>
   */
  public static final int ABSTRACT_MODALITY_VALUE = 4;


  public final int getNumber() { return value; }

  public static ModalityKind valueOf(int value) {
    switch (value) {
      case 1: return FINAL_MODALITY;
      case 2: return SEALED_MODALITY;
      case 3: return OPEN_MODALITY;
      case 4: return ABSTRACT_MODALITY;
      default: return null;
    }
  }

  public static org.jetbrains.kotlin.protobuf.Internal.EnumLiteMap<ModalityKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static org.jetbrains.kotlin.protobuf.Internal.EnumLiteMap<ModalityKind>
      internalValueMap =
        new org.jetbrains.kotlin.protobuf.Internal.EnumLiteMap<ModalityKind>() {
          public ModalityKind findValueByNumber(int number) {
            return ModalityKind.valueOf(number);
          }
        };

  private final int value;

  private ModalityKind(int index, int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:org.jetbrains.kotlin.backend.common.serialization.proto.ModalityKind)
}
