package typingsJapgolly.highcharts.mod

import typingsJapgolly.highcharts.highchartsStrings.drillupall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrillupAllEventObject extends js.Object {
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function
  /**
    * The event target.
    */
  var target: Chart_
  /**
    * The event type.
    */
  var `type`: drillupall
}

object DrillupAllEventObject {
  @scala.inline
  def apply(preventDefault: js.Function, target: Chart_, `type`: drillupall): DrillupAllEventObject = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrillupAllEventObject]
  }
}

