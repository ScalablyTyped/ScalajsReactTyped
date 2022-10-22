package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOpsMetadataRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an OpsMetadata Object to delete.
    */
  var OpsMetadataArn: typingsJapgolly.awsSdk.clientsSsmMod.OpsMetadataArn
}
object DeleteOpsMetadataRequest {
  
  inline def apply(OpsMetadataArn: OpsMetadataArn): DeleteOpsMetadataRequest = {
    val __obj = js.Dynamic.literal(OpsMetadataArn = OpsMetadataArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOpsMetadataRequest]
  }
  
  extension [Self <: DeleteOpsMetadataRequest](x: Self) {
    
    inline def setOpsMetadataArn(value: OpsMetadataArn): Self = StObject.set(x, "OpsMetadataArn", value.asInstanceOf[js.Any])
  }
}
