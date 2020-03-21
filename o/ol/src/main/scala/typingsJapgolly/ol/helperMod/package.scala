package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object helperMod {
  type UniformLiteralValue = scala.Double | js.Array[scala.Double] | org.scalajs.dom.raw.HTMLCanvasElement | org.scalajs.dom.raw.HTMLImageElement | org.scalajs.dom.raw.ImageData | typingsJapgolly.ol.olMod.Transform
  type UniformValue = typingsJapgolly.ol.helperMod.UniformLiteralValue | (js.Function1[
    /* p0 */ typingsJapgolly.ol.pluggableMapMod.FrameState, 
    typingsJapgolly.ol.helperMod.UniformLiteralValue
  ])
}
