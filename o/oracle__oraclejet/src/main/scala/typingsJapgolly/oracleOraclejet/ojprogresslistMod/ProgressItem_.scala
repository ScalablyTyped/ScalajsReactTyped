package typingsJapgolly.oracleOraclejet.ojprogresslistMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.oracleOraclejet.ojprogresslistMod.ProgressItem.EventType
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressItem_ extends js.Object {
  def addEventListener(eventType: EventType, listener: EventListener): Unit
  def removeEventListener(eventType: EventType, listener: EventListener): Unit
}

object ProgressItem_ {
  @scala.inline
  def apply(
    addEventListener: (EventType, EventListener) => Callback,
    removeEventListener: (EventType, EventListener) => Callback
  ): ProgressItem_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.oracleOraclejet.ojprogresslistMod.ProgressItem.EventType, t1: typingsJapgolly.std.EventListener) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.oracleOraclejet.ojprogresslistMod.ProgressItem.EventType, t1: typingsJapgolly.std.EventListener) => removeEventListener(t0, t1).runNow()))
    __obj.asInstanceOf[ProgressItem_]
  }
}

