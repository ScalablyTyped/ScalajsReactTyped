package typingsJapgolly.reactMapGl.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mapboxGl.mod.AnyLayout
import typingsJapgolly.mapboxGl.mod.BackgroundPaint
import typingsJapgolly.mapboxGl.mod.CirclePaint
import typingsJapgolly.mapboxGl.mod.FillExtrusionPaint
import typingsJapgolly.mapboxGl.mod.FillPaint
import typingsJapgolly.mapboxGl.mod.HeatmapPaint
import typingsJapgolly.mapboxGl.mod.HillshadePaint
import typingsJapgolly.mapboxGl.mod.LinePaint
import typingsJapgolly.mapboxGl.mod.RasterPaint
import typingsJapgolly.mapboxGl.mod.SymbolPaint
import typingsJapgolly.reactMapGl.mod.LayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Layer {
  def apply(
    paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint,
    `type`: String,
    beforeId: String = null,
    filter: js.Array[_] = null,
    id: String = null,
    layout: AnyLayout = null,
    maxzoom: Int | Double = null,
    minzoom: Int | Double = null,
    source: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LayerProps, typingsJapgolly.reactMapGl.mod.Layer, Unit, LayerProps] = {
    val __obj = js.Dynamic.literal(paint = paint.asInstanceOf[js.Any])
  
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (beforeId != null) __obj.updateDynamic("beforeId")(beforeId.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMapGl.mod.LayerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMapGl.mod.Layer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMapGl.mod.LayerProps])(children: _*)
  }
  @JSImport("react-map-gl", "Layer")
  @js.native
  object componentImport extends js.Object
  
}

