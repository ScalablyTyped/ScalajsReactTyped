package typingsJapgolly.reactAriaMenubutton.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperProps[T /* <: HTMLElement */]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  /**
  	 * By default, it does automatically close.
  	 * If false, the menu will not automatically close when it
  	 * blurs. Default: `true`.
  	 */
  var closeOnBlur: js.UndefOr[Boolean] = js.undefined
  /**
  	 * By default, it does automatically close.
  	 * If false, the menu will not automatically close when a
  	 * selection is made. Default: `true`.
  	 */
  var closeOnSelection: js.UndefOr[Boolean] = js.undefined
  /**
  	 * A callback to run when the menu is opened or closed.
  	 */
  var onMenuToggle: js.UndefOr[js.Function1[/* obj */ WrapperState, _]] = js.undefined
  /**
  	 * A callback to run when the user makes a selection
  	 * (i.e. clicks or presses Enter or Space on a `MenuItem`).
  	 * It will be passed the value of the selected `MenuItem` and
  	 * the React `SyntheticEvent`.
  	 */
  var onSelection: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ ReactEventFrom[T with Element], _]] = js.undefined
  var tag: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.undefined
}

object WrapperProps {
  @scala.inline
  def apply[T /* <: HTMLElement */](
    AllHTMLAttributes: AllHTMLAttributes[T] = null,
    ClassAttributes: ClassAttributes[T] = null,
    closeOnBlur: js.UndefOr[Boolean] = js.undefined,
    closeOnSelection: js.UndefOr[Boolean] = js.undefined,
    onMenuToggle: /* obj */ WrapperState => CallbackTo[js.Any] = null,
    onSelection: (/* value */ js.Any, /* event */ ReactEventFrom[T with Element]) => CallbackTo[js.Any] = null,
    tag: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any = null
  ): WrapperProps[T] = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(closeOnBlur)) __obj.updateDynamic("closeOnBlur")(closeOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelection)) __obj.updateDynamic("closeOnSelection")(closeOnSelection.asInstanceOf[js.Any])
    if (onMenuToggle != null) __obj.updateDynamic("onMenuToggle")(js.Any.fromFunction1((t0: /* obj */ typingsJapgolly.reactAriaMenubutton.mod.WrapperState) => onMenuToggle(t0).runNow()))
    if (onSelection != null) __obj.updateDynamic("onSelection")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* event */ japgolly.scalajs.react.ReactEventFrom[T with org.scalajs.dom.raw.Element]) => onSelection(t0, t1).runNow()))
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperProps[T]]
  }
}

