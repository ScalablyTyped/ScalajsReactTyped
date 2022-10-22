package typingsJapgolly.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object specifiying the semantic roles enrichment and related parameters. */
trait NluEnrichmentSemanticRoles extends StObject {
  
  /** When `true`, entities are extracted from the identified sentence parts. */
  var entities: js.UndefOr[Boolean] = js.undefined
  
  /** When `true`, keywords are extracted from the identified sentence parts. */
  var keywords: js.UndefOr[Boolean] = js.undefined
  
  /** The maximum number of semantic roles enrichments to extact from each instance of the specified field. */
  var limit: js.UndefOr[Double] = js.undefined
}
object NluEnrichmentSemanticRoles {
  
  inline def apply(): NluEnrichmentSemanticRoles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NluEnrichmentSemanticRoles]
  }
  
  extension [Self <: NluEnrichmentSemanticRoles](x: Self) {
    
    inline def setEntities(value: Boolean): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setKeywords(value: Boolean): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
