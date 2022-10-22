package typingsJapgolly.amazonCognitoAuthJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ContentType extends StObject {
    
    var `Content-Type`: String
  }
  object ContentType {
    
    inline def apply(`Content-Type`: String): ContentType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentType]
    }
    
    extension [Self <: ContentType](x: Self) {
      
      inline def `setContent-Type`(value: String): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    }
  }
}
