package typingsJapgolly.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AUTHENTICATION_TYPE extends StObject
@JSImport("react-native-keychain", "AUTHENTICATION_TYPE")
@js.native
object AUTHENTICATION_TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AUTHENTICATION_TYPE & String] = js.native
  
  @js.native
  sealed trait BIOMETRICS
    extends StObject
       with AUTHENTICATION_TYPE
  /* "AuthenticationWithBiometrics" */ val BIOMETRICS: typingsJapgolly.reactNativeKeychain.mod.AUTHENTICATION_TYPE.BIOMETRICS & String = js.native
  
  @js.native
  sealed trait DEVICE_PASSCODE_OR_BIOMETRICS
    extends StObject
       with AUTHENTICATION_TYPE
  /* "AuthenticationWithBiometricsDevicePasscode" */ val DEVICE_PASSCODE_OR_BIOMETRICS: typingsJapgolly.reactNativeKeychain.mod.AUTHENTICATION_TYPE.DEVICE_PASSCODE_OR_BIOMETRICS & String = js.native
}
