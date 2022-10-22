package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.ellipsisItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.firstItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.lastItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.nextItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.pageItem
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.prevItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsAddonsPaginationPaginationItemMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Pagination/PaginationItem", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PaginationItemProps, js.Object, Any]
  
  type PaginationItem = japgolly.scalajs.react.facade.React.Component[PaginationItemProps & js.Object, js.Object]
  
  trait PaginationItemProps
    extends StObject
       with StrictPaginationItemProps
       with /* key */ StringDictionary[Any]
  object PaginationItemProps {
    
    inline def apply(): PaginationItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationItemProps]
    }
  }
  
  trait StrictPaginationItemProps extends StObject {
    
    /** A pagination item can be active. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** A pagination item can be disabled. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ ReactMouseEventFrom[HTMLAnchorElement], 
          /* data */ PaginationItemProps, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Called on key down.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onKeyDown: js.UndefOr[
        js.Function2[
          /* event */ ReactMouseEventFrom[HTMLAnchorElement], 
          /* data */ PaginationItemProps, 
          Unit
        ]
      ] = js.undefined
    
    /** A pagination should have a type. */
    var `type`: js.UndefOr[ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem] = js.undefined
  }
  object StrictPaginationItemProps {
    
    inline def apply(): StrictPaginationItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPaginationItemProps]
    }
    
    extension [Self <: StrictPaginationItemProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnClick(
        value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ PaginationItemProps) => Callback
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* data */ PaginationItemProps) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyDown(
        value: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ PaginationItemProps) => Callback
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLAnchorElement], t1: /* data */ PaginationItemProps) => (value(t0, t1)).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setType(value: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
