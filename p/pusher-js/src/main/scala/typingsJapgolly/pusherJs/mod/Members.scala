package typingsJapgolly.pusherJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Members[T] extends js.Object {
  var count: Double
  var me: Member[T]
  var members: StringDictionary[Member[T]]
  var myID: String
  /**
    * Calls back for each member in unspecified order.
    */
  def each(callback: js.Function1[/* member */ Member[T], Unit]): Unit
  /**
    * Returns member's info for given id.
    *
    * Resulting object containts two fields - id and info.
    */
  def get(id: String): Null | T
}

object Members {
  @scala.inline
  def apply[T](
    count: Double,
    each: js.Function1[/* member */ Member[T], Unit] => Callback,
    get: String => CallbackTo[Null | T],
    me: Member[T],
    members: StringDictionary[Member[T]],
    myID: String
  ): Members[T] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], me = me.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], myID = myID.asInstanceOf[js.Any])
    __obj.updateDynamic("each")(js.Any.fromFunction1((t0: js.Function1[/* member */ typingsJapgolly.pusherJs.mod.Member[T], scala.Unit]) => each(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.asInstanceOf[Members[T]]
  }
}

