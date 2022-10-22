package typingsJapgolly.reactSAlert.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSAlert.mod.SAlert.SAlertBeepProps
import typingsJapgolly.reactSAlert.mod.SAlert.SAlertProps
import typingsJapgolly.reactSAlert.mod.SAlert.SAlertStackProps
import typingsJapgolly.reactSAlert.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSAlert {
  
  @JSImport("react-s-alert", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def beep(value: String | Boolean | SAlertBeepProps): this.type = set("beep", value.asInstanceOf[js.Any])
    
    inline def contentTemplate(value: /* repeated */ Any => Any): this.type = set("contentTemplate", js.Any.fromFunction1(value))
    
    inline def customFields(value: js.Object): this.type = set("customFields", value.asInstanceOf[js.Any])
    
    inline def effect(value: String): this.type = set("effect", value.asInstanceOf[js.Any])
    
    inline def html(value: Boolean): this.type = set("html", value.asInstanceOf[js.Any])
    
    inline def message(value: String): this.type = set("message", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def stack(value: Boolean | SAlertStackProps): this.type = set("stack", value.asInstanceOf[js.Any])
    
    inline def timeout(value: String | Double): this.type = set("timeout", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactSAlert.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SAlertProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
