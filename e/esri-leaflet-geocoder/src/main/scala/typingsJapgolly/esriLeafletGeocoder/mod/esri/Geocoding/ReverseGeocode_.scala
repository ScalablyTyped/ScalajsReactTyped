package typingsJapgolly.esriLeafletGeocoder.mod.esri.Geocoding

import typingsJapgolly.esriLeafletGeocoder.AnonAddress
import typingsJapgolly.leaflet.mod.LatLngExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task * / any */ @JSImport("leaflet", "esri.Geocoding.ReverseGeocode")
@js.native
class ReverseGeocode_ () extends js.Object {
  def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ js.Any) = this()
  def distance(distance: Double): this.type = js.native
  def language(language: String): this.type = js.native
  def latlng(latlng: LatLngExpression): this.type = js.native
  def run(
    callback: js.Function3[/* error */ js.UndefOr[js.Any], /* results */ AnonAddress, /* response */ js.Any, Unit]
  ): this.type = js.native
  def run(
    callback: js.Function3[/* error */ js.UndefOr[js.Any], /* results */ AnonAddress, /* response */ js.Any, Unit],
    context: js.Any
  ): this.type = js.native
}

