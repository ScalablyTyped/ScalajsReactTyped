package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.libResultPropsTypeMod.ResultPropsType
import typingsJapgolly.antDesignReactNative.libResultStyleMod.ResultStyle
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultMod {
  
  @JSImport("@ant-design/react-native/lib/result", JSImport.Default)
  @js.native
  open class default () extends Result
  
  @js.native
  trait Result extends Component[ResultNativeProps, Any, Any]
  
  trait ResultNativeProps
    extends StObject
       with ResultPropsType
       with WithThemeStyles[ResultStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object ResultNativeProps {
    
    inline def apply(): ResultNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultNativeProps]
    }
    
    extension [Self <: ResultNativeProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
