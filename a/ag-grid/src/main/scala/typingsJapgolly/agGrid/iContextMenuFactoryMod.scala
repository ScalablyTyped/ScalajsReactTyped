package typingsJapgolly.agGrid

import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.rowNodeMod.RowNode
import typingsJapgolly.std.MouseEvent
import typingsJapgolly.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/interfaces/iContextMenuFactory", JSImport.Namespace)
@js.native
object iContextMenuFactoryMod extends js.Object {
  @js.native
  trait IContextMenuFactory extends js.Object {
    def hideActiveMenu(): Unit = js.native
    def showMenu(node: RowNode, column: Column, value: js.Any, mouseEvent: MouseEvent): Unit = js.native
    def showMenu(node: RowNode, column: Column, value: js.Any, mouseEvent: Touch): Unit = js.native
  }
  
}

