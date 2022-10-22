package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.libStepperPropsTypeMod.StepPropsType
import typingsJapgolly.antDesignReactNative.libStepperStyleMod.StepperStyle
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepperMod {
  
  @JSImport("@ant-design/react-native/lib/stepper", JSImport.Default)
  @js.native
  open class default () extends Stepper
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/stepper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/stepper", "default.defaultProps")
    @js.native
    def defaultProps: StepProps = js.native
    inline def defaultProps_=(x: StepProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait StepProps
    extends StObject
       with StepPropsType
       with WithThemeStyles[StepperStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object StepProps {
    
    inline def apply(): StepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepProps]
    }
    
    extension [Self <: StepProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait Stepper extends Component[StepProps, Any, Any]
}
