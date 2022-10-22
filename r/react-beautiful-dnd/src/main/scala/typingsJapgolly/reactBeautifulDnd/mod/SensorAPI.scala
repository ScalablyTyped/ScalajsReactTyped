package typingsJapgolly.reactBeautifulDnd.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensorAPI extends StObject {
  
  def canGetLock(id: DraggableId): Boolean
  
  def findClosestDraggableId(event: Event): DraggableId | Null
  
  def findOptionsForDraggable(id: DraggableId): DraggableOptions | Null
  
  def isLockClaimed(): Boolean
  
  var tryGetLock: TryGetLock
  
  def tryReleaseLock(): Unit
}
object SensorAPI {
  
  inline def apply(
    canGetLock: DraggableId => Boolean,
    findClosestDraggableId: Event => DraggableId | Null,
    findOptionsForDraggable: DraggableId => DraggableOptions | Null,
    isLockClaimed: CallbackTo[Boolean],
    tryGetLock: (/* draggableId */ DraggableId, /* forceStop */ js.UndefOr[js.Function0[Unit]], /* options */ js.UndefOr[TryGetLockOptions]) => PreDragActions | Null,
    tryReleaseLock: Callback
  ): SensorAPI = {
    val __obj = js.Dynamic.literal(canGetLock = js.Any.fromFunction1(canGetLock), findClosestDraggableId = js.Any.fromFunction1(findClosestDraggableId), findOptionsForDraggable = js.Any.fromFunction1(findOptionsForDraggable), isLockClaimed = isLockClaimed.toJsFn, tryGetLock = js.Any.fromFunction3(tryGetLock), tryReleaseLock = tryReleaseLock.toJsFn)
    __obj.asInstanceOf[SensorAPI]
  }
  
  extension [Self <: SensorAPI](x: Self) {
    
    inline def setCanGetLock(value: DraggableId => Boolean): Self = StObject.set(x, "canGetLock", js.Any.fromFunction1(value))
    
    inline def setFindClosestDraggableId(value: Event => DraggableId | Null): Self = StObject.set(x, "findClosestDraggableId", js.Any.fromFunction1(value))
    
    inline def setFindOptionsForDraggable(value: DraggableId => DraggableOptions | Null): Self = StObject.set(x, "findOptionsForDraggable", js.Any.fromFunction1(value))
    
    inline def setIsLockClaimed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLockClaimed", value.toJsFn)
    
    inline def setTryGetLock(
      value: (/* draggableId */ DraggableId, /* forceStop */ js.UndefOr[js.Function0[Unit]], /* options */ js.UndefOr[TryGetLockOptions]) => PreDragActions | Null
    ): Self = StObject.set(x, "tryGetLock", js.Any.fromFunction3(value))
    
    inline def setTryReleaseLock(value: Callback): Self = StObject.set(x, "tryReleaseLock", value.toJsFn)
  }
}
