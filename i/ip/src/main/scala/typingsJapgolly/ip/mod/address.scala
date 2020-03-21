package typingsJapgolly.ip.mod

import typingsJapgolly.ip.ipStrings.`private`
import typingsJapgolly.ip.ipStrings.ipv4
import typingsJapgolly.ip.ipStrings.ipv6
import typingsJapgolly.ip.ipStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ip", "address")
@js.native
object address extends js.Object {
  def apply(): String = js.native
  def apply(name: String): String = js.native
  def apply(name: `private`, family: ipv4): String = js.native
  def apply(name: `private`, family: ipv6): String = js.native
  def apply(name: public, family: ipv4): String = js.native
  def apply(name: public, family: ipv6): String = js.native
}

