package typingsJapgolly.antDesignReactNative

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antDesignReactNative.anon.RadioPropsrefRefRadioForw
import typingsJapgolly.antDesignReactNative.libRadioRadioGroupMod.RadioGroupProps
import typingsJapgolly.antDesignReactNative.libRadioRadioItemMod.default
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRadioMod {
  
  object default extends Shortcut {
    
    @JSImport("@ant-design/react-native/lib/radio", JSImport.Default)
    @js.native
    val ^ : CompoundedComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@ant-design/react-native/lib/radio", "default.RadioItem")
    @js.native
    open class RadioItem ()
      extends typingsJapgolly.antDesignReactNative.libRadioRadioItemMod.default
    
    type _To = CompoundedComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CompoundedComponent = ^
  }
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[RadioPropsrefRefRadioForw] {
    
    var Group: MemoExoticComponent[ForwardRefExoticComponent[RadioGroupProps & RefAttributes[Any]]] = js.native
    
    var RadioItem: Instantiable0[default] = js.native
    
    var __ANTM_CHECKBOX: Boolean = js.native
    
    def onPress(): Unit = js.native
  }
}
