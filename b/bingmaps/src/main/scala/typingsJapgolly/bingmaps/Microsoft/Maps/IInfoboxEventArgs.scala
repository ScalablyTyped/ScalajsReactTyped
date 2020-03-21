package typingsJapgolly.bingmaps.Microsoft.Maps

import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInfoboxEventArgs extends js.Object {
  /** The event that occurred. **/
  var eventName: String
  /** Original mouse event from the browser. */
  var originalEvent: js.UndefOr[MouseEvent] = js.undefined
  /** The x-value of the pixel coordinate on the page of the mouse cursor. **/
  var pageX: Double
  /** The y-value of the pixel coordinate on the page of the mouse cursor. **/
  var pageY: Double
  /** The infobox object that fired the event. **/
  var target: Infobox
  /** The type of the object that fired the event.This will always be 'infobox'. **/
  var targetType: String
}

object IInfoboxEventArgs {
  @scala.inline
  def apply(
    eventName: String,
    pageX: Double,
    pageY: Double,
    target: Infobox,
    targetType: String,
    originalEvent: MouseEvent = null
  ): IInfoboxEventArgs = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfoboxEventArgs]
  }
}

