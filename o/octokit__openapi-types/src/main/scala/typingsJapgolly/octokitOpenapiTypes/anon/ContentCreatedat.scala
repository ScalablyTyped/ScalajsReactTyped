package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.Plussign1
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.`-1`
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.confused
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.eyes
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.heart
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.hooray
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.laugh
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.rocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentCreatedat extends StObject {
  
  /**
    * @description The reaction to use
    * @example heart
    * @enum {string}
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
  
  /**
    * Format: date-time
    * @example 2016-05-20T20:09:31Z
    */
  var created_at: String
  
  /** @example 1 */
  var id: Double
  
  /** @example MDg6UmVhY3Rpb24x */
  var node_id: String
  
  var user: Avatarurl | Null
}
object ContentCreatedat {
  
  inline def apply(
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    created_at: String,
    id: Double,
    node_id: String
  ): ContentCreatedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], user = null)
    __obj.asInstanceOf[ContentCreatedat]
  }
  
  extension [Self <: ContentCreatedat](x: Self) {
    
    inline def setContent(value: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
  }
}
