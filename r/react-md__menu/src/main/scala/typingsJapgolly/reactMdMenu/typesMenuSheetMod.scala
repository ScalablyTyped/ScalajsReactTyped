package typingsJapgolly.reactMdMenu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactMdMenu.typesTypesMod.MenuListProps
import typingsJapgolly.reactMdMenu.typesTypesMod.MenuOrientationProps
import typingsJapgolly.reactMdSheet.typesSheetMod.BaseSheetProps
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusArg
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusHandler
import typingsJapgolly.reactMdUtils.typesTypesMod.LabelRequiredForA11y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuSheetMod {
  
  @JSImport("@react-md/menu/types/MenuSheet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MenuSheet(
    hasIdChildrenHeaderFooterHorizontalMenuRefMenuPropsListStyleListClassNameListPropsPositionVerticalSizeOnClickOverlayPropsOnRequestCloseProps: LabelRequiredForA11y[MenuSheetProps]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuSheet")(hasIdChildrenHeaderFooterHorizontalMenuRefMenuPropsListStyleListClassNameListPropsPositionVerticalSizeOnClickOverlayPropsOnRequestCloseProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusCallbacks because var conflicts: onFocus, onKeyDown. Inlined onJumpToFirst, onSearch, onIncrement, onDecrement, onJumpToLast
  - typingsJapgolly.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusHookOptions because var conflicts: onFocus, onKeyDown. Inlined onFocusChange, getDefaultFocusIndex */ trait MenuSheetProps
    extends StObject
       with BaseSheetProps
       with MenuOrientationProps
       with MenuListProps {
    
    /**
      * The `Menu`s children.
      */
    @JSName("children")
    var children_MenuSheetProps: Node
    
    /** {@inheritDoc MenuConfiguration.sheetFooter} */
    var footer: js.UndefOr[Node] = js.undefined
    
    /**
      * A function that can be used to get the default focus index when the
      * container element first gains focus. If this returns `-1`, no child element
      * will be focused and the container will maintain focus instead.
      *
      * @param elements - The current list of elements that can be focused within
      * the container element
      * @param container - The container element that gained focus
      */
    var getDefaultFocusIndex: js.UndefOr[js.Function2[/* elements */ js.Array[HTMLElement], HTMLDivElement, Double]] = js.undefined
    
    /** {@inheritDoc MenuConfiguration.sheetHeader} */
    var header: js.UndefOr[Node] = js.undefined
    
    /**
      * Any additional props that should be passed to the `Menu` component.
      */
    var menuProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      * This should be the `menuRef` returned by the `useMenu` hook so that the
      * menu can be focused on mount.
      */
    var menuRef: Ref[HTMLDivElement]
    
    /**
      * This is called whenever one of the
      * {@link KeyboardMovementBehavior.decrementKeys} are pressed.
      */
    var onDecrement: js.UndefOr[KeyboardFocusHandler[HTMLDivElement]] = js.undefined
    
    /**
      * An optional function to call when the custom focused element should change.
      * The default value is just to call `element.focus()`.
      *
      * @param element - The element that should gain custom focus
      * @param nextFocusIndex - The next focus index which can be used for
      * additional movement behavior.
      */
    var onFocusChange: js.UndefOr[js.Function2[/* element */ HTMLElement, /* nextFocusIndex */ Double, Unit]] = js.undefined
    
    /**
      * This is called whenever one of the
      * {@link KeyboardMovementBehavior.incrementKeys} are pressed.
      */
    var onIncrement: js.UndefOr[KeyboardFocusHandler[HTMLDivElement]] = js.undefined
    
    /**
      * This is called whenever one of the
      * {@link KeyboardMovementBehavior.jumpToFirstKeys} are pressed.
      */
    var onJumpToFirst: js.UndefOr[KeyboardFocusHandler[HTMLDivElement]] = js.undefined
    
    /**
      * This is called whenever one of the
      * {@link KeyboardMovementBehavior.jumpToLastKeys} are pressed.
      */
    var onJumpToLast: js.UndefOr[KeyboardFocusHandler[HTMLDivElement]] = js.undefined
    
    /**
      * This is called whenever a single letter has been pressed and
      * {@link KeyboardMovementBehavior.searchable} is `true`.
      */
    var onSearch: js.UndefOr[KeyboardFocusHandler[HTMLDivElement]] = js.undefined
  }
  object MenuSheetProps {
    
    inline def apply(id: String, onRequestClose: Callback, visible: Boolean): MenuSheetProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onRequestClose = onRequestClose.toJsFn, visible = visible.asInstanceOf[js.Any], children = null, menuRef = null)
      __obj.asInstanceOf[MenuSheetProps]
    }
    
    extension [Self <: MenuSheetProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFooter(value: VdomNode): Self = StObject.set(x, "footer", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footer", js.Array(value*))
      
      inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGetDefaultFocusIndex(value: (/* elements */ js.Array[HTMLElement], HTMLDivElement) => Double): Self = StObject.set(x, "getDefaultFocusIndex", js.Any.fromFunction2(value))
      
      inline def setGetDefaultFocusIndexUndefined: Self = StObject.set(x, "getDefaultFocusIndex", js.undefined)
      
      inline def setHeader(value: VdomNode): Self = StObject.set(x, "header", value.rawNode.asInstanceOf[js.Any])
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "header", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMenuProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "menuProps", value.asInstanceOf[js.Any])
      
      inline def setMenuPropsUndefined: Self = StObject.set(x, "menuProps", js.undefined)
      
      inline def setMenuRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "menuRef", value.asInstanceOf[js.Any])
      
      inline def setMenuRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "menuRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
      
      inline def setMenuRefNull: Self = StObject.set(x, "menuRef", null)
      
      inline def setOnDecrement(value: /* arg */ KeyboardFocusArg[HTMLDivElement] => Callback): Self = StObject.set(x, "onDecrement", js.Any.fromFunction1((t0: /* arg */ KeyboardFocusArg[HTMLDivElement]) => value(t0).runNow()))
      
      inline def setOnDecrementUndefined: Self = StObject.set(x, "onDecrement", js.undefined)
      
      inline def setOnFocusChange(value: (/* element */ HTMLElement, /* nextFocusIndex */ Double) => Callback): Self = StObject.set(x, "onFocusChange", js.Any.fromFunction2((t0: /* element */ HTMLElement, t1: /* nextFocusIndex */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnFocusChangeUndefined: Self = StObject.set(x, "onFocusChange", js.undefined)
      
      inline def setOnIncrement(value: /* arg */ KeyboardFocusArg[HTMLDivElement] => Callback): Self = StObject.set(x, "onIncrement", js.Any.fromFunction1((t0: /* arg */ KeyboardFocusArg[HTMLDivElement]) => value(t0).runNow()))
      
      inline def setOnIncrementUndefined: Self = StObject.set(x, "onIncrement", js.undefined)
      
      inline def setOnJumpToFirst(value: /* arg */ KeyboardFocusArg[HTMLDivElement] => Callback): Self = StObject.set(x, "onJumpToFirst", js.Any.fromFunction1((t0: /* arg */ KeyboardFocusArg[HTMLDivElement]) => value(t0).runNow()))
      
      inline def setOnJumpToFirstUndefined: Self = StObject.set(x, "onJumpToFirst", js.undefined)
      
      inline def setOnJumpToLast(value: /* arg */ KeyboardFocusArg[HTMLDivElement] => Callback): Self = StObject.set(x, "onJumpToLast", js.Any.fromFunction1((t0: /* arg */ KeyboardFocusArg[HTMLDivElement]) => value(t0).runNow()))
      
      inline def setOnJumpToLastUndefined: Self = StObject.set(x, "onJumpToLast", js.undefined)
      
      inline def setOnSearch(value: /* arg */ KeyboardFocusArg[HTMLDivElement] => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction1((t0: /* arg */ KeyboardFocusArg[HTMLDivElement]) => value(t0).runNow()))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    }
  }
}
