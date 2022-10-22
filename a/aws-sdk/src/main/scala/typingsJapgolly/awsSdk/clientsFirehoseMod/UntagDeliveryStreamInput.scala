package typingsJapgolly.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagDeliveryStreamInput extends StObject {
  
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typingsJapgolly.awsSdk.clientsFirehoseMod.DeliveryStreamName
  
  /**
    * A list of tag keys. Each corresponding tag is removed from the delivery stream.
    */
  var TagKeys: TagKeyList
}
object UntagDeliveryStreamInput {
  
  inline def apply(DeliveryStreamName: DeliveryStreamName, TagKeys: TagKeyList): UntagDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagDeliveryStreamInput]
  }
  
  extension [Self <: UntagDeliveryStreamInput](x: Self) {
    
    inline def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
