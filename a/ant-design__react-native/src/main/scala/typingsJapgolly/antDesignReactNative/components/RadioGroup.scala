package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.antDesignReactNative.libRadioRadioGroupMod.RadioGroupProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioGroup {
  
  object Type {
    
    @JSImport("@ant-design/react-native/lib/radio/RadioGroup", "default.type")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Type.type): SharedBuilder_RadioGroupPropsRefAttributes308805308 = new SharedBuilder_RadioGroupPropsRefAttributes308805308(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RadioGroupProps & RefAttributes[Any]): SharedBuilder_RadioGroupPropsRefAttributes308805308 = new SharedBuilder_RadioGroupPropsRefAttributes308805308(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@ant-design/react-native/lib/radio/RadioGroup", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RadioGroup.type): SharedBuilder_RadioGroupPropsRefAttributes308805308 = new SharedBuilder_RadioGroupPropsRefAttributes308805308(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioGroupProps & RefAttributes[Any]): SharedBuilder_RadioGroupPropsRefAttributes308805308 = new SharedBuilder_RadioGroupPropsRefAttributes308805308(js.Array(this.component, p.asInstanceOf[js.Any]))
}
