package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.Dragging
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.Idle
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.Settling
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`on-drag`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewPagerAndroidProps
  extends StObject
     with ViewProps {
  
  /**
    * Index of initial page that should be selected. Use `setPage` method to
    * update the page, and `onPageSelected` to monitor page changes
    */
  var initialPage: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines whether the keyboard gets dismissed in response to a drag.
    *   - 'none' (the default), drags do not dismiss the keyboard.
    *   - 'on-drag', the keyboard is dismissed when a drag begins.
    */
  var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.undefined
  
  /**
    * Executed when transitioning between pages (ether because of animation for
    * the requested page change or when user is swiping/dragging between pages)
    * The `event.nativeEvent` object for this callback will carry following data:
    *  - position - index of first page from the left that is currently visible
    *  - offset - value from range [0,1) describing stage between page transitions.
    *    Value x means that (1 - x) fraction of the page at "position" index is
    *    visible, and x fraction of the next page is visible.
    */
  var onPageScroll: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  /**
    * Function called when the page scrolling state has changed.
    * The page scrolling state can be in 3 states:
    * - idle, meaning there is no interaction with the page scroller happening at the time
    * - dragging, meaning there is currently an interaction with the page scroller
    * - settling, meaning that there was an interaction with the page scroller, and the
    *   page scroller is now finishing it's closing or opening animation
    */
  var onPageScrollStateChanged: js.UndefOr[js.Function1[/* state */ Idle | Dragging | Settling, Unit]] = js.undefined
  
  /**
    * This callback will be called once ViewPager finish navigating to selected page
    * (when user swipes between pages). The `event.nativeEvent` object passed to this
    * callback will have following fields:
    *  - position - index of page that has been selected
    */
  var onPageSelected: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  /**
    * Blank space to show between pages. This is only visible while scrolling, pages are still
    * edge-to-edge.
    */
  var pageMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * When false, the content does not scroll.
    * The default value is true.
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
}
object ViewPagerAndroidProps {
  
  inline def apply(): ViewPagerAndroidProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewPagerAndroidProps]
  }
  
  extension [Self <: ViewPagerAndroidProps](x: Self) {
    
    inline def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
    
    inline def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
    
    inline def setKeyboardDismissMode(value: none | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
    
    inline def setOnPageScroll(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnPageScrollStateChanged(value: /* state */ Idle | Dragging | Settling => Callback): Self = StObject.set(x, "onPageScrollStateChanged", js.Any.fromFunction1((t0: /* state */ Idle | Dragging | Settling) => value(t0).runNow()))
    
    inline def setOnPageScrollStateChangedUndefined: Self = StObject.set(x, "onPageScrollStateChanged", js.undefined)
    
    inline def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
    
    inline def setOnPageSelected(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onPageSelected", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnPageSelectedUndefined: Self = StObject.set(x, "onPageSelected", js.undefined)
    
    inline def setPageMargin(value: Double): Self = StObject.set(x, "pageMargin", value.asInstanceOf[js.Any])
    
    inline def setPageMarginUndefined: Self = StObject.set(x, "pageMargin", js.undefined)
    
    inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
  }
}
