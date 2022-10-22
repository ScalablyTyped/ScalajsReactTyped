package typingsJapgolly.reactEditText.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.reactEditText.mod.EditTextProps
import typingsJapgolly.reactEditText.mod.inputTextType
import typingsJapgolly.reactEditText.mod.onSaveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditText {
  
  @JSImport("react-edit-text", "EditText")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactEditText.mod.EditText] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def editButtonContent(value: VdomNode): this.type = set("editButtonContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def editButtonContentNull: this.type = set("editButtonContent", null)
    
    inline def editButtonContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("editButtonContent", js.Array(value*))
    
    inline def editButtonContentVdomElement(value: VdomElement): this.type = set("editButtonContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def editButtonProps(value: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]): this.type = set("editButtonProps", value.asInstanceOf[js.Any])
    
    inline def formatDisplayText(value: /* value */ String => String): this.type = set("formatDisplayText", js.Any.fromFunction1(value))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def inputClassName(value: String): this.type = set("inputClassName", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: Callback): this.type = set("onBlur", value.toJsFn)
    
    inline def onChange(
      value: /* event */ ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
    ): this.type = set("onChange", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEditMode(value: Callback): this.type = set("onEditMode", value.toJsFn)
    
    inline def onSave(value: /* hasNameValuePreviousValue */ onSaveProps => Callback): this.type = set("onSave", js.Any.fromFunction1((t0: /* hasNameValuePreviousValue */ onSaveProps) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def readonly(value: Boolean): this.type = set("readonly", value.asInstanceOf[js.Any])
    
    inline def showEditButton(value: Boolean): this.type = set("showEditButton", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def `type`(value: inputTextType): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: EditText.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EditTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
