package typingsJapgolly.officeUiFabricReact.gridCellTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.officeUiFabricReact.baseButtonClassNamesMod.IButtonClassNames
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridCellProps[T] extends js.Object {
  /**
    * Optional, the CSS class used for when the cell is disabled
    */
  var cellDisabledStyle: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional, the CSS class used for when the cell is selected
    */
  var cellIsSelectedStyle: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional, className(s) to apply
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Optional, if the this option should be diabled
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Method to provide the classnames to style a button.
    * The default value for this prop is the getClassnames func
    * defined in BaseButton.classnames.
    */
  var getClassNames: js.UndefOr[
    js.Function9[
      /* theme */ ITheme, 
      /* className */ String, 
      /* variantClassName */ String, 
      /* iconClassName */ js.UndefOr[String], 
      /* menuIconClassName */ js.UndefOr[String], 
      /* disabled */ Boolean, 
      /* checked */ Boolean, 
      /* expanded */ Boolean, 
      /* isSplit */ js.UndefOr[Boolean], 
      IButtonClassNames
    ]
  ] = js.undefined
  /**
    * Arbitrary unique string associated with this option
    */
  var id: String
  /**
    * Index for this option
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * The option that will be made available to the user
    */
  var item: T
  /**
    * The label for this item.
    * Visible text if this item is a header,
    * tooltip if is this item is normal
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The on click handler
    */
  var onClick: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.undefined
  /**
    * Optional, the onFocus handler
    */
  var onFocus: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.undefined
  /**
    * Optional, the onHover handler
    */
  var onHover: js.UndefOr[js.Function1[/* item */ js.UndefOr[T], Unit]] = js.undefined
  /**
    * Optional, onkeydown handler
    */
  var onKeyDown: js.UndefOr[js.Function1[/* ev */ ReactKeyboardEventFrom[HTMLButtonElement], Unit]] = js.undefined
  /**
    * Optional, mouseEnter handler.
    * @returns true if the event should be processed, false otherwise
    */
  var onMouseEnter: js.UndefOr[js.Function1[/* ev */ ReactMouseEventFrom[HTMLButtonElement], Boolean]] = js.undefined
  /**
    * Optional, mouseLeave handler
    */
  var onMouseLeave: js.UndefOr[js.Function1[/* ev */ ReactMouseEventFrom[HTMLButtonElement], Unit]] = js.undefined
  /**
    * Optional, mouseMove handler
    * @returns true if the event should be processed, false otherwise
    */
  var onMouseMove: js.UndefOr[js.Function1[/* ev */ ReactMouseEventFrom[HTMLButtonElement], Boolean]] = js.undefined
  /**
    * Optional, onWheel handler
    */
  var onWheel: js.UndefOr[js.Function1[/* ev */ ReactMouseEventFrom[HTMLButtonElement], Unit]] = js.undefined
  /**
    * The accessible role for this option
    */
  var role: js.UndefOr[String] = js.undefined
  /**
    * Optional, if the cell is currently selected
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * The render callback to handle rendering the item
    */
  def onRenderItem(item: T): Element
}

object IGridCellProps {
  @scala.inline
  def apply[T](
    id: String,
    item: T,
    onRenderItem: T => CallbackTo[Element],
    cellDisabledStyle: js.Array[String] = null,
    cellIsSelectedStyle: js.Array[String] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    getClassNames: (/* theme */ ITheme, /* className */ String, /* variantClassName */ String, /* iconClassName */ js.UndefOr[String], /* menuIconClassName */ js.UndefOr[String], /* disabled */ Boolean, /* checked */ Boolean, /* expanded */ Boolean, /* isSplit */ js.UndefOr[Boolean]) => CallbackTo[IButtonClassNames] = null,
    index: Int | Double = null,
    label: String = null,
    onClick: /* item */ T => Callback = null,
    onFocus: /* item */ T => Callback = null,
    onHover: /* item */ js.UndefOr[T] => Callback = null,
    onKeyDown: /* ev */ ReactKeyboardEventFrom[HTMLButtonElement] => Callback = null,
    onMouseEnter: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => CallbackTo[Boolean] = null,
    onMouseLeave: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    onMouseMove: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => CallbackTo[Boolean] = null,
    onWheel: /* ev */ ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    role: String = null,
    selected: js.UndefOr[Boolean] = js.undefined
  ): IGridCellProps[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.updateDynamic("onRenderItem")(js.Any.fromFunction1((t0: T) => onRenderItem(t0).runNow()))
    if (cellDisabledStyle != null) __obj.updateDynamic("cellDisabledStyle")(cellDisabledStyle.asInstanceOf[js.Any])
    if (cellIsSelectedStyle != null) __obj.updateDynamic("cellIsSelectedStyle")(cellIsSelectedStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction9((t0: /* theme */ typingsJapgolly.uifabricStyling.ithemeMod.ITheme, t1: /* className */ java.lang.String, t2: /* variantClassName */ java.lang.String, t3: /* iconClassName */ js.UndefOr[java.lang.String], t4: /* menuIconClassName */ js.UndefOr[java.lang.String], t5: /* disabled */ scala.Boolean, t6: /* checked */ scala.Boolean, t7: /* expanded */ scala.Boolean, t8: /* isSplit */ js.UndefOr[scala.Boolean]) => getClassNames(t0, t1, t2, t3, t4, t5, t6, t7, t8).runNow()))
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* item */ T) => onClick(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* item */ T) => onFocus(t0).runNow()))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[T]) => onHover(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* ev */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onKeyDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onMouseMove(t0).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onWheel(t0).runNow()))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridCellProps[T]]
  }
}

