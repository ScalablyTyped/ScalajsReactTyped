package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.activated
import typingsJapgolly.ionicAngular.ionicAngularStrings.edge
import typingsJapgolly.ionicAngular.ionicAngularStrings.horizontal
import typingsJapgolly.ionicAngular.ionicAngularStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activated extends StObject {
  
  var activated: typingsJapgolly.ionicAngular.ionicAngularStrings.activated
  
  var edge: typingsJapgolly.ionicAngular.ionicAngularStrings.edge
  
  var horizontal: typingsJapgolly.ionicAngular.ionicAngularStrings.horizontal
  
  var vertical: typingsJapgolly.ionicAngular.ionicAngularStrings.vertical
}
object Activated {
  
  inline def apply(): Activated = {
    val __obj = js.Dynamic.literal(activated = "activated", edge = "edge", horizontal = "horizontal", vertical = "vertical")
    __obj.asInstanceOf[Activated]
  }
  
  extension [Self <: Activated](x: Self) {
    
    inline def setActivated(value: activated): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
    
    inline def setEdge(value: edge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setHorizontal(value: horizontal): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: vertical): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
