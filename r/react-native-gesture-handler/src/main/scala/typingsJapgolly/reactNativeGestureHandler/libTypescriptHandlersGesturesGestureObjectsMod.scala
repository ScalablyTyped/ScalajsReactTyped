package typingsJapgolly.reactNativeGestureHandler

import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesFlingGestureMod.FlingGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesForceTouchGestureMod.ForceTouchGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureCompositionMod.ComposedGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureCompositionMod.ExclusiveGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureCompositionMod.SimultaneousGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.Gesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesLongPressGestureMod.LongPressGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesManualGestureMod.ManualGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesNativeGestureMod.NativeGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesPanGestureMod.PanGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesPinchGestureMod.PinchGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesRotationGestureMod.RotationGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesTapGestureMod.TapGesture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesGestureObjectsMod {
  
  object GestureObjects {
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gestureObjects", "GestureObjects")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Builds a composed gesture where only one of the provided gestures can become active.
      * Priority is decided through the order of gestures: the first one has higher priority
      * than the second one, second one has higher priority than the third one, and so on.
      * For example, to make a gesture that recognizes both single and double tap you need
      * to call Exclusive(doubleTap, singleTap).
      */
    inline def Exclusive(gestures: Gesture*): ExclusiveGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Exclusive")(gestures.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ExclusiveGesture]
    
    inline def Fling(): FlingGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Fling")().asInstanceOf[FlingGesture]
    
    inline def ForceTouch(): ForceTouchGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("ForceTouch")().asInstanceOf[ForceTouchGesture]
    
    inline def LongPress(): LongPressGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("LongPress")().asInstanceOf[LongPressGesture]
    
    inline def Manual(): ManualGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Manual")().asInstanceOf[ManualGesture]
    
    inline def Native(): NativeGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Native")().asInstanceOf[NativeGesture]
    
    inline def Pan(): PanGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Pan")().asInstanceOf[PanGesture]
    
    inline def Pinch(): PinchGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Pinch")().asInstanceOf[PinchGesture]
    
    /**
      * Builds a composed gesture consisting of gestures provided as parameters.
      * The first one that becomes active cancels the rest of gestures.
      */
    inline def Race(gestures: Gesture*): ComposedGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Race")(gestures.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ComposedGesture]
    
    inline def Rotation(): RotationGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Rotation")().asInstanceOf[RotationGesture]
    
    /**
      * Builds a composed gesture that allows all base gestures to run simultaneously.
      */
    inline def Simultaneous(gestures: Gesture*): SimultaneousGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Simultaneous")(gestures.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SimultaneousGesture]
    
    inline def Tap(): TapGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("Tap")().asInstanceOf[TapGesture]
  }
}
