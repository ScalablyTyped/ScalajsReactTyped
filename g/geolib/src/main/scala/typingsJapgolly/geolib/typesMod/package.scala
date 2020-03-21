package typingsJapgolly.geolib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type GeolibAltitudeInputValue = scala.Double
  type GeolibDistanceFn = js.Function2[
    /* point */ typingsJapgolly.geolib.typesMod.GeolibInputCoordinates, 
    /* dest */ typingsJapgolly.geolib.typesMod.GeolibInputCoordinates, 
    scala.Double
  ]
  type GeolibGeoJSONPoint = js.Tuple3[
    typingsJapgolly.geolib.typesMod.GeolibLongitudeInputValue, 
    typingsJapgolly.geolib.typesMod.GeolibLatitudeInputValue, 
    js.UndefOr[typingsJapgolly.geolib.typesMod.GeolibAltitudeInputValue]
  ]
  type GeolibInputCoordinates = typingsJapgolly.geolib.typesMod.UserInputCoordinates | typingsJapgolly.geolib.typesMod.GeolibGeoJSONPoint
  type GeolibInputCoordinatesWithTime = typingsJapgolly.geolib.typesMod.GeolibInputCoordinates with typingsJapgolly.geolib.AnonTime
  type GeolibLatitudeInputValue = scala.Double | java.lang.String
  type GeolibLongitudeInputValue = scala.Double | java.lang.String
  type Timestamp = scala.Double
  type UserInputCoordinates = typingsJapgolly.geolib.typesMod.GeolibInputLongitude with typingsJapgolly.geolib.typesMod.GeolibInputLatitude with typingsJapgolly.geolib.typesMod.GeolibInputAltitude
}
