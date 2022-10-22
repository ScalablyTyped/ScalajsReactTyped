package typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisFirehoseInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the delivery stream.
    */
  var ResourceARN: typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.ResourceARN
}
object KinesisFirehoseInput {
  
  inline def apply(ResourceARN: ResourceARN): KinesisFirehoseInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseInput]
  }
  
  extension [Self <: KinesisFirehoseInput](x: Self) {
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
