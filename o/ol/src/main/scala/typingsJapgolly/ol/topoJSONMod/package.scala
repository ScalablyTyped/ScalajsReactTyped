package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object topoJSONMod {
  type TopoJSONGeometry = typingsJapgolly.topojsonSpecification.mod.GeometryObject[js.Object]
  type TopoJSONGeometryCollection = typingsJapgolly.topojsonSpecification.mod.GeometryCollection[js.Object]
  type TopoJSONLineString = typingsJapgolly.topojsonSpecification.mod.LineString[js.Object]
  type TopoJSONMultiLineString = typingsJapgolly.topojsonSpecification.mod.MultiLineString[js.Object]
  type TopoJSONMultiPoint = typingsJapgolly.topojsonSpecification.mod.MultiPoint[js.Object]
  type TopoJSONMultiPolygon = typingsJapgolly.topojsonSpecification.mod.MultiPolygon[js.Object]
  type TopoJSONPoint = typingsJapgolly.topojsonSpecification.mod.Point[js.Object]
  type TopoJSONPolygon = typingsJapgolly.topojsonSpecification.mod.Polygon[js.Object]
  type TopoJSONTopology = typingsJapgolly.topojsonSpecification.mod.Topology[
    typingsJapgolly.topojsonSpecification.mod.Objects[typingsJapgolly.topojsonSpecification.mod.Properties]
  ]
}
