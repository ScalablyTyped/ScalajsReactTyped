package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language extends StObject {
  
  /** @description The MIME type of the CodeQL database file. */
  var content_type: String
  
  /**
    * Format: date-time
    * @description The date and time at which the CodeQL database was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
    */
  var created_at: String
  
  /** @description The ID of the CodeQL database. */
  var id: Double
  
  /** @description The language of the CodeQL database. */
  var language: String
  
  /** @description The name of the CodeQL database. */
  var name: String
  
  /** @description The size of the CodeQL database file in bytes. */
  var size: Double
  
  /**
    * Format: date-time
    * @description The date and time at which the CodeQL database was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
    */
  var updated_at: String
  
  var uploader: Avatarurl
  
  /**
    * Format: uri
    * @description The URL at which to download the CodeQL database. The `Accept` header must be set to the value of the `content_type` property.
    */
  var url: String
}
object Language {
  
  inline def apply(
    content_type: String,
    created_at: String,
    id: Double,
    language: String,
    name: String,
    size: Double,
    updated_at: String,
    uploader: Avatarurl,
    url: String
  ): Language = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], uploader = uploader.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  
  extension [Self <: Language](x: Self) {
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUploader(value: Avatarurl): Self = StObject.set(x, "uploader", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
