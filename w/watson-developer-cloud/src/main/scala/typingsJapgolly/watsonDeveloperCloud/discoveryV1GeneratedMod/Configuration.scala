package typingsJapgolly.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A custom configuration for the environment. */
trait Configuration extends StObject {
  
  /** The unique identifier of the configuration. */
  var configuration_id: js.UndefOr[String] = js.undefined
  
  /** Document conversion settings. */
  var conversions: js.UndefOr[Conversions] = js.undefined
  
  /** The creation date of the configuration in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. */
  var created: js.UndefOr[String] = js.undefined
  
  /** The description of the configuration, if available. */
  var description: js.UndefOr[String] = js.undefined
  
  /** An array of document enrichment settings for the configuration. */
  var enrichments: js.UndefOr[js.Array[Enrichment]] = js.undefined
  
  /** The name of the configuration. */
  var name: String
  
  /** Defines operations that can be used to transform the final output JSON into a normalized form. Operations are executed in the order that they appear in the array. */
  var normalizations: js.UndefOr[js.Array[NormalizationOperation]] = js.undefined
  
  /** Object containing source parameters for the configuration. */
  var source: js.UndefOr[Source] = js.undefined
  
  /** The timestamp of when the configuration was last updated in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. */
  var updated: js.UndefOr[String] = js.undefined
}
object Configuration {
  
  inline def apply(name: String): Configuration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setConfiguration_id(value: String): Self = StObject.set(x, "configuration_id", value.asInstanceOf[js.Any])
    
    inline def setConfiguration_idUndefined: Self = StObject.set(x, "configuration_id", js.undefined)
    
    inline def setConversions(value: Conversions): Self = StObject.set(x, "conversions", value.asInstanceOf[js.Any])
    
    inline def setConversionsUndefined: Self = StObject.set(x, "conversions", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnrichments(value: js.Array[Enrichment]): Self = StObject.set(x, "enrichments", value.asInstanceOf[js.Any])
    
    inline def setEnrichmentsUndefined: Self = StObject.set(x, "enrichments", js.undefined)
    
    inline def setEnrichmentsVarargs(value: Enrichment*): Self = StObject.set(x, "enrichments", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNormalizations(value: js.Array[NormalizationOperation]): Self = StObject.set(x, "normalizations", value.asInstanceOf[js.Any])
    
    inline def setNormalizationsUndefined: Self = StObject.set(x, "normalizations", js.undefined)
    
    inline def setNormalizationsVarargs(value: NormalizationOperation*): Self = StObject.set(x, "normalizations", js.Array(value*))
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
