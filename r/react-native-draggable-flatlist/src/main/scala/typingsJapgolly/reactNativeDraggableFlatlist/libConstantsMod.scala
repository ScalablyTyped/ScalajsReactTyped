package typingsJapgolly.reactNativeDraggableFlatlist

import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HitSlop
import typingsJapgolly.reactNativeReanimated.mod.Animated.Value
import typingsJapgolly.reactNativeReanimated.mod.WithSpringConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConstantsMod {
  
  @JSImport("react-native-draggable-flatlist/lib/constants", "DEFAULT_ANIMATION_CONFIG")
  @js.native
  val DEFAULT_ANIMATION_CONFIG: WithSpringConfig = js.native
  
  object DEFAULT_PROPS {
    
    @JSImport("react-native-draggable-flatlist/lib/constants", "DEFAULT_PROPS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-draggable-flatlist/lib/constants", "DEFAULT_PROPS.activationDistance")
    @js.native
    def activationDistance: Double = js.native
    inline def activationDistance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activationDistance")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-draggable-flatlist/lib/constants", "DEFAULT_PROPS.animationConfig")
    @js.native
    def animationConfig: WithSpringConfig = js.native
    inline def animationConfig_=(x: WithSpringConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-draggable-flatlist/lib/constants", "DEFAULT_PROPS.autoscrollSpeed")
    @js.native
    def autoscrollSpeed: Double = js.native
    inline def autoscrollSpeed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoscrollSpeed")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-draggable-flatlist/lib/constants", "DEFAULT_PROPS.autoscrollThreshold")
    @js.native
    def autoscrollThreshold: Double = js.native
    inline def autoscrollThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoscrollThreshold")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-draggable-flatlist/lib/constants", "DEFAULT_PROPS.dragHitSlop")
    @js.native
    def dragHitSlop: js.UndefOr[HitSlop] = js.native
    inline def dragHitSlop_=(x: js.UndefOr[HitSlop]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragHitSlop")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-draggable-flatlist/lib/constants", "DEFAULT_PROPS.dragItemOverflow")
    @js.native
    def dragItemOverflow: Boolean = js.native
    inline def dragItemOverflow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragItemOverflow")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-draggable-flatlist/lib/constants", "DEFAULT_PROPS.outerScrollOffset")
    @js.native
    def outerScrollOffset: Value = js.native
    inline def outerScrollOffset_=(x: Value): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outerScrollOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-draggable-flatlist/lib/constants", "DEFAULT_PROPS.scrollEnabled")
    @js.native
    def scrollEnabled: Boolean = js.native
    inline def scrollEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-draggable-flatlist/lib/constants", "SCROLL_POSITION_TOLERANCE")
  @js.native
  val SCROLL_POSITION_TOLERANCE: /* 2 */ Double = js.native
  
  @JSImport("react-native-draggable-flatlist/lib/constants", "isAndroid")
  @js.native
  val isAndroid: Boolean = js.native
  
  @JSImport("react-native-draggable-flatlist/lib/constants", "isIOS")
  @js.native
  val isIOS: Boolean = js.native
  
  @JSImport("react-native-draggable-flatlist/lib/constants", "isReanimatedV2")
  @js.native
  val isReanimatedV2: /* true */ Boolean = js.native
  
  @JSImport("react-native-draggable-flatlist/lib/constants", "isWeb")
  @js.native
  val isWeb: Boolean = js.native
}
