package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesRoleMappingMod.RoleMapping
import typingsJapgolly.awsSdkTypes.abortMod.AbortSignal
import typingsJapgolly.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/types/SetIdentityPoolRolesInput", JSImport.Namespace)
@js.native
object typesSetIdentityPoolRolesInputMod extends js.Object {
  @js.native
  trait SetIdentityPoolRolesInput extends InputTypesUnion {
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>An identity pool ID in the format REGION:GUID.</p>
      */
    var IdentityPoolId: String = js.native
    /**
      * <p>How users for a specific identity provider are to mapped to roles. This is a string to <a>RoleMapping</a> object map. The string identifies the identity provider, for example, "graph.facebook.com" or "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".</p> <p>Up to 25 rules can be specified per identity provider.</p>
      */
    var RoleMappings: js.UndefOr[StringDictionary[RoleMapping] | (js.Iterable[js.Tuple2[String, RoleMapping]])] = js.native
    /**
      * <p>The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.</p>
      */
    var Roles: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]]) = js.native
  }
  
}

