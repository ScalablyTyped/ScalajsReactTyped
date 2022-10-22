package typingsJapgolly.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSignalCatalogResponse extends StObject {
  
  /**
    *  The ARN of the created signal catalog. 
    */
  var arn: typingsJapgolly.awsSdk.clientsIotfleetwiseMod.arn
  
  /**
    *  The name of the created signal catalog. 
    */
  var name: resourceName
}
object CreateSignalCatalogResponse {
  
  inline def apply(arn: arn, name: resourceName): CreateSignalCatalogResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSignalCatalogResponse]
  }
  
  extension [Self <: CreateSignalCatalogResponse](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
