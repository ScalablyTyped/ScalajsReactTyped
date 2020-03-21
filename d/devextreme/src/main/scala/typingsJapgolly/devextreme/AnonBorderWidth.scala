package typingsJapgolly.devextreme

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.devextremeStrings.Bright
import typingsJapgolly.devextreme.devextremeStrings.Carmine
import typingsJapgolly.devextreme.devextremeStrings.Default
import typingsJapgolly.devextreme.devextremeStrings.Material
import typingsJapgolly.devextreme.devextremeStrings.Ocean
import typingsJapgolly.devextreme.devextremeStrings.Office
import typingsJapgolly.devextreme.devextremeStrings.Pastel
import typingsJapgolly.devextreme.devextremeStrings.Soft
import typingsJapgolly.devextreme.devextremeStrings.Vintage
import typingsJapgolly.devextreme.devextremeStrings.Violet
import typingsJapgolly.devextreme.devextremeStrings.`Dark Moon`
import typingsJapgolly.devextreme.devextremeStrings.`Dark Violet`
import typingsJapgolly.devextreme.devextremeStrings.`Green Mist`
import typingsJapgolly.devextreme.devextremeStrings.`Harmony Light`
import typingsJapgolly.devextreme.devextremeStrings.`Soft Blue`
import typingsJapgolly.devextreme.devextremeStrings.`Soft Pastel`
import typingsJapgolly.devextreme.devextremeStrings.area
import typingsJapgolly.devextreme.devextremeStrings.bubble
import typingsJapgolly.devextreme.devextremeStrings.dot
import typingsJapgolly.devextreme.devextremeStrings.image
import typingsJapgolly.devextreme.devextremeStrings.line
import typingsJapgolly.devextreme.devextremeStrings.marker
import typingsJapgolly.devextreme.devextremeStrings.multiple
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.pie
import typingsJapgolly.devextreme.devextremeStrings.single_
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsJapgolly.devextreme.mod.DevExpress.viz.MapLayerElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderWidth extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var colorGroupingField: js.UndefOr[String] = js.undefined
  var colorGroups: js.UndefOr[js.Array[Double]] = js.undefined
  var customize: js.UndefOr[js.Function1[/* elements */ js.Array[MapLayerElement], _]] = js.undefined
  var dataField: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource | DataSourceOptions | String] = js.undefined
  var elementType: js.UndefOr[bubble | dot | image | pie] = js.undefined
  var hoverEnabled: js.UndefOr[Boolean] = js.undefined
  var hoveredBorderColor: js.UndefOr[String] = js.undefined
  var hoveredBorderWidth: js.UndefOr[Double] = js.undefined
  var hoveredColor: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[AnonDataFieldEnabled] = js.undefined
  var maxSize: js.UndefOr[Double] = js.undefined
  var minSize: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  var paletteSize: js.UndefOr[Double] = js.undefined
  var selectedBorderColor: js.UndefOr[String] = js.undefined
  var selectedBorderWidth: js.UndefOr[Double] = js.undefined
  var selectedColor: js.UndefOr[String] = js.undefined
  var selectionMode: js.UndefOr[multiple | none | single_] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var sizeGroupingField: js.UndefOr[String] = js.undefined
  var sizeGroups: js.UndefOr[js.Array[Double]] = js.undefined
  var `type`: js.UndefOr[area | line | marker] = js.undefined
}

object AnonBorderWidth {
  @scala.inline
  def apply(
    borderColor: String = null,
    borderWidth: Int | Double = null,
    color: String = null,
    colorGroupingField: String = null,
    colorGroups: js.Array[Double] = null,
    customize: /* elements */ js.Array[MapLayerElement] => CallbackTo[js.Any] = null,
    dataField: String = null,
    dataSource: js.Any | DataSource | DataSourceOptions | String = null,
    elementType: bubble | dot | image | pie = null,
    hoverEnabled: js.UndefOr[Boolean] = js.undefined,
    hoveredBorderColor: String = null,
    hoveredBorderWidth: Int | Double = null,
    hoveredColor: String = null,
    label: AnonDataFieldEnabled = null,
    maxSize: Int | Double = null,
    minSize: Int | Double = null,
    name: String = null,
    opacity: Int | Double = null,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteSize: Int | Double = null,
    selectedBorderColor: String = null,
    selectedBorderWidth: Int | Double = null,
    selectedColor: String = null,
    selectionMode: multiple | none | single_ = null,
    size: Int | Double = null,
    sizeGroupingField: String = null,
    sizeGroups: js.Array[Double] = null,
    `type`: area | line | marker = null
  ): AnonBorderWidth = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorGroupingField != null) __obj.updateDynamic("colorGroupingField")(colorGroupingField.asInstanceOf[js.Any])
    if (colorGroups != null) __obj.updateDynamic("colorGroups")(colorGroups.asInstanceOf[js.Any])
    if (customize != null) __obj.updateDynamic("customize")(js.Any.fromFunction1((t0: /* elements */ js.Array[typingsJapgolly.devextreme.mod.DevExpress.viz.MapLayerElement]) => customize(t0).runNow()))
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverEnabled)) __obj.updateDynamic("hoverEnabled")(hoverEnabled.asInstanceOf[js.Any])
    if (hoveredBorderColor != null) __obj.updateDynamic("hoveredBorderColor")(hoveredBorderColor.asInstanceOf[js.Any])
    if (hoveredBorderWidth != null) __obj.updateDynamic("hoveredBorderWidth")(hoveredBorderWidth.asInstanceOf[js.Any])
    if (hoveredColor != null) __obj.updateDynamic("hoveredColor")(hoveredColor.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteSize != null) __obj.updateDynamic("paletteSize")(paletteSize.asInstanceOf[js.Any])
    if (selectedBorderColor != null) __obj.updateDynamic("selectedBorderColor")(selectedBorderColor.asInstanceOf[js.Any])
    if (selectedBorderWidth != null) __obj.updateDynamic("selectedBorderWidth")(selectedBorderWidth.asInstanceOf[js.Any])
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeGroupingField != null) __obj.updateDynamic("sizeGroupingField")(sizeGroupingField.asInstanceOf[js.Any])
    if (sizeGroups != null) __obj.updateDynamic("sizeGroups")(sizeGroups.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderWidth]
  }
}

