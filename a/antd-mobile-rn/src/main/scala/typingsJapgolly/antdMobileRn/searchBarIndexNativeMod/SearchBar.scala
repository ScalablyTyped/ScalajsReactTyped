package typingsJapgolly.antdMobileRn.searchBarIndexNativeMod

import typingsJapgolly.antdMobileRn.AnonNativeEvent
import typingsJapgolly.antdMobileRn.searchBarPropsTypeMod.SearchBarState
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.TextInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBar
  extends Component[SearchBarNativeProps, SearchBarState, js.Any] {
  var inputRef: TextInput | Null = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSearchBar(nextProps: SearchBarNativeProps): Unit = js.native
  def onBlur(): Unit = js.native
  def onCancel(): Unit = js.native
  def onChangeText(value: String): Unit = js.native
  def onFocus(): Unit = js.native
  def onSubmit(_underscore: AnonNativeEvent): Unit = js.native
}

