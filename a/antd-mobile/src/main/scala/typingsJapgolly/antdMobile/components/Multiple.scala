package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.esComponentsTreeSelectMultipleMod.MultipleProps
import typingsJapgolly.antdMobile.esComponentsTreeSelectTreeSelectMod.TreeSelectOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Multiple {
  
  inline def apply(options: js.Array[TreeSelectOption]): SharedBuilder_MultipleProps686669472 = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new SharedBuilder_MultipleProps686669472(js.Array(this.component, __props.asInstanceOf[MultipleProps]))
  }
  
  @JSImport("antd-mobile/es/components/tree-select/multiple", "Multiple")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MultipleProps): SharedBuilder_MultipleProps686669472 = new SharedBuilder_MultipleProps686669472(js.Array(this.component, p.asInstanceOf[js.Any]))
}
