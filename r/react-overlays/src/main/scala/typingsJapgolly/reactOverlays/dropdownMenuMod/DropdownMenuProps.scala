package typingsJapgolly.reactOverlays.dropdownMenuMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownMenuProps extends js.Object {
  /**
    * Aligns the dropdown menu to the 'end' of it's placement position.
    * Generally this is provided by the parent `Dropdown` component,
    * but may also be specified as a prop directly.
    */
  var alignEnd: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables the Popper.js `flip` modifier, allowing the Dropdown to
    * automatically adjust it's placement in case of overlap with the viewport or toggle.
    */
  var flip: js.UndefOr[Boolean] = js.undefined
  /**
    * A set of popper options and props passed directly to react-popper's Popper component.
    */
  var popperConfig: js.UndefOr[js.Object] = js.undefined
  /**
    * Override the default event used by RootCloseWrapper.
    */
  var rootCloseEvent: js.UndefOr[String] = js.undefined
  /**
    * Controls the visible state of the menu, generally this is
    * provided by the parent `Dropdown` component,
    * but may also be specified as a prop directly.
    */
  var show: js.UndefOr[Boolean] = js.undefined
  var usePopper: js.UndefOr[Boolean] = js.undefined
  /**
    * A render prop that returns a Menu element. The `props`
    * argument should spread through to **a component that can accept a ref**.
    */
  def children(renderProps: DropdownMenuRenderProps): Element
}

object DropdownMenuProps {
  @scala.inline
  def apply(
    children: DropdownMenuRenderProps => CallbackTo[Element],
    alignEnd: js.UndefOr[Boolean] = js.undefined,
    flip: js.UndefOr[Boolean] = js.undefined,
    popperConfig: js.Object = null,
    rootCloseEvent: String = null,
    show: js.UndefOr[Boolean] = js.undefined,
    usePopper: js.UndefOr[Boolean] = js.undefined
  ): DropdownMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactOverlays.dropdownMenuMod.DropdownMenuRenderProps) => children(t0).runNow()))
    if (!js.isUndefined(alignEnd)) __obj.updateDynamic("alignEnd")(alignEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (popperConfig != null) __obj.updateDynamic("popperConfig")(popperConfig.asInstanceOf[js.Any])
    if (rootCloseEvent != null) __obj.updateDynamic("rootCloseEvent")(rootCloseEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(usePopper)) __obj.updateDynamic("usePopper")(usePopper.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownMenuProps]
  }
}

