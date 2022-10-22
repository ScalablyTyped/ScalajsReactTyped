package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceAssociation extends StObject {
  
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.AssociationId] = js.undefined
  
  /**
    * Version information for the association on the managed node.
    */
  var AssociationVersion: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.AssociationVersion] = js.undefined
  
  /**
    * The content of the association document for the managed node(s).
    */
  var Content: js.UndefOr[DocumentContent] = js.undefined
  
  /**
    * The managed node ID.
    */
  var InstanceId: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.InstanceId] = js.undefined
}
object InstanceAssociation {
  
  inline def apply(): InstanceAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAssociation]
  }
  
  extension [Self <: InstanceAssociation](x: Self) {
    
    inline def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setAssociationVersion(value: AssociationVersion): Self = StObject.set(x, "AssociationVersion", value.asInstanceOf[js.Any])
    
    inline def setAssociationVersionUndefined: Self = StObject.set(x, "AssociationVersion", js.undefined)
    
    inline def setContent(value: DocumentContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
