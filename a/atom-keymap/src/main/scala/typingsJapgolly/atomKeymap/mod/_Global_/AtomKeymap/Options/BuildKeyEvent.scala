package typingsJapgolly.atomKeymap.mod._Global_.AtomKeymap.Options

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildKeyEvent extends js.Object {
  var alt: js.UndefOr[Boolean] = js.undefined
  var cmd: js.UndefOr[Boolean] = js.undefined
  var ctrl: js.UndefOr[Boolean] = js.undefined
  var shift: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var which: js.UndefOr[Double] = js.undefined
}

object BuildKeyEvent {
  @scala.inline
  def apply(
    alt: js.UndefOr[Boolean] = js.undefined,
    cmd: js.UndefOr[Boolean] = js.undefined,
    ctrl: js.UndefOr[Boolean] = js.undefined,
    shift: js.UndefOr[Boolean] = js.undefined,
    target: Element = null,
    which: Int | Double = null
  ): BuildKeyEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alt)) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(cmd)) __obj.updateDynamic("cmd")(cmd.asInstanceOf[js.Any])
    if (!js.isUndefined(ctrl)) __obj.updateDynamic("ctrl")(ctrl.asInstanceOf[js.Any])
    if (!js.isUndefined(shift)) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (which != null) __obj.updateDynamic("which")(which.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildKeyEvent]
  }
}

