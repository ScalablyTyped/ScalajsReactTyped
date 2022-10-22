package typingsJapgolly.antDesignIconsSvg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PrimaryColor extends StObject {
    
    var primaryColor: String
    
    var secondaryColor: String
  }
  object PrimaryColor {
    
    inline def apply(primaryColor: String, secondaryColor: String): PrimaryColor = {
      val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any], secondaryColor = secondaryColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrimaryColor]
    }
    
    extension [Self <: PrimaryColor](x: Self) {
      
      inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
    }
  }
}
