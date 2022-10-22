package typingsJapgolly.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLogPatternResponse extends StObject {
  
  /**
    * The successfully created log pattern.
    */
  var LogPattern: js.UndefOr[typingsJapgolly.awsSdk.clientsApplicationinsightsMod.LogPattern] = js.undefined
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typingsJapgolly.awsSdk.clientsApplicationinsightsMod.ResourceGroupName] = js.undefined
}
object UpdateLogPatternResponse {
  
  inline def apply(): UpdateLogPatternResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLogPatternResponse]
  }
  
  extension [Self <: UpdateLogPatternResponse](x: Self) {
    
    inline def setLogPattern(value: LogPattern): Self = StObject.set(x, "LogPattern", value.asInstanceOf[js.Any])
    
    inline def setLogPatternUndefined: Self = StObject.set(x, "LogPattern", js.undefined)
    
    inline def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupNameUndefined: Self = StObject.set(x, "ResourceGroupName", js.undefined)
  }
}
