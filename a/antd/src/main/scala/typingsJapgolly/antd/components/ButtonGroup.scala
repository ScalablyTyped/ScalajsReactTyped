package typingsJapgolly.antd.components

import typingsJapgolly.antd.libButtonButtonGroupMod.ButtonGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonGroup {
  
  @JSImport("antd/lib/button/button-group", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ButtonGroup.type): SharedBuilder_ButtonGroupProps_1559762238 = new SharedBuilder_ButtonGroupProps_1559762238(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ButtonGroupProps): SharedBuilder_ButtonGroupProps_1559762238 = new SharedBuilder_ButtonGroupProps_1559762238(js.Array(this.component, p.asInstanceOf[js.Any]))
}
