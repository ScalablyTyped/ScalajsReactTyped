package typingsJapgolly.formik.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.formik.distFieldArrayMod.FieldArrayConfig
import typingsJapgolly.formik.distFieldArrayMod.FieldArrayRenderProps
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FieldArray {
  
  inline def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FieldArrayConfig]))
  }
  
  @JSImport("formik", "FieldArray")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: FieldArrayRenderProps => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def component(value: String | (ComponentType[FieldArrayRenderProps | Unit])): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def render(value: FieldArrayRenderProps => Node): this.type = set("render", js.Any.fromFunction1(value))
    
    inline def validateOnChange(value: Boolean): this.type = set("validateOnChange", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FieldArrayConfig): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
