package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentActionMod.CommentActionProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentActionsMod.CommentActionsProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentAuthorMod.CommentAuthorProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentAvatarMod.CommentAvatarProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentContentMod.CommentContentProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentGroupMod.CommentGroupProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentMetadataMod.CommentMetadataProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentTextMod.CommentTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsCommentCommentMod {
  
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/views/Comment/Comment", JSImport.Default)
    @js.native
    val ^ : CommentComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/views/Comment/Comment", "default.Action")
    @js.native
    open class Action protected ()
      extends Component[CommentActionProps, js.Object, Any] {
      def this(props: CommentActionProps) = this()
      def this(props: CommentActionProps, context: Any) = this()
    }
    
    type _To = CommentComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CommentComponent = ^
  }
  
  @js.native
  trait CommentComponent
    extends StObject
       with FunctionComponent[CommentProps] {
    
    var Action: ComponentClassP[CommentActionProps & js.Object] = js.native
    
    var Actions: FC[CommentActionsProps] = js.native
    
    var Author: FC[CommentAuthorProps] = js.native
    
    var Avatar: FC[CommentAvatarProps] = js.native
    
    var Content: FC[CommentContentProps] = js.native
    
    var Group: FC[CommentGroupProps] = js.native
    
    var Metadata: FC[CommentMetadataProps] = js.native
    
    var Text: FC[CommentTextProps] = js.native
  }
  
  trait CommentProps
    extends StObject
       with StrictCommentProps
       with /* key */ StringDictionary[Any]
  object CommentProps {
    
    inline def apply(): CommentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentProps]
    }
  }
  
  trait StrictCommentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Comment can be collapsed, or hidden from view. */
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictCommentProps {
    
    inline def apply(): StrictCommentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCommentProps]
    }
    
    extension [Self <: StrictCommentProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
