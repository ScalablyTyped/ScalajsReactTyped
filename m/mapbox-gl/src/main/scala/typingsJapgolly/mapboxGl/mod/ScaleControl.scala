package typingsJapgolly.mapboxGl.mod

import typingsJapgolly.mapboxGl.AnonMaxWidth
import typingsJapgolly.mapboxGl.mapboxGlStrings.imperial
import typingsJapgolly.mapboxGl.mapboxGlStrings.metric
import typingsJapgolly.mapboxGl.mapboxGlStrings.nautical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "ScaleControl")
@js.native
class ScaleControl () extends Evented {
  def this(options: AnonMaxWidth) = this()
  @JSName("setUnit")
  def setUnit_imperial(unit: imperial): Unit = js.native
  @JSName("setUnit")
  def setUnit_metric(unit: metric): Unit = js.native
  @JSName("setUnit")
  def setUnit_nautical(unit: nautical): Unit = js.native
}

