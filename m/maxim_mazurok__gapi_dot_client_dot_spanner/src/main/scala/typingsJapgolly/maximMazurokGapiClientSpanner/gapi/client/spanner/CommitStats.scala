package typingsJapgolly.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitStats extends StObject {
  
  /**
    * The total number of mutations for the transaction. Knowing the `mutation_count` value can help you maximize the number of mutations in a transaction and minimize the number of API
    * round trips. You can also monitor this value to prevent transactions from exceeding the system
    * [limit](https://cloud.google.com/spanner/quotas#limits_for_creating_reading_updating_and_deleting_data). If the number of mutations exceeds the limit, the server returns
    * [INVALID_ARGUMENT](https://cloud.google.com/spanner/docs/reference/rest/v1/Code#ENUM_VALUES.INVALID_ARGUMENT).
    */
  var mutationCount: js.UndefOr[String] = js.undefined
}
object CommitStats {
  
  inline def apply(): CommitStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitStats]
  }
  
  extension [Self <: CommitStats](x: Self) {
    
    inline def setMutationCount(value: String): Self = StObject.set(x, "mutationCount", value.asInstanceOf[js.Any])
    
    inline def setMutationCountUndefined: Self = StObject.set(x, "mutationCount", js.undefined)
  }
}
