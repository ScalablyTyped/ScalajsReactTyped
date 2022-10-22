package typingsJapgolly.reactOnsenui.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactOnsenui.mod.Tabbar
import typingsJapgolly.reactOnsenui.mod.TabbarRenderTab
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.auto
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.bottom
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.none
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.slide
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreEdgeWidth extends StObject {
  
  var animation: js.UndefOr[none | slide] = js.undefined
  
  var animationOptions: js.UndefOr[typingsJapgolly.reactOnsenui.mod.AnimationOptions] = js.undefined
  
  var ignoreEdgeWidth: js.UndefOr[Double] = js.undefined
  
  var index: Double
  
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPreChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onReactive: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSwipe: js.UndefOr[
    js.Function2[
      /* index */ Double, 
      /* animationOptions */ typingsJapgolly.reactOnsenui.mod.AnimationOptions, 
      Unit
    ]
  ] = js.undefined
  
  var position: js.UndefOr[bottom | top | auto] = js.undefined
  
  def renderTabs(index: Double, tabbar: Tabbar): js.Array[TabbarRenderTab]
  
  var swipeable: js.UndefOr[Boolean] = js.undefined
  
  var tabBorder: js.UndefOr[Boolean] = js.undefined
}
object IgnoreEdgeWidth {
  
  inline def apply(index: Double, renderTabs: (Double, Tabbar) => js.Array[TabbarRenderTab]): IgnoreEdgeWidth = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], renderTabs = js.Any.fromFunction2(renderTabs))
    __obj.asInstanceOf[IgnoreEdgeWidth]
  }
  
  extension [Self <: IgnoreEdgeWidth](x: Self) {
    
    inline def setAnimation(value: none | slide): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptions(value: typingsJapgolly.reactOnsenui.mod.AnimationOptions): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setIgnoreEdgeWidth(value: Double): Self = StObject.set(x, "ignoreEdgeWidth", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEdgeWidthUndefined: Self = StObject.set(x, "ignoreEdgeWidth", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOnPostChange(value: Callback): Self = StObject.set(x, "onPostChange", value.toJsFn)
    
    inline def setOnPostChangeUndefined: Self = StObject.set(x, "onPostChange", js.undefined)
    
    inline def setOnPreChange(value: Callback): Self = StObject.set(x, "onPreChange", value.toJsFn)
    
    inline def setOnPreChangeUndefined: Self = StObject.set(x, "onPreChange", js.undefined)
    
    inline def setOnReactive(value: Callback): Self = StObject.set(x, "onReactive", value.toJsFn)
    
    inline def setOnReactiveUndefined: Self = StObject.set(x, "onReactive", js.undefined)
    
    inline def setOnSwipe(
      value: (/* index */ Double, /* animationOptions */ typingsJapgolly.reactOnsenui.mod.AnimationOptions) => Callback
    ): Self = StObject.set(x, "onSwipe", js.Any.fromFunction2((t0: /* index */ Double, t1: /* animationOptions */ typingsJapgolly.reactOnsenui.mod.AnimationOptions) => (value(t0, t1)).runNow()))
    
    inline def setOnSwipeUndefined: Self = StObject.set(x, "onSwipe", js.undefined)
    
    inline def setPosition(value: bottom | top | auto): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRenderTabs(value: (Double, Tabbar) => js.Array[TabbarRenderTab]): Self = StObject.set(x, "renderTabs", js.Any.fromFunction2(value))
    
    inline def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
    
    inline def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
    
    inline def setTabBorder(value: Boolean): Self = StObject.set(x, "tabBorder", value.asInstanceOf[js.Any])
    
    inline def setTabBorderUndefined: Self = StObject.set(x, "tabBorder", js.undefined)
  }
}
