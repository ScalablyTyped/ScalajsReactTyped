package typingsJapgolly.antDesignReactNative.textareaItemMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.antDesignReactNative.AnonNativeEventAnonContentSize
import typingsJapgolly.antDesignReactNative.libStyleMod.Theme
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.TextInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAreaItem
  extends Component[TextareaItemProps, js.Any, js.Any] {
  var textAreaRef: TextInput | Null = js.native
  def getHeight(theme: Theme): js.Any = js.native
  def onChange(event: ReactEventFrom[NodeHandle with Element]): Unit = js.native
  def onContentSizeChange(theme: Theme): js.Function1[/* event */ AnonNativeEventAnonContentSize, Unit] = js.native
}

