package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import typingsJapgolly.firebaseAdmin.libAuthBaseAuthMod.BaseAuth
import typingsJapgolly.firebaseAdmin.libAuthTenantManagerMod.TenantManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthAuthMod {
  
  @JSImport("firebase-admin/lib/auth/auth", "Auth")
  @js.native
  open class Auth () extends BaseAuth {
    
    /**
      * Returns the app associated with this Auth instance.
      *
      * @returns The app associated with this Auth instance.
      */
    def app: App = js.native
    
    /* private */ val app_ : Any = js.native
    
    /**
      * Returns the tenant manager instance associated with the current project.
      *
      * @returns The tenant manager instance associated with the current project.
      */
    def tenantManager(): TenantManager = js.native
    
    /* private */ val tenantManager_ : Any = js.native
  }
}
