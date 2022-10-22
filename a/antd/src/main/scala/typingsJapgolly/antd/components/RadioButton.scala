package typingsJapgolly.antd.components

import typingsJapgolly.antd.libRadioRadioButtonMod.RadioButtonProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButton {
  
  @JSImport("antd/lib/radio/radioButton", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RadioButton.type): SharedBuilder_RadioButtonPropsRefAttributes745724458 = new SharedBuilder_RadioButtonPropsRefAttributes745724458(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioButtonProps & RefAttributes[Any]): SharedBuilder_RadioButtonPropsRefAttributes745724458 = new SharedBuilder_RadioButtonPropsRefAttributes745724458(js.Array(this.component, p.asInstanceOf[js.Any]))
}
