package typingsJapgolly.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTraceStatusMod {
  
  @js.native
  sealed trait SpanStatusCode extends StObject
  @JSImport("@opentelemetry/api/build/src/trace/status", "SpanStatusCode")
  @js.native
  object SpanStatusCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SpanStatusCode & Double] = js.native
    
    /**
      * The operation contains an error.
      */
    @js.native
    sealed trait ERROR
      extends StObject
         with SpanStatusCode
    /* 2 */ val ERROR: typingsJapgolly.opentelemetryApi.buildSrcTraceStatusMod.SpanStatusCode.ERROR & Double = js.native
    
    /**
      * The operation has been validated by an Application developer or
      * Operator to have completed successfully.
      */
    @js.native
    sealed trait OK
      extends StObject
         with SpanStatusCode
    /* 1 */ val OK: typingsJapgolly.opentelemetryApi.buildSrcTraceStatusMod.SpanStatusCode.OK & Double = js.native
    
    /**
      * The default status.
      */
    @js.native
    sealed trait UNSET
      extends StObject
         with SpanStatusCode
    /* 0 */ val UNSET: typingsJapgolly.opentelemetryApi.buildSrcTraceStatusMod.SpanStatusCode.UNSET & Double = js.native
  }
  
  trait SpanStatus extends StObject {
    
    /** The status code of this message. */
    var code: SpanStatusCode
    
    /** A developer-facing error message. */
    var message: js.UndefOr[String] = js.undefined
  }
  object SpanStatus {
    
    inline def apply(code: SpanStatusCode): SpanStatus = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpanStatus]
    }
    
    extension [Self <: SpanStatus](x: Self) {
      
      inline def setCode(value: SpanStatusCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
