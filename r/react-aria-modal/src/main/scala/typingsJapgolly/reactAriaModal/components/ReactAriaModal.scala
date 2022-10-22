package typingsJapgolly.reactAriaModal.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactAriaModal.anon.PickAriaModalPropstitleId
import typingsJapgolly.reactAriaModal.anon.PickAriaModalPropstitleTe
import typingsJapgolly.reactAriaModal.mod.AriaModalProps
import typingsJapgolly.reactAriaModal.mod.RequiredAriaTypes
import typingsJapgolly.reactAriaModal.mod.default
import typingsJapgolly.reactAriaModal.reactAriaModalBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAriaModal {
  
  @JSImport("react-aria-modal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def alert(value: Boolean): this.type = set("alert", value.asInstanceOf[js.Any])
    
    inline def applicationNode(value: Node | Element): this.type = set("applicationNode", value.asInstanceOf[js.Any])
    
    inline def dialogClass(value: String): this.type = set("dialogClass", value.asInstanceOf[js.Any])
    
    inline def dialogId(value: String): this.type = set("dialogId", value.asInstanceOf[js.Any])
    
    inline def dialogStyle(value: CSSProperties): this.type = set("dialogStyle", value.asInstanceOf[js.Any])
    
    inline def escapeExits(value: Boolean): this.type = set("escapeExits", value.asInstanceOf[js.Any])
    
    inline def focusDialog(value: Boolean): this.type = set("focusDialog", value.asInstanceOf[js.Any])
    
    inline def focusTrapOptions(value: js.Object): this.type = set("focusTrapOptions", value.asInstanceOf[js.Any])
    
    inline def focusTrapPaused(value: Boolean): this.type = set("focusTrapPaused", value.asInstanceOf[js.Any])
    
    inline def getApplicationNode(value: CallbackTo[Node | Element]): this.type = set("getApplicationNode", value.toJsFn)
    
    inline def includeDefaultStyles(value: Boolean): this.type = set("includeDefaultStyles", value.asInstanceOf[js.Any])
    
    inline def initialFocus(value: String): this.type = set("initialFocus", value.asInstanceOf[js.Any])
    
    inline def mounted(value: Boolean): this.type = set("mounted", value.asInstanceOf[js.Any])
    
    inline def onEnter(value: Callback): this.type = set("onEnter", value.toJsFn)
    
    inline def onExit(value: /* event */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element] => Callback): this.type = set("onExit", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]) => value(t0).runNow()))
    
    inline def scrollDisabled(value: Boolean): this.type = set("scrollDisabled", value.asInstanceOf[js.Any])
    
    inline def titleId(value: String): this.type = set("titleId", value.asInstanceOf[js.Any])
    
    inline def titleText(value: String): this.type = set("titleText", value.asInstanceOf[js.Any])
    
    inline def underlayClass(value: String): this.type = set("underlayClass", value.asInstanceOf[js.Any])
    
    inline def underlayClickExits(value: Boolean): this.type = set("underlayClickExits", value.asInstanceOf[js.Any])
    
    inline def underlayColor(value: String | `false`): this.type = set("underlayColor", value.asInstanceOf[js.Any])
    
    inline def underlayStyle(value: CSSProperties): this.type = set("underlayStyle", value.asInstanceOf[js.Any])
    
    inline def verticallyCenter(value: Boolean): this.type = set("verticallyCenter", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactAriaModal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AriaModalProps & (RequiredAriaTypes[PickAriaModalPropstitleId, PickAriaModalPropstitleTe])): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
