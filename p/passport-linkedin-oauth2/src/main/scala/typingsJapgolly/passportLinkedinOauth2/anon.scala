package typingsJapgolly.passportLinkedinOauth2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FamilyName extends StObject {
    
    var familyName: String
    
    var givenName: String
  }
  object FamilyName {
    
    inline def apply(familyName: String, givenName: String): FamilyName = {
      val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FamilyName]
    }
    
    extension [Self <: FamilyName](x: Self) {
      
      inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
      
      inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    inline def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
