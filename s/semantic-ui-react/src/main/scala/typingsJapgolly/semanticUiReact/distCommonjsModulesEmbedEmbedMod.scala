package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsElementsIconIconMod.IconProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.HtmlIframeProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`16Colon9`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`21Colon9`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`4Colon3`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.vimeo
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.youtube
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesEmbedEmbedMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Embed/Embed", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[EmbedProps, js.Object, Any] {
    def this(props: EmbedProps) = this()
    def this(props: EmbedProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Embed/Embed", JSImport.Default)
  @js.native
  val default: ComponentClassP[EmbedProps & js.Object] = js.native
  
  trait EmbedProps
    extends StObject
       with StrictEmbedProps
       with /* key */ StringDictionary[Any]
  object EmbedProps {
    
    inline def apply(): EmbedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmbedProps]
    }
  }
  
  trait StrictEmbedProps extends StObject {
    
    /** An embed can be active. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** An embed can specify an alternative aspect ratio. */
    var aspectRatio: js.UndefOr[`4Colon3` | `16Colon9` | `21Colon9`] = js.undefined
    
    /** Setting to true or false will force autoplay. */
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    /** Whether to show networks branded UI like title cards, or after video calls to action. */
    var brandedUI: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Specifies a default chrome color with Vimeo or YouTube. */
    var color: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Initial value of active. */
    var defaultActive: js.UndefOr[Boolean] = js.undefined
    
    /** Whether to prefer HD content. */
    var hd: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies an icon to use with placeholder content. */
    var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
    
    /** Specifies an id for source. */
    var id: js.UndefOr[String] = js.undefined
    
    /** Shorthand for HTML iframe. */
    var iframe: js.UndefOr[SemanticShorthandItem[HtmlIframeProps]] = js.undefined
    
    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed value.
      */
    var onClick: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ EmbedProps, Unit]
      ] = js.undefined
    
    /** A placeholder image for embed. */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Specifies a source to use. */
    var source: js.UndefOr[youtube | vimeo] = js.undefined
    
    /** Specifies a url to use for embed. */
    var url: js.UndefOr[String] = js.undefined
  }
  object StrictEmbedProps {
    
    inline def apply(): StrictEmbedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictEmbedProps]
    }
    
    extension [Self <: StrictEmbedProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAspectRatio(value: `4Colon3` | `16Colon9` | `21Colon9`): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setBrandedUI(value: Boolean): Self = StObject.set(x, "brandedUI", value.asInstanceOf[js.Any])
      
      inline def setBrandedUIUndefined: Self = StObject.set(x, "brandedUI", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultActive(value: Boolean): Self = StObject.set(x, "defaultActive", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveUndefined: Self = StObject.set(x, "defaultActive", js.undefined)
      
      inline def setHd(value: Boolean): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
      
      inline def setHdUndefined: Self = StObject.set(x, "hd", js.undefined)
      
      inline def setIcon(value: SemanticShorthandItem[IconProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction3(
        value: (/* component */ ElementType, IconProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIframe(value: SemanticShorthandItem[HtmlIframeProps]): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      inline def setIframeFunction3(
        value: (/* component */ ElementType, HtmlIframeProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "iframe", js.Any.fromFunction3(value))
      
      inline def setIframeNull: Self = StObject.set(x, "iframe", null)
      
      inline def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
      
      inline def setIframeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "iframe", js.Array(value*))
      
      inline def setIframeVdomElement(value: VdomElement): Self = StObject.set(x, "iframe", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClick(value: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ EmbedProps) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLDivElement], t1: /* data */ EmbedProps) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSource(value: youtube | vimeo): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type _To = ComponentClassP[EmbedProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesEmbedEmbedMod.foo` */
  override def _to: ComponentClassP[EmbedProps & js.Object] = default
}
