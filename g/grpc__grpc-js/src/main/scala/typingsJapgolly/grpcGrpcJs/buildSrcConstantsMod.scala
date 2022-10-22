package typingsJapgolly.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcConstantsMod {
  
  @JSImport("@grpc/grpc-js/build/src/constants", "DEFAULT_MAX_RECEIVE_MESSAGE_LENGTH")
  @js.native
  val DEFAULT_MAX_RECEIVE_MESSAGE_LENGTH: Double = js.native
  
  @JSImport("@grpc/grpc-js/build/src/constants", "DEFAULT_MAX_SEND_MESSAGE_LENGTH")
  @js.native
  val DEFAULT_MAX_SEND_MESSAGE_LENGTH: /* -1 */ Double = js.native
  
  @js.native
  sealed trait LogVerbosity extends StObject
  @JSImport("@grpc/grpc-js/build/src/constants", "LogVerbosity")
  @js.native
  object LogVerbosity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogVerbosity & Double] = js.native
    
    @js.native
    sealed trait DEBUG
      extends StObject
         with LogVerbosity
    /* 0 */ val DEBUG: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity.DEBUG & Double = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with LogVerbosity
    /* 2 */ val ERROR: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity.ERROR & Double = js.native
    
    @js.native
    sealed trait INFO
      extends StObject
         with LogVerbosity
    /* 1 */ val INFO: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity.INFO & Double = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with LogVerbosity
    /* 3 */ val NONE: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity.NONE & Double = js.native
  }
  
  @js.native
  sealed trait Propagate extends StObject
  @JSImport("@grpc/grpc-js/build/src/constants", "Propagate")
  @js.native
  object Propagate extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Propagate & Double] = js.native
    
    @js.native
    sealed trait CANCELLATION
      extends StObject
         with Propagate
    /* 8 */ val CANCELLATION: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Propagate.CANCELLATION & Double = js.native
    
    @js.native
    sealed trait CENSUS_STATS_CONTEXT
      extends StObject
         with Propagate
    /* 2 */ val CENSUS_STATS_CONTEXT: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Propagate.CENSUS_STATS_CONTEXT & Double = js.native
    
    @js.native
    sealed trait CENSUS_TRACING_CONTEXT
      extends StObject
         with Propagate
    /* 4 */ val CENSUS_TRACING_CONTEXT: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Propagate.CENSUS_TRACING_CONTEXT & Double = js.native
    
    @js.native
    sealed trait DEADLINE
      extends StObject
         with Propagate
    /* 1 */ val DEADLINE: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Propagate.DEADLINE & Double = js.native
    
    @js.native
    sealed trait DEFAULTS
      extends StObject
         with Propagate
    /* 65535 */ val DEFAULTS: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Propagate.DEFAULTS & Double = js.native
  }
  
  @js.native
  sealed trait Status extends StObject
  @JSImport("@grpc/grpc-js/build/src/constants", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait ABORTED
      extends StObject
         with Status
    /* 10 */ val ABORTED: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.ABORTED & Double = js.native
    
    @js.native
    sealed trait ALREADY_EXISTS
      extends StObject
         with Status
    /* 6 */ val ALREADY_EXISTS: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.ALREADY_EXISTS & Double = js.native
    
    @js.native
    sealed trait CANCELLED
      extends StObject
         with Status
    /* 1 */ val CANCELLED: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.CANCELLED & Double = js.native
    
    @js.native
    sealed trait DATA_LOSS
      extends StObject
         with Status
    /* 15 */ val DATA_LOSS: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.DATA_LOSS & Double = js.native
    
    @js.native
    sealed trait DEADLINE_EXCEEDED
      extends StObject
         with Status
    /* 4 */ val DEADLINE_EXCEEDED: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.DEADLINE_EXCEEDED & Double = js.native
    
    @js.native
    sealed trait FAILED_PRECONDITION
      extends StObject
         with Status
    /* 9 */ val FAILED_PRECONDITION: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.FAILED_PRECONDITION & Double = js.native
    
    @js.native
    sealed trait INTERNAL
      extends StObject
         with Status
    /* 13 */ val INTERNAL: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.INTERNAL & Double = js.native
    
    @js.native
    sealed trait INVALID_ARGUMENT
      extends StObject
         with Status
    /* 3 */ val INVALID_ARGUMENT: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.INVALID_ARGUMENT & Double = js.native
    
    @js.native
    sealed trait NOT_FOUND
      extends StObject
         with Status
    /* 5 */ val NOT_FOUND: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.NOT_FOUND & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 0 */ val OK: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.OK & Double = js.native
    
    @js.native
    sealed trait OUT_OF_RANGE
      extends StObject
         with Status
    /* 11 */ val OUT_OF_RANGE: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.OUT_OF_RANGE & Double = js.native
    
    @js.native
    sealed trait PERMISSION_DENIED
      extends StObject
         with Status
    /* 7 */ val PERMISSION_DENIED: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.PERMISSION_DENIED & Double = js.native
    
    @js.native
    sealed trait RESOURCE_EXHAUSTED
      extends StObject
         with Status
    /* 8 */ val RESOURCE_EXHAUSTED: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.RESOURCE_EXHAUSTED & Double = js.native
    
    @js.native
    sealed trait UNAUTHENTICATED
      extends StObject
         with Status
    /* 16 */ val UNAUTHENTICATED: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.UNAUTHENTICATED & Double = js.native
    
    @js.native
    sealed trait UNAVAILABLE
      extends StObject
         with Status
    /* 14 */ val UNAVAILABLE: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.UNAVAILABLE & Double = js.native
    
    @js.native
    sealed trait UNIMPLEMENTED
      extends StObject
         with Status
    /* 12 */ val UNIMPLEMENTED: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.UNIMPLEMENTED & Double = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with Status
    /* 2 */ val UNKNOWN: typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status.UNKNOWN & Double = js.native
  }
}
