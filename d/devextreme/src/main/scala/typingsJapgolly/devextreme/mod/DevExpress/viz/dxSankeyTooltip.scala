package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonBlur
import typingsJapgolly.devextreme.AnonDashStyleOpacity
import typingsJapgolly.devextreme.AnonSource
import typingsJapgolly.devextreme.AnonTitle
import typingsJapgolly.devextreme.AnonWeightIn
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod.DevExpress.ui.format
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSankeyTooltip extends BaseWidgetTooltip {
  /** Customizes link tooltips' appearance. */
  var customizeLinkTooltip: js.UndefOr[js.Function1[/* info */ AnonSource, _]] = js.undefined
  /** Customizes node tooltips' appearance. */
  var customizeNodeTooltip: js.UndefOr[js.Function1[/* info */ AnonTitle, _]] = js.undefined
  /** Specifies a custom template for a link's tooltip. */
  var linkTooltipTemplate: js.UndefOr[
    template | (js.Function2[/* info */ AnonSource, /* element */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** Specifies a custom template for a node's tooltip. */
  var nodeTooltipTemplate: js.UndefOr[
    template | (js.Function2[/* info */ AnonWeightIn, /* element */ dxElement, String | Element | JQuery])
  ] = js.undefined
}

object dxSankeyTooltip {
  @scala.inline
  def apply(
    arrowLength: Int | Double = null,
    border: AnonDashStyleOpacity = null,
    color: String = null,
    container: String | Element | JQuery = null,
    cornerRadius: Int | Double = null,
    customizeLinkTooltip: /* info */ AnonSource => CallbackTo[js.Any] = null,
    customizeNodeTooltip: /* info */ AnonTitle => CallbackTo[js.Any] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    font: Font = null,
    format: format = null,
    linkTooltipTemplate: template | (js.Function2[/* info */ AnonSource, /* element */ dxElement, String | Element | JQuery]) = null,
    nodeTooltipTemplate: template | (js.Function2[/* info */ AnonWeightIn, /* element */ dxElement, String | Element | JQuery]) = null,
    opacity: Int | Double = null,
    paddingLeftRight: Int | Double = null,
    paddingTopBottom: Int | Double = null,
    shadow: AnonBlur = null,
    zIndex: Int | Double = null
  ): dxSankeyTooltip = {
    val __obj = js.Dynamic.literal()
    if (arrowLength != null) __obj.updateDynamic("arrowLength")(arrowLength.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (customizeLinkTooltip != null) __obj.updateDynamic("customizeLinkTooltip")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.devextreme.AnonSource) => customizeLinkTooltip(t0).runNow()))
    if (customizeNodeTooltip != null) __obj.updateDynamic("customizeNodeTooltip")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.devextreme.AnonTitle) => customizeNodeTooltip(t0).runNow()))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (linkTooltipTemplate != null) __obj.updateDynamic("linkTooltipTemplate")(linkTooltipTemplate.asInstanceOf[js.Any])
    if (nodeTooltipTemplate != null) __obj.updateDynamic("nodeTooltipTemplate")(nodeTooltipTemplate.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (paddingLeftRight != null) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.asInstanceOf[js.Any])
    if (paddingTopBottom != null) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSankeyTooltip]
  }
}

