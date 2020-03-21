package typingsJapgolly.uiGrid.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IAngularEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenuItem extends js.Object {
  /** the method to call when the menu is clicked */
  var action: js.UndefOr[js.Function1[/* $event */ IAngularEvent, Unit]] = js.undefined
  /** a function to evaluate to determine whether or not the item is currently selected */
  var active: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** context to pass to the action function, available in this.context in your handler */
  var context: js.UndefOr[js.Any] = js.undefined
  /** the icon shown alongside that title */
  var icon: js.UndefOr[String] = js.undefined
  /** if set to true, the menu should stay open after the action, defaults to false */
  var leaveOpen: js.UndefOr[Boolean] = js.undefined
  /** a function to evaluate to determine whether or not to show the item */
  var shown: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** controls the title that is displayed in the menu */
  var title: js.UndefOr[String] = js.undefined
}

object IMenuItem {
  @scala.inline
  def apply(
    action: /* $event */ IAngularEvent => Callback = null,
    active: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    context: js.Any = null,
    icon: String = null,
    leaveOpen: js.UndefOr[Boolean] = js.undefined,
    shown: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    title: String = null
  ): IMenuItem = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1((t0: /* $event */ typingsJapgolly.angular.mod.IAngularEvent) => action(t0).runNow()))
    active.foreach(p => __obj.updateDynamic("active")(p.toJsFn))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(leaveOpen)) __obj.updateDynamic("leaveOpen")(leaveOpen.asInstanceOf[js.Any])
    shown.foreach(p => __obj.updateDynamic("shown")(p.toJsFn))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMenuItem]
  }
}

