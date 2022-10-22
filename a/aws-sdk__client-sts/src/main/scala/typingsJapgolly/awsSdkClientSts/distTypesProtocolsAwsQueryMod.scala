package typingsJapgolly.awsSdkClientSts

import typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleCommandMod.AssumeRoleCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleCommandMod.AssumeRoleCommandOutput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleWithSAMLCommandMod.AssumeRoleWithSAMLCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleWithSAMLCommandMod.AssumeRoleWithSAMLCommandOutput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommandOutput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsDecodeAuthorizationMessageCommandMod.DecodeAuthorizationMessageCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsDecodeAuthorizationMessageCommandMod.DecodeAuthorizationMessageCommandOutput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetAccessKeyInfoCommandMod.GetAccessKeyInfoCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetAccessKeyInfoCommandMod.GetAccessKeyInfoCommandOutput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetCallerIdentityCommandMod.GetCallerIdentityCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetCallerIdentityCommandMod.GetCallerIdentityCommandOutput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetFederationTokenCommandMod.GetFederationTokenCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetFederationTokenCommandMod.GetFederationTokenCommandOutput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetSessionTokenCommandMod.GetSessionTokenCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetSessionTokenCommandMod.GetSessionTokenCommandOutput
import typingsJapgolly.awsSdkProtocolHttp.mod.HttpRequest
import typingsJapgolly.awsSdkProtocolHttp.mod.HttpResponse
import typingsJapgolly.awsSdkTypes.distTypesSerdeMod.SerdeContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProtocolsAwsQueryMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/protocols/Aws_query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeAwsQueryAssumeRoleCommand(output: HttpResponse, context: SerdeContext): js.Promise[AssumeRoleCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryAssumeRoleCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssumeRoleCommandOutput]]
  
  inline def deserializeAwsQueryAssumeRoleWithSAMLCommand(output: HttpResponse, context: SerdeContext): js.Promise[AssumeRoleWithSAMLCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryAssumeRoleWithSAMLCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssumeRoleWithSAMLCommandOutput]]
  
  inline def deserializeAwsQueryAssumeRoleWithWebIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[AssumeRoleWithWebIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryAssumeRoleWithWebIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssumeRoleWithWebIdentityCommandOutput]]
  
  inline def deserializeAwsQueryDecodeAuthorizationMessageCommand(output: HttpResponse, context: SerdeContext): js.Promise[DecodeAuthorizationMessageCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryDecodeAuthorizationMessageCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DecodeAuthorizationMessageCommandOutput]]
  
  inline def deserializeAwsQueryGetAccessKeyInfoCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetAccessKeyInfoCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryGetAccessKeyInfoCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAccessKeyInfoCommandOutput]]
  
  inline def deserializeAwsQueryGetCallerIdentityCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetCallerIdentityCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryGetCallerIdentityCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCallerIdentityCommandOutput]]
  
  inline def deserializeAwsQueryGetFederationTokenCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetFederationTokenCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryGetFederationTokenCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetFederationTokenCommandOutput]]
  
  inline def deserializeAwsQueryGetSessionTokenCommand(output: HttpResponse, context: SerdeContext): js.Promise[GetSessionTokenCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeAws_queryGetSessionTokenCommand")(output.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSessionTokenCommandOutput]]
  
  inline def serializeAwsQueryAssumeRoleCommand(input: AssumeRoleCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryAssumeRoleCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsQueryAssumeRoleWithSAMLCommand(input: AssumeRoleWithSAMLCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryAssumeRoleWithSAMLCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsQueryAssumeRoleWithWebIdentityCommand(input: AssumeRoleWithWebIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryAssumeRoleWithWebIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsQueryDecodeAuthorizationMessageCommand(input: DecodeAuthorizationMessageCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryDecodeAuthorizationMessageCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsQueryGetAccessKeyInfoCommand(input: GetAccessKeyInfoCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryGetAccessKeyInfoCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsQueryGetCallerIdentityCommand(input: GetCallerIdentityCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryGetCallerIdentityCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsQueryGetFederationTokenCommand(input: GetFederationTokenCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryGetFederationTokenCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def serializeAwsQueryGetSessionTokenCommand(input: GetSessionTokenCommandInput, context: SerdeContext): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeAws_queryGetSessionTokenCommand")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
}
