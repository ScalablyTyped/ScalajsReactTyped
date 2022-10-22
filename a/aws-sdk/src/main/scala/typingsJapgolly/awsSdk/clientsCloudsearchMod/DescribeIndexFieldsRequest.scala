package typingsJapgolly.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIndexFieldsRequest extends StObject {
  
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typingsJapgolly.awsSdk.clientsCloudsearchMod.DomainName
  
  /**
    * A list of the index fields you want to describe. If not specified, information is returned for all configured index fields.
    */
  var FieldNames: js.UndefOr[DynamicFieldNameList] = js.undefined
}
object DescribeIndexFieldsRequest {
  
  inline def apply(DomainName: DomainName): DescribeIndexFieldsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIndexFieldsRequest]
  }
  
  extension [Self <: DescribeIndexFieldsRequest](x: Self) {
    
    inline def setDeployed(value: Boolean): Self = StObject.set(x, "Deployed", value.asInstanceOf[js.Any])
    
    inline def setDeployedUndefined: Self = StObject.set(x, "Deployed", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setFieldNames(value: DynamicFieldNameList): Self = StObject.set(x, "FieldNames", value.asInstanceOf[js.Any])
    
    inline def setFieldNamesUndefined: Self = StObject.set(x, "FieldNames", js.undefined)
    
    inline def setFieldNamesVarargs(value: DynamicFieldName*): Self = StObject.set(x, "FieldNames", js.Array(value*))
  }
}
