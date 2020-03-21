package typingsJapgolly.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mapboxGl.mod.BackgroundLayout
    - typingsJapgolly.mapboxGl.mod.FillLayout
    - typingsJapgolly.mapboxGl.mod.FillExtrusionLayout
    - typingsJapgolly.mapboxGl.mod.LineLayout
    - typingsJapgolly.mapboxGl.mod.SymbolLayout
    - typingsJapgolly.mapboxGl.mod.RasterLayout
    - typingsJapgolly.mapboxGl.mod.CircleLayout
    - typingsJapgolly.mapboxGl.mod.HeatmapLayout
    - typingsJapgolly.mapboxGl.mod.HillshadeLayout
  */
  type AnyLayout = typingsJapgolly.mapboxGl.mod._AnyLayout | typingsJapgolly.mapboxGl.mod.BackgroundLayout | typingsJapgolly.mapboxGl.mod.FillLayout | typingsJapgolly.mapboxGl.mod.FillExtrusionLayout | typingsJapgolly.mapboxGl.mod.RasterLayout | typingsJapgolly.mapboxGl.mod.CircleLayout | typingsJapgolly.mapboxGl.mod.HeatmapLayout | typingsJapgolly.mapboxGl.mod.HillshadeLayout
  type BackgroundLayout = typingsJapgolly.mapboxGl.mod.Layout
  type CircleLayout = typingsJapgolly.mapboxGl.mod.Layout
  type EventData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Expression = Array[typingsJapgolly.mapboxGl.mod.ExpressionName | js.Any]
  type FillExtrusionLayout = typingsJapgolly.mapboxGl.mod.Layout
  type FillLayout = typingsJapgolly.mapboxGl.mod.Layout
  type HeatmapLayout = typingsJapgolly.mapboxGl.mod.Layout
  type HillshadeLayout = typingsJapgolly.mapboxGl.mod.Layout
  type LngLatBoundsLike = typingsJapgolly.mapboxGl.mod.LngLatBounds | (js.Tuple2[typingsJapgolly.mapboxGl.mod.LngLatLike, typingsJapgolly.mapboxGl.mod.LngLatLike]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mapboxGl.mod.LngLat
    - typingsJapgolly.mapboxGl.AnonLat
    - typingsJapgolly.mapboxGl.AnonLon
    - js.Tuple2[scala.Double, scala.Double]
  */
  type LngLatLike = typingsJapgolly.mapboxGl.mod._LngLatLike | (js.Tuple2[scala.Double, scala.Double])
  type PointLike = typingsJapgolly.mapboxGl.mod.Point | (js.Tuple2[scala.Double, scala.Double])
  type PromoteIdSpecification = org.scalablytyped.runtime.StringDictionary[java.lang.String] | java.lang.String
  type RasterLayout = typingsJapgolly.mapboxGl.mod.Layout
  type Sources = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.mapboxGl.mod.AnySourceData]
  type TransformRequestFunction = js.Function2[
    /* url */ java.lang.String, 
    /* resourceType */ typingsJapgolly.mapboxGl.mod.ResourceType, 
    typingsJapgolly.mapboxGl.mod.RequestParameters
  ]
}
