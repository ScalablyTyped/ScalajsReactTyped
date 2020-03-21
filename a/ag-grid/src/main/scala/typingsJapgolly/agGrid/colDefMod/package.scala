package typingsJapgolly.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object colDefMod {
  type ColSpanParams = typingsJapgolly.agGrid.colDefMod.BaseColDefParams
  type IAggFunc = js.Function1[/* input */ js.Array[js.Any], js.Any]
  type IsColumnFunc = js.Function1[/* params */ typingsJapgolly.agGrid.colDefMod.IsColumnFuncParams, scala.Boolean]
  type RowSpanParams = typingsJapgolly.agGrid.colDefMod.BaseColDefParams
  type ValueFormatterParams = typingsJapgolly.agGrid.colDefMod.BaseWithValueColDefParams
  type ValueParserParams = typingsJapgolly.agGrid.colDefMod.NewValueParams
  type ValueSetterParams = typingsJapgolly.agGrid.colDefMod.NewValueParams
}
