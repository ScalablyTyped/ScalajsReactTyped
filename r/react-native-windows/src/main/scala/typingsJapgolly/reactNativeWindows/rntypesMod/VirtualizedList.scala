package typingsJapgolly.reactNativeWindows.rntypesMod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNativeWindows.anon.AnimatedOffset
import typingsJapgolly.reactNativeWindows.anon.ViewOffset
import typingsJapgolly.reactNativeWindows.anon.ViewPosition
import typingsJapgolly.reactNativeWindows.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows/rntypes", "VirtualizedList")
@js.native
open class VirtualizedList[ItemT] protected ()
  extends Component[VirtualizedListProps[ItemT], js.Object, Any] {
  def this(props: VirtualizedListProps[ItemT]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: VirtualizedListProps[ItemT], context: Any) = this()
  
  def recordInteraction(): Unit = js.native
  
  def scrollToEnd(): Unit = js.native
  def scrollToEnd(params: `0`): Unit = js.native
  
  def scrollToIndex(params: ViewOffset): Unit = js.native
  
  def scrollToItem(params: ViewPosition[ItemT]): Unit = js.native
  
  /**
    * Scroll to a specific content pixel offset in the list.
    * Param `offset` expects the offset to scroll to. In case of horizontal is true, the
    * offset is the x-value, in any other case the offset is the y-value.
    * Param `animated` (true by default) defines whether the list should do an animation while scrolling.
    */
  def scrollToOffset(params: AnimatedOffset): Unit = js.native
}
