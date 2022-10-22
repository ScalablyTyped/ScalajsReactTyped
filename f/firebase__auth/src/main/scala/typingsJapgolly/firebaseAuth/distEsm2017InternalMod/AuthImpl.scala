package typingsJapgolly.firebaseAuth.distEsm2017InternalMod

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseAuth.distEsm2017SrcModelAuthMod.ConfigInternal
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.heartbeat
import typingsJapgolly.firebaseComponent.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/esm2017/internal", "AuthImpl")
@js.native
open class AuthImpl protected ()
  extends typingsJapgolly.firebaseAuth.distEsm2017SrcCoreAuthAuthImplMod.AuthImpl {
  def this(app: FirebaseApp, heartbeatServiceProvider: Provider[heartbeat], config: ConfigInternal) = this()
}
