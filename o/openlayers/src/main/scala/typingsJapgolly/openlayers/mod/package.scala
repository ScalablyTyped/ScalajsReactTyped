package typingsJapgolly.openlayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AttributionLike = java.lang.String | (js.Array[typingsJapgolly.openlayers.mod.Attribution | java.lang.String]) | typingsJapgolly.openlayers.mod.Attribution
  type CanvasFunctionType = js.Function5[
    /* extent */ typingsJapgolly.openlayers.mod.Extent_, 
    /* resolution */ scala.Double, 
    /* pixelRatio */ scala.Double, 
    /* size */ typingsJapgolly.openlayers.mod.Size, 
    /* proj */ typingsJapgolly.openlayers.mod.proj.Projection, 
    org.scalajs.dom.raw.HTMLCanvasElement
  ]
  type ColorLike_ = java.lang.String | org.scalajs.dom.raw.CanvasPattern | org.scalajs.dom.raw.CanvasGradient
  type Color_ = (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8ClampedArray
  type CoordinateFormatType = js.Function1[
    /* coords */ js.UndefOr[typingsJapgolly.openlayers.mod.Coordinate_], 
    java.lang.String
  ]
  type Coordinate_ = js.Tuple2[scala.Double, scala.Double]
  type DragBoxEndConditionType = js.Function3[
    /* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent, 
    /* pixel1 */ typingsJapgolly.openlayers.mod.Pixel, 
    /* pixel2 */ typingsJapgolly.openlayers.mod.Pixel, 
    scala.Boolean
  ]
  type DrawGeometryFunctionType = js.Function2[
    /* coords */ typingsJapgolly.openlayers.mod.Coordinate_ | (js.Array[
      js.Array[typingsJapgolly.openlayers.mod.Coordinate_] | typingsJapgolly.openlayers.mod.Coordinate_
    ]), 
    /* geo */ js.UndefOr[typingsJapgolly.openlayers.mod.geom.SimpleGeometry], 
    typingsJapgolly.openlayers.mod.geom.SimpleGeometry
  ]
  type EventsConditionType = js.Function1[/* event */ typingsJapgolly.openlayers.mod.MapBrowserEvent, scala.Boolean]
  type EventsKey = typingsJapgolly.openlayers.mod.GlobalObject
  type EventsListenerFunctionType = js.Function1[/* evt */ typingsJapgolly.openlayers.mod.events.Event, scala.Boolean | scala.Unit]
  type Extent_ = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type FeatureLoader_ = js.Function3[
    /* extent */ typingsJapgolly.openlayers.mod.Extent_, 
    /* resolution */ scala.Double, 
    /* proj */ typingsJapgolly.openlayers.mod.proj.Projection, 
    scala.Unit
  ]
  type FeatureStyleFunction = js.Function1[
    /* resolution */ scala.Double, 
    typingsJapgolly.openlayers.mod.style.Style | js.Array[typingsJapgolly.openlayers.mod.style.Style] | scala.Null
  ]
  type FeatureUrlFunction = js.Function3[
    /* extent */ typingsJapgolly.openlayers.mod.Extent_, 
    /* resolution */ scala.Double, 
    /* proj */ typingsJapgolly.openlayers.mod.proj.Projection, 
    java.lang.String
  ]
  type GlobalObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ImageLoadFunctionType = js.Function2[
    /* image */ typingsJapgolly.openlayers.mod.Image, 
    /* url */ java.lang.String, 
    scala.Unit
  ]
  type ImageState = scala.Double
  type LoadingStrategy_ = js.Function2[
    /* extent */ typingsJapgolly.openlayers.mod.Extent_, 
    /* resolution */ scala.Double, 
    js.Array[typingsJapgolly.openlayers.mod.Extent_]
  ]
  type ModifyEventType = java.lang.String
  type Pixel = js.Tuple2[scala.Double, scala.Double]
  type PreRenderFunction = js.Function2[
    /* map */ typingsJapgolly.openlayers.mod.Map, 
    /* state */ js.UndefOr[typingsJapgolly.openlayers.mod.olx.FrameState], 
    scala.Boolean
  ]
  type ProjectionLike = js.UndefOr[typingsJapgolly.openlayers.mod.proj.Projection | java.lang.String]
  type RasterOperation = js.Function2[
    /* data */ js.Array[js.Array[scala.Double] | org.scalajs.dom.raw.ImageData], 
    /* obj */ typingsJapgolly.openlayers.mod.GlobalObject, 
    js.Array[scala.Double] | org.scalajs.dom.raw.ImageData
  ]
  type SelectFilterFunction = js.Function2[
    /* feature */ typingsJapgolly.openlayers.mod.Feature | typingsJapgolly.openlayers.mod.render.Feature, 
    /* layer */ typingsJapgolly.openlayers.mod.layer.Layer, 
    scala.Boolean
  ]
  type Size = js.Tuple2[scala.Double, scala.Double]
  type StyleFunction = js.Function2[
    /* feature */ typingsJapgolly.openlayers.mod.Feature | typingsJapgolly.openlayers.mod.render.Feature, 
    /* resolution */ scala.Double, 
    typingsJapgolly.openlayers.mod.style.Style | js.Array[typingsJapgolly.openlayers.mod.style.Style] | scala.Null
  ]
  type StyleGeometryFunction = js.Function1[
    /* feature */ typingsJapgolly.openlayers.mod.Feature | typingsJapgolly.openlayers.mod.render.Feature, 
    typingsJapgolly.openlayers.mod.geom.Geometry | typingsJapgolly.openlayers.mod.render.Feature
  ]
  type TileCoord = js.Tuple3[scala.Double, scala.Double, scala.Double]
  type TileLoadFunctionType = js.Function2[
    /* tile */ typingsJapgolly.openlayers.mod.Tile, 
    /* url */ java.lang.String, 
    scala.Unit
  ]
  type TileUrlFunctionType = js.Function3[
    /* coords */ typingsJapgolly.openlayers.mod.TileCoord, 
    /* pixelRatio */ scala.Double, 
    /* proj */ typingsJapgolly.openlayers.mod.proj.Projection, 
    java.lang.String
  ]
  type TransformFunction = js.Function3[
    /* array */ js.Array[scala.Double], 
    /* out */ js.UndefOr[js.Array[scala.Double]], 
    /* dimension */ js.UndefOr[scala.Double], 
    js.Array[scala.Double]
  ]
  type WFSFeatureCollectionMetadata = typingsJapgolly.openlayers.mod.GlobalObject
  type WFSTransactionResponse = typingsJapgolly.openlayers.mod.GlobalObject
}
