package typingsJapgolly.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotMetadata extends StObject {
  
  val fromCache: Boolean
  
  val hasPendingWrites: Boolean
  
  def isEqual(other: SnapshotMetadata): Boolean
}
object SnapshotMetadata {
  
  inline def apply(fromCache: Boolean, hasPendingWrites: Boolean, isEqual: SnapshotMetadata => Boolean): SnapshotMetadata = {
    val __obj = js.Dynamic.literal(fromCache = fromCache.asInstanceOf[js.Any], hasPendingWrites = hasPendingWrites.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[SnapshotMetadata]
  }
  
  extension [Self <: SnapshotMetadata](x: Self) {
    
    inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
    
    inline def setHasPendingWrites(value: Boolean): Self = StObject.set(x, "hasPendingWrites", value.asInstanceOf[js.Any])
    
    inline def setIsEqual(value: SnapshotMetadata => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
  }
}
