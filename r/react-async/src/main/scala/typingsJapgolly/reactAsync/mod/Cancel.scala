package typingsJapgolly.reactAsync.mod

import typingsJapgolly.reactAsync.AnonDictmeta
import typingsJapgolly.reactAsync.reactAsyncStrings.cancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-async.react-async.AbstractAction & {  type  :'cancel'} */
trait Cancel
  extends AsyncAction[js.Any] {
  var meta: AnonDictmeta
  var `type`: String with cancel
}

object Cancel {
  @scala.inline
  def apply(meta: AnonDictmeta, `type`: String with cancel): Cancel = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
}

