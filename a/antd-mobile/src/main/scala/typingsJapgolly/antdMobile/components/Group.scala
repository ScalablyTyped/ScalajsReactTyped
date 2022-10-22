package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.esComponentsRadioGroupMod.RadioGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Group {
  
  @JSImport("antd-mobile/es/components/radio/group", "Group")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Group.type): SharedBuilder_RadioGroupProps1703467614 = new SharedBuilder_RadioGroupProps1703467614(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioGroupProps): SharedBuilder_RadioGroupProps1703467614 = new SharedBuilder_RadioGroupProps1703467614(js.Array(this.component, p.asInstanceOf[js.Any]))
}
