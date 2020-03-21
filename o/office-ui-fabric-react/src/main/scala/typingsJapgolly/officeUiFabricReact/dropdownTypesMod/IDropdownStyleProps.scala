package typingsJapgolly.officeUiFabricReact.dropdownTypesMod

import typingsJapgolly.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Dropdown/Dropdown.types.IDropdownProps, 'theme' | 'className' | 'disabled' | 'required'> & {  hasError  :boolean,   hasLabel  :boolean,   isOpen  :boolean,   isRenderingPlaceholder  :boolean,   panelClassName ? :string,   calloutClassName ? :string,   calloutRenderEdge ? :office-ui-fabric-react.office-ui-fabric-react/lib/utilities/positioning.RectangleEdge} */
trait IDropdownStyleProps extends js.Object {
  /**
    * Optional custom className for the callout that displays in larger viewports, hosting the Dropdown options.
    * This is primarily provided for backwards compatibility.
    */
  var calloutClassName: js.UndefOr[String] = js.undefined
  /**
    * Prop to notify on what edge the dropdown callout was positioned respective to the title.
    */
  var calloutRenderEdge: js.UndefOr[RectangleEdge] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the dropdown is in an error state.
    */
  var hasError: Boolean
  /**
    * Specifies if the dropdown has label content.
    */
  var hasLabel: Boolean
  /**
    * Whether the dropdown is in an opened state.
    */
  var isOpen: Boolean
  /**
    * Whether the dropdown is presently rendering a placeholder.
    */
  var isRenderingPlaceholder: Boolean
  /**
    * Optional custom className for the panel that displays in small viewports, hosting the Dropdown options.
    * This is primarily provided for backwards compatibility.
    */
  var panelClassName: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IDropdownStyleProps {
  @scala.inline
  def apply(
    hasError: Boolean,
    hasLabel: Boolean,
    isOpen: Boolean,
    isRenderingPlaceholder: Boolean,
    calloutClassName: String = null,
    calloutRenderEdge: RectangleEdge = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    panelClassName: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    theme: ITheme = null
  ): IDropdownStyleProps = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], hasLabel = hasLabel.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isRenderingPlaceholder = isRenderingPlaceholder.asInstanceOf[js.Any])
    if (calloutClassName != null) __obj.updateDynamic("calloutClassName")(calloutClassName.asInstanceOf[js.Any])
    if (calloutRenderEdge != null) __obj.updateDynamic("calloutRenderEdge")(calloutRenderEdge.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (panelClassName != null) __obj.updateDynamic("panelClassName")(panelClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownStyleProps]
  }
}

