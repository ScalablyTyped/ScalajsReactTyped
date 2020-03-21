package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesCredentialsMod.UnmarshalledCredentials
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/types/GetCredentialsForIdentityOutput", JSImport.Namespace)
@js.native
object typesGetCredentialsForIdentityOutputMod extends js.Object {
  @js.native
  trait GetCredentialsForIdentityOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Credentials for the provided identity ID.</p>
      */
    var Credentials: js.UndefOr[UnmarshalledCredentials] = js.native
    /**
      * <p>A unique identifier in the format REGION:GUID.</p>
      */
    var IdentityId: js.UndefOr[String] = js.native
  }
  
}

