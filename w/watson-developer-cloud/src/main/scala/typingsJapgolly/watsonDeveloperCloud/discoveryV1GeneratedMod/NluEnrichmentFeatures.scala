package typingsJapgolly.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NluEnrichmentFeatures. */
trait NluEnrichmentFeatures extends StObject {
  
  /** An object that indicates the Categories enrichment will be applied to the specified field. */
  var categories: js.UndefOr[NluEnrichmentCategories] = js.undefined
  
  /** An object specifiying the concepts enrichment and related parameters. */
  var concepts: js.UndefOr[NluEnrichmentConcepts] = js.undefined
  
  /** An object specifying the emotion detection enrichment and related parameters. */
  var emotion: js.UndefOr[NluEnrichmentEmotion] = js.undefined
  
  /** An object speficying the Entities enrichment and related parameters. */
  var entities: js.UndefOr[NluEnrichmentEntities] = js.undefined
  
  /** An object specifying the Keyword enrichment and related parameters. */
  var keywords: js.UndefOr[NluEnrichmentKeywords] = js.undefined
  
  /** An object specifying the relations enrichment and related parameters. */
  var relations: js.UndefOr[NluEnrichmentRelations] = js.undefined
  
  /** An object specifiying the semantic roles enrichment and related parameters. */
  var semantic_roles: js.UndefOr[NluEnrichmentSemanticRoles] = js.undefined
  
  /** An object specifying the sentiment extraction enrichment and related parameters. */
  var sentiment: js.UndefOr[NluEnrichmentSentiment] = js.undefined
}
object NluEnrichmentFeatures {
  
  inline def apply(): NluEnrichmentFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentFeatures]
  }
  
  extension [Self <: NluEnrichmentFeatures](x: Self) {
    
    inline def setCategories(value: NluEnrichmentCategories): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setConcepts(value: NluEnrichmentConcepts): Self = StObject.set(x, "concepts", value.asInstanceOf[js.Any])
    
    inline def setConceptsUndefined: Self = StObject.set(x, "concepts", js.undefined)
    
    inline def setEmotion(value: NluEnrichmentEmotion): Self = StObject.set(x, "emotion", value.asInstanceOf[js.Any])
    
    inline def setEmotionUndefined: Self = StObject.set(x, "emotion", js.undefined)
    
    inline def setEntities(value: NluEnrichmentEntities): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setKeywords(value: NluEnrichmentKeywords): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setRelations(value: NluEnrichmentRelations): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    inline def setSemantic_roles(value: NluEnrichmentSemanticRoles): Self = StObject.set(x, "semantic_roles", value.asInstanceOf[js.Any])
    
    inline def setSemantic_rolesUndefined: Self = StObject.set(x, "semantic_roles", js.undefined)
    
    inline def setSentiment(value: NluEnrichmentSentiment): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    inline def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
  }
}
