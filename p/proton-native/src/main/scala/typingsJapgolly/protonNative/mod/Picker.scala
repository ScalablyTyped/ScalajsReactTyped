package typingsJapgolly.protonNative.mod

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proton-native", "Picker")
@js.native
open class Picker protected ()
  extends Component[PickerProps, js.Object, Any] {
  def this(props: PickerProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: PickerProps, context: Any) = this()
}
/* static members */
object Picker {
  
  @JSImport("proton-native", "Picker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("proton-native", "Picker.Item")
  @js.native
  def Item: Instantiable0[PickerItem] = js.native
  inline def Item_=(x: Instantiable0[PickerItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
