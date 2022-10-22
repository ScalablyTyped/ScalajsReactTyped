package typingsJapgolly.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCollectionRequest extends StObject {
  
  /**
    * text describing the collection
    * @type {string}
    * @memberof CreateCollectionRequest
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * configuration for event data
    * @type {EventTimeInfo}
    * @memberof CreateCollectionRequest
    */
  var event_time_info: js.UndefOr[EventTimeInfo] = js.undefined
  
  /**
    * list of mappings
    * @type {Array<FieldMappingV2>}
    * @memberof CreateCollectionRequest
    */
  var field_mappings: js.UndefOr[js.Array[FieldMappingV2]] = js.undefined
  
  /**
    * unique identifer for collection, can contain alphanumeric or dash characters
    * @type {string}
    * @memberof CreateCollectionRequest
    */
  var name: String
  
  /**
    * number of seconds after which data is purged, based on event time
    * @type {number}
    * @memberof CreateCollectionRequest
    */
  var retention_secs: js.UndefOr[Double] = js.undefined
  
  /**
    * list of sources from which to ingest data
    * @type {Array<Source>}
    * @memberof CreateCollectionRequest
    */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
}
object CreateCollectionRequest {
  
  inline def apply(name: String): CreateCollectionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollectionRequest]
  }
  
  extension [Self <: CreateCollectionRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEvent_time_info(value: EventTimeInfo): Self = StObject.set(x, "event_time_info", value.asInstanceOf[js.Any])
    
    inline def setEvent_time_infoUndefined: Self = StObject.set(x, "event_time_info", js.undefined)
    
    inline def setField_mappings(value: js.Array[FieldMappingV2]): Self = StObject.set(x, "field_mappings", value.asInstanceOf[js.Any])
    
    inline def setField_mappingsUndefined: Self = StObject.set(x, "field_mappings", js.undefined)
    
    inline def setField_mappingsVarargs(value: FieldMappingV2*): Self = StObject.set(x, "field_mappings", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRetention_secs(value: Double): Self = StObject.set(x, "retention_secs", value.asInstanceOf[js.Any])
    
    inline def setRetention_secsUndefined: Self = StObject.set(x, "retention_secs", js.undefined)
    
    inline def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
