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
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedContentMod.FeedContentProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedDateMod.FeedDateProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedExtraMod.FeedExtraProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedLabelMod.FeedLabelProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedMetaMod.FeedMetaProps
import typingsJapgolly.semanticUiReact.distCommonjsViewsFeedFeedSummaryMod.FeedSummaryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsFeedFeedEventMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedEvent", JSImport.Default)
  @js.native
  val default: FC[FeedEventProps] = js.native
  
  trait FeedEventProps
    extends StObject
       with StrictFeedEventProps
       with /* key */ StringDictionary[Any]
  object FeedEventProps {
    
    inline def apply(): FeedEventProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedEventProps]
    }
  }
  
  trait StrictFeedEventProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for FeedContent. */
    var content: js.UndefOr[SemanticShorthandItem[FeedContentProps]] = js.undefined
    
    /** Shorthand for FeedDate. */
    var date: js.UndefOr[SemanticShorthandItem[FeedDateProps]] = js.undefined
    
    /** Shorthand for FeedExtra with images. */
    var extraImages: js.UndefOr[SemanticShorthandItem[FeedExtraProps]] = js.undefined
    
    /** Shorthand for FeedExtra with content. */
    var extraText: js.UndefOr[SemanticShorthandItem[FeedExtraProps]] = js.undefined
    
    /** An event can contain icon label. */
    var icon: js.UndefOr[SemanticShorthandItem[FeedLabelProps]] = js.undefined
    
    /** An event can contain image label. */
    var image: js.UndefOr[SemanticShorthandItem[FeedLabelProps]] = js.undefined
    
    /** Shorthand for FeedMeta. */
    var meta: js.UndefOr[SemanticShorthandItem[FeedMetaProps]] = js.undefined
    
    /** Shorthand for FeedSummary. */
    var summary: js.UndefOr[SemanticShorthandItem[FeedSummaryProps]] = js.undefined
  }
  object StrictFeedEventProps {
    
    inline def apply(): StrictFeedEventProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedEventProps]
    }
    
    extension [Self <: StrictFeedEventProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandItem[FeedContentProps]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction3(
        value: (/* component */ ElementType, FeedContentProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "content", js.Any.fromFunction3(value))
      
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
      
      inline def setExtraImages(value: SemanticShorthandItem[FeedExtraProps]): Self = StObject.set(x, "extraImages", value.asInstanceOf[js.Any])
      
      inline def setExtraImagesFunction3(
        value: (/* component */ ElementType, FeedExtraProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "extraImages", js.Any.fromFunction3(value))
      
      inline def setExtraImagesNull: Self = StObject.set(x, "extraImages", null)
      
      inline def setExtraImagesUndefined: Self = StObject.set(x, "extraImages", js.undefined)
      
      inline def setExtraImagesVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "extraImages", js.Array(value*))
      
      inline def setExtraImagesVdomElement(value: VdomElement): Self = StObject.set(x, "extraImages", value.rawElement.asInstanceOf[js.Any])
      
      inline def setExtraText(value: SemanticShorthandItem[FeedExtraProps]): Self = StObject.set(x, "extraText", value.asInstanceOf[js.Any])
      
      inline def setExtraTextFunction3(
        value: (/* component */ ElementType, FeedExtraProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "extraText", js.Any.fromFunction3(value))
      
      inline def setExtraTextNull: Self = StObject.set(x, "extraText", null)
      
      inline def setExtraTextUndefined: Self = StObject.set(x, "extraText", js.undefined)
      
      inline def setExtraTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "extraText", js.Array(value*))
      
      inline def setExtraTextVdomElement(value: VdomElement): Self = StObject.set(x, "extraText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIcon(value: SemanticShorthandItem[FeedLabelProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction3(
        value: (/* component */ ElementType, FeedLabelProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setImage(value: SemanticShorthandItem[FeedLabelProps]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageFunction3(
        value: (/* component */ ElementType, FeedLabelProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "image", js.Any.fromFunction3(value))
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setImageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "image", js.Array(value*))
      
      inline def setImageVdomElement(value: VdomElement): Self = StObject.set(x, "image", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMeta(value: SemanticShorthandItem[FeedMetaProps]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaFunction3(
        value: (/* component */ ElementType, FeedMetaProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "meta", js.Any.fromFunction3(value))
      
      inline def setMetaNull: Self = StObject.set(x, "meta", null)
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setMetaVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "meta", js.Array(value*))
      
      inline def setMetaVdomElement(value: VdomElement): Self = StObject.set(x, "meta", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSummary(value: SemanticShorthandItem[FeedSummaryProps]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryFunction3(
        value: (/* component */ ElementType, FeedSummaryProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "summary", js.Any.fromFunction3(value))
      
      inline def setSummaryNull: Self = StObject.set(x, "summary", null)
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setSummaryVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "summary", js.Array(value*))
      
      inline def setSummaryVdomElement(value: VdomElement): Self = StObject.set(x, "summary", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[FeedEventProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsFeedFeedEventMod.foo` */
  override def _to: FC[FeedEventProps] = default
}
