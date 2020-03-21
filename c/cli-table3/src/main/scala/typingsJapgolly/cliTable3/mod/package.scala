package typingsJapgolly.cliTable3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Cell = typingsJapgolly.cliTable3.mod.CellValue | typingsJapgolly.cliTable3.mod.CellOptions
  type CellValue = js.UndefOr[scala.Boolean | scala.Double | java.lang.String | scala.Null]
  type CrossTable = typingsJapgolly.cliTable3.mod.GenericTable[typingsJapgolly.cliTable3.mod.CrossTableRow]
  type CrossTableRow = org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.cliTable3.mod.Cell]]
  type HorizontalTable = typingsJapgolly.cliTable3.mod.GenericTable[typingsJapgolly.cliTable3.mod.HorizontalTableRow]
  type HorizontalTableRow = js.Array[typingsJapgolly.cliTable3.mod.Cell]
  type Table = typingsJapgolly.cliTable3.mod.HorizontalTable | typingsJapgolly.cliTable3.mod.VerticalTable | typingsJapgolly.cliTable3.mod.CrossTable
  type VerticalTable = typingsJapgolly.cliTable3.mod.GenericTable[typingsJapgolly.cliTable3.mod.VerticalTableRow]
  type VerticalTableRow = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.cliTable3.mod.Cell]
}
