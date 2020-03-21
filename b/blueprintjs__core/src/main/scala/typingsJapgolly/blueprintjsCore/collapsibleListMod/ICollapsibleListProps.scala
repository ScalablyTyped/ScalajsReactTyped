package typingsJapgolly.blueprintjsCore.collapsibleListMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.blueprintjsCore.boundaryMod.Boundary
import typingsJapgolly.blueprintjsCore.menuItemMod.IMenuItemProps
import typingsJapgolly.blueprintjsCore.popoverMod.IPopoverProps
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollapsibleListProps extends IProps {
  /**
    * Which direction the items should collapse from: start or end of the children.
    * @default Boundary.START
    */
  var collapseFrom: js.UndefOr[Boundary] = js.undefined
  /**
    * Props to pass to the dropdown.
    */
  var dropdownProps: js.UndefOr[IPopoverProps] = js.undefined
  /**
    * Element to render as dropdown target with `CLICK` interaction to show collapsed menu.
    */
  var dropdownTarget: Element
  /**
    * CSS class names to add to `<li>` tags containing each visible item and the dropdown.
    */
  var visibleItemClassName: js.UndefOr[String] = js.undefined
  /**
    * Exact number of visible items.
    * @default 3
    */
  var visibleItemCount: js.UndefOr[Double] = js.undefined
  /**
    * Callback invoked to render each visible item. The item will be wrapped in an `li` with
    * the optional `visibleItemClassName` prop.
    */
  def visibleItemRenderer(props: IMenuItemProps, index: Double): Element
}

object ICollapsibleListProps {
  @scala.inline
  def apply(
    dropdownTarget: VdomElement,
    visibleItemRenderer: (IMenuItemProps, Double) => CallbackTo[Element],
    className: String = null,
    collapseFrom: Boundary = null,
    dropdownProps: IPopoverProps = null,
    visibleItemClassName: String = null,
    visibleItemCount: Int | Double = null
  ): ICollapsibleListProps = {
    val __obj = js.Dynamic.literal()
    if (dropdownTarget != null) __obj.updateDynamic("dropdownTarget")(dropdownTarget.rawElement.asInstanceOf[js.Any])
    __obj.updateDynamic("visibleItemRenderer")(js.Any.fromFunction2((t0: typingsJapgolly.blueprintjsCore.menuItemMod.IMenuItemProps, t1: scala.Double) => visibleItemRenderer(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseFrom != null) __obj.updateDynamic("collapseFrom")(collapseFrom.asInstanceOf[js.Any])
    if (dropdownProps != null) __obj.updateDynamic("dropdownProps")(dropdownProps.asInstanceOf[js.Any])
    if (visibleItemClassName != null) __obj.updateDynamic("visibleItemClassName")(visibleItemClassName.asInstanceOf[js.Any])
    if (visibleItemCount != null) __obj.updateDynamic("visibleItemCount")(visibleItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollapsibleListProps]
  }
}

