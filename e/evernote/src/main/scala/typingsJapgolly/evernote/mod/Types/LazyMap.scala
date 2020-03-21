package typingsJapgolly.evernote.mod.Types

import typingsJapgolly.evernote.AnonFullMap
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.LazyMap")
@js.native
class LazyMap () extends js.Object {
  def this(args: AnonFullMap) = this()
  var fullMap: js.UndefOr[Map[String, String]] = js.native
  var keysOnly: js.UndefOr[Set[String]] = js.native
}

