package typingsJapgolly.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchWriteOperation extends StObject {
  
  /**
    * A batch operation that adds a facet to an object.
    */
  var AddFacetToObject: js.UndefOr[BatchAddFacetToObject] = js.undefined
  
  /**
    * Attaches an object to a Directory.
    */
  var AttachObject: js.UndefOr[BatchAttachObject] = js.undefined
  
  /**
    * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
    */
  var AttachPolicy: js.UndefOr[BatchAttachPolicy] = js.undefined
  
  /**
    * Attaches the specified object to the specified index.
    */
  var AttachToIndex: js.UndefOr[BatchAttachToIndex] = js.undefined
  
  /**
    * Attaches a typed link to a specified source and target object. For more information, see Typed Links.
    */
  var AttachTypedLink: js.UndefOr[BatchAttachTypedLink] = js.undefined
  
  /**
    * Creates an index object. See Indexing and search for more information.
    */
  var CreateIndex: js.UndefOr[BatchCreateIndex] = js.undefined
  
  /**
    * Creates an object.
    */
  var CreateObject: js.UndefOr[BatchCreateObject] = js.undefined
  
  /**
    * Deletes an object in a Directory.
    */
  var DeleteObject: js.UndefOr[BatchDeleteObject] = js.undefined
  
  /**
    * Detaches the specified object from the specified index.
    */
  var DetachFromIndex: js.UndefOr[BatchDetachFromIndex] = js.undefined
  
  /**
    * Detaches an object from a Directory.
    */
  var DetachObject: js.UndefOr[BatchDetachObject] = js.undefined
  
  /**
    * Detaches a policy from a Directory.
    */
  var DetachPolicy: js.UndefOr[BatchDetachPolicy] = js.undefined
  
  /**
    * Detaches a typed link from a specified source and target object. For more information, see Typed Links.
    */
  var DetachTypedLink: js.UndefOr[BatchDetachTypedLink] = js.undefined
  
  /**
    * A batch operation that removes a facet from an object.
    */
  var RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObject] = js.undefined
  
  /**
    * Updates a given object's attributes.
    */
  var UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributes] = js.undefined
  
  /**
    * Updates a given object's attributes.
    */
  var UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributes] = js.undefined
}
object BatchWriteOperation {
  
  inline def apply(): BatchWriteOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteOperation]
  }
  
  extension [Self <: BatchWriteOperation](x: Self) {
    
    inline def setAddFacetToObject(value: BatchAddFacetToObject): Self = StObject.set(x, "AddFacetToObject", value.asInstanceOf[js.Any])
    
    inline def setAddFacetToObjectUndefined: Self = StObject.set(x, "AddFacetToObject", js.undefined)
    
    inline def setAttachObject(value: BatchAttachObject): Self = StObject.set(x, "AttachObject", value.asInstanceOf[js.Any])
    
    inline def setAttachObjectUndefined: Self = StObject.set(x, "AttachObject", js.undefined)
    
    inline def setAttachPolicy(value: BatchAttachPolicy): Self = StObject.set(x, "AttachPolicy", value.asInstanceOf[js.Any])
    
    inline def setAttachPolicyUndefined: Self = StObject.set(x, "AttachPolicy", js.undefined)
    
    inline def setAttachToIndex(value: BatchAttachToIndex): Self = StObject.set(x, "AttachToIndex", value.asInstanceOf[js.Any])
    
    inline def setAttachToIndexUndefined: Self = StObject.set(x, "AttachToIndex", js.undefined)
    
    inline def setAttachTypedLink(value: BatchAttachTypedLink): Self = StObject.set(x, "AttachTypedLink", value.asInstanceOf[js.Any])
    
    inline def setAttachTypedLinkUndefined: Self = StObject.set(x, "AttachTypedLink", js.undefined)
    
    inline def setCreateIndex(value: BatchCreateIndex): Self = StObject.set(x, "CreateIndex", value.asInstanceOf[js.Any])
    
    inline def setCreateIndexUndefined: Self = StObject.set(x, "CreateIndex", js.undefined)
    
    inline def setCreateObject(value: BatchCreateObject): Self = StObject.set(x, "CreateObject", value.asInstanceOf[js.Any])
    
    inline def setCreateObjectUndefined: Self = StObject.set(x, "CreateObject", js.undefined)
    
    inline def setDeleteObject(value: BatchDeleteObject): Self = StObject.set(x, "DeleteObject", value.asInstanceOf[js.Any])
    
    inline def setDeleteObjectUndefined: Self = StObject.set(x, "DeleteObject", js.undefined)
    
    inline def setDetachFromIndex(value: BatchDetachFromIndex): Self = StObject.set(x, "DetachFromIndex", value.asInstanceOf[js.Any])
    
    inline def setDetachFromIndexUndefined: Self = StObject.set(x, "DetachFromIndex", js.undefined)
    
    inline def setDetachObject(value: BatchDetachObject): Self = StObject.set(x, "DetachObject", value.asInstanceOf[js.Any])
    
    inline def setDetachObjectUndefined: Self = StObject.set(x, "DetachObject", js.undefined)
    
    inline def setDetachPolicy(value: BatchDetachPolicy): Self = StObject.set(x, "DetachPolicy", value.asInstanceOf[js.Any])
    
    inline def setDetachPolicyUndefined: Self = StObject.set(x, "DetachPolicy", js.undefined)
    
    inline def setDetachTypedLink(value: BatchDetachTypedLink): Self = StObject.set(x, "DetachTypedLink", value.asInstanceOf[js.Any])
    
    inline def setDetachTypedLinkUndefined: Self = StObject.set(x, "DetachTypedLink", js.undefined)
    
    inline def setRemoveFacetFromObject(value: BatchRemoveFacetFromObject): Self = StObject.set(x, "RemoveFacetFromObject", value.asInstanceOf[js.Any])
    
    inline def setRemoveFacetFromObjectUndefined: Self = StObject.set(x, "RemoveFacetFromObject", js.undefined)
    
    inline def setUpdateLinkAttributes(value: BatchUpdateLinkAttributes): Self = StObject.set(x, "UpdateLinkAttributes", value.asInstanceOf[js.Any])
    
    inline def setUpdateLinkAttributesUndefined: Self = StObject.set(x, "UpdateLinkAttributes", js.undefined)
    
    inline def setUpdateObjectAttributes(value: BatchUpdateObjectAttributes): Self = StObject.set(x, "UpdateObjectAttributes", value.asInstanceOf[js.Any])
    
    inline def setUpdateObjectAttributesUndefined: Self = StObject.set(x, "UpdateObjectAttributes", js.undefined)
  }
}
