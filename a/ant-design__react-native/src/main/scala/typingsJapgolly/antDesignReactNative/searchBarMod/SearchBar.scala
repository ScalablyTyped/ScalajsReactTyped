package typingsJapgolly.antDesignReactNative.searchBarMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.antDesignReactNative.AnonNativeEvent
import typingsJapgolly.antDesignReactNative.searchBarPropsTypeMod.SearchBarState
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.TextInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBar
  extends Component[SearchBarProps, SearchBarState, js.Any] {
  var inputRef: TextInput | Null = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSearchBar(nextProps: SearchBarProps): Unit = js.native
  def onBlur(e: ReactEventFrom[NodeHandle with Element]): Unit = js.native
  def onCancel(): Unit = js.native
  def onChangeText(value: String): Unit = js.native
  def onFocus(e: ReactEventFrom[NodeHandle with Element]): Unit = js.native
  def onSubmit(_underscore: AnonNativeEvent): Unit = js.native
}

