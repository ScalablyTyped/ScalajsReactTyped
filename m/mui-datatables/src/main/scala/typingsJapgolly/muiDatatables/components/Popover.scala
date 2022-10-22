package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.mod.MUIDataTablePopover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  @JSImport("mui-datatables", "Popover")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def action(value: /* args */ Any => Any): this.type = set("action", js.Any.fromFunction1(value))
    
    inline def anchorEl(value: VdomNode): this.type = set("anchorEl", value.rawNode.asInstanceOf[js.Any])
    
    inline def anchorElNull: this.type = set("anchorEl", null)
    
    inline def anchorElVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("anchorEl", js.Array(value*))
    
    inline def anchorElVdomElement(value: VdomElement): this.type = set("anchorEl", value.rawElement.asInstanceOf[js.Any])
    
    inline def anchorOrigin(value: Any): this.type = set("anchorOrigin", value.asInstanceOf[js.Any])
    
    inline def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def elevation(value: Double): this.type = set("elevation", value.asInstanceOf[js.Any])
    
    inline def onClose(value: /* args */ Any => Any): this.type = set("onClose", js.Any.fromFunction1(value))
    
    inline def onExited(value: /* args */ Any => Any): this.type = set("onExited", js.Any.fromFunction1(value))
    
    inline def option(value: Boolean): this.type = set("option", value.asInstanceOf[js.Any])
    
    inline def ref(value: Any): this.type = set("ref", value.asInstanceOf[js.Any])
    
    inline def refExit(value: /* args */ Any => Any): this.type = set("refExit", js.Any.fromFunction1(value))
    
    inline def transformOrigin(value: Any): this.type = set("transformOrigin", value.asInstanceOf[js.Any])
    
    inline def trigger(value: VdomNode): this.type = set("trigger", value.rawNode.asInstanceOf[js.Any])
    
    inline def triggerNull: this.type = set("trigger", null)
    
    inline def triggerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("trigger", js.Array(value*))
    
    inline def triggerVdomElement(value: VdomElement): this.type = set("trigger", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Popover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MUIDataTablePopover): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
