package typingsJapgolly.dbJs.DbJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.IDBDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseServer extends js.Object {
  def close(): Unit
  def getIndexedDB(): IDBDatabase
}

object BaseServer {
  @scala.inline
  def apply(close: Callback, getIndexedDB: CallbackTo[IDBDatabase]): BaseServer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("getIndexedDB")(getIndexedDB.toJsFn)
    __obj.asInstanceOf[BaseServer]
  }
}

