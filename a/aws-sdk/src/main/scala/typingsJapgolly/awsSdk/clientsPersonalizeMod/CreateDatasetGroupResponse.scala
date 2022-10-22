package typingsJapgolly.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetGroupResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the new dataset group.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The domain for the new Domain dataset group.
    */
  var domain: js.UndefOr[Domain] = js.undefined
}
object CreateDatasetGroupResponse {
  
  inline def apply(): CreateDatasetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetGroupResponse]
  }
  
  extension [Self <: CreateDatasetGroupResponse](x: Self) {
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetGroupArnUndefined: Self = StObject.set(x, "datasetGroupArn", js.undefined)
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
