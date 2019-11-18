package typingsJapgolly.antd.libCommentMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentProps extends js.Object {
  /** List of action items rendered below the comment content */
  var actions: js.UndefOr[js.Array[Node]] = js.undefined
  /** The element to display as the comment author. */
  var author: js.UndefOr[Node] = js.undefined
  /** The element to display as the comment avatar - generally an antd Avatar */
  var avatar: js.UndefOr[Node] = js.undefined
  /** Nested comments should be provided as children of the Comment */
  var children: js.UndefOr[Node] = js.undefined
  /** className of comment */
  var className: js.UndefOr[String] = js.undefined
  /** The main content of the comment */
  var content: Node
  /** A datetime element containing the time to be displayed */
  var datetime: js.UndefOr[Node] = js.undefined
  /** Comment prefix defaults to '.ant-comment' */
  var prefixCls: js.UndefOr[String] = js.undefined
  /** Additional style for the comment */
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CommentProps {
  @scala.inline
  def apply(
    content: VdomNode,
    actions: js.Array[Node] = null,
    author: VdomNode = null,
    avatar: VdomNode = null,
    children: VdomNode = null,
    className: String = null,
    datetime: VdomNode = null,
    prefixCls: String = null,
    style: CSSProperties = null
  ): CommentProps = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.rawNode.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.rawNode.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (datetime != null) __obj.updateDynamic("datetime")(datetime.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentProps]
  }
}

