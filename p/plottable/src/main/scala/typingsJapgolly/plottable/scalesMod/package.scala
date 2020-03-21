package typingsJapgolly.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scalesMod {
  type IIncludedValuesProvider[D] = js.Function2[
    /* scale */ typingsJapgolly.plottable.scaleMod.Scale[D, js.Any], 
    /* ignoreAnchorState */ js.UndefOr[scala.Boolean], 
    js.Array[D]
  ]
  type IPaddingExceptionsProvider[D] = js.Function1[
    /* scale */ typingsJapgolly.plottable.quantitativeScaleMod.QuantitativeScale[D], 
    js.Array[D]
  ]
}
