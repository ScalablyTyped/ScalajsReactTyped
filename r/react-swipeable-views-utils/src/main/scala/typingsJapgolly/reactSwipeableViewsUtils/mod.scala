package typingsJapgolly.reactSwipeableViewsUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUiTypes.mod.PropInjector
import typingsJapgolly.reactSwipeableViews.mod.OnChangeIndexCallback
import typingsJapgolly.reactSwipeableViews.mod.OnSwitchingCallback
import typingsJapgolly.reactSwipeableViews.mod.OnSwitchingCallbackTypeDescriptor
import typingsJapgolly.reactSwipeableViews.mod.OnTransitionEndCallback
import typingsJapgolly.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.`x-reverse`
import typingsJapgolly.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.`y-reverse`
import typingsJapgolly.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.decremental
import typingsJapgolly.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.incremental
import typingsJapgolly.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.x
import typingsJapgolly.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-swipeable-views-utils", "autoPlay")
  @js.native
  val autoPlay: PropInjector[WithAutoPlay, WithAutoPlayProps] = js.native
  
  @JSImport("react-swipeable-views-utils", "bindKeyboard")
  @js.native
  val bindKeyboard: PropInjector[WithBindKeyboard, WithBindKeyboardProps] = js.native
  
  @JSImport("react-swipeable-views-utils", "virtualize")
  @js.native
  val virtualize: PropInjector[WithVirtualize, WithVirtualizeProps] = js.native
  
  trait SlideRenderProps extends StObject {
    
    var index: Double
    
    var key: Double
  }
  object SlideRenderProps {
    
    inline def apply(index: Double, key: Double): SlideRenderProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideRenderProps]
    }
    
    extension [Self <: SlideRenderProps](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type SlideRendererCallback = js.Function1[/* render */ SlideRenderProps, Node]
  
  trait WithAutoPlay
    extends StObject
       with WithIndex {
    
    var onSwitching: js.UndefOr[OnSwitchingCallback] = js.undefined
  }
  object WithAutoPlay {
    
    inline def apply(): WithAutoPlay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithAutoPlay]
    }
    
    extension [Self <: WithAutoPlay](x: Self) {
      
      inline def setOnSwitching(value: (/* index */ Double, /* type */ OnSwitchingCallbackTypeDescriptor) => Callback): Self = StObject.set(x, "onSwitching", js.Any.fromFunction2((t0: /* index */ Double, t1: /* type */ OnSwitchingCallbackTypeDescriptor) => (value(t0, t1)).runNow()))
      
      inline def setOnSwitchingUndefined: Self = StObject.set(x, "onSwitching", js.undefined)
    }
  }
  
  trait WithAutoPlayProps
    extends StObject
       with WithIndex {
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var direction: js.UndefOr[incremental | decremental] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var slideCount: js.UndefOr[Double] = js.undefined
  }
  object WithAutoPlayProps {
    
    inline def apply(): WithAutoPlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithAutoPlayProps]
    }
    
    extension [Self <: WithAutoPlayProps](x: Self) {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setDirection(value: incremental | decremental): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      inline def setSlideCountUndefined: Self = StObject.set(x, "slideCount", js.undefined)
    }
  }
  
  type WithBindKeyboard = WithIndex
  
  trait WithBindKeyboardProps
    extends StObject
       with WithIndex {
    
    var axis: js.UndefOr[x | `x-reverse` | y | `y-reverse`] = js.undefined
    
    var slidecount: js.UndefOr[Double] = js.undefined
  }
  object WithBindKeyboardProps {
    
    inline def apply(): WithBindKeyboardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithBindKeyboardProps]
    }
    
    extension [Self <: WithBindKeyboardProps](x: Self) {
      
      inline def setAxis(
        value: typingsJapgolly.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.x | `x-reverse` | y | `y-reverse`
      ): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setSlidecount(value: Double): Self = StObject.set(x, "slidecount", value.asInstanceOf[js.Any])
      
      inline def setSlidecountUndefined: Self = StObject.set(x, "slidecount", js.undefined)
    }
  }
  
  trait WithIndex extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var onChangeIndex: js.UndefOr[OnChangeIndexCallback] = js.undefined
  }
  object WithIndex {
    
    inline def apply(): WithIndex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithIndex]
    }
    
    extension [Self <: WithIndex](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Callback): Self = StObject.set(x, "onChangeIndex", js.Any.fromFunction2((t0: /* index */ Double, t1: /* indexLatest */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeIndexUndefined: Self = StObject.set(x, "onChangeIndex", js.undefined)
    }
  }
  
  trait WithVirtualize
    extends StObject
       with WithIndex {
    
    def slideRenderer(render: SlideRendererCallback): Node
  }
  object WithVirtualize {
    
    inline def apply(slideRenderer: SlideRendererCallback => Node): WithVirtualize = {
      val __obj = js.Dynamic.literal(slideRenderer = js.Any.fromFunction1(slideRenderer))
      __obj.asInstanceOf[WithVirtualize]
    }
    
    extension [Self <: WithVirtualize](x: Self) {
      
      inline def setSlideRenderer(value: SlideRendererCallback => Node): Self = StObject.set(x, "slideRenderer", js.Any.fromFunction1(value))
    }
  }
  
  trait WithVirtualizeProps
    extends StObject
       with WithIndex {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var onTransitionEnd: js.UndefOr[OnTransitionEndCallback] = js.undefined
    
    var overscanSlideAfter: js.UndefOr[Double] = js.undefined
    
    var overscanSlideBefore: js.UndefOr[Double] = js.undefined
    
    var slideCount: js.UndefOr[Double] = js.undefined
    
    var slideRenderer: SlideRendererCallback
  }
  object WithVirtualizeProps {
    
    inline def apply(slideRenderer: /* render */ SlideRenderProps => Node): WithVirtualizeProps = {
      val __obj = js.Dynamic.literal(slideRenderer = js.Any.fromFunction1(slideRenderer))
      __obj.asInstanceOf[WithVirtualizeProps]
    }
    
    extension [Self <: WithVirtualizeProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnTransitionEnd(value: Callback): Self = StObject.set(x, "onTransitionEnd", value.toJsFn)
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOverscanSlideAfter(value: Double): Self = StObject.set(x, "overscanSlideAfter", value.asInstanceOf[js.Any])
      
      inline def setOverscanSlideAfterUndefined: Self = StObject.set(x, "overscanSlideAfter", js.undefined)
      
      inline def setOverscanSlideBefore(value: Double): Self = StObject.set(x, "overscanSlideBefore", value.asInstanceOf[js.Any])
      
      inline def setOverscanSlideBeforeUndefined: Self = StObject.set(x, "overscanSlideBefore", js.undefined)
      
      inline def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      inline def setSlideCountUndefined: Self = StObject.set(x, "slideCount", js.undefined)
      
      inline def setSlideRenderer(value: /* render */ SlideRenderProps => Node): Self = StObject.set(x, "slideRenderer", js.Any.fromFunction1(value))
    }
  }
}
