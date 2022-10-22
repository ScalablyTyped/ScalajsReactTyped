package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListContentMod.ListContentProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListDescriptionMod.ListDescriptionProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListHeaderMod.ListHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListIconMod.ListIconProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListItemMod.ListItemProps
import typingsJapgolly.semanticUiReact.distCommonjsElementsListListListMod.ListListProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticFLOATS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticSIZES
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.very
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsListListMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/List/List", JSImport.Default)
  @js.native
  val default: ListComponent = js.native
  
  @js.native
  trait ListComponent
    extends StObject
       with FunctionComponent[ListProps] {
    
    var Content: FC[ListContentProps] = js.native
    
    var Description: FC[ListDescriptionProps] = js.native
    
    var Header: FC[ListHeaderProps] = js.native
    
    var Icon: FC[ListIconProps] = js.native
    
    var Item: FC[ListItemProps] = js.native
    
    var List: FC[ListListProps] = js.native
  }
  
  trait ListProps
    extends StObject
       with StrictListProps
       with /* key */ StringDictionary[Any]
  object ListProps {
    
    inline def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
  }
  
  trait StrictListProps extends StObject {
    
    /** A list can animate to set the current item apart from the list. */
    var animated: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** A list can mark items with a bullet. */
    var bulleted: js.UndefOr[Boolean] = js.undefined
    
    /** A list can divide its items into cells. */
    var celled: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A list can show divisions between content. */
    var divided: js.UndefOr[Boolean] = js.undefined
    
    /** An list can be floated left or right. */
    var floated: js.UndefOr[SemanticFLOATS] = js.undefined
    
    /** A list can be formatted to have items appear horizontally. */
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    /** A list can be inverted to appear on a dark background. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand array of props for ListItem. */
    var items: js.UndefOr[SemanticShorthandCollection[ListItemProps]] = js.undefined
    
    /** A list can be specially formatted for navigation links. */
    var link: js.UndefOr[Boolean] = js.undefined
    
    /**
      * onClick handler for ListItem. Mutually exclusive with children.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All item props.
      */
    var onItemClick: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ ListItemProps, Unit]
      ] = js.undefined
    
    /** A list can be ordered numerically. */
    var ordered: js.UndefOr[Boolean] = js.undefined
    
    /** A list can relax its padding to provide more negative space. */
    var relaxed: js.UndefOr[Boolean | very] = js.undefined
    
    /** A selection list formats list items as possible choices. */
    var selection: js.UndefOr[Boolean] = js.undefined
    
    /** A list can vary in size. */
    var size: js.UndefOr[SemanticSIZES] = js.undefined
    
    /** An element inside a list can be vertically aligned. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.undefined
  }
  object StrictListProps {
    
    inline def apply(): StrictListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictListProps]
    }
    
    extension [Self <: StrictListProps](x: Self) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBulleted(value: Boolean): Self = StObject.set(x, "bulleted", value.asInstanceOf[js.Any])
      
      inline def setBulletedUndefined: Self = StObject.set(x, "bulleted", js.undefined)
      
      inline def setCelled(value: Boolean): Self = StObject.set(x, "celled", value.asInstanceOf[js.Any])
      
      inline def setCelledUndefined: Self = StObject.set(x, "celled", js.undefined)
      
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
      
      inline def setDivided(value: Boolean): Self = StObject.set(x, "divided", value.asInstanceOf[js.Any])
      
      inline def setDividedUndefined: Self = StObject.set(x, "divided", js.undefined)
      
      inline def setFloated(value: SemanticFLOATS): Self = StObject.set(x, "floated", value.asInstanceOf[js.Any])
      
      inline def setFloatedUndefined: Self = StObject.set(x, "floated", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setItems(value: SemanticShorthandCollection[ListItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: SemanticShorthandItem[ListItemProps]*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setOnItemClick(value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ ListItemProps) => Callback): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* data */ ListItemProps) => (value(t0, t1)).runNow()))
      
      inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
      
      inline def setRelaxed(value: Boolean | very): Self = StObject.set(x, "relaxed", value.asInstanceOf[js.Any])
      
      inline def setRelaxedUndefined: Self = StObject.set(x, "relaxed", js.undefined)
      
      inline def setSelection(value: Boolean): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setSize(value: SemanticSIZES): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  type _To = ListComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsListListMod.foo` */
  override def _to: ListComponent = default
}
