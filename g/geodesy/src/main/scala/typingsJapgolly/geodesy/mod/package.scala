package typingsJapgolly.geodesy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Datums = typingsJapgolly.geodesy.mod.Plural[typingsJapgolly.geodesy.mod.Datum]
  type Ellipsoids = typingsJapgolly.geodesy.mod.Plural[typingsJapgolly.geodesy.mod.Ellipsoid]
  type Plural[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Polygon[T] = js.Array[T]
  type Transform = js.Tuple7[
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double, 
    scala.Double
  ]
}
