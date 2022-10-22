package typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod

import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreloadableConcreteRequest[TQuery /* <: OperationType */] extends StObject {
  
  var kind: typingsJapgolly.reactRelay.reactRelayStrings.PreloadableConcreteRequest
  
  var params: RequestParameters
}
object PreloadableConcreteRequest {
  
  inline def apply[TQuery /* <: OperationType */](params: RequestParameters): PreloadableConcreteRequest[TQuery] = {
    val __obj = js.Dynamic.literal(kind = "PreloadableConcreteRequest", params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadableConcreteRequest[TQuery]]
  }
  
  extension [Self <: PreloadableConcreteRequest[?], TQuery /* <: OperationType */](x: Self & PreloadableConcreteRequest[TQuery]) {
    
    inline def setKind(value: typingsJapgolly.reactRelay.reactRelayStrings.PreloadableConcreteRequest): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setParams(value: RequestParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
