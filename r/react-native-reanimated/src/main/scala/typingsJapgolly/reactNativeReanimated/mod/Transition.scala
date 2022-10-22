package typingsJapgolly.reactNativeReanimated.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-reanimated", "Transition")
@js.native
open class Transition protected ()
  extends Component[js.Object, js.Object, Any] {
  def this(props: js.Object) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: js.Object, context: Any) = this()
}
/* static members */
object Transition {
  
  @JSImport("react-native-reanimated", "Transition")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-reanimated", "Transition.Change")
  @js.native
  def Change: ComponentClassP[TransitionProps & js.Object] = js.native
  inline def Change_=(x: ComponentClassP[TransitionProps & js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Change")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-reanimated", "Transition.In")
  @js.native
  def In: ComponentClassP[TransitionInOutProps & js.Object] = js.native
  inline def In_=(x: ComponentClassP[TransitionInOutProps & js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("In")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-reanimated", "Transition.Out")
  @js.native
  def Out: ComponentClassP[TransitionInOutProps & js.Object] = js.native
  inline def Out_=(x: ComponentClassP[TransitionInOutProps & js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Out")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-reanimated", "Transition.Sequence")
  @js.native
  def Sequence: ComponentClassP[js.Object] = js.native
  inline def Sequence_=(x: ComponentClassP[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sequence")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-reanimated", "Transition.Together")
  @js.native
  def Together: ComponentClassP[js.Object] = js.native
  inline def Together_=(x: ComponentClassP[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Together")(x.asInstanceOf[js.Any])
}
