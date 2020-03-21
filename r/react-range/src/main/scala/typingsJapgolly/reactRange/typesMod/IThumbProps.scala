package typingsJapgolly.reactRange.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThumbProps extends js.Object {
  var `aria-valuemax`: Double
  var `aria-valuemin`: Double
  var `aria-valuenow`: Double
  var draggable: Boolean
  var key: Double
  var ref: RefHandle[_]
  var role: String
  var style: CSSProperties
  var tabIndex: js.UndefOr[Double] = js.undefined
  def onKeyDown(e: ReactKeyboardEventFrom[Element]): Unit
  def onKeyUp(e: ReactKeyboardEventFrom[Element]): Unit
}

object IThumbProps {
  @scala.inline
  def apply(
    `aria-valuemax`: Double,
    `aria-valuemin`: Double,
    `aria-valuenow`: Double,
    draggable: Boolean,
    key: Double,
    onKeyDown: ReactKeyboardEventFrom[Element] => Callback,
    onKeyUp: ReactKeyboardEventFrom[Element] => Callback,
    ref: RefHandle[_],
    role: String,
    style: CSSProperties,
    tabIndex: Int | Double = null
  ): IThumbProps = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => onKeyUp(t0).runNow()))
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThumbProps]
  }
}

