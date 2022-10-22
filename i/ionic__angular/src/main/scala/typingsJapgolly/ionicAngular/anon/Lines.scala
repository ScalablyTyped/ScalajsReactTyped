package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.lines
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lines extends StObject {
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var lines: typingsJapgolly.ionicAngular.ionicAngularStrings.lines
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
}
object Lines {
  
  inline def apply(): Lines = {
    val __obj = js.Dynamic.literal(color = "color", lines = "lines", mode = "mode")
    __obj.asInstanceOf[Lines]
  }
  
  extension [Self <: Lines](x: Self) {
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setLines(value: lines): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
