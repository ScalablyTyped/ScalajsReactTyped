package typingsJapgolly.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExpressionRequest extends StObject {
  
  var DomainName: typingsJapgolly.awsSdk.clientsCloudsearchMod.DomainName
  
  /**
    * The name of the Expression to delete.
    */
  var ExpressionName: StandardName
}
object DeleteExpressionRequest {
  
  inline def apply(DomainName: DomainName, ExpressionName: StandardName): DeleteExpressionRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ExpressionName = ExpressionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExpressionRequest]
  }
  
  extension [Self <: DeleteExpressionRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setExpressionName(value: StandardName): Self = StObject.set(x, "ExpressionName", value.asInstanceOf[js.Any])
  }
}
