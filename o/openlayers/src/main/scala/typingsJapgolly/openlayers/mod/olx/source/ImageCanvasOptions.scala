package typingsJapgolly.openlayers.mod.olx.source

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsJapgolly.openlayers.mod.AttributionLike
import typingsJapgolly.openlayers.mod.CanvasFunctionType
import typingsJapgolly.openlayers.mod.Extent_
import typingsJapgolly.openlayers.mod.ProjectionLike
import typingsJapgolly.openlayers.mod.Size
import typingsJapgolly.openlayers.mod.olx.LogoOptions
import typingsJapgolly.openlayers.mod.proj.Projection
import typingsJapgolly.openlayers.mod.source.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageCanvasOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  @JSName("canvasFunction")
  var canvasFunction_Original: CanvasFunctionType = js.native
  var logo: js.UndefOr[String | LogoOptions] = js.native
  var projection: ProjectionLike = js.native
  var ratio: js.UndefOr[Double] = js.native
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  var state: js.UndefOr[State] = js.native
  def canvasFunction(extent: Extent_, resolution: Double, pixelRatio: Double, size: Size, proj: Projection): HTMLCanvasElement = js.native
}

