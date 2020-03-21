package typingsJapgolly.storybookReactNative.storyViewMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryView
  extends Component[Props, js.Object, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MStoryView(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MStoryView(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MStoryView(): Unit = js.native
  def forceReRender(): Unit = js.native
  def renderHelp(): Element = js.native
  def renderOnDeviceUIHelp(): Element = js.native
}

