package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.esComponentsFormFormArrayMod.FormArrayField
import typingsJapgolly.antdMobile.esComponentsFormFormArrayMod.FormArrayOperation
import typingsJapgolly.antdMobile.esComponentsFormFormArrayMod.FormArrayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormArray {
  
  inline def apply(
    children: (js.Array[FormArrayField], FormArrayOperation) => js.Array[Element],
    name: String | Double | (js.Array[String | Double])
  ): SharedBuilder_FormArrayProps_2130765192 = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), name = name.asInstanceOf[js.Any])
    new SharedBuilder_FormArrayProps_2130765192(js.Array(this.component, __props.asInstanceOf[FormArrayProps]))
  }
  
  @JSImport("antd-mobile/es/components/form/form-array", "FormArray")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FormArrayProps): SharedBuilder_FormArrayProps_2130765192 = new SharedBuilder_FormArrayProps_2130765192(js.Array(this.component, p.asInstanceOf[js.Any]))
}
