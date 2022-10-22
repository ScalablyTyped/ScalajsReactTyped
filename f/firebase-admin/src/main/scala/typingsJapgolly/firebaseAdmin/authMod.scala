package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object authMod {
  
  @JSImport("firebase-admin/auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/auth", "Auth")
  @js.native
  open class Auth ()
    extends typingsJapgolly.firebaseAdmin.libAuthMod.Auth
  
  /* note: abstract class */ @JSImport("firebase-admin/auth", "BaseAuth")
  @js.native
  open class BaseAuth ()
    extends typingsJapgolly.firebaseAdmin.libAuthMod.BaseAuth
  
  /* note: abstract class */ @JSImport("firebase-admin/auth", "MultiFactorInfo")
  @js.native
  open class MultiFactorInfo ()
    extends typingsJapgolly.firebaseAdmin.libAuthMod.MultiFactorInfo
  
  @JSImport("firebase-admin/auth", "MultiFactorSettings")
  @js.native
  open class MultiFactorSettings ()
    extends typingsJapgolly.firebaseAdmin.libAuthMod.MultiFactorSettings
  
  @JSImport("firebase-admin/auth", "PhoneMultiFactorInfo")
  @js.native
  open class PhoneMultiFactorInfo ()
    extends typingsJapgolly.firebaseAdmin.libAuthMod.PhoneMultiFactorInfo
  
  @JSImport("firebase-admin/auth", "Tenant")
  @js.native
  open class Tenant ()
    extends typingsJapgolly.firebaseAdmin.libAuthMod.Tenant
  /* static members */
  object Tenant {
    
    @JSImport("firebase-admin/auth", "Tenant")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Validates a tenant options object. Throws an error on failure.
      *
      * @param request - The tenant options object to validate.
      * @param createRequest - Whether this is a create request.
      */
    @JSImport("firebase-admin/auth", "Tenant.validate")
    @js.native
    def validate: Any = js.native
    inline def validate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validate")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("firebase-admin/auth", "TenantAwareAuth")
  @js.native
  open class TenantAwareAuth ()
    extends typingsJapgolly.firebaseAdmin.libAuthMod.TenantAwareAuth
  
  @JSImport("firebase-admin/auth", "TenantManager")
  @js.native
  open class TenantManager ()
    extends typingsJapgolly.firebaseAdmin.libAuthMod.TenantManager
  
  @JSImport("firebase-admin/auth", "UserInfo")
  @js.native
  open class UserInfo ()
    extends typingsJapgolly.firebaseAdmin.libAuthMod.UserInfo
  
  @JSImport("firebase-admin/auth", "UserMetadata")
  @js.native
  open class UserMetadata ()
    extends typingsJapgolly.firebaseAdmin.libAuthMod.UserMetadata
  
  @JSImport("firebase-admin/auth", "UserRecord")
  @js.native
  open class UserRecord ()
    extends typingsJapgolly.firebaseAdmin.libAuthMod.UserRecord
  
  inline def getAuth(): typingsJapgolly.firebaseAdmin.libAuthAuthMod.Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")().asInstanceOf[typingsJapgolly.firebaseAdmin.libAuthAuthMod.Auth]
  inline def getAuth(app: App): typingsJapgolly.firebaseAdmin.libAuthAuthMod.Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libAuthAuthMod.Auth]
}
