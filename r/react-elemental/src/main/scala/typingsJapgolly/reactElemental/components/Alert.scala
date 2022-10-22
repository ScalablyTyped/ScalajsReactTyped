package typingsJapgolly.reactElemental.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactElemental.mod.AlertProps
import typingsJapgolly.reactElemental.mod.AlertSize
import typingsJapgolly.reactElemental.mod.AlertType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Alert {
  
  inline def apply(message: String | Element, title: String): Builder = {
    val __props = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AlertProps]))
  }
  
  @JSImport("react-elemental", "Alert")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactElemental.mod.Alert] {
    
    inline def dismissible(value: Boolean): this.type = set("dismissible", value.asInstanceOf[js.Any])
    
    inline def onDismiss(value: Callback): this.type = set("onDismiss", value.toJsFn)
    
    inline def size(value: AlertSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def `type`(value: AlertType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AlertProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
