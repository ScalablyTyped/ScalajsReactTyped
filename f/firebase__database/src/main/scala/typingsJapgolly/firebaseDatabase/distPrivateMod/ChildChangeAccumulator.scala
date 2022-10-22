package typingsJapgolly.firebaseDatabase.distPrivateMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildChangeAccumulator extends StObject {
  
  /* private */ val changeMap: Any
  
  def getChanges(): js.Array[Change]
  
  def trackChildChange(change: Change): Unit
}
object ChildChangeAccumulator {
  
  inline def apply(changeMap: Any, getChanges: CallbackTo[js.Array[Change]], trackChildChange: Change => Callback): ChildChangeAccumulator = {
    val __obj = js.Dynamic.literal(changeMap = changeMap.asInstanceOf[js.Any], getChanges = getChanges.toJsFn, trackChildChange = js.Any.fromFunction1((t0: Change) => trackChildChange(t0).runNow()))
    __obj.asInstanceOf[ChildChangeAccumulator]
  }
  
  extension [Self <: ChildChangeAccumulator](x: Self) {
    
    inline def setChangeMap(value: Any): Self = StObject.set(x, "changeMap", value.asInstanceOf[js.Any])
    
    inline def setGetChanges(value: CallbackTo[js.Array[Change]]): Self = StObject.set(x, "getChanges", value.toJsFn)
    
    inline def setTrackChildChange(value: Change => Callback): Self = StObject.set(x, "trackChildChange", js.Any.fromFunction1((t0: Change) => value(t0).runNow()))
  }
}
