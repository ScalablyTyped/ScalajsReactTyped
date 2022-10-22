package typingsJapgolly.awsSdkMiddlewareSerde

import typingsJapgolly.awsSdkMiddlewareSerde.distTypesSerdePluginMod.V1OrV2Endpoint
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.SerializeMiddleware
import typingsJapgolly.awsSdkTypes.distTypesSerdeMod.EndpointBearer
import typingsJapgolly.awsSdkTypes.distTypesSerdeMod.RequestSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSerializerMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-serde/dist-types/serializerMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, RuntimeUtils /* <: EndpointBearer */](options: V1OrV2Endpoint[RuntimeUtils], serializer: RequestSerializer[Any, RuntimeUtils]): SerializeMiddleware[Input, Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializerMiddleware")(options.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[SerializeMiddleware[Input, Output]]
}
