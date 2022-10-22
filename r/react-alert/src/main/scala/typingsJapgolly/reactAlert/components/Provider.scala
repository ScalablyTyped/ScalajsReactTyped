package typingsJapgolly.reactAlert.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactAlert.mod.AlertContainer
import typingsJapgolly.reactAlert.mod.AlertPosition
import typingsJapgolly.reactAlert.mod.AlertProviderProps
import typingsJapgolly.reactAlert.mod.AlertTemplateProps
import typingsJapgolly.reactAlert.mod.AlertTransition
import typingsJapgolly.reactAlert.mod.AlertType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  inline def apply(template: ComponentType[AlertTemplateProps]): Builder = {
    val __props = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AlertProviderProps]))
  }
  
  @JSImport("react-alert", "Provider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactAlert.mod.Provider] {
    
    inline def containerStyle(value: CSSProperties): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def context(value: Context[AlertContainer]): this.type = set("context", value.asInstanceOf[js.Any])
    
    inline def offset(value: String): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def position(value: AlertPosition): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def timeout(value: Double): this.type = set("timeout", value.asInstanceOf[js.Any])
    
    inline def transition(value: AlertTransition): this.type = set("transition", value.asInstanceOf[js.Any])
    
    inline def `type`(value: AlertType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AlertProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
