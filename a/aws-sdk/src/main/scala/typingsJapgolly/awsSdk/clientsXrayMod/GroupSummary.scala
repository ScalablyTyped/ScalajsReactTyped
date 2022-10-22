package typingsJapgolly.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupSummary extends StObject {
  
  /**
    * The filter expression defining the parameters to include traces.
    */
  var FilterExpression: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the group generated based on the GroupName.
    */
  var GroupARN: js.UndefOr[String] = js.undefined
  
  /**
    * The unique case-sensitive name of the group.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The structure containing configurations related to insights.   The InsightsEnabled boolean can be set to true to enable insights for the group or false to disable insights for the group.   The NotificationsEnabled boolean can be set to true to enable insights notifications. Notifications can only be enabled on a group with InsightsEnabled set to true.  
    */
  var InsightsConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsXrayMod.InsightsConfiguration] = js.undefined
}
object GroupSummary {
  
  inline def apply(): GroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupSummary]
  }
  
  extension [Self <: GroupSummary](x: Self) {
    
    inline def setFilterExpression(value: String): Self = StObject.set(x, "FilterExpression", value.asInstanceOf[js.Any])
    
    inline def setFilterExpressionUndefined: Self = StObject.set(x, "FilterExpression", js.undefined)
    
    inline def setGroupARN(value: String): Self = StObject.set(x, "GroupARN", value.asInstanceOf[js.Any])
    
    inline def setGroupARNUndefined: Self = StObject.set(x, "GroupARN", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setInsightsConfiguration(value: InsightsConfiguration): Self = StObject.set(x, "InsightsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInsightsConfigurationUndefined: Self = StObject.set(x, "InsightsConfiguration", js.undefined)
  }
}
