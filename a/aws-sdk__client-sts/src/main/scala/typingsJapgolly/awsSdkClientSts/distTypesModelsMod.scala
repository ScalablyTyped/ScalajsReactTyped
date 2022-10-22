package typingsJapgolly.awsSdkClientSts

import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypeExpire
import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypeIDPCom
import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypeIDPRej
import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypeInvali
import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypeMalfor
import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypePacked
import typingsJapgolly.awsSdkClientSts.anon.ExceptionOptionTypeRegion
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModelsMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AssumeRoleRequestFilterSensitiveLog(obj: AssumeRoleRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def AssumeRoleResponseFilterSensitiveLog(obj: AssumeRoleResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def AssumeRoleWithSAMLRequestFilterSensitiveLog(obj: AssumeRoleWithSAMLRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleWithSAMLRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def AssumeRoleWithSAMLResponseFilterSensitiveLog(obj: AssumeRoleWithSAMLResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleWithSAMLResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def AssumeRoleWithWebIdentityRequestFilterSensitiveLog(obj: AssumeRoleWithWebIdentityRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleWithWebIdentityRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def AssumeRoleWithWebIdentityResponseFilterSensitiveLog(obj: AssumeRoleWithWebIdentityResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumeRoleWithWebIdentityResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def AssumedRoleUserFilterSensitiveLog(obj: AssumedRoleUser): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AssumedRoleUserFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def CredentialsFilterSensitiveLog(obj: Credentials): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CredentialsFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def DecodeAuthorizationMessageRequestFilterSensitiveLog(obj: DecodeAuthorizationMessageRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeAuthorizationMessageRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def DecodeAuthorizationMessageResponseFilterSensitiveLog(obj: DecodeAuthorizationMessageResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DecodeAuthorizationMessageResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "ExpiredTokenException")
  @js.native
  open class ExpiredTokenException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.ExpiredTokenException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeExpire) = this()
  }
  
  inline def FederatedUserFilterSensitiveLog(obj: FederatedUser): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("FederatedUserFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetAccessKeyInfoRequestFilterSensitiveLog(obj: GetAccessKeyInfoRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAccessKeyInfoRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetAccessKeyInfoResponseFilterSensitiveLog(obj: GetAccessKeyInfoResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAccessKeyInfoResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetCallerIdentityRequestFilterSensitiveLog(obj: GetCallerIdentityRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCallerIdentityRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetCallerIdentityResponseFilterSensitiveLog(obj: GetCallerIdentityResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCallerIdentityResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetFederationTokenRequestFilterSensitiveLog(obj: GetFederationTokenRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetFederationTokenRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetFederationTokenResponseFilterSensitiveLog(obj: GetFederationTokenResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetFederationTokenResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetSessionTokenRequestFilterSensitiveLog(obj: GetSessionTokenRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSessionTokenRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetSessionTokenResponseFilterSensitiveLog(obj: GetSessionTokenResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSessionTokenResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "IDPCommunicationErrorException")
  @js.native
  open class IDPCommunicationErrorException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.IDPCommunicationErrorException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeIDPCom) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "IDPRejectedClaimException")
  @js.native
  open class IDPRejectedClaimException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.IDPRejectedClaimException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeIDPRej) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "InvalidAuthorizationMessageException")
  @js.native
  open class InvalidAuthorizationMessageException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.InvalidAuthorizationMessageException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "InvalidIdentityTokenException")
  @js.native
  open class InvalidIdentityTokenException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.InvalidIdentityTokenException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "MalformedPolicyDocumentException")
  @js.native
  open class MalformedPolicyDocumentException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.MalformedPolicyDocumentException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeMalfor) = this()
  }
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "PackedPolicyTooLargeException")
  @js.native
  open class PackedPolicyTooLargeException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.PackedPolicyTooLargeException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypePacked) = this()
  }
  
  inline def PolicyDescriptorTypeFilterSensitiveLog(obj: PolicyDescriptorType): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("PolicyDescriptorTypeFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sts/dist-types/models", "RegionDisabledException")
  @js.native
  open class RegionDisabledException protected ()
    extends typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.RegionDisabledException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeRegion) = this()
  }
  
  inline def TagFilterSensitiveLog(obj: Tag): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("TagFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
}
