package typingsJapgolly.antDesignReactNative.tagMod

import typingsJapgolly.antDesignReactNative.AnonActiveText
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
  def onPress(): Unit = js.native
  def onPressIn(styles: AnonActiveText): js.Function0[Unit] = js.native
  def onPressOut(styles: AnonActiveText): js.Function0[Unit] = js.native
  def onTagClose(): Unit = js.native
}

