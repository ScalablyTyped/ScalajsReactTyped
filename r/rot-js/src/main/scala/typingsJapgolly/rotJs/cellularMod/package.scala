package typingsJapgolly.rotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cellularMod {
  type ConnectionCallback = js.Function2[
    /* from */ typingsJapgolly.rotJs.cellularMod.Point, 
    /* to */ typingsJapgolly.rotJs.cellularMod.Point, 
    scala.Unit
  ]
  type Point = js.Tuple2[scala.Double, scala.Double]
  type PointMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.rotJs.cellularMod.Point]
}
