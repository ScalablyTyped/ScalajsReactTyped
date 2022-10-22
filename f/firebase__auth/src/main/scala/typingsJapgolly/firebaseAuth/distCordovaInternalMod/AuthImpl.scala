package typingsJapgolly.firebaseAuth.distCordovaInternalMod

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseAuth.distCordovaSrcModelAuthMod.ConfigInternal
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.heartbeat
import typingsJapgolly.firebaseComponent.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/cordova/internal", "AuthImpl")
@js.native
open class AuthImpl protected ()
  extends typingsJapgolly.firebaseAuth.distCordovaSrcCoreAuthAuthImplMod.AuthImpl {
  def this(app: FirebaseApp, heartbeatServiceProvider: Provider[heartbeat], config: ConfigInternal) = this()
}
