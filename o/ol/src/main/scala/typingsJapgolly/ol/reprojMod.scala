package typingsJapgolly.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.projectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/reproj", JSImport.Namespace)
@js.native
object reprojMod extends js.Object {
  def calculateSourceResolution(sourceProj: default, targetProj: default, targetCenter: Coordinate, targetResolution: Double): Double = js.native
  def render(
    width: Double,
    height: Double,
    pixelRatio: Double,
    sourceResolution: Double,
    sourceExtent: Extent,
    targetResolution: Double,
    targetExtent: Extent,
    triangulation: typingsJapgolly.ol.triangulationMod.default,
    sources: js.Array[_],
    gutter: Double
  ): HTMLCanvasElement = js.native
  def render(
    width: Double,
    height: Double,
    pixelRatio: Double,
    sourceResolution: Double,
    sourceExtent: Extent,
    targetResolution: Double,
    targetExtent: Extent,
    triangulation: typingsJapgolly.ol.triangulationMod.default,
    sources: js.Array[_],
    gutter: Double,
    opt_renderEdges: Boolean
  ): HTMLCanvasElement = js.native
}

