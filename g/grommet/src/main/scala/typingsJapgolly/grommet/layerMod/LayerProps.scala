package typingsJapgolly.grommet.layerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.grommet.grommetStrings.`bottom-left`
import typingsJapgolly.grommet.grommetStrings.`bottom-right`
import typingsJapgolly.grommet.grommetStrings.`top-left`
import typingsJapgolly.grommet.grommetStrings.`top-right`
import typingsJapgolly.grommet.grommetStrings.bottom
import typingsJapgolly.grommet.grommetStrings.center
import typingsJapgolly.grommet.grommetStrings.fadeIn
import typingsJapgolly.grommet.grommetStrings.hidden
import typingsJapgolly.grommet.grommetStrings.horizontal
import typingsJapgolly.grommet.grommetStrings.left
import typingsJapgolly.grommet.grommetStrings.none
import typingsJapgolly.grommet.grommetStrings.right
import typingsJapgolly.grommet.grommetStrings.slide
import typingsJapgolly.grommet.grommetStrings.top
import typingsJapgolly.grommet.grommetStrings.vertical
import typingsJapgolly.grommet.utilsMod.AnimateType
import typingsJapgolly.grommet.utilsMod.KeyboardType
import typingsJapgolly.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerProps extends js.Object {
  var animate: js.UndefOr[AnimateType] = js.undefined
  var animation: js.UndefOr[none | slide | fadeIn | Boolean] = js.undefined
  var full: js.UndefOr[Boolean | vertical | horizontal] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var onClickOutside: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onEsc: js.UndefOr[KeyboardType] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[
    bottom | `bottom-left` | `bottom-right` | center | hidden | left | right | top | `top-left` | `top-right`
  ] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
}

object LayerProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    animation: none | slide | fadeIn | Boolean = null,
    full: Boolean | vertical | horizontal = null,
    margin: MarginType = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    onClickOutside: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onEsc: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    position: bottom | `bottom-left` | `bottom-right` | center | hidden | left | right | top | `top-left` | `top-right` = null,
    responsive: js.UndefOr[Boolean] = js.undefined
  ): LayerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (full != null) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClickOutside(t0).runNow()))
    if (onEsc != null) __obj.updateDynamic("onEsc")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onEsc(t0).runNow()))
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerProps]
  }
}

