package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteCellRange
import typingsJapgolly.hyperformula.typingsCellMod.SimpleCellAddress_
import typingsJapgolly.hyperformula.typingsDependencyGraphMod.ArrayVertex
import typingsJapgolly.hyperformula.typingsMaybeMod.Maybe
import typingsJapgolly.hyperformula.typingsSpanMod.ColumnsSpan
import typingsJapgolly.hyperformula.typingsSpanMod.RowsSpan
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyGraphArrayMappingMod {
  
  @JSImport("hyperformula/typings/DependencyGraph/ArrayMapping", "ArrayMapping")
  @js.native
  open class ArrayMapping () extends StObject {
    
    val arrayMapping: Map[String, ArrayVertex] = js.native
    
    def arraysInCols(col: ColumnsSpan): IterableIterator[js.Tuple2[String, ArrayVertex]] = js.native
    
    def arraysInRows(rowsSpan: RowsSpan): IterableIterator[js.Tuple2[String, ArrayVertex]] = js.native
    
    def count(): Double = js.native
    
    def getArray(range: AbsoluteCellRange): Maybe[ArrayVertex] = js.native
    
    def getArrayByCorner(address: SimpleCellAddress_): Maybe[ArrayVertex] = js.native
    
    def isFormulaArrayAtAddress(address: SimpleCellAddress_): Boolean = js.native
    
    def isFormulaArrayInAllColumns(span: ColumnsSpan): Boolean = js.native
    
    def isFormulaArrayInAllRows(span: RowsSpan): Boolean = js.native
    
    def isFormulaArrayInColumn(sheet: Double, column: Double): Boolean = js.native
    
    def isFormulaArrayInRange(range: AbsoluteCellRange): Boolean = js.native
    
    def isFormulaArrayInRow(sheet: Double, row: Double): Boolean = js.native
    
    def moveArrayVerticesAfterColumnByColumns(sheet: Double, column: Double, numberOfColumns: Double): Unit = js.native
    
    def moveArrayVerticesAfterRowByRows(sheet: Double, row: Double, numberOfRows: Double): Unit = js.native
    
    def removeArray(range: String): Unit = js.native
    def removeArray(range: AbsoluteCellRange): Unit = js.native
    
    def setArray(range: AbsoluteCellRange, vertex: ArrayVertex): Unit = js.native
    
    /* private */ var updateArrayVerticesInSheet: Any = js.native
  }
}
