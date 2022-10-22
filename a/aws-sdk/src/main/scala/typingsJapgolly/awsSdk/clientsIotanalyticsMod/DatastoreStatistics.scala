package typingsJapgolly.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreStatistics extends StObject {
  
  /**
    * The estimated size of the data store.
    */
  var size: js.UndefOr[EstimatedResourceSize] = js.undefined
}
object DatastoreStatistics {
  
  inline def apply(): DatastoreStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreStatistics]
  }
  
  extension [Self <: DatastoreStatistics](x: Self) {
    
    inline def setSize(value: EstimatedResourceSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
