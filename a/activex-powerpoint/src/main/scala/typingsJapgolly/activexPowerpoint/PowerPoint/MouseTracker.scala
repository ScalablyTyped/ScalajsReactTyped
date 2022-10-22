package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseTracker extends StObject {
  
  def EndTrack(X: Double, Y: Double): Unit
  
  def OnTrack(X: Double, Y: Double): Unit
  
  /* private */ @JSName("PowerPoint.MouseTracker_typekey")
  var PowerPointDotMouseTracker_typekey: MouseTracker
}
object MouseTracker {
  
  inline def apply(
    EndTrack: (Double, Double) => Callback,
    OnTrack: (Double, Double) => Callback,
    PowerPointDotMouseTracker_typekey: MouseTracker
  ): MouseTracker = {
    val __obj = js.Dynamic.literal(EndTrack = js.Any.fromFunction2((t0: Double, t1: Double) => (EndTrack(t0, t1)).runNow()), OnTrack = js.Any.fromFunction2((t0: Double, t1: Double) => (OnTrack(t0, t1)).runNow()))
    __obj.updateDynamic("PowerPoint.MouseTracker_typekey")(PowerPointDotMouseTracker_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseTracker]
  }
  
  extension [Self <: MouseTracker](x: Self) {
    
    inline def setEndTrack(value: (Double, Double) => Callback): Self = StObject.set(x, "EndTrack", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setOnTrack(value: (Double, Double) => Callback): Self = StObject.set(x, "OnTrack", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setPowerPointDotMouseTracker_typekey(value: MouseTracker): Self = StObject.set(x, "PowerPoint.MouseTracker_typekey", value.asInstanceOf[js.Any])
  }
}
