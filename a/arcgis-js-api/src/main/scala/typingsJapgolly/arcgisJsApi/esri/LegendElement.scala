package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisJsApi.esri.SymbolTableElement
  - typingsJapgolly.arcgisJsApi.esri.ColorRampElement
  - typingsJapgolly.arcgisJsApi.esri.OpacityRampElement
  - typingsJapgolly.arcgisJsApi.esri.SizeRampElement
  - typingsJapgolly.arcgisJsApi.esri.HeatmapRampElement
  - typingsJapgolly.arcgisJsApi.esri.RelationshipRampElement
*/
trait LegendElement extends js.Object

object LegendElement {
  @scala.inline
  def SymbolTableElement(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    infos: js.Array[SymbolTableElementType],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: String,
    legendType: String = null,
    title: String | RendererTitle = null
  ): LegendElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], infos = infos.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (legendType != null) __obj.updateDynamic("legendType")(legendType.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendElement]
  }
  @scala.inline
  def ColorRampElement(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    infos: js.Array[ColorRampStop],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    title: String | RampTitle,
    `type`: String
  ): LegendElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], infos = infos.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendElement]
  }
  @scala.inline
  def RelationshipRampElement(
    colors: js.Array[js.Array[Color_]],
    constructor: js.Function,
    focus: String,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    labels: RelationshipLabels,
    numClasses: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    rotation: Double,
    `type`: String,
    infos: js.Array[_] = null,
    title: String = null
  ): LegendElement = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], numClasses = numClasses.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (infos != null) __obj.updateDynamic("infos")(infos.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendElement]
  }
  @scala.inline
  def HeatmapRampElement(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    infos: js.Array[HeatmapRampStop],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: String,
    title: String | RampTitle = null
  ): LegendElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], infos = infos.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendElement]
  }
  @scala.inline
  def SizeRampElement(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    infos: js.Array[SizeRampStop],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: String,
    title: String | RampTitle = null
  ): LegendElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], infos = infos.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendElement]
  }
  @scala.inline
  def OpacityRampElement(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    infos: js.Array[OpacityRampStop],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: String,
    title: String | RampTitle = null
  ): LegendElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], infos = infos.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendElement]
  }
}

