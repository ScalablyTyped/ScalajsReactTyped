package typingsJapgolly.leafletGeosearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BoundsTuple = js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type OpenStreetMapProviderOptions = typingsJapgolly.leafletGeosearch.mod.OpenStreetMapProviderOptionsOutputFormat with typingsJapgolly.leafletGeosearch.mod.OpenStreetMapProviderOptionsOutputDetails with typingsJapgolly.leafletGeosearch.mod.OpenStreetMapProviderOptionsResultLanguage with typingsJapgolly.leafletGeosearch.mod.OpenStreetMapProviderOptionsResultLimitation with typingsJapgolly.leafletGeosearch.mod.OpenStreetMapProviderOptionsPolygonOutput with typingsJapgolly.leafletGeosearch.mod.OpenStreetMapProviderOptionsOther
  type PointTuple = js.Tuple2[scala.Double, scala.Double]
}
