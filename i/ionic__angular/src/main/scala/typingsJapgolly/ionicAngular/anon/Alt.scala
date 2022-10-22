package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.alt
import typingsJapgolly.ionicAngular.ionicAngularStrings.src
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alt extends StObject {
  
  var alt: typingsJapgolly.ionicAngular.ionicAngularStrings.alt
  
  var src: typingsJapgolly.ionicAngular.ionicAngularStrings.src
}
object Alt {
  
  inline def apply(): Alt = {
    val __obj = js.Dynamic.literal(alt = "alt", src = "src")
    __obj.asInstanceOf[Alt]
  }
  
  extension [Self <: Alt](x: Self) {
    
    inline def setAlt(value: alt): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: src): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
