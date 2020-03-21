package typingsJapgolly.d3Geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GeoGeometryObjects = typingsJapgolly.geojson.mod.GeometryObject | typingsJapgolly.d3Geo.mod.GeoSphere
  type GeoIdentityTranform = typingsJapgolly.d3Geo.mod.GeoIdentityTransform
  type GeoPermissibleObjects = typingsJapgolly.d3Geo.mod.GeoGeometryObjects | typingsJapgolly.d3Geo.mod.ExtendedGeometryCollection[typingsJapgolly.d3Geo.mod.GeoGeometryObjects] | (typingsJapgolly.d3Geo.mod.ExtendedFeature[
    typingsJapgolly.d3Geo.mod.GeoGeometryObjects | scala.Null, 
    typingsJapgolly.geojson.mod.GeoJsonProperties
  ]) | (typingsJapgolly.d3Geo.mod.ExtendedFeatureCollection[
    typingsJapgolly.d3Geo.mod.ExtendedFeature[
      typingsJapgolly.d3Geo.mod.GeoGeometryObjects | scala.Null, 
      typingsJapgolly.geojson.mod.GeoJsonProperties
    ]
  ])
}
