package typingsJapgolly.mapboxGl.mod

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

@JSImport("mapbox-gl", "ImageSource")
@js.native
class ImageSource ()
  extends ImageSourceRaw
     with AnySourceImpl {
  def this(options: ImageSourceOptions) = this()
  /* CompleteClass */
  override var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_ImageSourceRaw: image_ = js.native
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
  def updateImage(options: ImageSourceOptions): this.type = js.native
}

