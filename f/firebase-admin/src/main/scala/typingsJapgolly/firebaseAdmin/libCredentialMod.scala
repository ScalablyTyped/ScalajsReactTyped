package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCredentialMod.ServiceAccount
import typingsJapgolly.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCredentialMod {
  
  object credential {
    
    @JSImport("firebase-admin/lib/credential", "credential")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof applicationDefaultFn` */
    inline def applicationDefault(): typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("applicationDefault")().asInstanceOf[typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential]
    inline def applicationDefault(httpAgent: Agent): typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("applicationDefault")(httpAgent.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential]
    
    /* was `typeof certFn` */
    inline def cert(serviceAccountPathOrObject: String): typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential]
    inline def cert(serviceAccountPathOrObject: String, httpAgent: Agent): typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential]
    inline def cert(serviceAccountPathOrObject: ServiceAccount): typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential]
    inline def cert(serviceAccountPathOrObject: ServiceAccount, httpAgent: Agent): typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential]
    
    /* was `typeof refreshTokenFn` */
    inline def refreshToken(refreshTokenPathOrObject: String): typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential]
    inline def refreshToken(refreshTokenPathOrObject: String, httpAgent: Agent): typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential]
    inline def refreshToken(refreshTokenPathOrObject: js.Object): typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential]
    inline def refreshToken(refreshTokenPathOrObject: js.Object, httpAgent: Agent): typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential]
    
    /**
      * Interface that provides Google OAuth2 access tokens used to authenticate
      * with Firebase services.
      *
      * In most cases, you will not need to implement this yourself and can instead
      * use the default implementations provided by the `admin.credential` namespace.
      */
    type Credential = typingsJapgolly.firebaseAdmin.libAppCredentialMod.Credential
  }
}
