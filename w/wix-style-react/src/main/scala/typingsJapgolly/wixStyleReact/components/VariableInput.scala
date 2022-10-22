package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.PrefixString
import typingsJapgolly.wixStyleReact.distTypesStatusIndicatorMod.StatusIndicatorState
import typingsJapgolly.wixStyleReact.distTypesVariableInputMod.VariableInputProps
import typingsJapgolly.wixStyleReact.distTypesVariableInputMod.VariableInputSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VariableInput {
  
  @JSImport("wix-style-react", "VariableInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.VariableInput] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def initialValue(value: String): this.type = set("initialValue", value.asInstanceOf[js.Any])
    
    inline def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* value */ String => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onChange(value: /* value */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onFocus(value: /* value */ String => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onSubmit(value: /* value */ String => Callback): this.type = set("onSubmit", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def size(value: VariableInputSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def status(value: StatusIndicatorState): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def statusMessage(value: VdomNode): this.type = set("statusMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def statusMessageNull: this.type = set("statusMessage", null)
    
    inline def statusMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("statusMessage", js.Array(value*))
    
    inline def statusMessageVdomElement(value: VdomElement): this.type = set("statusMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def variableParser(value: /* value */ String => String | Boolean): this.type = set("variableParser", js.Any.fromFunction1(value))
    
    inline def variableTemplate(value: PrefixString): this.type = set("variableTemplate", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VariableInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VariableInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
