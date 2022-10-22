package typingsJapgolly.mapboxGl.mod

import org.scalajs.dom.HTMLVideoElement
import typingsJapgolly.mapboxGl.mapboxGlStrings.`raster-dem`
import typingsJapgolly.mapboxGl.mapboxGlStrings.canvas
import typingsJapgolly.mapboxGl.mapboxGlStrings.custom
import typingsJapgolly.mapboxGl.mapboxGlStrings.geojson
import typingsJapgolly.mapboxGl.mapboxGlStrings.image_
import typingsJapgolly.mapboxGl.mapboxGlStrings.raster
import typingsJapgolly.mapboxGl.mapboxGlStrings.vector
import typingsJapgolly.mapboxGl.mapboxGlStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "VideoSource")
@js.native
open class VideoSource ()
  extends StObject
     with VideoSourceRaw
     with _AnySourceImpl {
  def this(options: VideoSourceOptions) = this()
  
  def getVideo(): HTMLVideoElement = js.native
  
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
  
  /* CompleteClass */
  var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas | custom = js.native
  /* CompleteClass */
  @JSName("type")
  var type_VideoSourceRaw: video = js.native
}
