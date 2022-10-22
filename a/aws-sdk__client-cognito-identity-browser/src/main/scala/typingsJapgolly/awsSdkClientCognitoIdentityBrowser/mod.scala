package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesInputMod.DeleteIdentitiesInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityInputMod.DescribeIdentityInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityInputMod.GetCredentialsForIdentityInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesGetIdInputMod.GetIdInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesInputMod.GetIdentityPoolRolesInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod.GetOpenIdTokenForDeveloperIdentityInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesInputMod.ListIdentitiesInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolInputMod.UpdateIdentityPoolInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "CognitoIdentity")
  @js.native
  open class CognitoIdentity protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityMod.CognitoIdentity {
    def this(configuration: CognitoIdentityConfiguration) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "CognitoIdentityClient")
  @js.native
  open class CognitoIdentityClient protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityClientMod.CognitoIdentityClient {
    def this(configuration: CognitoIdentityConfiguration) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "CreateIdentityPoolCommand")
  @js.native
  open class CreateIdentityPoolCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsCreateIdentityPoolCommandMod.CreateIdentityPoolCommand {
    def this(input: CreateIdentityPoolInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "DeleteIdentitiesCommand")
  @js.native
  open class DeleteIdentitiesCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsDeleteIdentitiesCommandMod.DeleteIdentitiesCommand {
    def this(input: DeleteIdentitiesInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "DeleteIdentityPoolCommand")
  @js.native
  open class DeleteIdentityPoolCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsDeleteIdentityPoolCommandMod.DeleteIdentityPoolCommand {
    def this(input: DeleteIdentityPoolInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "DescribeIdentityCommand")
  @js.native
  open class DescribeIdentityCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsDescribeIdentityCommandMod.DescribeIdentityCommand {
    def this(input: DescribeIdentityInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "DescribeIdentityPoolCommand")
  @js.native
  open class DescribeIdentityPoolCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsDescribeIdentityPoolCommandMod.DescribeIdentityPoolCommand {
    def this(input: DescribeIdentityPoolInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "GetCredentialsForIdentityCommand")
  @js.native
  open class GetCredentialsForIdentityCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsGetCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommand {
    def this(input: GetCredentialsForIdentityInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "GetIdCommand")
  @js.native
  open class GetIdCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsGetIdCommandMod.GetIdCommand {
    def this(input: GetIdInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "GetIdentityPoolRolesCommand")
  @js.native
  open class GetIdentityPoolRolesCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsGetIdentityPoolRolesCommandMod.GetIdentityPoolRolesCommand {
    def this(input: GetIdentityPoolRolesInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "GetOpenIdTokenCommand")
  @js.native
  open class GetOpenIdTokenCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsGetOpenIdTokenCommandMod.GetOpenIdTokenCommand {
    def this(input: GetOpenIdTokenInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "GetOpenIdTokenForDeveloperIdentityCommand")
  @js.native
  open class GetOpenIdTokenForDeveloperIdentityCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsGetOpenIdTokenForDeveloperIdentityCommandMod.GetOpenIdTokenForDeveloperIdentityCommand {
    def this(input: GetOpenIdTokenForDeveloperIdentityInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "ListIdentitiesCommand")
  @js.native
  open class ListIdentitiesCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsListIdentitiesCommandMod.ListIdentitiesCommand {
    def this(input: ListIdentitiesInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "ListIdentityPoolsCommand")
  @js.native
  open class ListIdentityPoolsCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsListIdentityPoolsCommandMod.ListIdentityPoolsCommand {
    def this(input: ListIdentityPoolsInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "LookupDeveloperIdentityCommand")
  @js.native
  open class LookupDeveloperIdentityCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsLookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommand {
    def this(input: LookupDeveloperIdentityInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "MergeDeveloperIdentitiesCommand")
  @js.native
  open class MergeDeveloperIdentitiesCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsMergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommand {
    def this(input: MergeDeveloperIdentitiesInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "SetIdentityPoolRolesCommand")
  @js.native
  open class SetIdentityPoolRolesCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsSetIdentityPoolRolesCommandMod.SetIdentityPoolRolesCommand {
    def this(input: SetIdentityPoolRolesInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "UnlinkDeveloperIdentityCommand")
  @js.native
  open class UnlinkDeveloperIdentityCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsUnlinkDeveloperIdentityCommandMod.UnlinkDeveloperIdentityCommand {
    def this(input: UnlinkDeveloperIdentityInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "UnlinkIdentityCommand")
  @js.native
  open class UnlinkIdentityCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsUnlinkIdentityCommandMod.UnlinkIdentityCommand {
    def this(input: UnlinkIdentityInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "UpdateIdentityPoolCommand")
  @js.native
  open class UpdateIdentityPoolCommand protected ()
    extends typingsJapgolly.awsSdkClientCognitoIdentityBrowser.commandsUpdateIdentityPoolCommandMod.UpdateIdentityPoolCommand {
    def this(input: UpdateIdentityPoolInput) = this()
  }
  
  @JSImport("@aws-sdk/client-cognito-identity-browser", "configurationProperties")
  @js.native
  val configurationProperties: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ConfigurationDefinition<CognitoIdentityResolvableConfiguration, CognitoIdentityResolvedConfiguration> */ Any = js.native
}
