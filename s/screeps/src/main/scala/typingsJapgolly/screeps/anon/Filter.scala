package typingsJapgolly.screeps.anon

import typingsJapgolly.screeps.FilterObject
import typingsJapgolly.screeps.FindClosestByPathAlgorithm
import typingsJapgolly.screeps.HasRoomPosition
import typingsJapgolly.screeps.RoomPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter[T /* <: HasRoomPosition | RoomPosition */] extends StObject {
  
  var algorithm: js.UndefOr[FindClosestByPathAlgorithm] = js.undefined
  
  var filter: js.UndefOr[(js.Function1[/* object */ T, Boolean]) | FilterObject | String] = js.undefined
}
object Filter {
  
  inline def apply[T /* <: HasRoomPosition | RoomPosition */](): Filter[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter[T]]
  }
  
  extension [Self <: Filter[?], T /* <: HasRoomPosition | RoomPosition */](x: Self & Filter[T]) {
    
    inline def setAlgorithm(value: FindClosestByPathAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setFilter(value: (js.Function1[/* object */ T, Boolean]) | FilterObject | String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterFunction1(value: /* object */ T => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
