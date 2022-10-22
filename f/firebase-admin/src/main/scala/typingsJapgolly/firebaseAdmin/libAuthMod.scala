package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthMod {
  
  @JSImport("firebase-admin/lib/auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/auth", "Auth")
  @js.native
  open class Auth ()
    extends typingsJapgolly.firebaseAdmin.libAuthAuthMod.Auth
  
  /* note: abstract class */ @JSImport("firebase-admin/lib/auth", "BaseAuth")
  @js.native
  open class BaseAuth ()
    extends typingsJapgolly.firebaseAdmin.libAuthBaseAuthMod.BaseAuth
  
  /* note: abstract class */ @JSImport("firebase-admin/lib/auth", "MultiFactorInfo")
  @js.native
  open class MultiFactorInfo ()
    extends typingsJapgolly.firebaseAdmin.libAuthUserRecordMod.MultiFactorInfo
  
  @JSImport("firebase-admin/lib/auth", "MultiFactorSettings")
  @js.native
  open class MultiFactorSettings ()
    extends typingsJapgolly.firebaseAdmin.libAuthUserRecordMod.MultiFactorSettings
  
  @JSImport("firebase-admin/lib/auth", "PhoneMultiFactorInfo")
  @js.native
  open class PhoneMultiFactorInfo ()
    extends typingsJapgolly.firebaseAdmin.libAuthUserRecordMod.PhoneMultiFactorInfo
  
  @JSImport("firebase-admin/lib/auth", "Tenant")
  @js.native
  open class Tenant ()
    extends typingsJapgolly.firebaseAdmin.libAuthTenantMod.Tenant
  /* static members */
  object Tenant {
    
    @JSImport("firebase-admin/lib/auth", "Tenant")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Validates a tenant options object. Throws an error on failure.
      *
      * @param request - The tenant options object to validate.
      * @param createRequest - Whether this is a create request.
      */
    @JSImport("firebase-admin/lib/auth", "Tenant.validate")
    @js.native
    def validate: Any = js.native
    inline def validate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validate")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("firebase-admin/lib/auth", "TenantAwareAuth")
  @js.native
  open class TenantAwareAuth ()
    extends typingsJapgolly.firebaseAdmin.libAuthTenantManagerMod.TenantAwareAuth
  
  @JSImport("firebase-admin/lib/auth", "TenantManager")
  @js.native
  open class TenantManager ()
    extends typingsJapgolly.firebaseAdmin.libAuthTenantManagerMod.TenantManager
  
  @JSImport("firebase-admin/lib/auth", "UserInfo")
  @js.native
  open class UserInfo ()
    extends typingsJapgolly.firebaseAdmin.libAuthUserRecordMod.UserInfo
  
  @JSImport("firebase-admin/lib/auth", "UserMetadata")
  @js.native
  open class UserMetadata ()
    extends typingsJapgolly.firebaseAdmin.libAuthUserRecordMod.UserMetadata
  
  @JSImport("firebase-admin/lib/auth", "UserRecord")
  @js.native
  open class UserRecord ()
    extends typingsJapgolly.firebaseAdmin.libAuthUserRecordMod.UserRecord
  
  inline def getAuth(): typingsJapgolly.firebaseAdmin.libAuthAuthMod.Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")().asInstanceOf[typingsJapgolly.firebaseAdmin.libAuthAuthMod.Auth]
  inline def getAuth(app: App): typingsJapgolly.firebaseAdmin.libAuthAuthMod.Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libAuthAuthMod.Auth]
}
