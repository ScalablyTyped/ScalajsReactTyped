package typingsJapgolly.cordovaIonic

import typingsJapgolly.cordovaIonic.Ionic.Keyboard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPlugins extends StObject {
  
  var Keyboard: typingsJapgolly.cordovaIonic.Ionic.Keyboard
}
object CordovaPlugins {
  
  inline def apply(Keyboard: Keyboard): CordovaPlugins = {
    val __obj = js.Dynamic.literal(Keyboard = Keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  extension [Self <: CordovaPlugins](x: Self) {
    
    inline def setKeyboard(value: Keyboard): Self = StObject.set(x, "Keyboard", value.asInstanceOf[js.Any])
  }
}
