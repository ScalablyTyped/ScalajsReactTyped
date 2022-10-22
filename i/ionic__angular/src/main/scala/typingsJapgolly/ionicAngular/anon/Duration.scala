package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.duration
import typingsJapgolly.ionicAngular.ionicAngularStrings.name
import typingsJapgolly.ionicAngular.ionicAngularStrings.paused
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var duration: typingsJapgolly.ionicAngular.ionicAngularStrings.duration
  
  var name: typingsJapgolly.ionicAngular.ionicAngularStrings.name
  
  var paused: typingsJapgolly.ionicAngular.ionicAngularStrings.paused
}
object Duration {
  
  inline def apply(): Duration = {
    val __obj = js.Dynamic.literal(color = "color", duration = "duration", name = "name", paused = "paused")
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setName(value: name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPaused(value: paused): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
  }
}
