package typingsJapgolly.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDeliveryStreamEncryptionInput extends StObject {
  
  /**
    * Used to specify the type and Amazon Resource Name (ARN) of the KMS key needed for Server-Side Encryption (SSE).
    */
  var DeliveryStreamEncryptionConfigurationInput: js.UndefOr[
    typingsJapgolly.awsSdk.clientsFirehoseMod.DeliveryStreamEncryptionConfigurationInput
  ] = js.undefined
  
  /**
    * The name of the delivery stream for which you want to enable server-side encryption (SSE).
    */
  var DeliveryStreamName: typingsJapgolly.awsSdk.clientsFirehoseMod.DeliveryStreamName
}
object StartDeliveryStreamEncryptionInput {
  
  inline def apply(DeliveryStreamName: DeliveryStreamName): StartDeliveryStreamEncryptionInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeliveryStreamEncryptionInput]
  }
  
  extension [Self <: StartDeliveryStreamEncryptionInput](x: Self) {
    
    inline def setDeliveryStreamEncryptionConfigurationInput(value: DeliveryStreamEncryptionConfigurationInput): Self = StObject.set(x, "DeliveryStreamEncryptionConfigurationInput", value.asInstanceOf[js.Any])
    
    inline def setDeliveryStreamEncryptionConfigurationInputUndefined: Self = StObject.set(x, "DeliveryStreamEncryptionConfigurationInput", js.undefined)
    
    inline def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
  }
}
