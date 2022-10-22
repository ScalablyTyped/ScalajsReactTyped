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
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedDateMod.FeedDateProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedUserMod.FeedUserProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsFeedFeedSummaryMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedSummary", JSImport.Default)
  @js.native
  val default: FC[FeedSummaryProps] = js.native
  
  trait FeedSummaryProps
    extends StObject
       with StrictFeedSummaryProps
       with /* key */ StringDictionary[Any]
  object FeedSummaryProps {
    
    inline def apply(): FeedSummaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedSummaryProps]
    }
  }
  
  trait StrictFeedSummaryProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Shorthand for FeedDate. */
    var date: js.UndefOr[SemanticShorthandItem[FeedDateProps]] = js.undefined
    
    /** Shorthand for FeedUser. */
    var user: js.UndefOr[SemanticShorthandItem[FeedUserProps]] = js.undefined
  }
  object StrictFeedSummaryProps {
    
    inline def apply(): StrictFeedSummaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedSummaryProps]
    }
    
    extension [Self <: StrictFeedSummaryProps](x: Self) {
      
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
      
      inline def setDate(value: SemanticShorthandItem[FeedDateProps]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateFunction3(
        value: (/* component */ ElementType, FeedDateProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "date", js.Any.fromFunction3(value))
      
      inline def setDateNull: Self = StObject.set(x, "date", null)
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDateVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "date", js.Array(value*))
      
      inline def setDateVdomElement(value: VdomElement): Self = StObject.set(x, "date", value.rawElement.asInstanceOf[js.Any])
      
      inline def setUser(value: SemanticShorthandItem[FeedUserProps]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserFunction3(
        value: (/* component */ ElementType, FeedUserProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "user", js.Any.fromFunction3(value))
      
      inline def setUserNull: Self = StObject.set(x, "user", null)
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def setUserVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "user", js.Array(value*))
      
      inline def setUserVdomElement(value: VdomElement): Self = StObject.set(x, "user", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[FeedSummaryProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsFeedFeedSummaryMod.foo` */
  override def _to: FC[FeedSummaryProps] = default
}
