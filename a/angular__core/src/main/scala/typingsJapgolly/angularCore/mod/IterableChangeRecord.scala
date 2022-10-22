package typingsJapgolly.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IterableChangeRecord[V] extends StObject {
  
  /** Current index of the item in `Iterable` or null if removed. */
  val currentIndex: Double | Null
  
  /** The item. */
  val item: V
  
  /** Previous index of the item in `Iterable` or null if added. */
  val previousIndex: Double | Null
  
  /** Track by identity as computed by the `TrackByFunction`. */
  val trackById: Any
}
object IterableChangeRecord {
  
  inline def apply[V](item: V, trackById: Any): IterableChangeRecord[V] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], trackById = trackById.asInstanceOf[js.Any], currentIndex = null, previousIndex = null)
    __obj.asInstanceOf[IterableChangeRecord[V]]
  }
  
  extension [Self <: IterableChangeRecord[?], V](x: Self & IterableChangeRecord[V]) {
    
    inline def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
    
    inline def setCurrentIndexNull: Self = StObject.set(x, "currentIndex", null)
    
    inline def setItem(value: V): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setPreviousIndex(value: Double): Self = StObject.set(x, "previousIndex", value.asInstanceOf[js.Any])
    
    inline def setPreviousIndexNull: Self = StObject.set(x, "previousIndex", null)
    
    inline def setTrackById(value: Any): Self = StObject.set(x, "trackById", value.asInstanceOf[js.Any])
  }
}
