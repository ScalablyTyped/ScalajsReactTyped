package typingsJapgolly.agGrid

import typingsJapgolly.agGrid.beansMod.Beans
import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.componentMod.Component
import typingsJapgolly.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/rowDragComp", JSImport.Namespace)
@js.native
object rowDragCompMod extends js.Object {
  @js.native
  class RowDragComp protected () extends Component {
    def this(rowNode: RowNode, column: Column, cellValue: String, beans: Beans) = this()
    val beans: js.Any = js.native
    val cellValue: js.Any = js.native
    val column: js.Any = js.native
    val rowNode: js.Any = js.native
    /* private */ def addDragSource(): js.Any = js.native
    /* private */ def checkCompatibility(): js.Any = js.native
    /* private */ def postConstruct(): js.Any = js.native
  }
  
}

