package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommentMod extends Shortcut {
  
  @JSImport("antd/lib/comment", JSImport.Default)
  @js.native
  val default: FC[CommentProps] = js.native
  
  trait CommentProps extends StObject {
    
    /** List of action items rendered below the comment content */
    var actions: js.UndefOr[js.Array[Node]] = js.undefined
    
    /** The element to display as the comment author. */
    var author: js.UndefOr[Node] = js.undefined
    
    /** The element to display as the comment avatar - generally an antd Avatar */
    var avatar: js.UndefOr[Node] = js.undefined
    
    /** Nested comments should be provided as children of the Comment */
    var children: js.UndefOr[Node] = js.undefined
    
    /** ClassName of comment */
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
    
    inline def apply(): CommentProps = {
      val __obj = js.Dynamic.literal(content = null)
      __obj.asInstanceOf[CommentProps]
    }
    
    extension [Self <: CommentProps](x: Self) {
      
      inline def setActions(value: js.Array[Node]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: Node*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setAuthor(value: VdomNode): Self = StObject.set(x, "author", value.rawNode.asInstanceOf[js.Any])
      
      inline def setAuthorNull: Self = StObject.set(x, "author", null)
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setAuthorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "author", js.Array(value*))
      
      inline def setAuthorVdomElement(value: VdomElement): Self = StObject.set(x, "author", value.rawElement.asInstanceOf[js.Any])
      
      inline def setAvatar(value: VdomNode): Self = StObject.set(x, "avatar", value.rawNode.asInstanceOf[js.Any])
      
      inline def setAvatarNull: Self = StObject.set(x, "avatar", null)
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setAvatarVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "avatar", js.Array(value*))
      
      inline def setAvatarVdomElement(value: VdomElement): Self = StObject.set(x, "avatar", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDatetime(value: VdomNode): Self = StObject.set(x, "datetime", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDatetimeNull: Self = StObject.set(x, "datetime", null)
      
      inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      inline def setDatetimeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "datetime", js.Array(value*))
      
      inline def setDatetimeVdomElement(value: VdomElement): Self = StObject.set(x, "datetime", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[CommentProps]
  
  /* This means you don't have to write `default`, but can instead just say `libCommentMod.foo` */
  override def _to: FC[CommentProps] = default
}
