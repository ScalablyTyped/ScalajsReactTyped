package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.Anon0
import typingsJapgolly.reactNative.AnonItem
import typingsJapgolly.reactNative.AnonOffset
import typingsJapgolly.reactNative.AnonViewOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "FlatList")
@js.native
class FlatList[ItemT] ()
  extends Component[FlatListProps[ItemT], js.Object, js.Any] {
  /**
    * Displays the scroll indicators momentarily.
    */
  def flashScrollIndicators(): Unit = js.native
  /**
    * Provides a reference to the underlying host component
    */
  def getNativeScrollRef(): js.UndefOr[
    (RefHandle[
      (japgolly.scalajs.react.raw.React.Component[ScrollViewProps with js.Object, js.Object]) | View
    ]) | Null
  ] = js.native
  /**
    * Provides a handle to the underlying scroll responder.
    */
  def getScrollResponder(): js.UndefOr[Element | Null] = js.native
  def getScrollableNode(): js.Any = js.native
  /**
    * Tells the list an interaction has occured, which should trigger viewability calculations,
    * e.g. if waitForInteractions is true and the user has not scrolled. This is typically called
    * by taps on items or by navigation actions.
    */
  def recordInteraction(): Unit = js.native
  /**
    * Scrolls to the end of the content. May be janky without `getItemLayout` prop.
    */
  def scrollToEnd(): Unit = js.native
  def scrollToEnd(params: Anon0): Unit = js.native
  /**
    * Scrolls to the item at the specified index such that it is positioned in the viewable area
    * such that viewPosition 0 places it at the top, 1 at the bottom, and 0.5 centered in the middle.
    * Cannot scroll to locations outside the render window without specifying the getItemLayout prop.
    */
  def scrollToIndex(params: AnonViewOffset): Unit = js.native
  /**
    * Requires linear scan through data - use `scrollToIndex` instead if possible.
    * May be janky without `getItemLayout` prop.
    */
  def scrollToItem(params: AnonItem[ItemT]): Unit = js.native
  /**
    * Scroll to a specific content pixel offset, like a normal `ScrollView`.
    */
  def scrollToOffset(params: AnonOffset): Unit = js.native
  // TODO: use `unknown` instead of `any` for Typescript >= 3.0
  def setNativeProps(props: StringDictionary[js.Any]): Unit = js.native
}

