package typingsJapgolly.mapboxGl.mod

import typingsJapgolly.mapboxGl.mapboxGlStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "ErrorEvent")
@js.native
class ErrorEvent ()
  extends MapboxEvent[js.UndefOr[scala.Nothing]] {
  var error: js.Error = js.native
  @JSName("type")
  var type_ErrorEvent: error = js.native
}

