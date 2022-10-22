package typingsJapgolly.reactBeautifulDnd.mod

import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndBooleans.`true`
import typingsJapgolly.reactBeautifulDnd.reactBeautifulDndStrings.DROP_PENDING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent react-beautiful-dnd.react-beautiful-dnd.Omit<react-beautiful-dnd.react-beautiful-dnd.DraggingState, 'phase'> */
trait DropPendingState
  extends StObject
     with State {
  
  var afterCritical: LiftEffect
  
  var critical: Critical
  
  var current: DragPositions
  
  var dimensions: DimensionMap
  
  var forceShouldAnimate: js.UndefOr[Boolean] = js.undefined
  
  var impact: DragImpact
  
  var initial: DragPositions
  
  var isDragging: `true`
  
  var isWaiting: Boolean
  
  var isWindowScrollAllowed: Boolean
  
  var movementMode: MovementMode
  
  var onLiftImpact: DragImpact
  
  var phase: DROP_PENDING
  
  var reason: DropReason
  
  var scrollJumpRequest: js.UndefOr[Position] = js.undefined
  
  var viewport: Viewport
}
object DropPendingState {
  
  inline def apply(
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
  ): DropPendingState = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], isDragging = true, isWaiting = isWaiting.asInstanceOf[js.Any], isWindowScrollAllowed = isWindowScrollAllowed.asInstanceOf[js.Any], movementMode = movementMode.asInstanceOf[js.Any], onLiftImpact = onLiftImpact.asInstanceOf[js.Any], phase = "DROP_PENDING", reason = reason.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropPendingState]
  }
  
  extension [Self <: DropPendingState](x: Self) {
    
    inline def setAfterCritical(value: LiftEffect): Self = StObject.set(x, "afterCritical", value.asInstanceOf[js.Any])
    
    inline def setCritical(value: Critical): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCurrent(value: DragPositions): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setDimensions(value: DimensionMap): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setForceShouldAnimate(value: Boolean): Self = StObject.set(x, "forceShouldAnimate", value.asInstanceOf[js.Any])
    
    inline def setForceShouldAnimateUndefined: Self = StObject.set(x, "forceShouldAnimate", js.undefined)
    
    inline def setImpact(value: DragImpact): Self = StObject.set(x, "impact", value.asInstanceOf[js.Any])
    
    inline def setInitial(value: DragPositions): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setIsDragging(value: `true`): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    inline def setIsWaiting(value: Boolean): Self = StObject.set(x, "isWaiting", value.asInstanceOf[js.Any])
    
    inline def setIsWindowScrollAllowed(value: Boolean): Self = StObject.set(x, "isWindowScrollAllowed", value.asInstanceOf[js.Any])
    
    inline def setMovementMode(value: MovementMode): Self = StObject.set(x, "movementMode", value.asInstanceOf[js.Any])
    
    inline def setOnLiftImpact(value: DragImpact): Self = StObject.set(x, "onLiftImpact", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: DROP_PENDING): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setReason(value: DropReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setScrollJumpRequest(value: Position): Self = StObject.set(x, "scrollJumpRequest", value.asInstanceOf[js.Any])
    
    inline def setScrollJumpRequestUndefined: Self = StObject.set(x, "scrollJumpRequest", js.undefined)
    
    inline def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
