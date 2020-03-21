package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerClass extends js.Object {
  def Create(name: String, options: TimerCreateOptions, callback: CbCallback): Unit
  def Fetch(name: String, callback: CbCallback): Unit
}

object TimerClass {
  @scala.inline
  def apply(
    Create: (String, TimerCreateOptions, CbCallback) => Callback,
    Fetch: (String, CbCallback) => Callback
  ): TimerClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Create")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.clearbladejsServer.CbServer.TimerCreateOptions, t2: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => Create(t0, t1, t2).runNow()))
    __obj.updateDynamic("Fetch")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => Fetch(t0, t1).runNow()))
    __obj.asInstanceOf[TimerClass]
  }
}

