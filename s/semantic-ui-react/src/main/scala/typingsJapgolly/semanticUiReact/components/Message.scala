package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMessageMessageContentMod.MessageContentProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMessageMessageHeaderMod.MessageHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMessageMessageItemMod.MessageItemProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMessageMessageListMod.MessageListProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMessageMessageMod.MessageProps
import typingsJapgolly.semanticUiReact.distCommonjsCollectionsMessageMessageMod.MessageSizeProp
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Message {
  
  object Content {
    
    @JSImport("semantic-ui-react", "Message.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_MessageContentProps_1436092918 = new SharedBuilder_MessageContentProps_1436092918(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: MessageContentProps): SharedBuilder_MessageContentProps_1436092918 = new SharedBuilder_MessageContentProps_1436092918(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("semantic-ui-react", "Message.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_MessageHeaderProps_1959897789 = new SharedBuilder_MessageHeaderProps_1959897789(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: MessageHeaderProps): SharedBuilder_MessageHeaderProps_1959897789 = new SharedBuilder_MessageHeaderProps_1959897789(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Item {
    
    @JSImport("semantic-ui-react", "Message.Item")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Item.type): SharedBuilder_MessageItemProps1591511845 = new SharedBuilder_MessageItemProps1591511845(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: MessageItemProps): SharedBuilder_MessageItemProps1591511845 = new SharedBuilder_MessageItemProps1591511845(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object List {
    
    @JSImport("semantic-ui-react", "Message.List")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: List.type): SharedBuilder_MessageListProps_2026924381 = new SharedBuilder_MessageListProps_2026924381(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: MessageListProps): SharedBuilder_MessageListProps_2026924381 = new SharedBuilder_MessageListProps_2026924381(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Message")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def attached(value: Boolean | bottom | top): this.type = set("attached", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def floating(value: Boolean): this.type = set("floating", value.asInstanceOf[js.Any])
    
    inline def header(value: SemanticShorthandItem[MessageHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
    
    inline def headerFunction3(
      value: (/* component */ ElementType, MessageHeaderProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("header", js.Any.fromFunction3(value))
    
    inline def headerNull: this.type = set("header", null)
    
    inline def headerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("header", js.Array(value*))
    
    inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def icon(value: Any | Boolean): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def info(value: Boolean): this.type = set("info", value.asInstanceOf[js.Any])
    
    inline def list(value: SemanticShorthandCollection[MessageItemProps]): this.type = set("list", value.asInstanceOf[js.Any])
    
    inline def listVarargs(value: SemanticShorthandItem[MessageItemProps]*): this.type = set("list", js.Array(value*))
    
    inline def negative(value: Boolean): this.type = set("negative", value.asInstanceOf[js.Any])
    
    inline def onDismiss(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ MessageProps) => Callback): this.type = set("onDismiss", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ MessageProps) => (value(t0, t1)).runNow()))
    
    inline def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
    
    inline def size(value: MessageSizeProp): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def success(value: Boolean): this.type = set("success", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def warning(value: Boolean): this.type = set("warning", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Message.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MessageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
