package typingsJapgolly.antd.libAvatarMod

import typingsJapgolly.antd.Anon_IsImgExist
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avatar
  extends Component[AvatarProps, AvatarState, js.Any] {
  var avatarChildren: js.Any = js.native
  var avatarNode: js.Any = js.native
  var lastChildrenWidth: js.Any = js.native
  var lastNodeWidth: js.Any = js.native
  @JSName("state")
  var state_Avatar: Anon_IsImgExist = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAvatar(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAvatar(prevProps: AvatarProps): Unit = js.native
  def handleImgLoadError(): Unit = js.native
  def renderAvatar(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def setScale(): Unit = js.native
}

