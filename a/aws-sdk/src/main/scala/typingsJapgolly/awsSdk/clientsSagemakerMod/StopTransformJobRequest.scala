package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTransformJobRequest extends StObject {
  
  /**
    * The name of the batch transform job to stop.
    */
  var TransformJobName: typingsJapgolly.awsSdk.clientsSagemakerMod.TransformJobName
}
object StopTransformJobRequest {
  
  inline def apply(TransformJobName: TransformJobName): StopTransformJobRequest = {
    val __obj = js.Dynamic.literal(TransformJobName = TransformJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTransformJobRequest]
  }
  
  extension [Self <: StopTransformJobRequest](x: Self) {
    
    inline def setTransformJobName(value: TransformJobName): Self = StObject.set(x, "TransformJobName", value.asInstanceOf[js.Any])
  }
}
