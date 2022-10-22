package typingsJapgolly.googleGax

import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcStatusMod {
  
  @JSImport("google-gax/build/src/status", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-gax/build/src/status", "HttpCodeToRpcCodeMap")
  @js.native
  val HttpCodeToRpcCodeMap: Map[Double, Status] = js.native
  
  @js.native
  sealed trait Status extends StObject
  @JSImport("google-gax/build/src/status", "Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait ABORTED
      extends StObject
         with Status
    /* 10 */ val ABORTED: typingsJapgolly.googleGax.buildSrcStatusMod.Status.ABORTED & Double = js.native
    
    @js.native
    sealed trait ALREADY_EXISTS
      extends StObject
         with Status
    /* 6 */ val ALREADY_EXISTS: typingsJapgolly.googleGax.buildSrcStatusMod.Status.ALREADY_EXISTS & Double = js.native
    
    @js.native
    sealed trait CANCELLED
      extends StObject
         with Status
    /* 1 */ val CANCELLED: typingsJapgolly.googleGax.buildSrcStatusMod.Status.CANCELLED & Double = js.native
    
    @js.native
    sealed trait DATA_LOSS
      extends StObject
         with Status
    /* 15 */ val DATA_LOSS: typingsJapgolly.googleGax.buildSrcStatusMod.Status.DATA_LOSS & Double = js.native
    
    @js.native
    sealed trait DEADLINE_EXCEEDED
      extends StObject
         with Status
    /* 4 */ val DEADLINE_EXCEEDED: typingsJapgolly.googleGax.buildSrcStatusMod.Status.DEADLINE_EXCEEDED & Double = js.native
    
    @js.native
    sealed trait FAILED_PRECONDITION
      extends StObject
         with Status
    /* 9 */ val FAILED_PRECONDITION: typingsJapgolly.googleGax.buildSrcStatusMod.Status.FAILED_PRECONDITION & Double = js.native
    
    @js.native
    sealed trait INTERNAL
      extends StObject
         with Status
    /* 13 */ val INTERNAL: typingsJapgolly.googleGax.buildSrcStatusMod.Status.INTERNAL & Double = js.native
    
    @js.native
    sealed trait INVALID_ARGUMENT
      extends StObject
         with Status
    /* 3 */ val INVALID_ARGUMENT: typingsJapgolly.googleGax.buildSrcStatusMod.Status.INVALID_ARGUMENT & Double = js.native
    
    @js.native
    sealed trait NOT_FOUND
      extends StObject
         with Status
    /* 5 */ val NOT_FOUND: typingsJapgolly.googleGax.buildSrcStatusMod.Status.NOT_FOUND & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 0 */ val OK: typingsJapgolly.googleGax.buildSrcStatusMod.Status.OK & Double = js.native
    
    @js.native
    sealed trait OUT_OF_RANGE
      extends StObject
         with Status
    /* 11 */ val OUT_OF_RANGE: typingsJapgolly.googleGax.buildSrcStatusMod.Status.OUT_OF_RANGE & Double = js.native
    
    @js.native
    sealed trait PERMISSION_DENIED
      extends StObject
         with Status
    /* 7 */ val PERMISSION_DENIED: typingsJapgolly.googleGax.buildSrcStatusMod.Status.PERMISSION_DENIED & Double = js.native
    
    @js.native
    sealed trait RESOURCE_EXHAUSTED
      extends StObject
         with Status
    /* 8 */ val RESOURCE_EXHAUSTED: typingsJapgolly.googleGax.buildSrcStatusMod.Status.RESOURCE_EXHAUSTED & Double = js.native
    
    @js.native
    sealed trait UNAUTHENTICATED
      extends StObject
         with Status
    /* 16 */ val UNAUTHENTICATED: typingsJapgolly.googleGax.buildSrcStatusMod.Status.UNAUTHENTICATED & Double = js.native
    
    @js.native
    sealed trait UNAVAILABLE
      extends StObject
         with Status
    /* 14 */ val UNAVAILABLE: typingsJapgolly.googleGax.buildSrcStatusMod.Status.UNAVAILABLE & Double = js.native
    
    @js.native
    sealed trait UNIMPLEMENTED
      extends StObject
         with Status
    /* 12 */ val UNIMPLEMENTED: typingsJapgolly.googleGax.buildSrcStatusMod.Status.UNIMPLEMENTED & Double = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with Status
    /* 2 */ val UNKNOWN: typingsJapgolly.googleGax.buildSrcStatusMod.Status.UNKNOWN & Double = js.native
  }
  
  inline def rpcCodeFromHttpStatusCode(httpStatusCode: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rpcCodeFromHttpStatusCode")(httpStatusCode.asInstanceOf[js.Any]).asInstanceOf[Double]
}
