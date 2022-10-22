package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.forceOverscroll
import typingsJapgolly.ionicAngular.ionicAngularStrings.fullscreen
import typingsJapgolly.ionicAngular.ionicAngularStrings.scrollEvents
import typingsJapgolly.ionicAngular.ionicAngularStrings.scrollX
import typingsJapgolly.ionicAngular.ionicAngularStrings.scrollY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceOverscroll extends StObject {
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var forceOverscroll: typingsJapgolly.ionicAngular.ionicAngularStrings.forceOverscroll
  
  var fullscreen: typingsJapgolly.ionicAngular.ionicAngularStrings.fullscreen
  
  var scrollEvents: typingsJapgolly.ionicAngular.ionicAngularStrings.scrollEvents
  
  var scrollX: typingsJapgolly.ionicAngular.ionicAngularStrings.scrollX
  
  var scrollY: typingsJapgolly.ionicAngular.ionicAngularStrings.scrollY
}
object ForceOverscroll {
  
  inline def apply(): ForceOverscroll = {
    val __obj = js.Dynamic.literal(color = "color", forceOverscroll = "forceOverscroll", fullscreen = "fullscreen", scrollEvents = "scrollEvents", scrollX = "scrollX", scrollY = "scrollY")
    __obj.asInstanceOf[ForceOverscroll]
  }
  
  extension [Self <: ForceOverscroll](x: Self) {
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setForceOverscroll(value: forceOverscroll): Self = StObject.set(x, "forceOverscroll", value.asInstanceOf[js.Any])
    
    inline def setFullscreen(value: fullscreen): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setScrollEvents(value: scrollEvents): Self = StObject.set(x, "scrollEvents", value.asInstanceOf[js.Any])
    
    inline def setScrollX(value: scrollX): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    
    inline def setScrollY(value: scrollY): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
  }
}
