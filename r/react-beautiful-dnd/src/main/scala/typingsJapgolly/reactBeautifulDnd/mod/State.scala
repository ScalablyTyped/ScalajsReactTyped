package typingsJapgolly.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactBeautifulDnd.mod.IdleState
  - typingsJapgolly.reactBeautifulDnd.mod.DraggingState
  - typingsJapgolly.reactBeautifulDnd.mod.CollectingState
  - typingsJapgolly.reactBeautifulDnd.mod.DropPendingState
  - typingsJapgolly.reactBeautifulDnd.mod.DropAnimatingState
*/
trait State extends StObject
object State {
  
  inline def CollectingState(
    afterCritical: LiftEffect,
    critical: Critical,
    current: DragPositions,
    dimensions: DimensionMap,
    impact: DragImpact,
    initial: DragPositions,
    isWindowScrollAllowed: Boolean,
    movementMode: MovementMode,
    onLiftImpact: DragImpact,
    viewport: Viewport
  ): typingsJapgolly.reactBeautifulDnd.mod.CollectingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = true, isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = "COLLECTING", viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactBeautifulDnd.mod.CollectingState]
  }
  
  inline def DraggingState(
    afterCritical: LiftEffect,
    critical: Critical,
    current: DragPositions,
    dimensions: DimensionMap,
    impact: DragImpact,
    initial: DragPositions,
    isWindowScrollAllowed: Boolean,
    movementMode: MovementMode,
    onLiftImpact: DragImpact,
    viewport: Viewport
  ): typingsJapgolly.reactBeautifulDnd.mod.DraggingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = true, isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = "DRAGGING", viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactBeautifulDnd.mod.DraggingState]
  }
  
  inline def DropAnimatingState(
    completed: CompletedDrag,
    dimensions: DimensionMap,
    dropDuration: Double,
    newHomeClientOffset: Position
  ): typingsJapgolly.reactBeautifulDnd.mod.DropAnimatingState = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], dropDuration = dropDuration.asInstanceOf[js.Any], newHomeClientOffset = newHomeClientOffset.asInstanceOf[js.Any], phase = "DROP_ANIMATING")
    __obj.asInstanceOf[typingsJapgolly.reactBeautifulDnd.mod.DropAnimatingState]
  }
  
  inline def DropPendingState(
    afterCritical: LiftEffect,
    critical: Critical,
    current: DragPositions,
    dimensions: DimensionMap,
    impact: DragImpact,
    initial: DragPositions,
    isWaiting: Boolean,
    isWindowScrollAllowed: Boolean,
    movementMode: MovementMode,
    onLiftImpact: DragImpact,
    reason: DropReason,
    viewport: Viewport
  ): typingsJapgolly.reactBeautifulDnd.mod.DropPendingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = true, isWaiting = isWaiting.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = "DROP_PENDING", reason = reason.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactBeautifulDnd.mod.DropPendingState]
  }
  
  inline def IdleState(shouldFlush: Boolean): typingsJapgolly.reactBeautifulDnd.mod.IdleState = {
    val __obj = js.Dynamic.literal(phase = "IDLE", shouldFlush = shouldFlush.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactBeautifulDnd.mod.IdleState]
  }
}
