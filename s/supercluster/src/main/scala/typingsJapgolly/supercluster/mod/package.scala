package typingsJapgolly.supercluster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Default properties type, allowing any properties.
    * Try to avoid this for better typesafety by using proper types.
    */
  type AnyProps = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ClusterFeature[C] = typingsJapgolly.supercluster.mod.PointFeature[typingsJapgolly.supercluster.mod.ClusterProperties with C]
  /**
    * [GeoJSON Feature](https://tools.ietf.org/html/rfc7946#section-3.2),
    * with the geometry being a
    * [GeoJSON Point](https://tools.ietf.org/html/rfc7946#section-3.1.2).
    */
  type PointFeature[P] = typingsJapgolly.geojson.mod.Feature[typingsJapgolly.geojson.mod.Point, P]
}
