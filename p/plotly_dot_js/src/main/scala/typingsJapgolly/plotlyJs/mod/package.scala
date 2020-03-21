package typingsJapgolly.plotlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ButtonClickEvent = js.Function2[
    /* gd */ typingsJapgolly.plotlyJs.mod.PlotlyHTMLElement, 
    /* ev */ org.scalajs.dom.raw.MouseEvent, 
    scala.Unit
  ]
  type Color = java.lang.String | scala.Double | (js.Array[
    js.UndefOr[
      (js.Array[js.UndefOr[java.lang.String | scala.Double | scala.Null]]) | scala.Double | scala.Null | java.lang.String
    ]
  ])
  type ColorScale = java.lang.String | (js.Array[java.lang.String | (js.Tuple2[scala.Double, java.lang.String])])
  type Datum = java.lang.String | scala.Double | js.Date | scala.Null
  type ErrorBar = typingsJapgolly.plotlyJs.PartialErrorOptions with (typingsJapgolly.plotlyJs.AnonType | typingsJapgolly.plotlyJs.AnonArray)
  type MarkerSymbol = java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double])
  type PlotRestyleEvent = js.Tuple2[js.Any, js.Array[scala.Double]]
  type Root = java.lang.String | org.scalajs.dom.raw.HTMLElement
  type ScatterData = typingsJapgolly.plotlyJs.mod.PlotData
  type ScatterMarker = typingsJapgolly.plotlyJs.mod.PlotMarker
  type TypedArray = scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array
}
