package typingsJapgolly.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChangeSetRequest extends StObject {
  
  /**
    * Required. The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typingsJapgolly.awsSdk.clientsMarketplacecatalogMod.Catalog
  
  /**
    * Required. The unique identifier for the StartChangeSet request that you want to describe the details for.
    */
  var ChangeSetId: ResourceId
}
object DescribeChangeSetRequest {
  
  inline def apply(Catalog: Catalog, ChangeSetId: ResourceId): DescribeChangeSetRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], ChangeSetId = ChangeSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChangeSetRequest]
  }
  
  extension [Self <: DescribeChangeSetRequest](x: Self) {
    
    inline def setCatalog(value: Catalog): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    inline def setChangeSetId(value: ResourceId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
  }
}
