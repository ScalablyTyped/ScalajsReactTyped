package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import typingsJapgolly.ionicAngular.ionicAngularStrings.sticky
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sticky extends StObject {
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var sticky: typingsJapgolly.ionicAngular.ionicAngularStrings.sticky
}
object Sticky {
  
  inline def apply(): Sticky = {
    val __obj = js.Dynamic.literal(color = "color", mode = "mode", sticky = "sticky")
    __obj.asInstanceOf[Sticky]
  }
  
  extension [Self <: Sticky](x: Self) {
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setSticky(value: sticky): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
  }
}
