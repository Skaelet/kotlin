// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface ExpectActualTableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.ExpectActualTable)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.ExpectToActual expectToActuals = 1;</code>
   */
  java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.ExpectToActual> 
      getExpectToActualsList();
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.ExpectToActual expectToActuals = 1;</code>
   */
  org.jetbrains.kotlin.backend.common.serialization.proto.ExpectToActual getExpectToActuals(int index);
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.ExpectToActual expectToActuals = 1;</code>
   */
  int getExpectToActualsCount();
}