package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libCommentMod.CommentProps
import typingsJapgolly.antd.libCommentMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Comment {
  def apply(
    actions: js.Array[Node] = null,
    author: VdomNode = null,
    avatar: VdomNode = null,
    className: String = null,
    content: VdomNode = null,
    datetime: VdomNode = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CommentProps, default, Unit, CommentProps] = {
    val __obj = js.Dynamic.literal()
  
      if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.rawNode.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (datetime != null) __obj.updateDynamic("datetime")(datetime.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libCommentMod.CommentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libCommentMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libCommentMod.CommentProps])(children: _*)
  }
  @JSImport("antd/lib/comment", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

