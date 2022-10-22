package typingsJapgolly.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBehalfOfContentOwnerRating extends StObject {
  
  /**
    * The id parameter specifies the YouTube video ID.
    */
  var id: String
  
  /**
    * The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the rating to record.
    */
  var rating: String
}
object OnBehalfOfContentOwnerRating {
  
  inline def apply(id: String, rating: String): OnBehalfOfContentOwnerRating = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBehalfOfContentOwnerRating]
  }
  
  extension [Self <: OnBehalfOfContentOwnerRating](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    inline def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
  }
}
