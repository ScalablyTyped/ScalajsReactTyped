package typingsJapgolly.mapboxGl.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsJapgolly.mapboxGl.mapboxGlStrings.`raster-dem`
import typingsJapgolly.mapboxGl.mapboxGlStrings.canvas
import typingsJapgolly.mapboxGl.mapboxGlStrings.geojson
import typingsJapgolly.mapboxGl.mapboxGlStrings.image_
import typingsJapgolly.mapboxGl.mapboxGlStrings.raster
import typingsJapgolly.mapboxGl.mapboxGlStrings.vector
import typingsJapgolly.mapboxGl.mapboxGlStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "CanvasSource")
@js.native
class CanvasSource ()
  extends CanvasSourceRaw
     with AnySourceImpl {
  /* CompleteClass */
  override var canvas: String | HTMLCanvasElement = js.native
  /* CompleteClass */
  override var coordinates: js.Array[js.Array[Double]] = js.native
  /* CompleteClass */
  override var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_CanvasSourceRaw: canvas = js.native
  def getCanvas(): HTMLCanvasElement = js.native
  def pause(): Unit = js.native
  def play(): Unit = js.native
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
}

