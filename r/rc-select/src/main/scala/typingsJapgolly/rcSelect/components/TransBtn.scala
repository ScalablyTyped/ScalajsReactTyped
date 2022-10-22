package typingsJapgolly.rcSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcSelect.libBaseSelectMod.RenderNode
import typingsJapgolly.rcSelect.libTransBtnMod.TransBtnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TransBtn {
  
  inline def apply(className: String): Builder = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TransBtnProps]))
  }
  
  @JSImport("rc-select/lib/TransBtn", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def customizeIcon(value: RenderNode): this.type = set("customizeIcon", value.asInstanceOf[js.Any])
    
    inline def customizeIconFunction1(value: /* props */ Any => Node): this.type = set("customizeIcon", js.Any.fromFunction1(value))
    
    inline def customizeIconNull: this.type = set("customizeIcon", null)
    
    inline def customizeIconProps(value: Any): this.type = set("customizeIconProps", value.asInstanceOf[js.Any])
    
    inline def customizeIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("customizeIcon", js.Array(value*))
    
    inline def customizeIconVdomElement(value: VdomElement): this.type = set("customizeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def onClick(value: ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseDown(value: ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  }
  
  def withProps(p: TransBtnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
