package typingsJapgolly.zipkin.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Tracer sends each annotation to a Recorder implementation */
trait Recorder extends js.Object {
  def record(rec: Record): Unit
}

object Recorder {
  @scala.inline
  def apply(record: Record => Callback): Recorder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("record")(js.Any.fromFunction1((t0: typingsJapgolly.zipkin.mod.Record) => record(t0).runNow()))
    __obj.asInstanceOf[Recorder]
  }
}

