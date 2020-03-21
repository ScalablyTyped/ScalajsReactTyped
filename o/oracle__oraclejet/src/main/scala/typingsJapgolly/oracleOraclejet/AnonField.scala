package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.ColumnsRendererContext
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.FooterRendererContext
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.HeaderRendererContext
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonField[K, D] extends js.Object {
  var className: js.UndefOr[String | Null] = js.undefined
  var field: js.UndefOr[String | Null] = js.undefined
  var footerClassName: js.UndefOr[String | Null] = js.undefined
  var footerRenderer: js.UndefOr[(js.Function1[/* context */ FooterRendererContext[K, D], Anon1 | Unit]) | Null] = js.undefined
  var footerStyle: js.UndefOr[String | Null] = js.undefined
  var footerTemplate: js.UndefOr[AnonComponentElementElement] = js.undefined
  var headerClassName: js.UndefOr[String | Null] = js.undefined
  var headerRenderer: js.UndefOr[(js.Function1[/* context */ HeaderRendererContext[K, D], Anon1 | Unit]) | Null] = js.undefined
  var headerStyle: js.UndefOr[String | Null] = js.undefined
  var headerTemplate: js.UndefOr[AnonComponentElementData] = js.undefined
  var headerText: js.UndefOr[String | Null] = js.undefined
  var id: js.UndefOr[String | Null] = js.undefined
  var renderer: js.UndefOr[(js.Function1[/* context */ ColumnsRendererContext[K, D], Anon1 | Unit]) | Null] = js.undefined
  var resizable: js.UndefOr[enabled | disabled] = js.undefined
  var sortProperty: js.UndefOr[String | Null] = js.undefined
  var sortable: js.UndefOr[auto | enabled | disabled] = js.undefined
  var style: js.UndefOr[String | Null] = js.undefined
  var template: js.UndefOr[AnonMode] = js.undefined
  var width: js.UndefOr[Double | Null] = js.undefined
}

object AnonField {
  @scala.inline
  def apply[K, D](
    className: String = null,
    field: String = null,
    footerClassName: String = null,
    footerRenderer: /* context */ FooterRendererContext[K, D] => CallbackTo[Anon1 | Unit] = null,
    footerStyle: String = null,
    footerTemplate: AnonComponentElementElement = null,
    headerClassName: String = null,
    headerRenderer: /* context */ HeaderRendererContext[K, D] => CallbackTo[Anon1 | Unit] = null,
    headerStyle: String = null,
    headerTemplate: AnonComponentElementData = null,
    headerText: String = null,
    id: String = null,
    renderer: /* context */ ColumnsRendererContext[K, D] => CallbackTo[Anon1 | Unit] = null,
    resizable: enabled | disabled = null,
    sortProperty: String = null,
    sortable: auto | enabled | disabled = null,
    style: String = null,
    template: AnonMode = null,
    width: Int | Double = null
  ): AnonField[K, D] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (footerClassName != null) __obj.updateDynamic("footerClassName")(footerClassName.asInstanceOf[js.Any])
    if (footerRenderer != null) __obj.updateDynamic("footerRenderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.FooterRendererContext[K, D]) => footerRenderer(t0).runNow()))
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle.asInstanceOf[js.Any])
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (headerRenderer != null) __obj.updateDynamic("headerRenderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.HeaderRendererContext[K, D]) => headerRenderer(t0).runNow()))
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.ColumnsRendererContext[K, D]) => renderer(t0).runNow()))
    if (resizable != null) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (sortProperty != null) __obj.updateDynamic("sortProperty")(sortProperty.asInstanceOf[js.Any])
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonField[K, D]]
  }
}

