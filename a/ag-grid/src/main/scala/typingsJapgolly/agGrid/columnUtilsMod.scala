package typingsJapgolly.agGrid

import typingsJapgolly.agGrid.columnGroupChildMod.ColumnGroupChild
import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.originalColumnGroupChildMod.OriginalColumnGroupChild
import typingsJapgolly.agGrid.originalColumnGroupMod.OriginalColumnGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/columnController/columnUtils", JSImport.Namespace)
@js.native
object columnUtilsMod extends js.Object {
  @js.native
  class ColumnUtils () extends js.Object {
    var gridOptionsWrapper: js.Any = js.native
    def calculateColInitialWidth(colDef: js.Any): Double = js.native
    def depthFirstAllColumnTreeSearch(tree: js.Array[ColumnGroupChild], callback: js.Function1[/* treeNode */ ColumnGroupChild, Unit]): Unit = js.native
    def depthFirstDisplayedColumnTreeSearch(tree: js.Array[ColumnGroupChild], callback: js.Function1[/* treeNode */ ColumnGroupChild, Unit]): Unit = js.native
    def depthFirstOriginalTreeSearch(
      tree: js.Array[OriginalColumnGroupChild],
      callback: js.Function1[/* treeNode */ OriginalColumnGroupChild, Unit]
    ): Unit = js.native
    def getOriginalPathForColumn(column: Column, originalBalancedTree: js.Array[OriginalColumnGroupChild]): js.Array[OriginalColumnGroup] = js.native
  }
  
}

