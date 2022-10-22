package typingsJapgolly.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSubscription extends StObject {
  
  /**
    * The RDS event notification subscription Id.
    */
  var CustSubscriptionId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services customer account associated with the RDS event notification subscription.
    */
  var CustomerAwsId: js.UndefOr[String] = js.undefined
  
  /**
    * A Boolean value indicating if the subscription is enabled. True indicates the subscription is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of event categories for the RDS event notification subscription.
    */
  var EventCategoriesList: js.UndefOr[typingsJapgolly.awsSdk.clientsRdsMod.EventCategoriesList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the event subscription.
    */
  var EventSubscriptionArn: js.UndefOr[String] = js.undefined
  
  /**
    * The topic ARN of the RDS event notification subscription.
    */
  var SnsTopicArn: js.UndefOr[String] = js.undefined
  
  /**
    * A list of source IDs for the RDS event notification subscription.
    */
  var SourceIdsList: js.UndefOr[typingsJapgolly.awsSdk.clientsRdsMod.SourceIdsList] = js.undefined
  
  /**
    * The source type for the RDS event notification subscription.
    */
  var SourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the RDS event notification subscription. Constraints: Can be one of the following: creating | modifying | deleting | active | no-permission | topic-not-exist The status "no-permission" indicates that RDS no longer has permission to post to the SNS topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was created.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The time the RDS event notification subscription was created.
    */
  var SubscriptionCreationTime: js.UndefOr[String] = js.undefined
}
object EventSubscription {
  
  inline def apply(): EventSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSubscription]
  }
  
  extension [Self <: EventSubscription](x: Self) {
    
    inline def setCustSubscriptionId(value: String): Self = StObject.set(x, "CustSubscriptionId", value.asInstanceOf[js.Any])
    
    inline def setCustSubscriptionIdUndefined: Self = StObject.set(x, "CustSubscriptionId", js.undefined)
    
    inline def setCustomerAwsId(value: String): Self = StObject.set(x, "CustomerAwsId", value.asInstanceOf[js.Any])
    
    inline def setCustomerAwsIdUndefined: Self = StObject.set(x, "CustomerAwsId", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setEventCategoriesList(value: EventCategoriesList): Self = StObject.set(x, "EventCategoriesList", value.asInstanceOf[js.Any])
    
    inline def setEventCategoriesListUndefined: Self = StObject.set(x, "EventCategoriesList", js.undefined)
    
    inline def setEventCategoriesListVarargs(value: String*): Self = StObject.set(x, "EventCategoriesList", js.Array(value*))
    
    inline def setEventSubscriptionArn(value: String): Self = StObject.set(x, "EventSubscriptionArn", value.asInstanceOf[js.Any])
    
    inline def setEventSubscriptionArnUndefined: Self = StObject.set(x, "EventSubscriptionArn", js.undefined)
    
    inline def setSnsTopicArn(value: String): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
    
    inline def setSourceIdsList(value: SourceIdsList): Self = StObject.set(x, "SourceIdsList", value.asInstanceOf[js.Any])
    
    inline def setSourceIdsListUndefined: Self = StObject.set(x, "SourceIdsList", js.undefined)
    
    inline def setSourceIdsListVarargs(value: String*): Self = StObject.set(x, "SourceIdsList", js.Array(value*))
    
    inline def setSourceType(value: String): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubscriptionCreationTime(value: String): Self = StObject.set(x, "SubscriptionCreationTime", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionCreationTimeUndefined: Self = StObject.set(x, "SubscriptionCreationTime", js.undefined)
  }
}
