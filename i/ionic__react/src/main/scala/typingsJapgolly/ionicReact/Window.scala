package typingsJapgolly.ionicReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var Ionic: Any
  
  var cordova: Any
}
object Window {
  
  inline def apply(Ionic: Any, cordova: Any): Window = {
    val __obj = js.Dynamic.literal(Ionic = Ionic.asInstanceOf[js.Any], cordova = cordova.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setCordova(value: Any): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
    
    inline def setIonic(value: Any): Self = StObject.set(x, "Ionic", value.asInstanceOf[js.Any])
  }
}
