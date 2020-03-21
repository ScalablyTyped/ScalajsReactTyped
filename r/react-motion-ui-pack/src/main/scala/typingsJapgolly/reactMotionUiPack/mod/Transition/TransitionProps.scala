package typingsJapgolly.reactMotionUiPack.mod.Transition

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactMotion.mod.PlainStyle
import typingsJapgolly.reactMotion.mod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionProps extends js.Object {
  var appear: js.UndefOr[Style] = js.undefined
  var component: js.UndefOr[String | Boolean | Element] = js.undefined
  var enter: js.UndefOr[Style] = js.undefined
  var leave: js.UndefOr[Style] = js.undefined
  var onEnter: js.UndefOr[js.Function1[/* style */ PlainStyle, Unit]] = js.undefined
  var onLeave: js.UndefOr[js.Function1[/* style */ Style, Unit]] = js.undefined
  var runOnMount: js.UndefOr[Boolean] = js.undefined
}

object TransitionProps {
  @scala.inline
  def apply(
    appear: Style = null,
    component: String | Boolean | Element = null,
    enter: Style = null,
    leave: Style = null,
    onEnter: /* style */ PlainStyle => Callback = null,
    onLeave: /* style */ Style => Callback = null,
    runOnMount: js.UndefOr[Boolean] = js.undefined
  ): TransitionProps = {
    val __obj = js.Dynamic.literal()
    if (appear != null) __obj.updateDynamic("appear")(appear.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1((t0: /* style */ typingsJapgolly.reactMotion.mod.PlainStyle) => onEnter(t0).runNow()))
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction1((t0: /* style */ typingsJapgolly.reactMotion.mod.Style) => onLeave(t0).runNow()))
    if (!js.isUndefined(runOnMount)) __obj.updateDynamic("runOnMount")(runOnMount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionProps]
  }
}

