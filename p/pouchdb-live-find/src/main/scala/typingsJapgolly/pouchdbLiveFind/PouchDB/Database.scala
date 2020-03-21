package typingsJapgolly.pouchdbLiveFind.PouchDB

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pouchdbLiveFind.PouchDB.LiveFind.LiveFeed
import typingsJapgolly.pouchdbLiveFind.PouchDB.LiveFind.RequestDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Database[Content /* <: js.Object */] extends js.Object {
  def liveFind(requestDef: RequestDef[Content]): LiveFeed[Content]
}

object Database {
  @scala.inline
  def apply[Content /* <: js.Object */](liveFind: RequestDef[Content] => CallbackTo[LiveFeed[Content]]): Database[Content] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("liveFind")(js.Any.fromFunction1((t0: typingsJapgolly.pouchdbLiveFind.PouchDB.LiveFind.RequestDef[Content]) => liveFind(t0).runNow()))
    __obj.asInstanceOf[Database[Content]]
  }
}

