package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMessageMessageContentMod.MessageContentProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMessageMessageHeaderMod.MessageHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMessageMessageItemMod.MessageItemProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMessageMessageListMod.MessageListProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsMessageMessageMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message/Message", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[MessageProps, js.Object, Any] {
    def this(props: MessageProps) = this()
    def this(props: MessageProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message/Message", JSImport.Default)
  @js.native
  val default: MessageComponent = js.native
  
  @js.native
  trait MessageComponent
    extends StObject
       with ComponentClass[MessageProps, js.Object] {
    
    var Content: FC[MessageContentProps] = js.native
    
    var Header: FC[MessageHeaderProps] = js.native
    
    var Item: FC[MessageItemProps] = js.native
    
    var List: FC[MessageListProps] = js.native
  }
  
  trait MessageProps
    extends StObject
       with StrictMessageProps
       with /* key */ StringDictionary[Any]
  object MessageProps {
    
    inline def apply(): MessageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageProps]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.big
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
    - typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive
  */
  trait MessageSizeProp extends StObject
  object MessageSizeProp {
    
    inline def big: typingsJapgolly.semanticUiReact.semanticUiReactStrings.big = "big".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.big]
    
    inline def huge: typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge = "huge".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge]
    
    inline def large: typingsJapgolly.semanticUiReact.semanticUiReactStrings.large = "large".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.large]
    
    inline def massive: typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive = "massive".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive]
    
    inline def mini: typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini = "mini".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini]
    
    inline def small: typingsJapgolly.semanticUiReact.semanticUiReactStrings.small = "small".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.small]
    
    inline def tiny: typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny]
  }
  
  trait StrictMessageProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** A message can be formatted to attach itself to other content. */
    var attached: js.UndefOr[Boolean | bottom | top] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** A message can be formatted to be different colors. */
    var color: js.UndefOr[SemanticCOLORS] = js.undefined
    
    /** A message can only take up the width of its content. */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A message may be formatted to display a negative message. Same as `negative`. */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** A message can float above content that it is related to. */
    var floating: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for MessageHeader. */
    var header: js.UndefOr[SemanticShorthandItem[MessageHeaderProps]] = js.undefined
    
    /** A message can be hidden. */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /** Add an icon by icon name or pass an <Icon /.> */
    var icon: js.UndefOr[Any | Boolean] = js.undefined
    
    /** A message may be formatted to display information. */
    var info: js.UndefOr[Boolean] = js.undefined
    
    /** Array shorthand items for the MessageList. Mutually exclusive with children. */
    var list: js.UndefOr[SemanticShorthandCollection[MessageItemProps]] = js.undefined
    
    /** A message may be formatted to display a negative message. Same as `error`. */
    var negative: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A message that the user can choose to hide.
      * Called when the user clicks the "x" icon. This also adds the "x" icon.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onDismiss: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ MessageProps, Unit]
      ] = js.undefined
    
    /** A message may be formatted to display a positive message.  Same as `success`. */
    var positive: js.UndefOr[Boolean] = js.undefined
    
    /** A message can have different sizes. */
    var size: js.UndefOr[MessageSizeProp] = js.undefined
    
    /** A message may be formatted to display a positive message.  Same as `positive`. */
    var success: js.UndefOr[Boolean] = js.undefined
    
    /** A message can be set to visible to force itself to be shown. */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** A message may be formatted to display warning messages. */
    var warning: js.UndefOr[Boolean] = js.undefined
  }
  object StrictMessageProps {
    
    inline def apply(): StrictMessageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMessageProps]
    }
    
    extension [Self <: StrictMessageProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAttached(value: Boolean | bottom | top): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      inline def setHeader(value: SemanticShorthandItem[MessageHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFunction3(
        value: (/* component */ ElementType, MessageHeaderProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "header", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setIcon(value: Any | Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setList(value: SemanticShorthandCollection[MessageItemProps]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setListVarargs(value: SemanticShorthandItem[MessageItemProps]*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
      
      inline def setOnDismiss(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ MessageProps) => Callback): Self = StObject.set(x, "onDismiss", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ MessageProps) => (value(t0, t1)).runNow()))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      inline def setSize(value: MessageSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  type _To = MessageComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsMessageMessageMod.foo` */
  override def _to: MessageComponent = default
}
