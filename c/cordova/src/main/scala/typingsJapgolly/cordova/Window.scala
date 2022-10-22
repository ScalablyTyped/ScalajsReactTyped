package typingsJapgolly.cordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var cordova: Cordova
}
object Window {
  
  inline def apply(cordova: Cordova): Window = {
    val __obj = js.Dynamic.literal(cordova = cordova.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setCordova(value: Cordova): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
  }
}
