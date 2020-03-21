package typingsJapgolly.reactAsync.mod

import typingsJapgolly.reactAsync.AnonDictmeta
import typingsJapgolly.reactAsync.reactAsyncStrings.fulfill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-async.react-async.AbstractAction & {  type  :'fulfill',   payload  :T} */
trait Fulfill[T] extends AsyncAction[T] {
  var meta: AnonDictmeta
  var payload: T
  var `type`: String with fulfill
}

object Fulfill {
  @scala.inline
  def apply[T](meta: AnonDictmeta, payload: T, `type`: String with fulfill): Fulfill[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fulfill[T]]
  }
}

