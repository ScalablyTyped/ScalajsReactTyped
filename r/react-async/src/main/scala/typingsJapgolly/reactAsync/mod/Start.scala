package typingsJapgolly.reactAsync.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactAsync.AnonDictmeta
import typingsJapgolly.reactAsync.reactAsyncStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-async.react-async.AbstractAction & {  type  :'start', payload (): std.Promise<void>} */
trait Start
  extends AsyncAction[js.Any] {
  var meta: AnonDictmeta
  var `type`: String with start
  def payload(): js.Promise[Unit]
}

object Start {
  @scala.inline
  def apply(meta: AnonDictmeta, payload: CallbackTo[js.Promise[Unit]], `type`: String with start): Start = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("payload")(payload.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
}

