package typingsJapgolly.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfigsResponse extends StObject {
  
  /**
    * List of Config items.
    */
  var configList: js.UndefOr[ConfigList] = js.undefined
  
  /**
    * Next token returned in the response of a previous ListConfigs call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListConfigsResponse {
  
  inline def apply(): ListConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigsResponse]
  }
  
  extension [Self <: ListConfigsResponse](x: Self) {
    
    inline def setConfigList(value: ConfigList): Self = StObject.set(x, "configList", value.asInstanceOf[js.Any])
    
    inline def setConfigListUndefined: Self = StObject.set(x, "configList", js.undefined)
    
    inline def setConfigListVarargs(value: ConfigListItem*): Self = StObject.set(x, "configList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
