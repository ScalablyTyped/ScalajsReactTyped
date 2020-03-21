package typingsJapgolly.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stackingUtilsMod {
  type GenericStackingResult[D] = typingsJapgolly.plottable.utilsMod.Map[
    typingsJapgolly.plottable.datasetMod.Dataset, 
    typingsJapgolly.plottable.utilsMod.Map[
      java.lang.String | scala.Double, 
      typingsJapgolly.plottable.stackingUtilsMod.GenericStackedDatum[D]
    ]
  ]
  type IStackingOrder = java.lang.String
  type StackedDatum = typingsJapgolly.plottable.stackingUtilsMod.GenericStackedDatum[java.lang.String]
  type StackingResult = typingsJapgolly.plottable.stackingUtilsMod.GenericStackingResult[java.lang.String]
}
