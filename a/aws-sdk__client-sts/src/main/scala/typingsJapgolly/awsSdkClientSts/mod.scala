package typingsJapgolly.awsSdkClientSts

import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypeExpire
import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypeIDPCom
import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypeIDPRej
import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypeInvali
import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypeMalfor
import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypePacked
import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypeRegion
import typingsJapgolly.awsSdkClientSts.anon.PickSTSClientConfiglogger
import typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleCommandMod.AssumeRoleCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleWithSAMLCommandMod.AssumeRoleWithSAMLCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsAssumeRoleWithWebIdentityCommandMod.AssumeRoleWithWebIdentityCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsDecodeAuthorizationMessageCommandMod.DecodeAuthorizationMessageCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetAccessKeyInfoCommandMod.GetAccessKeyInfoCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetCallerIdentityCommandMod.GetCallerIdentityCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetFederationTokenCommandMod.GetFederationTokenCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesCommandsGetSessionTokenCommandMod.GetSessionTokenCommandInput
import typingsJapgolly.awsSdkClientSts.distTypesDefaultStsRoleAssumersMod.DefaultCredentialProvider
import typingsJapgolly.awsSdkClientSts.distTypesDefaultStsRoleAssumersMod.RoleAssumer
import typingsJapgolly.awsSdkClientSts.distTypesDefaultStsRoleAssumersMod.RoleAssumerWithWebIdentity
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleRequest
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleResponse
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleWithSAMLRequest
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleWithSAMLResponse
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleWithWebIdentityRequest
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleWithWebIdentityResponse
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.AssumedRoleUser
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.Credentials
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.DecodeAuthorizationMessageRequest
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.DecodeAuthorizationMessageResponse
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.FederatedUser
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.GetAccessKeyInfoRequest
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.GetAccessKeyInfoResponse
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.GetCallerIdentityRequest
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.GetCallerIdentityResponse
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.GetFederationTokenRequest
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.GetFederationTokenResponse
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.GetSessionTokenRequest
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.GetSessionTokenResponse
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.PolicyDescriptorType
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.Tag
import typingsJapgolly.awsSdkClientSts.distTypesStsclientMod.STSClientConfig
import typingsJapgolly.awsSdkClientSts.distTypesStsclientMod.ServiceInputTypes
import typingsJapgolly.awsSdkClientSts.distTypesStsclientMod.ServiceOutputTypes
import typingsJapgolly.awsSdkSmithyClient.distTypesExceptionsMod.ServiceExceptionOptions
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/client-sts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/client-sts", "AssumeRoleCommand")
  @js.native
  open class AssumeRoleCommand protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesCommandsMod.AssumeRoleCommand {
    def this(input: AssumeRoleCommandInput) = this()
  }
  
  inline def AssumeRoleRequestFilterSensitiveLog(obj: AssumeRoleRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def AssumeRoleResponseFilterSensitiveLog(obj: AssumeRoleResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "AssumeRoleWithSAMLCommand")
  @js.native
  open class AssumeRoleWithSAMLCommand protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesCommandsMod.AssumeRoleWithSAMLCommand {
    def this(input: AssumeRoleWithSAMLCommandInput) = this()
  }
  
  inline def AssumeRoleWithSAMLRequestFilterSensitiveLog(obj: AssumeRoleWithSAMLRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleWithSAMLRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def AssumeRoleWithSAMLResponseFilterSensitiveLog(obj: AssumeRoleWithSAMLResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleWithSAMLResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "AssumeRoleWithWebIdentityCommand")
  @js.native
  open class AssumeRoleWithWebIdentityCommand protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesCommandsMod.AssumeRoleWithWebIdentityCommand {
    def this(input: AssumeRoleWithWebIdentityCommandInput) = this()
  }
  
  inline def AssumeRoleWithWebIdentityRequestFilterSensitiveLog(obj: AssumeRoleWithWebIdentityRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleWithWebIdentityRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def AssumeRoleWithWebIdentityResponseFilterSensitiveLog(obj: AssumeRoleWithWebIdentityResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleWithWebIdentityResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def AssumedRoleUserFilterSensitiveLog(obj: AssumedRoleUser): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumedRoleUserFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def CredentialsFilterSensitiveLog(obj: Credentials): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CredentialsFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "DecodeAuthorizationMessageCommand")
  @js.native
  open class DecodeAuthorizationMessageCommand protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesCommandsMod.DecodeAuthorizationMessageCommand {
    def this(input: DecodeAuthorizationMessageCommandInput) = this()
  }
  
  inline def DecodeAuthorizationMessageRequestFilterSensitiveLog(obj: DecodeAuthorizationMessageRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeAuthorizationMessageRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def DecodeAuthorizationMessageResponseFilterSensitiveLog(obj: DecodeAuthorizationMessageResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeAuthorizationMessageResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "ExpiredTokenException")
  @js.native
  open class ExpiredTokenException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsMod.ExpiredTokenException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeExpire) = this()
  }
  
  inline def FederatedUserFilterSensitiveLog(obj: FederatedUser): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("FederatedUserFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "GetAccessKeyInfoCommand")
  @js.native
  open class GetAccessKeyInfoCommand protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesCommandsMod.GetAccessKeyInfoCommand {
    def this(input: GetAccessKeyInfoCommandInput) = this()
  }
  
  inline def GetAccessKeyInfoRequestFilterSensitiveLog(obj: GetAccessKeyInfoRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAccessKeyInfoRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetAccessKeyInfoResponseFilterSensitiveLog(obj: GetAccessKeyInfoResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAccessKeyInfoResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "GetCallerIdentityCommand")
  @js.native
  open class GetCallerIdentityCommand protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesCommandsMod.GetCallerIdentityCommand {
    def this(input: GetCallerIdentityCommandInput) = this()
  }
  
  inline def GetCallerIdentityRequestFilterSensitiveLog(obj: GetCallerIdentityRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCallerIdentityRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetCallerIdentityResponseFilterSensitiveLog(obj: GetCallerIdentityResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCallerIdentityResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "GetFederationTokenCommand")
  @js.native
  open class GetFederationTokenCommand protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesCommandsMod.GetFederationTokenCommand {
    def this(input: GetFederationTokenCommandInput) = this()
  }
  
  inline def GetFederationTokenRequestFilterSensitiveLog(obj: GetFederationTokenRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetFederationTokenRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetFederationTokenResponseFilterSensitiveLog(obj: GetFederationTokenResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetFederationTokenResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "GetSessionTokenCommand")
  @js.native
  open class GetSessionTokenCommand protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesCommandsMod.GetSessionTokenCommand {
    def this(input: GetSessionTokenCommandInput) = this()
  }
  
  inline def GetSessionTokenRequestFilterSensitiveLog(obj: GetSessionTokenRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSessionTokenRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetSessionTokenResponseFilterSensitiveLog(obj: GetSessionTokenResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSessionTokenResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "IDPCommunicationErrorException")
  @js.native
  open class IDPCommunicationErrorException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsMod.IDPCommunicationErrorException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeIDPCom) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "IDPRejectedClaimException")
  @js.native
  open class IDPRejectedClaimException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsMod.IDPRejectedClaimException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeIDPRej) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "InvalidAuthorizationMessageException")
  @js.native
  open class InvalidAuthorizationMessageException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsMod.InvalidAuthorizationMessageException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "InvalidIdentityTokenException")
  @js.native
  open class InvalidIdentityTokenException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsMod.InvalidIdentityTokenException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "MalformedPolicyDocumentException")
  @js.native
  open class MalformedPolicyDocumentException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsMod.MalformedPolicyDocumentException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeMalfor) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "PackedPolicyTooLargeException")
  @js.native
  open class PackedPolicyTooLargeException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsMod.PackedPolicyTooLargeException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypePacked) = this()
  }
  
  inline def PolicyDescriptorTypeFilterSensitiveLog(obj: PolicyDescriptorType): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("PolicyDescriptorTypeFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts", "RegionDisabledException")
  @js.native
  open class RegionDisabledException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsMod.RegionDisabledException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeRegion) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "STS")
  @js.native
  open class STS protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesStsMod.STS {
    def this(configuration: STSClientConfig) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "STSClient")
  @js.native
  open class STSClient protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesStsclientMod.STSClient {
    def this(configuration: STSClientConfig) = this()
  }
  
  @JSImport("@aws-sdk/client-sts", "STSServiceException")
  @js.native
  open class STSServiceException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsStsserviceexceptionMod.STSServiceException {
    /**
      * @internal
      */
    def this(options: ServiceExceptionOptions) = this()
  }
  
  inline def TagFilterSensitiveLog(obj: Tag): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("TagFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def decorateDefaultCredentialProvider(provider: DefaultCredentialProvider): DefaultCredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("decorateDefaultCredentialProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[DefaultCredentialProvider]
  
  inline def getDefaultRoleAssumer(): RoleAssumer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumer")().asInstanceOf[RoleAssumer]
  inline def getDefaultRoleAssumer(stsOptions: Unit, stsPlugins: js.Array[Pluggable[ServiceInputTypes, ServiceOutputTypes]]): RoleAssumer = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumer")(stsOptions.asInstanceOf[js.Any], stsPlugins.asInstanceOf[js.Any])).asInstanceOf[RoleAssumer]
  inline def getDefaultRoleAssumer(stsOptions: PickSTSClientConfiglogger): RoleAssumer = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumer")(stsOptions.asInstanceOf[js.Any]).asInstanceOf[RoleAssumer]
  inline def getDefaultRoleAssumer(
    stsOptions: PickSTSClientConfiglogger,
    stsPlugins: js.Array[Pluggable[ServiceInputTypes, ServiceOutputTypes]]
  ): RoleAssumer = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumer")(stsOptions.asInstanceOf[js.Any], stsPlugins.asInstanceOf[js.Any])).asInstanceOf[RoleAssumer]
  
  inline def getDefaultRoleAssumerWithWebIdentity(): RoleAssumerWithWebIdentity = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumerWithWebIdentity")().asInstanceOf[RoleAssumerWithWebIdentity]
  inline def getDefaultRoleAssumerWithWebIdentity(stsOptions: Unit, stsPlugins: js.Array[Pluggable[ServiceInputTypes, ServiceOutputTypes]]): RoleAssumerWithWebIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumerWithWebIdentity")(stsOptions.asInstanceOf[js.Any], stsPlugins.asInstanceOf[js.Any])).asInstanceOf[RoleAssumerWithWebIdentity]
  inline def getDefaultRoleAssumerWithWebIdentity(stsOptions: PickSTSClientConfiglogger): RoleAssumerWithWebIdentity = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumerWithWebIdentity")(stsOptions.asInstanceOf[js.Any]).asInstanceOf[RoleAssumerWithWebIdentity]
  inline def getDefaultRoleAssumerWithWebIdentity(
    stsOptions: PickSTSClientConfiglogger,
    stsPlugins: js.Array[Pluggable[ServiceInputTypes, ServiceOutputTypes]]
  ): RoleAssumerWithWebIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRoleAssumerWithWebIdentity")(stsOptions.asInstanceOf[js.Any], stsPlugins.asInstanceOf[js.Any])).asInstanceOf[RoleAssumerWithWebIdentity]
}
