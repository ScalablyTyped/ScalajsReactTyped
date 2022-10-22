package typingsJapgolly.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatsProvided extends StObject {
  
  var areHitsSorted: Boolean
  
  var nbHits: Double
  
  var nbSortedHits: Double
  
  var processingTimeMS: Double
}
object StatsProvided {
  
  inline def apply(areHitsSorted: Boolean, nbHits: Double, nbSortedHits: Double, processingTimeMS: Double): StatsProvided = {
    val __obj = js.Dynamic.literal(areHitsSorted = areHitsSorted.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], nbSortedHits = nbSortedHits.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsProvided]
  }
  
  extension [Self <: StatsProvided](x: Self) {
    
    inline def setAreHitsSorted(value: Boolean): Self = StObject.set(x, "areHitsSorted", value.asInstanceOf[js.Any])
    
    inline def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
    
    inline def setNbSortedHits(value: Double): Self = StObject.set(x, "nbSortedHits", value.asInstanceOf[js.Any])
    
    inline def setProcessingTimeMS(value: Double): Self = StObject.set(x, "processingTimeMS", value.asInstanceOf[js.Any])
  }
}
