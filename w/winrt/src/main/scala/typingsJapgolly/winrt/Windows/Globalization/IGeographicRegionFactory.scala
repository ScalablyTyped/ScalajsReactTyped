package typingsJapgolly.winrt.Windows.Globalization

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeographicRegionFactory extends js.Object {
  def createGeographicRegion(geographicRegionCode: String): GeographicRegion
}

object IGeographicRegionFactory {
  @scala.inline
  def apply(createGeographicRegion: String => CallbackTo[GeographicRegion]): IGeographicRegionFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createGeographicRegion")(js.Any.fromFunction1((t0: java.lang.String) => createGeographicRegion(t0).runNow()))
    __obj.asInstanceOf[IGeographicRegionFactory]
  }
}

