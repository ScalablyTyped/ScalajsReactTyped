package typingsJapgolly.reactJsonEditorAjrm.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactJsonEditorAjrm.mod.JSONInputProperties
import typingsJapgolly.reactJsonEditorAjrm.mod.default
import typingsJapgolly.reactJsonEditorAjrm.mod.locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactJsonEditorAjrm {
  
  inline def apply(locale: locale): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[JSONInputProperties]))
  }
  
  @JSImport("react-json-editor-ajrm", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def colors(value: typingsJapgolly.reactJsonEditorAjrm.mod.colors): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def confirmGood(value: Boolean): this.type = set("confirmGood", value.asInstanceOf[js.Any])
    
    inline def error(value: typingsJapgolly.reactJsonEditorAjrm.mod.error): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def modifyErrorText(value: /* errorReason */ String => String): this.type = set("modifyErrorText", js.Any.fromFunction1(value))
    
    inline def onBlur(value: Any): this.type = set("onBlur", value.asInstanceOf[js.Any])
    
    inline def onChange(value: Any): this.type = set("onChange", value.asInstanceOf[js.Any])
    
    inline def onKeyPressUpdate(value: Boolean): this.type = set("onKeyPressUpdate", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: Any): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def reset(value: Boolean): this.type = set("reset", value.asInstanceOf[js.Any])
    
    inline def style(value: typingsJapgolly.reactJsonEditorAjrm.mod.style): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def viewOnly(value: Boolean): this.type = set("viewOnly", value.asInstanceOf[js.Any])
    
    inline def waitAfterKeyPress(value: Double): this.type = set("waitAfterKeyPress", value.asInstanceOf[js.Any])
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: JSONInputProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
