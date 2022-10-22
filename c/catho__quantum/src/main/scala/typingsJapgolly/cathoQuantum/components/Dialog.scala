package typingsJapgolly.cathoQuantum.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.`12`
import typingsJapgolly.cathoQuantum.dialogMod.DialogProps
import typingsJapgolly.cathoQuantum.dialogMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dialog {
  
  inline def apply(disableClickOutside: Boolean): Builder = {
    val __props = js.Dynamic.literal(disableClickOutside = disableClickOutside.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DialogProps]))
  }
  
  @JSImport("@catho/quantum/Dialog", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def children(value: js.Array[Node] | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def closeOnTime(value: Double): this.type = set("closeOnTime", value.asInstanceOf[js.Any])
    
    inline def onClickOutside(value: Callback): this.type = set("onClickOutside", value.toJsFn)
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def theme(value: `12`): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
