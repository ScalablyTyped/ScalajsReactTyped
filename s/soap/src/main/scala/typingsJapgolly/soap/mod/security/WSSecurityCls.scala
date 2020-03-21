package typingsJapgolly.soap.mod.security

import typingsJapgolly.soap.securityMod.WSSecurity
import typingsJapgolly.soap.wssecurityMod.IWSSecurityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "security.WSSecurity")
@js.native
class WSSecurityCls protected () extends WSSecurity {
  def this(username: String, password: String) = this()
  def this(username: String, password: String, options: String) = this()
  def this(username: String, password: String, options: IWSSecurityOptions) = this()
}

