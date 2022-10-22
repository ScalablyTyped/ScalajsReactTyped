package typingsJapgolly.reactNative.mod

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethods */ @JSImport("react-native", "RefreshControl")
@js.native
open class RefreshControl ()
  extends Component[RefreshControlProps, js.Object, Any]
/* static members */
object RefreshControl {
  
  @JSImport("react-native", "RefreshControl")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native", "RefreshControl.SIZE")
  @js.native
  def SIZE: js.Object = js.native
  inline def SIZE_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIZE")(x.asInstanceOf[js.Any])
}
