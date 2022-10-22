package typingsJapgolly.antdMobileRn

import typingsJapgolly.antdMobileRn.libSwitchPropsTypeMod.SwitchPropsType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwitchIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/switch/index.native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: AntmSwitchProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait AntmSwitchProps
    extends StObject
       with SwitchPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object AntmSwitchProps {
    
    inline def apply(): AntmSwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AntmSwitchProps]
    }
    
    extension [Self <: AntmSwitchProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
