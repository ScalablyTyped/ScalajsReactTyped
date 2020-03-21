package typingsJapgolly.dayzed.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dayzed.AnonCalendars
import typingsJapgolly.dayzed.AnonDateObj
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps extends js.Object {
  var calendars: js.Array[Calendar]
  def getBackProps(data: AnonCalendars): Record[String, _]
  def getDateProps(data: AnonDateObj): Record[String, _]
  def getForwardProps(data: AnonCalendars): Record[String, _]
}

object RenderProps {
  @scala.inline
  def apply(
    calendars: js.Array[Calendar],
    getBackProps: AnonCalendars => CallbackTo[Record[String, js.Any]],
    getDateProps: AnonDateObj => CallbackTo[Record[String, js.Any]],
    getForwardProps: AnonCalendars => CallbackTo[Record[String, js.Any]]
  ): RenderProps = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any])
    __obj.updateDynamic("getBackProps")(js.Any.fromFunction1((t0: typingsJapgolly.dayzed.AnonCalendars) => getBackProps(t0).runNow()))
    __obj.updateDynamic("getDateProps")(js.Any.fromFunction1((t0: typingsJapgolly.dayzed.AnonDateObj) => getDateProps(t0).runNow()))
    __obj.updateDynamic("getForwardProps")(js.Any.fromFunction1((t0: typingsJapgolly.dayzed.AnonCalendars) => getForwardProps(t0).runNow()))
    __obj.asInstanceOf[RenderProps]
  }
}

