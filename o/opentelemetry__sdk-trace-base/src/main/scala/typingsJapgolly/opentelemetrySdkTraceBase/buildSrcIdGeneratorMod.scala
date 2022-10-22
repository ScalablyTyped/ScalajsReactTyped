package typingsJapgolly.opentelemetrySdkTraceBase

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcIdGeneratorMod {
  
  trait IdGenerator extends StObject {
    
    /** Returns a span ID composed of 16 lowercase hex characters. */
    def generateSpanId(): String
    
    /** Returns a trace ID composed of 32 lowercase hex characters. */
    def generateTraceId(): String
  }
  object IdGenerator {
    
    inline def apply(generateSpanId: CallbackTo[String], generateTraceId: CallbackTo[String]): IdGenerator = {
      val __obj = js.Dynamic.literal(generateSpanId = generateSpanId.toJsFn, generateTraceId = generateTraceId.toJsFn)
      __obj.asInstanceOf[IdGenerator]
    }
    
    extension [Self <: IdGenerator](x: Self) {
      
      inline def setGenerateSpanId(value: CallbackTo[String]): Self = StObject.set(x, "generateSpanId", value.toJsFn)
      
      inline def setGenerateTraceId(value: CallbackTo[String]): Self = StObject.set(x, "generateTraceId", value.toJsFn)
    }
  }
}
