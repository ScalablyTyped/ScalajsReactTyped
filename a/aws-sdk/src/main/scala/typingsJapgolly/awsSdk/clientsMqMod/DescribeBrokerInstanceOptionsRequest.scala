package typingsJapgolly.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBrokerInstanceOptionsRequest extends StObject {
  
  /**
    * Filter response by engine type.
    */
  var EngineType: js.UndefOr[string] = js.undefined
  
  /**
    * Filter response by host instance type.
    */
  var HostInstanceType: js.UndefOr[string] = js.undefined
  
  /**
    * The maximum number of brokers that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsMqMod.MaxResults] = js.undefined
  
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * Filter response by storage type.
    */
  var StorageType: js.UndefOr[string] = js.undefined
}
object DescribeBrokerInstanceOptionsRequest {
  
  inline def apply(): DescribeBrokerInstanceOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBrokerInstanceOptionsRequest]
  }
  
  extension [Self <: DescribeBrokerInstanceOptionsRequest](x: Self) {
    
    inline def setEngineType(value: string): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    inline def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
    
    inline def setHostInstanceType(value: string): Self = StObject.set(x, "HostInstanceType", value.asInstanceOf[js.Any])
    
    inline def setHostInstanceTypeUndefined: Self = StObject.set(x, "HostInstanceType", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStorageType(value: string): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
  }
}
