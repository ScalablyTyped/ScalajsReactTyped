package typingsJapgolly.reactNative.mod

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.TimerMixin
- Dropped new (args : ...any): react-native.react-native.TouchableMixin
- Dropped new (args : ...any): react-native.react-native.NativeMethods */ @JSImport("react-native", "TouchableOpacity")
@js.native
open class TouchableOpacity ()
  extends Component[TouchableOpacityProps, js.Object, Any] {
  
  /**
    * Animate the touchable to a new opacity.
    */
  def setOpacityTo(value: Double): Unit = js.native
}
