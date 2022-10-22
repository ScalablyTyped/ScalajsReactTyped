package typingsJapgolly.awsSdkClientSso

import typingsJapgolly.awsSdkClientSso.distTypesCommandsGetRoleCredentialsCommandMod.GetRoleCredentialsCommandInput
import typingsJapgolly.awsSdkClientSso.distTypesCommandsGetRoleCredentialsCommandMod.GetRoleCredentialsCommandOutput
import typingsJapgolly.awsSdkClientSso.distTypesCommandsListAccountRolesCommandMod.ListAccountRolesCommandInput
import typingsJapgolly.awsSdkClientSso.distTypesCommandsListAccountRolesCommandMod.ListAccountRolesCommandOutput
import typingsJapgolly.awsSdkClientSso.distTypesCommandsListAccountsCommandMod.ListAccountsCommandInput
import typingsJapgolly.awsSdkClientSso.distTypesCommandsListAccountsCommandMod.ListAccountsCommandOutput
import typingsJapgolly.awsSdkClientSso.distTypesCommandsLogoutCommandMod.LogoutCommandInput
import typingsJapgolly.awsSdkClientSso.distTypesCommandsLogoutCommandMod.LogoutCommandOutput
import typingsJapgolly.awsSdkProtocolHttp.mod.HttpRequest
import typingsJapgolly.awsSdkProtocolHttp.mod.HttpResponse
import typingsJapgolly.awsSdkTypes.distTypesSerdeMod.SerdeContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProtocolsAwsRestJson1Mod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/protocols/Aws_restJson1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeAwsRestJson1GetRoleCredentialsCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetRoleCredentialsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_restJson1GetRoleCredentialsCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRoleCredentialsCommandOutput]]
  
  inline def deserializeAwsRestJson1ListAccountRolesCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListAccountRolesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_restJson1ListAccountRolesCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListAccountRolesCommandOutput]]
  
  inline def deserializeAwsRestJson1ListAccountsCommand(output: HttpResponse, context: SerdeContext): js.Promise[ListAccountsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_restJson1ListAccountsCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ListAccountsCommandOutput]]
  
  inline def deserializeAwsRestJson1LogoutCommand(output: HttpResponse, context: SerdeContext): js.Promise[LogoutCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_restJson1LogoutCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LogoutCommandOutput]]
  
  inline def serializeAwsRestJson1GetRoleCredentialsCommand(input: GetRoleCredentialsCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_restJson1GetRoleCredentialsCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsRestJson1ListAccountRolesCommand(input: ListAccountRolesCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_restJson1ListAccountRolesCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsRestJson1ListAccountsCommand(input: ListAccountsCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_restJson1ListAccountsCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsRestJson1LogoutCommand(input: LogoutCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_restJson1LogoutCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
}
