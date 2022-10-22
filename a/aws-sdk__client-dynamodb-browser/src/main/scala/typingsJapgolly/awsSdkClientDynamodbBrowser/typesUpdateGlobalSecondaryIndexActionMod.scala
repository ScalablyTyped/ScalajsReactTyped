package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.UnmarshalledProvisionedThroughput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateGlobalSecondaryIndexActionMod {
  
  trait UnmarshalledUpdateGlobalSecondaryIndexAction
    extends StObject
       with UpdateGlobalSecondaryIndexAction {
    
    /**
      * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    @JSName("ProvisionedThroughput")
    var ProvisionedThroughput_UnmarshalledUpdateGlobalSecondaryIndexAction: UnmarshalledProvisionedThroughput
  }
  object UnmarshalledUpdateGlobalSecondaryIndexAction {
    
    inline def apply(IndexName: String, ProvisionedThroughput: UnmarshalledProvisionedThroughput): UnmarshalledUpdateGlobalSecondaryIndexAction = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledUpdateGlobalSecondaryIndexAction]
    }
    
    extension [Self <: UnmarshalledUpdateGlobalSecondaryIndexAction](x: Self) {
      
      inline def setProvisionedThroughput(value: UnmarshalledProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateGlobalSecondaryIndexAction extends StObject {
    
    /**
      * <p>The name of the global secondary index to be updated.</p>
      */
    var IndexName: String
    
    /**
      * <p>Represents the provisioned throughput settings for the specified global secondary index.</p> <p>For current minimum and maximum provisioned throughput values, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
      */
    var ProvisionedThroughput: typingsJapgolly.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
  }
  object UpdateGlobalSecondaryIndexAction {
    
    inline def apply(IndexName: String, ProvisionedThroughput: ProvisionedThroughput): UpdateGlobalSecondaryIndexAction = {
      val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateGlobalSecondaryIndexAction]
    }
    
    extension [Self <: UpdateGlobalSecondaryIndexAction](x: Self) {
      
      inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
      
      inline def setProvisionedThroughput(value: ProvisionedThroughput): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    }
  }
}
