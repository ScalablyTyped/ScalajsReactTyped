package typingsJapgolly.onfleetNodeOnfleet

import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.worker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  type MatchMetadata[T] = js.Function1[/* obj */ T, js.Promise[js.Array[MatchMetadataResult]]]
  
  trait MatchMetadataResult extends StObject {
    
    var id: String
    
    var metadata: js.Array[OnfleetMetadata]
  }
  object MatchMetadataResult {
    
    inline def apply(id: String, metadata: js.Array[OnfleetMetadata]): MatchMetadataResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchMetadataResult]
    }
    
    extension [Self <: MatchMetadataResult](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean
    - typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number
    - typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string
    - typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object`
  */
  trait MetadataSubType extends StObject
  object MetadataSubType {
    
    inline def boolean: typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean = "boolean".asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean]
    
    inline def number: typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number = "number".asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number]
    
    inline def `object`: typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object` = "object".asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object`]
    
    inline def string: typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string = "string".asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean
    - typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number
    - typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string
    - typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object`
    - typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.array
  */
  trait MetadataType extends StObject
  object MetadataType {
    
    inline def array: typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.array = "array".asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.array]
    
    inline def boolean: typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean = "boolean".asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.boolean]
    
    inline def number: typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number = "number".asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.number]
    
    inline def `object`: typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object` = "object".asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`object`]
    
    inline def string: typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string = "string".asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.string]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.api
    - typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.dashboard
    - typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.worker_
  */
  trait MetadataVisibility extends StObject
  object MetadataVisibility {
    
    inline def api: typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.api = "api".asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.api]
    
    inline def dashboard: typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.dashboard = "dashboard".asInstanceOf[typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.dashboard]
    
    inline def worker: worker_ = "worker".asInstanceOf[worker_]
  }
  
  trait OnfleetMetadata extends StObject {
    
    var name: String
    
    var subtype: js.UndefOr[MetadataSubType] = js.undefined
    
    var `type`: MetadataType
    
    var value: Any
    
    var visibility: js.UndefOr[js.Array[MetadataVisibility]] = js.undefined
  }
  object OnfleetMetadata {
    
    inline def apply(name: String, `type`: MetadataType, value: Any): OnfleetMetadata = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetMetadata]
    }
    
    extension [Self <: OnfleetMetadata](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSubtype(value: MetadataSubType): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
      
      inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
      
      inline def setType(value: MetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVisibility(value: js.Array[MetadataVisibility]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setVisibilityVarargs(value: MetadataVisibility*): Self = StObject.set(x, "visibility", js.Array(value*))
    }
  }
}
