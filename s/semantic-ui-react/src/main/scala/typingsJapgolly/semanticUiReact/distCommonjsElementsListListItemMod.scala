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
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsElementsImageImageMod.ImageProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListContentMod.ListContentProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListDescriptionMod.ListDescriptionProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListHeaderMod.ListHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListIconMod.ListIconProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsListListItemMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/List/ListItem", JSImport.Default)
  @js.native
  val default: FC[ListItemProps] = js.native
  
  trait ListItemProps
    extends StObject
       with StrictListItemProps
       with /* key */ StringDictionary[Any]
  object ListItemProps {
    
    inline def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
  }
  
  trait StrictListItemProps extends StObject {
    
    /** A list item can active. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandItem[ListContentProps]] = js.undefined
    
    /** Shorthand for ListDescription. */
    var description: js.UndefOr[SemanticShorthandItem[ListDescriptionProps]] = js.undefined
    
    /** A list item can disabled. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for ListHeader. */
    var header: js.UndefOr[SemanticShorthandItem[ListHeaderProps]] = js.undefined
    
    /** Shorthand for ListIcon. */
    var icon: js.UndefOr[SemanticShorthandItem[ListIconProps]] = js.undefined
    
    /** Shorthand for Image. */
    var image: js.UndefOr[SemanticShorthandItem[ImageProps]] = js.undefined
    
    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ ListItemProps, Unit]
      ] = js.undefined
    
    /** A value for an ordered list. */
    var value: js.UndefOr[String] = js.undefined
  }
  object StrictListItemProps {
    
    inline def apply(): StrictListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictListItemProps]
    }
    
    extension [Self <: StrictListItemProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandItem[ListContentProps]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction3(
        value: (/* component */ ElementType, ListContentProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "content", js.Any.fromFunction3(value))
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDescription(value: SemanticShorthandItem[ListDescriptionProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionFunction3(
        value: (/* component */ ElementType, ListDescriptionProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "description", js.Any.fromFunction3(value))
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDescriptionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setDescriptionVdomElement(value: VdomElement): Self = StObject.set(x, "description", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHeader(value: SemanticShorthandItem[ListHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFunction3(
        value: (/* component */ ElementType, ListHeaderProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "header", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIcon(value: SemanticShorthandItem[ListIconProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction3(
        value: (/* component */ ElementType, ListIconProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setImage(value: SemanticShorthandItem[ImageProps]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageFunction3(
        value: (/* component */ ElementType, ImageProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
      ): Self = StObject.set(x, "image", js.Any.fromFunction3(value))
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setImageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "image", js.Array(value*))
      
      inline def setImageVdomElement(value: VdomElement): Self = StObject.set(x, "image", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClick(value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ ListItemProps) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* data */ ListItemProps) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = FC[ListItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsListListItemMod.foo` */
  override def _to: FC[ListItemProps] = default
}
