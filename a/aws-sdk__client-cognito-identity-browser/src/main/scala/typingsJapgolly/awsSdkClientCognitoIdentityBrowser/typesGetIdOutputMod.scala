package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/types/GetIdOutput", JSImport.Namespace)
@js.native
object typesGetIdOutputMod extends js.Object {
  @js.native
  trait GetIdOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>A unique identifier in the format REGION:GUID.</p>
      */
    var IdentityId: js.UndefOr[String] = js.native
  }
  
}

