package typingsJapgolly.antdMobileRn.tagIndexNativeMod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag
  extends Component[TagNativeProps, js.Any, js.Any] {
  var closeDom: View | Null = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTag(nextProps: TagNativeProps): Unit = js.native
  def handleLongPress(): Unit = js.native
  def onClick(): Unit = js.native
  def onPressIn(): Unit = js.native
  def onPressOut(): Unit = js.native
  def onTagClose(): Unit = js.native
}

