package typingsJapgolly.formik.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.formik.distErrorMessageMod.ErrorMessageProps
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ErrorMessage {
  
  inline def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ErrorMessageProps]))
  }
  
  @JSImport("formik", "ErrorMessage")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: /* errorMessage */ String => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def component(value: String | ComponentType[js.Object]): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def render(value: /* errorMessage */ String => Node): this.type = set("render", js.Any.fromFunction1(value))
  }
  
  def withProps(p: ErrorMessageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
