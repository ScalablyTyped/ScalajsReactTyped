package typingsJapgolly.mapboxGl.mod

import org.scalajs.dom.raw.HTMLVideoElement
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

@JSImport("mapbox-gl", "VideoSource")
@js.native
class VideoSource ()
  extends VideoSourceRaw
     with AnySourceImpl {
  def this(options: VideoSourceOptions) = this()
  /* CompleteClass */
  override var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_VideoSourceRaw: video = js.native
  def getVideo(): HTMLVideoElement = js.native
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
}

