package typingsJapgolly.reactMessengerCheckbox.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMessengerCheckbox.mod.ReactMessengerProps
import typingsJapgolly.reactMessengerCheckbox.mod.^
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.dark
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.large
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.light
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.medium
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.small
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.standard
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.xlarge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMessengerCheckbox {
  
  inline def apply(appId: String, origin: String, pageId: String, userRef: String): Builder = {
    val __props = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pageId = pageId.asInstanceOf[js.Any], userRef = userRef.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactMessengerProps]))
  }
  
  @JSImport("react-messenger-checkbox", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def allowLogin(value: Boolean): this.type = set("allowLogin", value.asInstanceOf[js.Any])
    
    inline def autoLogAppEvents(value: Boolean): this.type = set("autoLogAppEvents", value.asInstanceOf[js.Any])
    
    inline def centerAlign(value: Boolean): this.type = set("centerAlign", value.asInstanceOf[js.Any])
    
    inline def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    inline def language(value: String): this.type = set("language", value.asInstanceOf[js.Any])
    
    inline def onEvent(value: /* event */ Any => Callback): this.type = set("onEvent", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
    
    inline def prechecked(value: Boolean): this.type = set("prechecked", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium | large | standard | xlarge): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def skin(value: light | dark): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def version(value: String): this.type = set("version", value.asInstanceOf[js.Any])
    
    inline def xfbml(value: Boolean): this.type = set("xfbml", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactMessengerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
