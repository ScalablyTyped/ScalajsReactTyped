package typingsJapgolly.topojsonSpecification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Arc = js.Array[typingsJapgolly.topojsonSpecification.mod.Positions]
  type ArcIndexes = js.Array[scala.Double]
  type Objects[P /* <: typingsJapgolly.topojsonSpecification.mod.Properties */] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.topojsonSpecification.mod.GeometryObject[P]]
  type OrNull[T /* <: typingsJapgolly.topojsonSpecification.mod.Objects[js.Object] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | topojson-specification.topojson-specification.NullObject}
    */ typingsJapgolly.topojsonSpecification.topojsonSpecificationStrings.OrNull with T
  type Positions = js.Array[scala.Double]
  type Properties = typingsJapgolly.geojson.mod.GeoJsonProperties
}
