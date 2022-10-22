package typingsJapgolly.webgpuTypes

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUDebugCommandsMixin extends StObject {
  
  /**
    * Marks a point in a stream of commands with a label.
    * @param markerLabel - The label to insert.
    */
  def insertDebugMarker(markerLabel: String): Unit
  
  /**
    * Ends the labeled debug group most recently started by {@link GPUDebugCommandsMixin#pushDebugGroup}.
    */
  def popDebugGroup(): Unit
  
  /**
    * Begins a labeled debug group containing subsequent commands.
    * @param groupLabel - The label for the command group.
    */
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
