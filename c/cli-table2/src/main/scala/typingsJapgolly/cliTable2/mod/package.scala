package typingsJapgolly.cliTable2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Cell = typingsJapgolly.cliTable2.mod.CellValue | typingsJapgolly.cliTable2.mod.CellOptions
  type CellValue = js.UndefOr[scala.Boolean | scala.Double | java.lang.String | scala.Null]
  type CrossTable = typingsJapgolly.cliTable2.mod.GenericTable[typingsJapgolly.cliTable2.mod.CrossTableRow]
  type CrossTableRow = org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.cliTable2.mod.Cell]]
  type HorizontalTable = typingsJapgolly.cliTable2.mod.GenericTable[typingsJapgolly.cliTable2.mod.HorizontalTableRow]
  type HorizontalTableRow = js.Array[typingsJapgolly.cliTable2.mod.Cell]
  type Table = typingsJapgolly.cliTable2.mod.HorizontalTable | typingsJapgolly.cliTable2.mod.VerticalTable | typingsJapgolly.cliTable2.mod.CrossTable
  type VerticalTable = typingsJapgolly.cliTable2.mod.GenericTable[typingsJapgolly.cliTable2.mod.VerticalTableRow]
  type VerticalTableRow = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.cliTable2.mod.Cell]
}
