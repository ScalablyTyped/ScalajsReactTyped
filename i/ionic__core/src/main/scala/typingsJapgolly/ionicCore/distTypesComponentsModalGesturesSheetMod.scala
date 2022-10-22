package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.anon.Gesture
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonBackdropElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonModalElement
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsModalGesturesSheetMod {
  
  @JSImport("@ionic/core/dist/types/components/modal/gestures/sheet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSheetGesture(
    baseEl: HTMLIonModalElement,
    backdropEl: HTMLIonBackdropElement,
    wrapperEl: HTMLElement,
    initialBreakpoint: Double,
    backdropBreakpoint: Double,
    animation: Animation,
    breakpoints: js.Array[Double],
    getCurrentBreakpoint: js.Function0[Double],
    onDismiss: js.Function0[Unit],
    onBreakpointChange: js.Function1[/* breakpoint */ Double, Unit]
  ): Gesture = (^.asInstanceOf[js.Dynamic].applyDynamic("createSheetGesture")(baseEl.asInstanceOf[js.Any], backdropEl.asInstanceOf[js.Any], wrapperEl.asInstanceOf[js.Any], initialBreakpoint.asInstanceOf[js.Any], backdropBreakpoint.asInstanceOf[js.Any], animation.asInstanceOf[js.Any], breakpoints.asInstanceOf[js.Any], getCurrentBreakpoint.asInstanceOf[js.Any], onDismiss.asInstanceOf[js.Any], onBreakpointChange.asInstanceOf[js.Any])).asInstanceOf[Gesture]
  inline def createSheetGesture(
    baseEl: HTMLIonModalElement,
    backdropEl: HTMLIonBackdropElement,
    wrapperEl: HTMLElement,
    initialBreakpoint: Double,
    backdropBreakpoint: Double,
    animation: Animation,
    breakpoints: Unit,
    getCurrentBreakpoint: js.Function0[Double],
    onDismiss: js.Function0[Unit],
    onBreakpointChange: js.Function1[/* breakpoint */ Double, Unit]
  ): Gesture = (^.asInstanceOf[js.Dynamic].applyDynamic("createSheetGesture")(baseEl.asInstanceOf[js.Any], backdropEl.asInstanceOf[js.Any], wrapperEl.asInstanceOf[js.Any], initialBreakpoint.asInstanceOf[js.Any], backdropBreakpoint.asInstanceOf[js.Any], animation.asInstanceOf[js.Any], breakpoints.asInstanceOf[js.Any], getCurrentBreakpoint.asInstanceOf[js.Any], onDismiss.asInstanceOf[js.Any], onBreakpointChange.asInstanceOf[js.Any])).asInstanceOf[Gesture]
  
  trait MoveSheetToBreakpointOptions extends StObject {
    
    /**
      * The breakpoint value to move the sheet to.
      */
    var breakpoint: Double
    
    /**
      * The offset value between the current breakpoint and the new breakpoint.
      *
      * For breakpoint changes as a result of a touch gesture, this value
      * will be calculated internally.
      *
      * For breakpoint changes as a result of dynamically setting the value,
      * this value should be the difference between the new and old breakpoint.
      * For example:
      * - breakpoints: [0, 0.25, 0.5, 0.75, 1]
      * - Current breakpoint value is 1.
      * - Setting the breakpoint to 0.25.
      * - The offset value should be 0.75 (1 - 0.25).
      */
    var breakpointOffset: Double
    
    /**
      * `true` if the sheet can be transitioned and dismissed off the view.
      */
    var canDismiss: js.UndefOr[Boolean] = js.undefined
  }
  object MoveSheetToBreakpointOptions {
    
    inline def apply(breakpoint: Double, breakpointOffset: Double): MoveSheetToBreakpointOptions = {
      val __obj = js.Dynamic.literal(breakpoint = breakpoint.asInstanceOf[js.Any], breakpointOffset = breakpointOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveSheetToBreakpointOptions]
    }
    
    extension [Self <: MoveSheetToBreakpointOptions](x: Self) {
      
      inline def setBreakpoint(value: Double): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      inline def setBreakpointOffset(value: Double): Self = StObject.set(x, "breakpointOffset", value.asInstanceOf[js.Any])
      
      inline def setCanDismiss(value: Boolean): Self = StObject.set(x, "canDismiss", value.asInstanceOf[js.Any])
      
      inline def setCanDismissUndefined: Self = StObject.set(x, "canDismiss", js.undefined)
    }
  }
}
