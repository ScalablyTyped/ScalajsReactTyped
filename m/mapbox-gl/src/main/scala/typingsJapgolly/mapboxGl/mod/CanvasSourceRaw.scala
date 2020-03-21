package typingsJapgolly.mapboxGl.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsJapgolly.mapboxGl.mapboxGlStrings.canvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasSourceRaw
  extends Source
     with CanvasSourceOptions
     with AnySourceData {
  @JSName("type")
  var type_CanvasSourceRaw: canvas
}

object CanvasSourceRaw {
  @scala.inline
  def apply(
    canvas: String | HTMLCanvasElement,
    coordinates: js.Array[js.Array[Double]],
    `type`: canvas,
    animate: js.UndefOr[Boolean] = js.undefined
  ): CanvasSourceRaw = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasSourceRaw]
  }
}

