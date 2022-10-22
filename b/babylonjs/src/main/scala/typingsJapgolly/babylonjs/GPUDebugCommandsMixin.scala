package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUDebugCommandsMixin extends StObject {
  
  def insertDebugMarker(markerLabel: String): Unit
  
  def popDebugGroup(): Unit
  
  def pushDebugGroup(groupLabel: String): Unit
}
object GPUDebugCommandsMixin {
  
  inline def apply(insertDebugMarker: String => Callback, popDebugGroup: Callback, pushDebugGroup: String => Callback): GPUDebugCommandsMixin = {
    val __obj = js.Dynamic.literal(insertDebugMarker = js.Any.fromFunction1((t0: String) => insertDebugMarker(t0).runNow()), popDebugGroup = popDebugGroup.toJsFn, pushDebugGroup = js.Any.fromFunction1((t0: String) => pushDebugGroup(t0).runNow()))
    __obj.asInstanceOf[GPUDebugCommandsMixin]
  }
  
  extension [Self <: GPUDebugCommandsMixin](x: Self) {
    
    inline def setInsertDebugMarker(value: String => Callback): Self = StObject.set(x, "insertDebugMarker", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setPopDebugGroup(value: Callback): Self = StObject.set(x, "popDebugGroup", value.toJsFn)
    
    inline def setPushDebugGroup(value: String => Callback): Self = StObject.set(x, "pushDebugGroup", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
