package typingsJapgolly.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNativeElements.anon.PickSwitchPropscolorstrin
import typingsJapgolly.reactNativeElements.anon.SwitchPropscolorstringund
import typingsJapgolly.reactNativeElements.distHelpersMod.RneFunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSwitchSwitchMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/switch/switch", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickSwitchPropscolorstrin] | ForwardRefExoticComponent[SwitchPropscolorstringund] = js.native
  
  @JSImport("react-native-elements/dist/switch/switch", "Switch")
  @js.native
  val Switch: RneFunctionComponent[SwitchProps] = js.native
  
  trait SwitchProps
    extends StObject
       with typingsJapgolly.reactNative.mod.SwitchProps {
    
    var color: js.UndefOr[String] = js.undefined
  }
  object SwitchProps {
    
    inline def apply(): SwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchProps]
    }
    
    extension [Self <: SwitchProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickSwitchPropscolorstrin] | ForwardRefExoticComponent[SwitchPropscolorstringund]
  
  /* This means you don't have to write `default`, but can instead just say `distSwitchSwitchMod.foo` */
  override def _to: FunctionComponent[PickSwitchPropscolorstrin] | ForwardRefExoticComponent[SwitchPropscolorstringund] = default
}
