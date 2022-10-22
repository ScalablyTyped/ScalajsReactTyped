package typingsJapgolly.awsSdkS3RequestPresigner

import typingsJapgolly.awsSdkSmithyClient.mod.Client
import typingsJapgolly.awsSdkSmithyClient.mod.Command
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesSignatureMod.RequestPresigningArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetSignedUrlMod {
  
  @JSImport("@aws-sdk/s3-request-presigner/dist-types/getSignedUrl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSignedUrl[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, OutputType /* <: MetadataBearer */](
    client: Client[Any, InputTypesUnion, MetadataBearer, Any],
    command: Command[InputType, OutputType, Any, InputTypesUnion, MetadataBearer]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignedUrl")(client.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getSignedUrl[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, OutputType /* <: MetadataBearer */](
    client: Client[Any, InputTypesUnion, MetadataBearer, Any],
    command: Command[InputType, OutputType, Any, InputTypesUnion, MetadataBearer],
    options: RequestPresigningArguments
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignedUrl")(client.asInstanceOf[js.Any], command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
