package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for calendar triggers.
  */
trait CalendarTriggerBuilder extends js.Object {
  def create(): Trigger
  def onEventUpdated(): CalendarTriggerBuilder
}

object CalendarTriggerBuilder {
  @scala.inline
  def apply(create: CallbackTo[Trigger], onEventUpdated: CallbackTo[CalendarTriggerBuilder]): CalendarTriggerBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("onEventUpdated")(onEventUpdated.toJsFn)
    __obj.asInstanceOf[CalendarTriggerBuilder]
  }
}

