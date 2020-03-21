package typingsJapgolly.reactNativeKeychain.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BIOMETRY_TYPE extends js.Object

@JSImport("react-native-keychain", "BIOMETRY_TYPE")
@js.native
object BIOMETRY_TYPE extends js.Object {
  @js.native
  sealed trait FACE_ID extends BIOMETRY_TYPE
  
  @js.native
  sealed trait FINGERPRINT extends BIOMETRY_TYPE
  
  @js.native
  sealed trait TOUCH_ID extends BIOMETRY_TYPE
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BIOMETRY_TYPE with String] = js.native
  /* "FaceID" */ @js.native
  object FACE_ID extends TopLevel[FACE_ID with String]
  
  /* "Fingerprint" */ @js.native
  object FINGERPRINT extends TopLevel[FINGERPRINT with String]
  
  /* "TouchID" */ @js.native
  object TOUCH_ID extends TopLevel[TOUCH_ID with String]
  
}

