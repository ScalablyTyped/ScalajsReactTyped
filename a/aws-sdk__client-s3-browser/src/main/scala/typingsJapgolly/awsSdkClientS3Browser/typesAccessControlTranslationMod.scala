package typingsJapgolly.awsSdkClientS3Browser

import typingsJapgolly.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Destination
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAccessControlTranslationMod {
  
  trait AccessControlTranslation extends StObject {
    
    /**
      * <p>The override value for the owner of the replica object.</p>
      */
    var Owner: Destination | String
  }
  object AccessControlTranslation {
    
    inline def apply(Owner: Destination | String): AccessControlTranslation = {
      val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessControlTranslation]
    }
    
    extension [Self <: AccessControlTranslation](x: Self) {
      
      inline def setOwner(value: Destination | String): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledAccessControlTranslation = AccessControlTranslation
}
