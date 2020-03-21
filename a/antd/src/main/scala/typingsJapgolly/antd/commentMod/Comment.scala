package typingsJapgolly.antd.commentMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment
  extends Component[CommentProps, js.Object, js.Any] {
  def renderComment(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def renderNested(prefixCls: String, children: js.Any): Element = js.native
}

