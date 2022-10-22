package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTopicRuleDestinationResponse extends StObject {
  
  /**
    * The topic rule destination.
    */
  var topicRuleDestination: js.UndefOr[TopicRuleDestination] = js.undefined
}
object GetTopicRuleDestinationResponse {
  
  inline def apply(): GetTopicRuleDestinationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTopicRuleDestinationResponse]
  }
  
  extension [Self <: GetTopicRuleDestinationResponse](x: Self) {
    
    inline def setTopicRuleDestination(value: TopicRuleDestination): Self = StObject.set(x, "topicRuleDestination", value.asInstanceOf[js.Any])
    
    inline def setTopicRuleDestinationUndefined: Self = StObject.set(x, "topicRuleDestination", js.undefined)
  }
}
