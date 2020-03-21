package typingsJapgolly.wordpressShortcode.mod

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcodeAttrs extends js.Object {
  var named: Record[String, js.UndefOr[String]]
  var numeric: js.Array[String]
}

object ShortcodeAttrs {
  @scala.inline
  def apply(named: Record[String, js.UndefOr[String]], numeric: js.Array[String]): ShortcodeAttrs = {
    val __obj = js.Dynamic.literal(named = named.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShortcodeAttrs]
  }
}

