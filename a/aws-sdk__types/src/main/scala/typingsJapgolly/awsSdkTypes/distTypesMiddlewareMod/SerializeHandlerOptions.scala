package typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod

import typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.serialize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializeHandlerOptions
  extends StObject
     with HandlerOptions {
  
  @JSName("step")
  var step_SerializeHandlerOptions: serialize
}
object SerializeHandlerOptions {
  
  inline def apply(): SerializeHandlerOptions = {
    val __obj = js.Dynamic.literal(step = "serialize")
    __obj.asInstanceOf[SerializeHandlerOptions]
  }
  
  extension [Self <: SerializeHandlerOptions](x: Self) {
    
    inline def setStep(value: serialize): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
