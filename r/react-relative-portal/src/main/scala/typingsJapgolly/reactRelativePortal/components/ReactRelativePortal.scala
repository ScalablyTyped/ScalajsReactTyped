package typingsJapgolly.reactRelativePortal.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRelativePortal.mod.Props
import typingsJapgolly.reactRelativePortal.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactRelativePortal {
  
  inline def apply(component: String): Builder = {
    val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-relative-portal", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    
    inline def left(value: Double): this.type = set("left", value.asInstanceOf[js.Any])
    
    inline def onOutClick(value: Callback): this.type = set("onOutClick", value.toJsFn)
    
    inline def right(value: Double): this.type = set("right", value.asInstanceOf[js.Any])
    
    inline def top(value: Double): this.type = set("top", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
