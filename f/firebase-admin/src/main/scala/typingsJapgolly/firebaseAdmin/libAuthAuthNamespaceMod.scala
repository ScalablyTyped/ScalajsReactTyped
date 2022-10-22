package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthAuthNamespaceMod {
  
  object auth {
    
    inline def apply(): Auth = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Auth]
    inline def apply(app: App): Auth = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
    
    @JSImport("firebase-admin/lib/auth/auth-namespace", "auth")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.auth#ActionCodeSettings}.
      */
    type ActionCodeSettings = typingsJapgolly.firebaseAdmin.libAuthActionCodeSettingsBuilderMod.ActionCodeSettings
    
    /**
      * Type alias to {@link firebase-admin.auth#Auth}.
      */
    type Auth = typingsJapgolly.firebaseAdmin.libAuthAuthMod.Auth
    
    /**
      * Type alias to {@link firebase-admin.auth#AuthFactorType}.
      */
    type AuthFactorType = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.AuthFactorType
    
    /**
      * Type alias to {@link firebase-admin.auth#AuthProviderConfig}.
      */
    type AuthProviderConfig = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.AuthProviderConfig
    
    /**
      * Type alias to {@link firebase-admin.auth#AuthProviderConfigFilter}.
      */
    type AuthProviderConfigFilter = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.AuthProviderConfigFilter
    
    /**
      * Type alias to {@link firebase-admin.auth#BaseAuth}.
      */
    type BaseAuth = typingsJapgolly.firebaseAdmin.libAuthBaseAuthMod.BaseAuth
    
    /**
      * Type alias to {@link firebase-admin.auth#CreateMultiFactorInfoRequest}.
      */
    type CreateMultiFactorInfoRequest = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.CreateMultiFactorInfoRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#CreatePhoneMultiFactorInfoRequest}.
      */
    type CreatePhoneMultiFactorInfoRequest = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.CreatePhoneMultiFactorInfoRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#CreateRequest}.
      */
    type CreateRequest = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.CreateRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#CreateTenantRequest}.
      */
    type CreateTenantRequest = typingsJapgolly.firebaseAdmin.libAuthTenantMod.CreateTenantRequest
    
    /** @alpha */
    type DecodedAuthBlockingToken = typingsJapgolly.firebaseAdmin.libAuthTokenVerifierMod.DecodedAuthBlockingToken
    
    /**
      * Type alias to {@link firebase-admin.auth#DecodedIdToken}.
      */
    type DecodedIdToken = typingsJapgolly.firebaseAdmin.libAuthTokenVerifierMod.DecodedIdToken
    
    /**
      * Type alias to {@link firebase-admin.auth#DeleteUsersResult}.
      */
    type DeleteUsersResult = typingsJapgolly.firebaseAdmin.libAuthBaseAuthMod.DeleteUsersResult
    
    /**
      * Type alias to {@link firebase-admin.auth#EmailIdentifier}.
      */
    type EmailIdentifier = typingsJapgolly.firebaseAdmin.libAuthIdentifierMod.EmailIdentifier
    
    /**
      * Type alias to {@link firebase-admin.auth#EmailSignInProviderConfig}.
      */
    type EmailSignInProviderConfig = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.EmailSignInProviderConfig
    
    /**
      * Type alias to {@link firebase-admin.auth#GetUsersResult}.
      */
    type GetUsersResult = typingsJapgolly.firebaseAdmin.libAuthBaseAuthMod.GetUsersResult
    
    /**
      * Type alias to {@link firebase-admin.auth#HashAlgorithmType}.
      */
    type HashAlgorithmType = typingsJapgolly.firebaseAdmin.libAuthUserImportBuilderMod.HashAlgorithmType
    
    /**
      * Type alias to {@link firebase-admin.auth#ListProviderConfigResults}.
      */
    type ListProviderConfigResults = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.ListProviderConfigResults
    
    /**
      * Type alias to {@link firebase-admin.auth#ListTenantsResult}.
      */
    type ListTenantsResult = typingsJapgolly.firebaseAdmin.libAuthTenantManagerMod.ListTenantsResult
    
    /**
      * Type alias to {@link firebase-admin.auth#ListUsersResult}.
      */
    type ListUsersResult = typingsJapgolly.firebaseAdmin.libAuthBaseAuthMod.ListUsersResult
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorConfig}.
      */
    type MultiFactorConfig = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.MultiFactorConfig
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorConfigState}.
      */
    type MultiFactorConfigState = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.MultiFactorConfigState
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorCreateSettings}.
      */
    type MultiFactorCreateSettings = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.MultiFactorCreateSettings
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorInfo}.
      */
    type MultiFactorInfo = typingsJapgolly.firebaseAdmin.libAuthUserRecordMod.MultiFactorInfo
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorSettings}.
      */
    type MultiFactorSettings = typingsJapgolly.firebaseAdmin.libAuthUserRecordMod.MultiFactorSettings
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorUpdateSettings}.
      */
    type MultiFactorUpdateSettings = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.MultiFactorUpdateSettings
    
    /**
      * Type alias to {@link firebase-admin.auth#OIDCAuthProviderConfig}.
      */
    type OIDCAuthProviderConfig = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.OIDCAuthProviderConfig
    
    /**
      * Type alias to {@link firebase-admin.auth#OIDCUpdateAuthProviderRequest}.
      */
    type OIDCUpdateAuthProviderRequest = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.OIDCUpdateAuthProviderRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#PhoneIdentifier}.
      */
    type PhoneIdentifier = typingsJapgolly.firebaseAdmin.libAuthIdentifierMod.PhoneIdentifier
    
    /**
      * Type alias to {@link firebase-admin.auth#PhoneMultiFactorInfo}.
      */
    type PhoneMultiFactorInfo = typingsJapgolly.firebaseAdmin.libAuthUserRecordMod.PhoneMultiFactorInfo
    
    /**
      * Type alias to {@link firebase-admin.auth#ProviderIdentifier}.
      */
    type ProviderIdentifier = typingsJapgolly.firebaseAdmin.libAuthIdentifierMod.ProviderIdentifier
    
    /**
      * Type alias to {@link firebase-admin.auth#SAMLAuthProviderConfig}.
      */
    type SAMLAuthProviderConfig = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.SAMLAuthProviderConfig
    
    /**
      * Type alias to {@link firebase-admin.auth#SAMLUpdateAuthProviderRequest}.
      */
    type SAMLUpdateAuthProviderRequest = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.SAMLUpdateAuthProviderRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#SessionCookieOptions}.
      */
    type SessionCookieOptions = typingsJapgolly.firebaseAdmin.libAuthBaseAuthMod.SessionCookieOptions
    
    /**
      * Type alias to {@link firebase-admin.auth#Tenant}.
      */
    type Tenant = typingsJapgolly.firebaseAdmin.libAuthTenantMod.Tenant
    
    /**
      * Type alias to {@link firebase-admin.auth#TenantAwareAuth}.
      */
    type TenantAwareAuth = typingsJapgolly.firebaseAdmin.libAuthTenantManagerMod.TenantAwareAuth
    
    /**
      * Type alias to {@link firebase-admin.auth#TenantManager}.
      */
    type TenantManager = typingsJapgolly.firebaseAdmin.libAuthTenantManagerMod.TenantManager
    
    /**
      * Type alias to {@link firebase-admin.auth#UidIdentifier}.
      */
    type UidIdentifier = typingsJapgolly.firebaseAdmin.libAuthIdentifierMod.UidIdentifier
    
    /**
      * Type alias to {@link firebase-admin.auth#UpdateAuthProviderRequest}.
      */
    type UpdateAuthProviderRequest = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.UpdateAuthProviderRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UpdateMultiFactorInfoRequest}.
      */
    type UpdateMultiFactorInfoRequest = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.UpdateMultiFactorInfoRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UpdatePhoneMultiFactorInfoRequest}.
      */
    type UpdatePhoneMultiFactorInfoRequest = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.UpdatePhoneMultiFactorInfoRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UpdateRequest}.
      */
    type UpdateRequest = typingsJapgolly.firebaseAdmin.libAuthAuthConfigMod.UpdateRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UpdateTenantRequest}.
      */
    type UpdateTenantRequest = typingsJapgolly.firebaseAdmin.libAuthTenantMod.UpdateTenantRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UserIdentifier}.
      */
    type UserIdentifier = typingsJapgolly.firebaseAdmin.libAuthIdentifierMod.UserIdentifier
    
    /**
      * Type alias to {@link firebase-admin.auth#UserImportOptions}.
      */
    type UserImportOptions = typingsJapgolly.firebaseAdmin.libAuthUserImportBuilderMod.UserImportOptions
    
    /**
      * Type alias to {@link firebase-admin.auth#UserImportRecord}.
      */
    type UserImportRecord = typingsJapgolly.firebaseAdmin.libAuthUserImportBuilderMod.UserImportRecord
    
    /**
      * Type alias to {@link firebase-admin.auth#UserImportResult}.
      */
    type UserImportResult = typingsJapgolly.firebaseAdmin.libAuthUserImportBuilderMod.UserImportResult
    
    /**
      * Type alias to {@link firebase-admin.auth#UserInfo}.
      */
    type UserInfo = typingsJapgolly.firebaseAdmin.libAuthUserRecordMod.UserInfo
    
    /**
      * Type alias to {@link firebase-admin.auth#UserMetadata}.
      */
    type UserMetadata = typingsJapgolly.firebaseAdmin.libAuthUserRecordMod.UserMetadata
    
    /**
      * Type alias to {@link firebase-admin.auth#UserMetadataRequest}.
      */
    type UserMetadataRequest = typingsJapgolly.firebaseAdmin.libAuthUserImportBuilderMod.UserMetadataRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UserProviderRequest}.
      */
    type UserProviderRequest = typingsJapgolly.firebaseAdmin.libAuthUserImportBuilderMod.UserProviderRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UserRecord}.
      */
    type UserRecord = typingsJapgolly.firebaseAdmin.libAuthUserRecordMod.UserRecord
  }
}
