package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedContentMod.FeedContentProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedDateMod.FeedDateProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedEventMod.FeedEventProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedExtraMod.FeedExtraProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedLabelMod.FeedLabelProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedLikeMod.FeedLikeProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedMetaMod.FeedMetaProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedSummaryMod.FeedSummaryProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedUserMod.FeedUserProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsFeedFeedMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/Feed", JSImport.Default)
  @js.native
  val default: FeedComponent = js.native
  
  @js.native
  trait FeedComponent
    extends StObject
       with FunctionComponent[FeedProps] {
    
    var Content: FC[FeedContentProps] = js.native
    
    var Date: FC[FeedDateProps] = js.native
    
    var Event: FC[FeedEventProps] = js.native
    
    var Extra: FC[FeedExtraProps] = js.native
    
    var Label: FC[FeedLabelProps] = js.native
    
    var Like: FC[FeedLikeProps] = js.native
    
    var Meta: FC[FeedMetaProps] = js.native
    
    var Summary: FC[FeedSummaryProps] = js.native
    
    var User: FC[FeedUserProps] = js.native
  }
  
  trait FeedProps
    extends StObject
       with StrictFeedProps
       with /* key */ StringDictionary[Any]
  object FeedProps {
    
    inline def apply(): FeedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedProps]
    }
  }
  
  trait StrictFeedProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand array of props for FeedEvent. */
    var events: js.UndefOr[SemanticShorthandCollection[FeedEventProps]] = js.undefined
    
    /** A feed can have different sizes. */
    var size: js.UndefOr[small | large] = js.undefined
  }
  object StrictFeedProps {
    
    inline def apply(): StrictFeedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedProps]
    }
    
    extension [Self <: StrictFeedProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEvents(value: SemanticShorthandCollection[FeedEventProps]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: SemanticShorthandItem[FeedEventProps]*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setSize(value: small | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FeedComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsFeedFeedMod.foo` */
  override def _to: FeedComponent = default
}
