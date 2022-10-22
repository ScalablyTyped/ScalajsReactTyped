package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeyMod.IHotkeyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Hotkey {
  
  inline def apply(combo: String): Builder = {
    val __props = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IHotkeyProps]))
  }
  
  @JSImport("@blueprintjs/core", "Hotkey")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.Hotkey] {
    
    inline def allowInInput(value: Boolean): this.type = set("allowInInput", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def global(value: Boolean): this.type = set("global", value.asInstanceOf[js.Any])
    
    inline def group(value: String): this.type = set("group", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def onKeyDown(value: /* e */ KeyboardEvent => Any): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    inline def onKeyUp(value: /* e */ KeyboardEvent => Any): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    inline def preventDefault(value: Boolean): this.type = set("preventDefault", value.asInstanceOf[js.Any])
    
    inline def stopPropagation(value: Boolean): this.type = set("stopPropagation", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IHotkeyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
