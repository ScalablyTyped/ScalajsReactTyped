package typingsJapgolly.awsSdkMiddlewareSerde

import typingsJapgolly.awsSdkMiddlewareSerde.distTypesSerdePluginMod.V1OrV2Endpoint
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.DeserializeHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.DeserializeMiddleware
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.SerializeHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.SerializeMiddleware
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesSerdeMod.EndpointBearer
import typingsJapgolly.awsSdkTypes.distTypesSerdeMod.RequestSerializer
import typingsJapgolly.awsSdkTypes.distTypesSerdeMod.ResponseDeserializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-serde", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, RuntimeUtils](options: RuntimeUtils, deserializer: ResponseDeserializer[Any, Any, RuntimeUtils]): DeserializeMiddleware[Input, Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializerMiddleware")(options.asInstanceOf[js.Any], deserializer.asInstanceOf[js.Any])).asInstanceOf[DeserializeMiddleware[Input, Output]]
  
  @JSImport("@aws-sdk/middleware-serde", "deserializerMiddlewareOption")
  @js.native
  val deserializerMiddlewareOption: DeserializeHandlerOptions = js.native
  
  inline def getSerdePlugin[InputType /* <: js.Object */, SerDeContext /* <: EndpointBearer */, OutputType /* <: MetadataBearer */](
    config: V1OrV2Endpoint[SerDeContext],
    serializer: RequestSerializer[Any, SerDeContext],
    deserializer: ResponseDeserializer[OutputType, Any, SerDeContext]
  ): Pluggable[InputType, OutputType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSerdePlugin")(config.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], deserializer.asInstanceOf[js.Any])).asInstanceOf[Pluggable[InputType, OutputType]]
  
  inline def serializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, RuntimeUtils /* <: EndpointBearer */](options: V1OrV2Endpoint[RuntimeUtils], serializer: RequestSerializer[Any, RuntimeUtils]): SerializeMiddleware[Input, Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializerMiddleware")(options.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[SerializeMiddleware[Input, Output]]
  
  @JSImport("@aws-sdk/middleware-serde", "serializerMiddlewareOption")
  @js.native
  val serializerMiddlewareOption: SerializeHandlerOptions = js.native
}
