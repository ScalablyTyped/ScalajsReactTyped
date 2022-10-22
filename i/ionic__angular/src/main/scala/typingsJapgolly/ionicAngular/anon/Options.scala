package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import typingsJapgolly.ionicAngular.ionicAngularStrings.options
import typingsJapgolly.ionicAngular.ionicAngularStrings.pager
import typingsJapgolly.ionicAngular.ionicAngularStrings.scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var options: typingsJapgolly.ionicAngular.ionicAngularStrings.options
  
  var pager: typingsJapgolly.ionicAngular.ionicAngularStrings.pager
  
  var scrollbar: typingsJapgolly.ionicAngular.ionicAngularStrings.scrollbar
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal(mode = "mode", options = "options", pager = "pager", scrollbar = "scrollbar")
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPager(value: pager): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    inline def setScrollbar(value: scrollbar): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
  }
}
