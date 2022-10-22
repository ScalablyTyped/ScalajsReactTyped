package typingsJapgolly.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncListDescriptor extends StObject {
  
  var date_expires: String
  
  var date_updated: js.Date
  
  var last_event_id: Double
  
  var links: Any
  
  var revision: String
  
  var sid: String
  
  var unique_name: String
  
  var url: String
}
object SyncListDescriptor {
  
  inline def apply(
    date_expires: String,
    date_updated: js.Date,
    last_event_id: Double,
    links: Any,
    revision: String,
    sid: String,
    unique_name: String,
    url: String
  ): SyncListDescriptor = {
    val __obj = js.Dynamic.literal(date_expires = date_expires.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], last_event_id = last_event_id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncListDescriptor]
  }
  
  extension [Self <: SyncListDescriptor](x: Self) {
    
    inline def setDate_expires(value: String): Self = StObject.set(x, "date_expires", value.asInstanceOf[js.Any])
    
    inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
    
    inline def setLast_event_id(value: Double): Self = StObject.set(x, "last_event_id", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Any): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
