package typingsJapgolly.reactNativeMaterialRipple

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.TouchableWithoutFeedbackProps
import typingsJapgolly.reactNativeMaterialRipple.anon.AnimatedPropsViewProps
import typingsJapgolly.reactNativeMaterialRipple.anon.Disabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-material-ripple", JSImport.Default)
  @js.native
  open class default ()
    extends Component[RippleProps, js.Object, Any]
  
  type Ripple = japgolly.scalajs.react.facade.React.Component[RippleProps & js.Object, js.Object]
  
  type RippleProps = TouchableWithoutFeedbackProps & AnimatedPropsViewProps & Disabled
}
