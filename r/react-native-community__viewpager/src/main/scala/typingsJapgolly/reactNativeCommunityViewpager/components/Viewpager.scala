package typingsJapgolly.reactNativeCommunityViewpager.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCommunityViewpager.libTypescriptSrcTypesMod.Orientation
import typingsJapgolly.reactNativeCommunityViewpager.libTypescriptSrcTypesMod.OverScrollMode
import typingsJapgolly.reactNativeCommunityViewpager.libTypescriptSrcTypesMod.PageScrollStateChangedNativeEvent
import typingsJapgolly.reactNativeCommunityViewpager.libTypescriptSrcTypesMod.TransitionStyle
import typingsJapgolly.reactNativeCommunityViewpager.libTypescriptSrcTypesMod.ViewPagerOnPageScrollEvent
import typingsJapgolly.reactNativeCommunityViewpager.libTypescriptSrcTypesMod.ViewPagerOnPageSelectedEvent
import typingsJapgolly.reactNativeCommunityViewpager.libTypescriptSrcTypesMod.ViewPagerProps
import typingsJapgolly.reactNativeCommunityViewpager.mod.default
import typingsJapgolly.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.`on-drag`
import typingsJapgolly.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Viewpager {
  
  @JSImport("@react-native-community/viewpager", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def initialPage(value: Double): this.type = set("initialPage", value.asInstanceOf[js.Any])
    
    inline def keyboardDismissMode(value: none | `on-drag`): this.type = set("keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def offscreenPageLimit(value: Double): this.type = set("offscreenPageLimit", value.asInstanceOf[js.Any])
    
    inline def onMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onPageScroll(value: /* event */ ViewPagerOnPageScrollEvent => Callback): this.type = set("onPageScroll", js.Any.fromFunction1((t0: /* event */ ViewPagerOnPageScrollEvent) => value(t0).runNow()))
    
    inline def onPageScrollStateChanged(value: /* event */ PageScrollStateChangedNativeEvent => Callback): this.type = set("onPageScrollStateChanged", js.Any.fromFunction1((t0: /* event */ PageScrollStateChangedNativeEvent) => value(t0).runNow()))
    
    inline def onPageSelected(value: /* event */ ViewPagerOnPageSelectedEvent => Callback): this.type = set("onPageSelected", js.Any.fromFunction1((t0: /* event */ ViewPagerOnPageSelectedEvent) => value(t0).runNow()))
    
    inline def orientation(value: Orientation): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def overScrollMode(value: OverScrollMode): this.type = set("overScrollMode", value.asInstanceOf[js.Any])
    
    inline def overdrag(value: Boolean): this.type = set("overdrag", value.asInstanceOf[js.Any])
    
    inline def pageMargin(value: Double): this.type = set("pageMargin", value.asInstanceOf[js.Any])
    
    inline def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def showPageIndicator(value: Boolean): this.type = set("showPageIndicator", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def transitionStyle(value: TransitionStyle): this.type = set("transitionStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Viewpager.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ViewPagerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
