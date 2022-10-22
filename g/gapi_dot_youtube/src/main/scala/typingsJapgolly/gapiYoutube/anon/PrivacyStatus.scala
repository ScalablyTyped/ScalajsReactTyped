package typingsJapgolly.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivacyStatus extends StObject {
  
  /**
    * The playlists privacy status.
    */
  var privacyStatus: String
}
object PrivacyStatus {
  
  inline def apply(privacyStatus: String): PrivacyStatus = {
    val __obj = js.Dynamic.literal(privacyStatus = privacyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivacyStatus]
  }
  
  extension [Self <: PrivacyStatus](x: Self) {
    
    inline def setPrivacyStatus(value: String): Self = StObject.set(x, "privacyStatus", value.asInstanceOf[js.Any])
  }
}
