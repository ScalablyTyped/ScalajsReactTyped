package typingsJapgolly.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scaleMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.scaleMod.RangeEnum
    - typingsJapgolly.vegaTypings.scaleMod.RangeRaw
    - typingsJapgolly.vegaTypings.AnonStep
  */
  type RangeBand = typingsJapgolly.vegaTypings.scaleMod._RangeBand | typingsJapgolly.vegaTypings.scaleMod.RangeRaw
  type RangeRaw = js.Array[
    scala.Null | scala.Boolean | java.lang.String | scala.Double | typingsJapgolly.vegaTypings.signalMod.SignalRef | typingsJapgolly.vegaTypings.scaleMod.RangeRawArray
  ]
  type RangeRawArray = js.Array[scala.Double | typingsJapgolly.vegaTypings.signalMod.SignalRef]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.scaleMod.RangeEnum
    - typingsJapgolly.vegaTypings.scaleMod.RangeRaw
    - typingsJapgolly.vegaTypings.signalMod.SignalRef
    - typingsJapgolly.vegaTypings.AnonExtent
  */
  type RangeScheme = typingsJapgolly.vegaTypings.scaleMod._RangeScheme | typingsJapgolly.vegaTypings.scaleMod.RangeRaw
  /* Rewritten from type alias, can be one of: 
    - js.Array[scala.Double | typingsJapgolly.vegaTypings.signalMod.SignalRef]
    - typingsJapgolly.vegaTypings.signalMod.SignalRef
    - typingsJapgolly.vegaTypings.AnonStart
  */
  type ScaleBins = typingsJapgolly.vegaTypings.scaleMod._ScaleBins | (js.Array[scala.Double | typingsJapgolly.vegaTypings.signalMod.SignalRef])
  type ScaleData = typingsJapgolly.vegaTypings.DataRefsortSortField | (typingsJapgolly.vegaTypings.scaleMod.MultiDataRef with typingsJapgolly.vegaTypings.AnonSort)
  type ScaleField = java.lang.String | typingsJapgolly.vegaTypings.signalMod.SignalRef
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsJapgolly.vegaTypings.AnonOrderSortOrder
    - typingsJapgolly.vegaTypings.AnonOp
  */
  type SortField = typingsJapgolly.vegaTypings.scaleMod._SortField | scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsJapgolly.vegaTypings.AnonOpOrder
    - typingsJapgolly.vegaTypings.AnonFieldOp
  */
  type UnionSortField = typingsJapgolly.vegaTypings.scaleMod._UnionSortField | scala.Boolean
}
