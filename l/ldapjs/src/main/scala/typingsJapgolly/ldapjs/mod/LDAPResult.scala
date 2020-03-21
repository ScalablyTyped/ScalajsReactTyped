package typingsJapgolly.ldapjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "LDAPResult")
@js.native
class LDAPResult () extends LDAPMessage {
  var connection: js.Any = js.native
  var errorMessage: String = js.native
  var matchedDN: String = js.native
  var referrals: js.Array[String] = js.native
  /** Result status 0 = success */
  var status: Double = js.native
  @JSName("type")
  val type_LDAPResult: typingsJapgolly.ldapjs.ldapjsStrings.LDAPResult = js.native
}

