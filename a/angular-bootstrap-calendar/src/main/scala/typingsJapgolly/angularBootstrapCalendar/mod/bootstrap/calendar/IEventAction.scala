package typingsJapgolly.angularBootstrapCalendar.mod.bootstrap.calendar

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventAction extends js.Object {
  /**
  	         * CSS class to be added to the action element
  	         */
  var cssClass: js.UndefOr[String] = js.undefined
  /**
  	         * The label of the action
  	         */
  var label: String
  /**
  	         * The action that occurs when it's clicked
  	         * @param args - the IEvent whose action was clicked
  	         */
  def onClick(args: js.Any): Unit
}

object IEventAction {
  @scala.inline
  def apply(label: String, onClick: js.Any => Callback, cssClass: String = null): IEventAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: js.Any) => onClick(t0).runNow()))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventAction]
  }
}

