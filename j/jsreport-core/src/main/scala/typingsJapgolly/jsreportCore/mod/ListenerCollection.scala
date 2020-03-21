package typingsJapgolly.jsreportCore.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerCollection extends js.Object {
  def add(
    `type`: String,
    callback: js.Function3[
      /* req */ Request, 
      /* res */ Response, 
      /* err */ js.UndefOr[js.Any], 
      js.Promise[_] | Unit
    ]
  ): Unit
}

object ListenerCollection {
  @scala.inline
  def apply(
    add: (String, js.Function3[
      /* req */ Request, 
      /* res */ Response, 
      /* err */ js.UndefOr[js.Any], 
      js.Promise[js.Any] | Unit
    ]) => Callback
  ): ListenerCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function3[
  /* req */ typingsJapgolly.jsreportCore.mod.Request, 
  /* res */ typingsJapgolly.jsreportCore.mod.Response, 
  /* err */ js.UndefOr[js.Any], 
  js.Promise[js.Any] | scala.Unit]) => add(t0, t1).runNow()))
    __obj.asInstanceOf[ListenerCollection]
  }
}

