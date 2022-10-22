package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.materialUiCore.materialUiCoreStrings.auto
import typingsJapgolly.materialUiCore.materialUiCoreStrings.desktop
import typingsJapgolly.materialUiCore.materialUiCoreStrings.fullWidth
import typingsJapgolly.materialUiCore.materialUiCoreStrings.horizontal
import typingsJapgolly.materialUiCore.materialUiCoreStrings.inherit
import typingsJapgolly.materialUiCore.materialUiCoreStrings.off
import typingsJapgolly.materialUiCore.materialUiCoreStrings.on
import typingsJapgolly.materialUiCore.materialUiCoreStrings.primary
import typingsJapgolly.materialUiCore.materialUiCoreStrings.scrollable
import typingsJapgolly.materialUiCore.materialUiCoreStrings.secondary
import typingsJapgolly.materialUiCore.materialUiCoreStrings.standard
import typingsJapgolly.materialUiCore.materialUiCoreStrings.vertical
import typingsJapgolly.materialUiCore.tabsTabsMod.TabsActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arialabelledby extends StObject {
  
  /**
    * The component used to render the scroll buttons.
    */
  var ScrollButtonComponent: js.UndefOr[ElementType] = js.undefined
  
  /**
    * Props applied to the tab indicator element.
    */
  var TabIndicatorProps: js.UndefOr[PartialHTMLAttributesHTML] = js.undefined
  
  /**
    * Props applied to the [`TabScrollButton`](/api/tab-scroll-button/) element.
    */
  var TabScrollButtonProps: js.UndefOr[PartialTabScrollButtonPro] = js.undefined
  
  /**
    * Callback fired when the component mounts.
    * This is useful when you want to trigger an action programmatically.
    * It supports two actions: `updateIndicator()` and `updateScrollButtons()`
    *
    * @param {object} actions This object contains all possible actions
    * that can be triggered programmatically.
    */
  var action: js.UndefOr[typingsJapgolly.react.mod.Ref[TabsActions]] = js.undefined
  
  /**
    * The label for the Tabs as a string.
    */
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  /**
    * An id or list of ids separated by a space that label the Tabs.
    */
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the tabs will be centered.
    * This property is intended for large views.
    */
  var centered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Determines the color of the indicator.
    */
  var indicatorColor: js.UndefOr[secondary | primary] = js.undefined
  
  /**
    * Callback fired when the value changes.
    *
    * @param {object} event The event source of the callback
    * @param {any} value We default to the index of the child (number)
    */
  var onChange: js.UndefOr[
    js.Function2[/* event */ ReactEventFrom[js.Object & Element], /* value */ Any, Unit]
  ] = js.undefined
  
  /**
    * The tabs orientation (layout flow direction).
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  
  /**
    * Determine behavior of scroll buttons when tabs are set to scroll:
    *
    * - `auto` will only present them when not all the items are visible.
    * - `desktop` will only present them on medium and larger viewports.
    * - `on` will always present them.
    * - `off` will never present them.
    */
  var scrollButtons: js.UndefOr[auto | desktop | on | off] = js.undefined
  
  /**
    * If `true` the selected tab changes on focus. Otherwise it only
    * changes on activation.
    */
  var selectionFollowsFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines the color of the `Tab`.
    */
  var textColor: js.UndefOr[secondary | primary | inherit] = js.undefined
  
  /**
    * The value of the currently selected `Tab`.
    * If you don't want any selected `Tab`, you can set this property to `false`.
    */
  var value: js.UndefOr[Any] = js.undefined
  
  /**
    *  Determines additional display behavior of the tabs:
    *
    *  - `scrollable` will invoke scrolling properties and allow for horizontally
    *  scrolling (or swiping) of the tab bar.
    *  -`fullWidth` will make the tabs grow to use all the available space,
    *  which should be used for small views, like on mobile.
    *  - `standard` will render the default state.
    */
  var variant: js.UndefOr[standard | scrollable | fullWidth] = js.undefined
}
object Arialabelledby {
  
  inline def apply(): Arialabelledby = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arialabelledby]
  }
  
  extension [Self <: Arialabelledby](x: Self) {
    
    inline def setAction(value: typingsJapgolly.react.mod.Ref[TabsActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionFunction1(value: TabsActions | Null => Callback): Self = StObject.set(x, "action", js.Any.fromFunction1((t0: TabsActions | Null) => value(t0).runNow()))
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
    
    inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIndicatorColor(value: secondary | primary): Self = StObject.set(x, "indicatorColor", value.asInstanceOf[js.Any])
    
    inline def setIndicatorColorUndefined: Self = StObject.set(x, "indicatorColor", js.undefined)
    
    inline def setOnChange(value: (/* event */ ReactEventFrom[js.Object & Element], /* value */ Any) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[js.Object & Element], t1: /* value */ Any) => (value(t0, t1)).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setScrollButtonComponent(value: ElementType): Self = StObject.set(x, "ScrollButtonComponent", value.asInstanceOf[js.Any])
    
    inline def setScrollButtonComponentUndefined: Self = StObject.set(x, "ScrollButtonComponent", js.undefined)
    
    inline def setScrollButtons(value: auto | desktop | on | off): Self = StObject.set(x, "scrollButtons", value.asInstanceOf[js.Any])
    
    inline def setScrollButtonsUndefined: Self = StObject.set(x, "scrollButtons", js.undefined)
    
    inline def setSelectionFollowsFocus(value: Boolean): Self = StObject.set(x, "selectionFollowsFocus", value.asInstanceOf[js.Any])
    
    inline def setSelectionFollowsFocusUndefined: Self = StObject.set(x, "selectionFollowsFocus", js.undefined)
    
    inline def setTabIndicatorProps(value: PartialHTMLAttributesHTML): Self = StObject.set(x, "TabIndicatorProps", value.asInstanceOf[js.Any])
    
    inline def setTabIndicatorPropsUndefined: Self = StObject.set(x, "TabIndicatorProps", js.undefined)
    
    inline def setTabScrollButtonProps(value: PartialTabScrollButtonPro): Self = StObject.set(x, "TabScrollButtonProps", value.asInstanceOf[js.Any])
    
    inline def setTabScrollButtonPropsUndefined: Self = StObject.set(x, "TabScrollButtonProps", js.undefined)
    
    inline def setTextColor(value: secondary | primary | inherit): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariant(value: standard | scrollable | fullWidth): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
