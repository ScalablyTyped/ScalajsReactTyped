package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.fixed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fixed extends StObject {
  
  var fixed: typingsJapgolly.ionicAngular.ionicAngularStrings.fixed
}
object Fixed {
  
  inline def apply(): Fixed = {
    val __obj = js.Dynamic.literal(fixed = "fixed")
    __obj.asInstanceOf[Fixed]
  }
  
  extension [Self <: Fixed](x: Self) {
    
    inline def setFixed(value: fixed): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
  }
}
