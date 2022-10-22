package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.inset
import typingsJapgolly.ionicAngular.ionicAngularStrings.lines
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inset extends StObject {
  
  var inset: typingsJapgolly.ionicAngular.ionicAngularStrings.inset
  
  var lines: typingsJapgolly.ionicAngular.ionicAngularStrings.lines
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
}
object Inset {
  
  inline def apply(): Inset = {
    val __obj = js.Dynamic.literal(inset = "inset", lines = "lines", mode = "mode")
    __obj.asInstanceOf[Inset]
  }
  
  extension [Self <: Inset](x: Self) {
    
    inline def setInset(value: inset): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setLines(value: lines): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
