package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.activated
import typingsJapgolly.ionicAngular.ionicAngularStrings.side
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Side extends StObject {
  
  var activated: typingsJapgolly.ionicAngular.ionicAngularStrings.activated
  
  var side: typingsJapgolly.ionicAngular.ionicAngularStrings.side
}
object Side {
  
  inline def apply(): Side = {
    val __obj = js.Dynamic.literal(activated = "activated", side = "side")
    __obj.asInstanceOf[Side]
  }
  
  extension [Self <: Side](x: Self) {
    
    inline def setActivated(value: activated): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
    
    inline def setSide(value: side): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
