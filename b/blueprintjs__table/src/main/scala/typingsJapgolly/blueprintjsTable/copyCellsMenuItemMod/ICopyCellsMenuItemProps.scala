package typingsJapgolly.blueprintjsTable.copyCellsMenuItemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.PartialIPopoverProps
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.blueprintjsCore.menuItemMod.IMenuItemProps
import typingsJapgolly.blueprintjsCore.propsMod.MaybeElement
import typingsJapgolly.blueprintjsIcons.iconNameMod.IconName
import typingsJapgolly.blueprintjsTable.menuContextMod.IMenuContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICopyCellsMenuItemProps extends IMenuItemProps {
  /**
    * The `IMenuContext` that launched the menu.
    */
  var context: IMenuContext
  /**
    * If you want to do something after the copy or if you want to notify the
    * user if a copy fails, you may provide this optional callback.
    *
    * Due to browser limitations, the copy can fail. This usually occurs if
    * the selection is too large, like 20,000+ cells. The copy will also fail
    * if the browser does not support the copy method (see
    * `Clipboard.isCopySupported`).
    */
  var onCopy: js.UndefOr[js.Function1[/* success */ Boolean, Unit]] = js.undefined
  /**
    * A callback that returns the data for a specific cell. This need not
    * match the value displayed in the `<Cell>` component. The value will be
    * invisibly added as `textContent` into the DOM before copying.
    */
  def getCellData(row: Double, col: Double): js.Any
}

object ICopyCellsMenuItemProps {
  @scala.inline
  def apply(
    context: IMenuContext,
    getCellData: (Double, Double) => CallbackTo[js.Any],
    active: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    icon: IconName | MaybeElement = null,
    intent: Intent = null,
    label: String = null,
    labelClassName: String = null,
    labelElement: VdomNode = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    onClick: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onCopy: /* success */ Boolean => Callback = null,
    popoverProps: PartialIPopoverProps = null,
    shouldDismissPopover: js.UndefOr[Boolean] = js.undefined,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any = null,
    target: String = null,
    text: VdomNode = null,
    textClassName: String = null
  ): ICopyCellsMenuItemProps = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.updateDynamic("getCellData")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getCellData(t0, t1).runNow()))
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelClassName != null) __obj.updateDynamic("labelClassName")(labelClassName.asInstanceOf[js.Any])
    if (labelElement != null) __obj.updateDynamic("labelElement")(labelElement.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClick(t0).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: /* success */ scala.Boolean) => onCopy(t0).runNow()))
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldDismissPopover)) __obj.updateDynamic("shouldDismissPopover")(shouldDismissPopover.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.rawNode.asInstanceOf[js.Any])
    if (textClassName != null) __obj.updateDynamic("textClassName")(textClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICopyCellsMenuItemProps]
  }
}

