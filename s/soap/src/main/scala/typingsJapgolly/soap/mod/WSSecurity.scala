package typingsJapgolly.soap.mod

import typingsJapgolly.soap.wssecurityMod.IWSSecurityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "WSSecurity")
@js.native
class WSSecurity protected ()
  extends typingsJapgolly.soap.securityMod.WSSecurity {
  def this(username: String, password: String) = this()
  def this(username: String, password: String, options: String) = this()
  def this(username: String, password: String, options: IWSSecurityOptions) = this()
}

