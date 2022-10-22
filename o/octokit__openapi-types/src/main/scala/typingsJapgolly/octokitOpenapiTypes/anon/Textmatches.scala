package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Textmatches extends StObject {
  
  var default: Boolean
  
  var color: String
  
  var description: String | Null
  
  var id: Double
  
  var name: String
  
  var node_id: String
  
  var score: Double
  
  var text_matches: js.UndefOr[js.Array[Fragment]] = js.undefined
  
  /** Format: uri */
  var url: String
}
object Textmatches {
  
  inline def apply(
    color: String,
    default: Boolean,
    id: Double,
    name: String,
    node_id: String,
    score: Double,
    url: String
  ): Textmatches = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], description = null)
    __obj.asInstanceOf[Textmatches]
  }
  
  extension [Self <: Textmatches](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setText_matches(value: js.Array[Fragment]): Self = StObject.set(x, "text_matches", value.asInstanceOf[js.Any])
    
    inline def setText_matchesUndefined: Self = StObject.set(x, "text_matches", js.undefined)
    
    inline def setText_matchesVarargs(value: Fragment*): Self = StObject.set(x, "text_matches", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
