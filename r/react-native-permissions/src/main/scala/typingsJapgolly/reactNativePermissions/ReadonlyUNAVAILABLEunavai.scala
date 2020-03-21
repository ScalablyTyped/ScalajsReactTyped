package typingsJapgolly.reactNativePermissions

import typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.blocked
import typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.denied
import typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.granted
import typingsJapgolly.reactNativePermissions.reactNativePermissionsStrings.unavailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  UNAVAILABLE  :'unavailable',   DENIED  :'denied',   BLOCKED  :'blocked',   GRANTED  :'granted'}> */
trait ReadonlyUNAVAILABLEunavai extends js.Object {
  val BLOCKED: blocked
  val DENIED: denied
  val GRANTED: granted
  val UNAVAILABLE: unavailable
}

object ReadonlyUNAVAILABLEunavai {
  @scala.inline
  def apply(BLOCKED: blocked, DENIED: denied, GRANTED: granted, UNAVAILABLE: unavailable): ReadonlyUNAVAILABLEunavai = {
    val __obj = js.Dynamic.literal(BLOCKED = BLOCKED.asInstanceOf[js.Any], DENIED = DENIED.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any], UNAVAILABLE = UNAVAILABLE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadonlyUNAVAILABLEunavai]
  }
}

