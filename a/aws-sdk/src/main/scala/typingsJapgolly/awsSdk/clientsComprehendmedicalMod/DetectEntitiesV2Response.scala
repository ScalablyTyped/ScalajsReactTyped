package typingsJapgolly.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectEntitiesV2Response extends StObject {
  
  /**
    * The collection of medical entities extracted from the input text and their associated information. For each entity, the response provides the entity text, the entity category, where the entity text begins and ends, and the level of confidence in the detection and analysis. Attributes and traits of the entity are also returned.
    */
  var Entities: EntityList
  
  /**
    * The version of the model used to analyze the documents. The version number looks like X.X.X. You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: String
  
  /**
    * If the result to the DetectEntitiesV2 operation was truncated, include the PaginationToken to fetch the next page of entities.
    */
  var PaginationToken: js.UndefOr[String] = js.undefined
  
  /**
    * Attributes extracted from the input text that couldn't be related to an entity.
    */
  var UnmappedAttributes: js.UndefOr[UnmappedAttributeList] = js.undefined
}
object DetectEntitiesV2Response {
  
  inline def apply(Entities: EntityList, ModelVersion: String): DetectEntitiesV2Response = {
    val __obj = js.Dynamic.literal(Entities = Entities.asInstanceOf[js.Any], ModelVersion = ModelVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectEntitiesV2Response]
  }
  
  extension [Self <: DetectEntitiesV2Response](x: Self) {
    
    inline def setEntities(value: EntityList): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "Entities", js.Array(value*))
    
    inline def setModelVersion(value: String): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setPaginationToken(value: String): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    inline def setUnmappedAttributes(value: UnmappedAttributeList): Self = StObject.set(x, "UnmappedAttributes", value.asInstanceOf[js.Any])
    
    inline def setUnmappedAttributesUndefined: Self = StObject.set(x, "UnmappedAttributes", js.undefined)
    
    inline def setUnmappedAttributesVarargs(value: UnmappedAttribute*): Self = StObject.set(x, "UnmappedAttributes", js.Array(value*))
  }
}
