package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssociationRequest extends StObject {
  
  /**
    * The association ID for which you want information.
    */
  var AssociationId: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.AssociationId] = js.undefined
  
  /**
    * Specify the association version to retrieve. To view the latest version, either specify $LATEST for this parameter, or omit this parameter. To view a list of all associations for a managed node, use ListAssociations. To get a list of versions for a specific association, use ListAssociationVersions. 
    */
  var AssociationVersion: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.AssociationVersion] = js.undefined
  
  /**
    * The managed node ID.
    */
  var InstanceId: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.InstanceId] = js.undefined
  
  /**
    * The name of the SSM document.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
}
object DescribeAssociationRequest {
  
  inline def apply(): DescribeAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAssociationRequest]
  }
  
  extension [Self <: DescribeAssociationRequest](x: Self) {
    
    inline def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setAssociationVersion(value: AssociationVersion): Self = StObject.set(x, "AssociationVersion", value.asInstanceOf[js.Any])
    
    inline def setAssociationVersionUndefined: Self = StObject.set(x, "AssociationVersion", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
