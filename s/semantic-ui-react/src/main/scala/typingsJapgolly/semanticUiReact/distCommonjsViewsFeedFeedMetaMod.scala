package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedLikeMod.FeedLikeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsFeedFeedMetaMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedMeta", JSImport.Default)
  @js.native
  val default: FC[FeedMetaProps] = js.native
  
  trait FeedMetaProps
    extends StObject
       with StrictFeedMetaProps
       with /* key */ StringDictionary[Any]
  object FeedMetaProps {
    
    inline def apply(): FeedMetaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedMetaProps]
    }
  }
  
  trait StrictFeedMetaProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Shorthand for FeedLike. */
    var like: js.UndefOr[SemanticShorthandItem[FeedLikeProps]] = js.undefined
  }
  object StrictFeedMetaProps {
    
    inline def apply(): StrictFeedMetaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedMetaProps]
    }
    
    extension [Self <: StrictFeedMetaProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLike(value: SemanticShorthandItem[FeedLikeProps]): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
      
      inline def setLikeFunction3(
        value: (/* component */ ElementType, FeedLikeProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "like", js.Any.fromFunction3(value))
      
      inline def setLikeNull: Self = StObject.set(x, "like", null)
      
      inline def setLikeUndefined: Self = StObject.set(x, "like", js.undefined)
      
      inline def setLikeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "like", js.Array(value*))
      
      inline def setLikeVdomElement(value: VdomElement): Self = StObject.set(x, "like", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[FeedMetaProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsFeedFeedMetaMod.foo` */
  override def _to: FC[FeedMetaProps] = default
}
