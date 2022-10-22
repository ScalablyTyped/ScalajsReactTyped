package typingsJapgolly.reactBeautifulDnd.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreDragActions extends StObject {
  
  // cancel the pre drag without starting a drag. Releases the lock
  def abort(): Unit
  
  // lift the current item
  def fluidLift(clientSelection: Position): FluidDragActions
  
  // discover if the lock is still active
  def isActive(): Boolean
  
  // whether it has been indicated if force press should be respected
  def shouldRespectForcePress(): Boolean
  
  def snapLift(): SnapDragActions
}
object PreDragActions {
  
  inline def apply(
    abort: Callback,
    fluidLift: Position => FluidDragActions,
    isActive: CallbackTo[Boolean],
    shouldRespectForcePress: CallbackTo[Boolean],
    snapLift: CallbackTo[SnapDragActions]
  ): PreDragActions = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, fluidLift = js.Any.fromFunction1(fluidLift), isActive = isActive.toJsFn, shouldRespectForcePress = shouldRespectForcePress.toJsFn, snapLift = snapLift.toJsFn)
    __obj.asInstanceOf[PreDragActions]
  }
  
  extension [Self <: PreDragActions](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setFluidLift(value: Position => FluidDragActions): Self = StObject.set(x, "fluidLift", js.Any.fromFunction1(value))
    
    inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
    
    inline def setShouldRespectForcePress(value: CallbackTo[Boolean]): Self = StObject.set(x, "shouldRespectForcePress", value.toJsFn)
    
    inline def setSnapLift(value: CallbackTo[SnapDragActions]): Self = StObject.set(x, "snapLift", value.toJsFn)
  }
}
