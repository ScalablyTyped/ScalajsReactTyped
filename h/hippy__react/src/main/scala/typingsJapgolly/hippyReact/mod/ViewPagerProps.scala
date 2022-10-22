package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.hippyReact.hippyReactStrings.`on-drag`
import typingsJapgolly.hippyReact.hippyReactStrings.interactive
import typingsJapgolly.hippyReact.hippyReactStrings.none
import typingsJapgolly.hippyReact.hippyReactStrings.onDrag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewPagerProps
  extends StObject
     with LayoutableProps {
  
  var children: js.UndefOr[js.Array[Node]] = js.undefined
  
  var horizontal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specific initial page after rendering.
    *
    * Default: 0
    */
  var initialPage: js.UndefOr[Double] = js.undefined
  
  /**
    * iOS only
    * https://developer.apple.com/documentation/uikit/uiscrollview/keyboarddismissmode
    */
  var keyboardDismissMode: js.UndefOr[none | `on-drag` | interactive | onDrag] = js.undefined
  
  /**
    * Called when the page scroll starts.
    *
    * @param {Object} evt - Page scroll event data.
    * @param {number} evt.position - Page index that will be selected.
    * @param {number} evt.offset - Scroll offset while scrolling.
    */
  var onPageScroll: js.UndefOr[js.Function1[/* evt */ PageScrollEvent, Unit]] = js.undefined
  
  /**
    * Called when the page scroll state changed.
    *
    * @param {string} evt - Page scroll state event data
    * This can be one of the following values:
    *
    * * idle
    * * dragging
    * * settling
    */
  var onPageScrollStateChanged: js.UndefOr[js.Function1[/* evt */ PageScrollState, Unit]] = js.undefined
  
  /**
    * Fires at most once per page is selected
    *
    * @param {Object} evt - Page selected event data.
    * @param {number} evt.position - Page index of selected.
    */
  var onPageSelected: js.UndefOr[js.Function1[/* evt */ PageSelectedEvent, Unit]] = js.undefined
  
  /**
    * When `false`, the view cannot be scrolled via touch interaction.
    *
    * Default: true
    *
    * > Note that the view can always be scrolled by calling setPage.
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[ViewStyleProp] = js.undefined
}
object ViewPagerProps {
  
  inline def apply(): ViewPagerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewPagerProps]
  }
  
  extension [Self <: ViewPagerProps](x: Self) {
    
    inline def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
    
    inline def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
    
    inline def setKeyboardDismissMode(value: none | `on-drag` | interactive | onDrag): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
    
    inline def setOnPageScroll(value: /* evt */ PageScrollEvent => Callback): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1((t0: /* evt */ PageScrollEvent) => value(t0).runNow()))
    
    inline def setOnPageScrollStateChanged(value: /* evt */ PageScrollState => Callback): Self = StObject.set(x, "onPageScrollStateChanged", js.Any.fromFunction1((t0: /* evt */ PageScrollState) => value(t0).runNow()))
    
    inline def setOnPageScrollStateChangedUndefined: Self = StObject.set(x, "onPageScrollStateChanged", js.undefined)
    
    inline def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
    
    inline def setOnPageSelected(value: /* evt */ PageSelectedEvent => Callback): Self = StObject.set(x, "onPageSelected", js.Any.fromFunction1((t0: /* evt */ PageSelectedEvent) => value(t0).runNow()))
    
    inline def setOnPageSelectedUndefined: Self = StObject.set(x, "onPageSelected", js.undefined)
    
    inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    inline def setStyle(value: ViewStyleProp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: ViewStyle*): Self = StObject.set(x, "style", js.Array(value*))
  }
}
