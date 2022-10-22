package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  /**
    * The author of the change.
    */
  var author: IdentityRef
  
  /**
    * The type of change. "commit", "changeset", etc.
    */
  var changeType: String
  
  /**
    * The location of a user-friendly representation of the resource.
    */
  var displayUri: String
  
  /**
    * Something that identifies the change. For a commit, this would be the SHA1. For a TFVC changeset, this would be the changeset id.
    */
  var id: String
  
  /**
    * The location of the full representation of the resource.
    */
  var location: String
  
  /**
    * A description of the change. This might be a commit message or changeset description.
    */
  var message: String
  
  /**
    * The person or process that pushed the change.
    */
  var pusher: String
  
  /**
    * A timestamp for the change.
    */
  var timestamp: js.Date
}
object Change {
  
  inline def apply(
    author: IdentityRef,
    changeType: String,
    displayUri: String,
    id: String,
    location: String,
    message: String,
    pusher: String,
    timestamp: js.Date
  ): Change = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], displayUri = displayUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  extension [Self <: Change](x: Self) {
    
    inline def setAuthor(value: IdentityRef): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setDisplayUri(value: String): Self = StObject.set(x, "displayUri", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPusher(value: String): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
