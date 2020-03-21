package typingsJapgolly.reactAsync.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactAsync.AnonDictmeta
import typingsJapgolly.reactAsync.reactAsyncBooleans.`true`
import typingsJapgolly.reactAsync.reactAsyncStrings.cancel
import typingsJapgolly.reactAsync.reactAsyncStrings.fulfill
import typingsJapgolly.reactAsync.reactAsyncStrings.reject
import typingsJapgolly.reactAsync.reactAsyncStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactAsync.mod.Start
  - typingsJapgolly.reactAsync.mod.Cancel
  - typingsJapgolly.reactAsync.mod.Fulfill[T]
  - typingsJapgolly.reactAsync.mod.Reject
*/
trait AsyncAction[T] extends js.Object

object AsyncAction {
  @scala.inline
  def Start[T](meta: AnonDictmeta, payload: CallbackTo[js.Promise[Unit]], `type`: String with start): AsyncAction[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("payload")(payload.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncAction[T]]
  }
  @scala.inline
  def Cancel[T](meta: AnonDictmeta, `type`: String with cancel): AsyncAction[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncAction[T]]
  }
  @scala.inline
  def Fulfill[T](meta: AnonDictmeta, payload: T, `type`: String with fulfill): AsyncAction[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncAction[T]]
  }
  @scala.inline
  def Reject[T](error: `true`, meta: AnonDictmeta, payload: js.Error, `type`: String with reject): AsyncAction[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncAction[T]]
  }
}

