package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A script trigger.
  */
trait Trigger extends js.Object {
  def getEventType(): EventType
  def getHandlerFunction(): String
  def getTriggerSource(): TriggerSource
  def getTriggerSourceId(): String
  def getUniqueId(): String
}

object Trigger {
  @scala.inline
  def apply(
    getEventType: CallbackTo[EventType],
    getHandlerFunction: CallbackTo[String],
    getTriggerSource: CallbackTo[TriggerSource],
    getTriggerSourceId: CallbackTo[String],
    getUniqueId: CallbackTo[String]
  ): Trigger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEventType")(getEventType.toJsFn)
    __obj.updateDynamic("getHandlerFunction")(getHandlerFunction.toJsFn)
    __obj.updateDynamic("getTriggerSource")(getTriggerSource.toJsFn)
    __obj.updateDynamic("getTriggerSourceId")(getTriggerSourceId.toJsFn)
    __obj.updateDynamic("getUniqueId")(getUniqueId.toJsFn)
    __obj.asInstanceOf[Trigger]
  }
}

