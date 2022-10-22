package typingsJapgolly.reactNativeWindows.rntypesMod

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows/rntypes", "SwipeableListView")
@js.native
open class SwipeableListView protected ()
  extends Component[SwipeableListViewProps, js.Object, Any] {
  def this(props: SwipeableListViewProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: SwipeableListViewProps, context: Any) = this()
}
/* static members */
object SwipeableListView {
  
  @JSImport("react-native-windows/rntypes", "SwipeableListView")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNewDataSource(): SwipeableListViewDataSource = ^.asInstanceOf[js.Dynamic].applyDynamic("getNewDataSource")().asInstanceOf[SwipeableListViewDataSource]
}
