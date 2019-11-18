package typingsJapgolly.leaflet.leafletMod.Control

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Control.Attribution")
@js.native
class Attribution ()
  extends typingsJapgolly.leaflet.leafletMod.Control {
  def this(options: AttributionOptions) = this()
  @JSName("options")
  var options_Attribution: AttributionOptions = js.native
  def addAttribution(text: String): this.type = js.native
  def removeAttribution(text: String): this.type = js.native
  def setPrefix(prefix: String): this.type = js.native
}

