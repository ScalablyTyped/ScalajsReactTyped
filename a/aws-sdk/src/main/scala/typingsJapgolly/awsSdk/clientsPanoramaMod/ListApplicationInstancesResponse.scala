package typingsJapgolly.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationInstancesResponse extends StObject {
  
  /**
    * A list of application instances.
    */
  var ApplicationInstances: js.UndefOr[typingsJapgolly.awsSdk.clientsPanoramaMod.ApplicationInstances] = js.undefined
  
  /**
    * A pagination token that's included if more results are available.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsPanoramaMod.NextToken] = js.undefined
}
object ListApplicationInstancesResponse {
  
  inline def apply(): ListApplicationInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationInstancesResponse]
  }
  
  extension [Self <: ListApplicationInstancesResponse](x: Self) {
    
    inline def setApplicationInstances(value: ApplicationInstances): Self = StObject.set(x, "ApplicationInstances", value.asInstanceOf[js.Any])
    
    inline def setApplicationInstancesUndefined: Self = StObject.set(x, "ApplicationInstances", js.undefined)
    
    inline def setApplicationInstancesVarargs(value: ApplicationInstance*): Self = StObject.set(x, "ApplicationInstances", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
