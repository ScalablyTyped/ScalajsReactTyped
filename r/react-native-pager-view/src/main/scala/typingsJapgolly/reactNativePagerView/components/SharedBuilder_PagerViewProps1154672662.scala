package typingsJapgolly.reactNativePagerView.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePagerView.libTypescriptTypesMod.Orientation
import typingsJapgolly.reactNativePagerView.libTypescriptTypesMod.OverScrollMode
import typingsJapgolly.reactNativePagerView.libTypescriptTypesMod.PageScrollStateChangedNativeEvent
import typingsJapgolly.reactNativePagerView.libTypescriptTypesMod.PagerViewOnPageScrollEvent
import typingsJapgolly.reactNativePagerView.libTypescriptTypesMod.PagerViewOnPageSelectedEvent
import typingsJapgolly.reactNativePagerView.reactNativePagerViewStrings.`on-drag`
import typingsJapgolly.reactNativePagerView.reactNativePagerViewStrings.locale
import typingsJapgolly.reactNativePagerView.reactNativePagerViewStrings.ltr
import typingsJapgolly.reactNativePagerView.reactNativePagerViewStrings.none
import typingsJapgolly.reactNativePagerView.reactNativePagerViewStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_PagerViewProps1154672662[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def initialPage(value: Double): this.type = set("initialPage", value.asInstanceOf[js.Any])
  
  inline def keyboardDismissMode(value: none | `on-drag`): this.type = set("keyboardDismissMode", value.asInstanceOf[js.Any])
  
  inline def layoutDirection(value: rtl | ltr | locale): this.type = set("layoutDirection", value.asInstanceOf[js.Any])
  
  inline def offscreenPageLimit(value: Double): this.type = set("offscreenPageLimit", value.asInstanceOf[js.Any])
  
  inline def onMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
  
  inline def onPageScroll(value: /* event */ PagerViewOnPageScrollEvent => Callback): this.type = set("onPageScroll", js.Any.fromFunction1((t0: /* event */ PagerViewOnPageScrollEvent) => value(t0).runNow()))
  
  inline def onPageScrollStateChanged(value: /* event */ PageScrollStateChangedNativeEvent => Callback): this.type = set("onPageScrollStateChanged", js.Any.fromFunction1((t0: /* event */ PageScrollStateChangedNativeEvent) => value(t0).runNow()))
  
  inline def onPageSelected(value: /* event */ PagerViewOnPageSelectedEvent => Callback): this.type = set("onPageSelected", js.Any.fromFunction1((t0: /* event */ PagerViewOnPageSelectedEvent) => value(t0).runNow()))
  
  inline def onStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
  
  inline def orientation(value: Orientation): this.type = set("orientation", value.asInstanceOf[js.Any])
  
  inline def overScrollMode(value: OverScrollMode): this.type = set("overScrollMode", value.asInstanceOf[js.Any])
  
  inline def overdrag(value: Boolean): this.type = set("overdrag", value.asInstanceOf[js.Any])
  
  inline def pageMargin(value: Double): this.type = set("pageMargin", value.asInstanceOf[js.Any])
  
  inline def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
  
  inline def showPageIndicator(value: Boolean): this.type = set("showPageIndicator", value.asInstanceOf[js.Any])
  
  inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
}
