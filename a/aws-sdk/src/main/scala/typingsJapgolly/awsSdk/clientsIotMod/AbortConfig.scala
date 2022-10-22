package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortConfig extends StObject {
  
  /**
    * The list of criteria that determine when and how to abort the job.
    */
  var criteriaList: AbortCriteriaList
}
object AbortConfig {
  
  inline def apply(criteriaList: AbortCriteriaList): AbortConfig = {
    val __obj = js.Dynamic.literal(criteriaList = criteriaList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortConfig]
  }
  
  extension [Self <: AbortConfig](x: Self) {
    
    inline def setCriteriaList(value: AbortCriteriaList): Self = StObject.set(x, "criteriaList", value.asInstanceOf[js.Any])
    
    inline def setCriteriaListVarargs(value: AbortCriteria*): Self = StObject.set(x, "criteriaList", js.Array(value*))
  }
}
