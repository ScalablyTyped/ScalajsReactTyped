package typingsJapgolly.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicPartitioningConfiguration extends StObject {
  
  /**
    * Specifies that the dynamic partitioning is enabled for this Kinesis Data Firehose delivery stream.
    */
  var Enabled: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver data to an Amazon S3 prefix.
    */
  var RetryOptions: js.UndefOr[typingsJapgolly.awsSdk.clientsFirehoseMod.RetryOptions] = js.undefined
}
object DynamicPartitioningConfiguration {
  
  inline def apply(): DynamicPartitioningConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicPartitioningConfiguration]
  }
  
  extension [Self <: DynamicPartitioningConfiguration](x: Self) {
    
    inline def setEnabled(value: BooleanObject): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setRetryOptions(value: RetryOptions): Self = StObject.set(x, "RetryOptions", value.asInstanceOf[js.Any])
    
    inline def setRetryOptionsUndefined: Self = StObject.set(x, "RetryOptions", js.undefined)
  }
}
