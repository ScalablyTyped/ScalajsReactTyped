package typingsJapgolly.devtoolsProtocol.mod.Protocol.HeapProfiler

import typingsJapgolly.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeapStatsUpdateEvent extends StObject {
  
  /**
    * An array of triplets. Each triplet describes a fragment. The first integer is the fragment
    * index, the second integer is a total count of objects for the fragment, the third integer is
    * a total size of the objects for the fragment.
    */
  var statsUpdate: js.Array[integer]
}
object HeapStatsUpdateEvent {
  
  inline def apply(statsUpdate: js.Array[integer]): HeapStatsUpdateEvent = {
    val __obj = js.Dynamic.literal(statsUpdate = statsUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapStatsUpdateEvent]
  }
  
  extension [Self <: HeapStatsUpdateEvent](x: Self) {
    
    inline def setStatsUpdate(value: js.Array[integer]): Self = StObject.set(x, "statsUpdate", value.asInstanceOf[js.Any])
    
    inline def setStatsUpdateVarargs(value: integer*): Self = StObject.set(x, "statsUpdate", js.Array(value*))
  }
}
