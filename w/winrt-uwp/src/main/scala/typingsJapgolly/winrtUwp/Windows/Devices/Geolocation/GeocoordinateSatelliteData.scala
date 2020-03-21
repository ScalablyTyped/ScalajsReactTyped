package typingsJapgolly.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides additional information about a Geocoordinate . This information is only applicable to position estimates obtained using satellite signals. */
@JSGlobal("Windows.Devices.Geolocation.GeocoordinateSatelliteData")
@js.native
abstract class GeocoordinateSatelliteData () extends js.Object {
  /** Gets the horizontal dilution of precision (HDOP) of a Geocoordinate . */
  var horizontalDilutionOfPrecision: Double = js.native
  /** Gets the position dilution of precision (PDOP) of a Geocoordinate . */
  var positionDilutionOfPrecision: Double = js.native
  /** Gets the vertical dilution of precision (VDOP) of a Geocoordinate . */
  var verticalDilutionOfPrecision: Double = js.native
}

