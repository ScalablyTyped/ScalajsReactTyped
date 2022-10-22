package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesTimeTableMod.TimeTableChangeDetails
import typingsJapgolly.wixStyleReact.distTypesTimeTableMod.TimeTableColumn
import typingsJapgolly.wixStyleReact.distTypesTimeTableMod.TimeTableInsertPosition
import typingsJapgolly.wixStyleReact.distTypesTimeTableMod.TimeTableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimeTable {
  
  @JSImport("wix-style-react", "TimeTable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.TimeTable] {
    
    inline def addItemButtonLabel(value: VdomNode): this.type = set("addItemButtonLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def addItemButtonLabelNull: this.type = set("addItemButtonLabel", null)
    
    inline def addItemButtonLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("addItemButtonLabel", js.Array(value*))
    
    inline def addItemButtonLabelVdomElement(value: VdomElement): this.type = set("addItemButtonLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def columns(value: js.Array[TimeTableColumn]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def columnsVarargs(value: TimeTableColumn*): this.type = set("columns", js.Array(value*))
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def insertPosition(value: TimeTableInsertPosition): this.type = set("insertPosition", value.asInstanceOf[js.Any])
    
    inline def onAdd(value: /* columnIndex */ Double => Callback): this.type = set("onAdd", js.Any.fromFunction1((t0: /* columnIndex */ Double) => value(t0).runNow()))
    
    inline def onChange(value: (/* columns */ js.Array[TimeTableColumn], /* details */ TimeTableChangeDetails) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* columns */ js.Array[TimeTableColumn], t1: /* details */ TimeTableChangeDetails) => (value(t0, t1)).runNow()))
  }
  
  implicit def make(companion: TimeTable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimeTableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
