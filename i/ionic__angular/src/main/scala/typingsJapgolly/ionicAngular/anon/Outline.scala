package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import typingsJapgolly.ionicAngular.ionicAngularStrings.outline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outline extends StObject {
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var disabled: typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var outline: typingsJapgolly.ionicAngular.ionicAngularStrings.outline
}
object Outline {
  
  inline def apply(): Outline = {
    val __obj = js.Dynamic.literal(color = "color", disabled = "disabled", mode = "mode", outline = "outline")
    __obj.asInstanceOf[Outline]
  }
  
  extension [Self <: Outline](x: Self) {
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: disabled): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOutline(value: outline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
  }
}
