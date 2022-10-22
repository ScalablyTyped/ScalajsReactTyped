package typingsJapgolly.reactNativeCollapsible

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.bottom
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.center
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-collapsible", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CollapsibleProps, js.Object, Any]
  
  type Collapsible = japgolly.scalajs.react.facade.React.Component[CollapsibleProps & js.Object, js.Object]
  
  trait CollapsibleProps extends StObject {
    
    /**
      * Alignment of the content when transitioning, can be top, center or bottom
      *
      * @default top
      */
    var align: js.UndefOr[top | center | bottom] = js.undefined
    
    /**
      * Whether to show the child components or not
      *
      * @default true
      */
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Which height should the component collapse to
      *
      * @default 0
      */
    var collapsedHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Duration of transition in milliseconds
      *
      * @default 300
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Function or function name from Easing (or tween-functions if < RN 0.8). Collapsible will try to combine Easing functions for you if you name them like tween-functions
      *
      * @default easeOutCubic
      */
    var easing: js.UndefOr[EasingMode | Any] = js.undefined
    
    /**
      * Enable pointer events on collapsed view
      *
      * @default false
      */
    var enablePointerEvents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function called when the animation finished
      */
    var onAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Render children in collapsible even if not visible
      *
      * @default true
      */
    var renderChildrenCollapsed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional styling for the container
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object CollapsibleProps {
    
    inline def apply(): CollapsibleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapsibleProps]
    }
    
    extension [Self <: CollapsibleProps](x: Self) {
      
      inline def setAlign(value: top | center | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedHeight(value: Double): Self = StObject.set(x, "collapsedHeight", value.asInstanceOf[js.Any])
      
      inline def setCollapsedHeightUndefined: Self = StObject.set(x, "collapsedHeight", js.undefined)
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: EasingMode | Any): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setEnablePointerEvents(value: Boolean): Self = StObject.set(x, "enablePointerEvents", value.asInstanceOf[js.Any])
      
      inline def setEnablePointerEventsUndefined: Self = StObject.set(x, "enablePointerEvents", js.undefined)
      
      inline def setOnAnimationEnd(value: Callback): Self = StObject.set(x, "onAnimationEnd", value.toJsFn)
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setRenderChildrenCollapsed(value: Boolean): Self = StObject.set(x, "renderChildrenCollapsed", value.asInstanceOf[js.Any])
      
      inline def setRenderChildrenCollapsedUndefined: Self = StObject.set(x, "renderChildrenCollapsed", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.linear
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuad
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuad
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuad
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCubic
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCubic
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCubic
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuart
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuart
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuart
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuint
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuint
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuint
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInSine
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutSine
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutSine
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInExpo
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutExpo
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutExpo
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCirc
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCirc
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCirc
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInElastic
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutElastic
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutElastic
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBack
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBack
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBack
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBounce
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBounce
    - typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBounce
  */
  trait EasingMode extends StObject
  object EasingMode {
    
    inline def easeInBack: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBack = "easeInBack".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBack]
    
    inline def easeInBounce: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBounce = "easeInBounce".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInBounce]
    
    inline def easeInCirc: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCirc = "easeInCirc".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCirc]
    
    inline def easeInCubic: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCubic = "easeInCubic".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInCubic]
    
    inline def easeInElastic: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInElastic = "easeInElastic".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInElastic]
    
    inline def easeInExpo: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInExpo = "easeInExpo".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInExpo]
    
    inline def easeInOutBack: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBack = "easeInOutBack".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBack]
    
    inline def easeInOutBounce: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBounce = "easeInOutBounce".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutBounce]
    
    inline def easeInOutCirc: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCirc = "easeInOutCirc".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCirc]
    
    inline def easeInOutCubic: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCubic = "easeInOutCubic".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutCubic]
    
    inline def easeInOutElastic: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutElastic = "easeInOutElastic".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutElastic]
    
    inline def easeInOutExpo: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutExpo = "easeInOutExpo".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutExpo]
    
    inline def easeInOutQuad: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuad = "easeInOutQuad".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuad]
    
    inline def easeInOutQuart: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuart = "easeInOutQuart".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuart]
    
    inline def easeInOutQuint: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuint = "easeInOutQuint".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutQuint]
    
    inline def easeInOutSine: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutSine = "easeInOutSine".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInOutSine]
    
    inline def easeInQuad: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuad = "easeInQuad".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuad]
    
    inline def easeInQuart: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuart = "easeInQuart".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuart]
    
    inline def easeInQuint: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuint = "easeInQuint".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInQuint]
    
    inline def easeInSine: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInSine = "easeInSine".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeInSine]
    
    inline def easeOutBack: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBack = "easeOutBack".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBack]
    
    inline def easeOutBounce: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBounce = "easeOutBounce".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutBounce]
    
    inline def easeOutCirc: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCirc = "easeOutCirc".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCirc]
    
    inline def easeOutCubic: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCubic = "easeOutCubic".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutCubic]
    
    inline def easeOutElastic: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutElastic = "easeOutElastic".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutElastic]
    
    inline def easeOutExpo: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutExpo = "easeOutExpo".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutExpo]
    
    inline def easeOutQuad: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuad = "easeOutQuad".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuad]
    
    inline def easeOutQuart: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuart = "easeOutQuart".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuart]
    
    inline def easeOutQuint: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuint = "easeOutQuint".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutQuint]
    
    inline def easeOutSine: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutSine = "easeOutSine".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.easeOutSine]
    
    inline def linear: typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.linear = "linear".asInstanceOf[typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.linear]
  }
}
