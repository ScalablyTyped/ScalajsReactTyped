package typingsJapgolly.awsSdkMiddlewareSerde

import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.DeserializeMiddleware
import typingsJapgolly.awsSdkTypes.distTypesSerdeMod.ResponseDeserializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDeserializerMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-serde/dist-types/deserializerMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, RuntimeUtils](options: RuntimeUtils, deserializer: ResponseDeserializer[Any, Any, RuntimeUtils]): DeserializeMiddleware[Input, Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializerMiddleware")(options.asInstanceOf[js.Any], deserializer.asInstanceOf[js.Any])).asInstanceOf[DeserializeMiddleware[Input, Output]]
}
