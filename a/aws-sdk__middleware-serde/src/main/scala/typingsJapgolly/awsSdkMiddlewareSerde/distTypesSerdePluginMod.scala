package typingsJapgolly.awsSdkMiddlewareSerde

import typingsJapgolly.awsSdkMiddlewareSerde.anon.UrlParser
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.DeserializeHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.SerializeHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesSerdeMod.EndpointBearer
import typingsJapgolly.awsSdkTypes.distTypesSerdeMod.RequestSerializer
import typingsJapgolly.awsSdkTypes.distTypesSerdeMod.ResponseDeserializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSerdePluginMod {
  
  @JSImport("@aws-sdk/middleware-serde/dist-types/serdePlugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-serde/dist-types/serdePlugin", "deserializerMiddlewareOption")
  @js.native
  val deserializerMiddlewareOption: DeserializeHandlerOptions = js.native
  
  inline def getSerdePlugin[InputType /* <: js.Object */, SerDeContext /* <: EndpointBearer */, OutputType /* <: MetadataBearer */](
    config: V1OrV2Endpoint[SerDeContext],
    serializer: RequestSerializer[Any, SerDeContext],
    deserializer: ResponseDeserializer[OutputType, Any, SerDeContext]
  ): Pluggable[InputType, OutputType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSerdePlugin")(config.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], deserializer.asInstanceOf[js.Any])).asInstanceOf[Pluggable[InputType, OutputType]]
  
  @JSImport("@aws-sdk/middleware-serde/dist-types/serdePlugin", "serializerMiddlewareOption")
  @js.native
  val serializerMiddlewareOption: SerializeHandlerOptions = js.native
  
  type V1OrV2Endpoint[T /* <: EndpointBearer */] = T & UrlParser
}
