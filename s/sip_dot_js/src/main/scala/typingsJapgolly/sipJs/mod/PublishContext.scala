package typingsJapgolly.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "PublishContext")
@js.native
class PublishContext protected ()
  extends typingsJapgolly.sipJs.publishContextMod.PublishContext {
  def this(ua: typingsJapgolly.sipJs.uAMod.UA, target: String, event: String) = this()
  def this(ua: typingsJapgolly.sipJs.uAMod.UA, target: typingsJapgolly.sipJs.coreMod.URI, event: String) = this()
  def this(ua: typingsJapgolly.sipJs.uAMod.UA, target: String, event: String, options: js.Any) = this()
  def this(
    ua: typingsJapgolly.sipJs.uAMod.UA,
    target: typingsJapgolly.sipJs.coreMod.URI,
    event: String,
    options: js.Any
  ) = this()
}

