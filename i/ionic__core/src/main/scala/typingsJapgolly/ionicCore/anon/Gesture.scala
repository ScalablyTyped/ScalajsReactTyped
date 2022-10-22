package typingsJapgolly.ionicCore.anon

import typingsJapgolly.ionicCore.distTypesComponentsModalGesturesSheetMod.MoveSheetToBreakpointOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gesture extends StObject {
  
  var gesture: typingsJapgolly.ionicCore.distTypesUtilsGestureMod.Gesture
  
  def moveSheetToBreakpoint(options: MoveSheetToBreakpointOptions): js.Promise[Unit]
}
object Gesture {
  
  inline def apply(
    gesture: typingsJapgolly.ionicCore.distTypesUtilsGestureMod.Gesture,
    moveSheetToBreakpoint: MoveSheetToBreakpointOptions => js.Promise[Unit]
  ): Gesture = {
    val __obj = js.Dynamic.literal(gesture = gesture.asInstanceOf[js.Any], moveSheetToBreakpoint = js.Any.fromFunction1(moveSheetToBreakpoint))
    __obj.asInstanceOf[Gesture]
  }
  
  extension [Self <: Gesture](x: Self) {
    
    inline def setGesture(value: typingsJapgolly.ionicCore.distTypesUtilsGestureMod.Gesture): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
    
    inline def setMoveSheetToBreakpoint(value: MoveSheetToBreakpointOptions => js.Promise[Unit]): Self = StObject.set(x, "moveSheetToBreakpoint", js.Any.fromFunction1(value))
  }
}
