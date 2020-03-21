package typingsJapgolly.heremaps.H

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object geo {
  /**
    * A Geographic coordinate that specifies the height of a point in meters. A value of undefined is treated as 0.
    */
  type Altitude = scala.Double
  /**
    * A geographic coordinate that specifies the north-south position of a point on the Earth's surface in the range from -90 to + 90 degrees, inclusive.
    */
  type Latitude = scala.Double
  /**
    * A Geographic coordinate that specifies the east-west position of a point on the Earth's surface in the range from -180 to 180 degrees, inclusive.
    */
  type Longitude = scala.Double
  type Polygon = typingsJapgolly.heremaps.H.geo.Polygon_
}
