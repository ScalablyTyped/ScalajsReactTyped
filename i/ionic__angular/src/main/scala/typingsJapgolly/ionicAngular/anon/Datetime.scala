package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.datetime
import typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datetime extends StObject {
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var datetime: typingsJapgolly.ionicAngular.ionicAngularStrings.datetime
  
  var disabled: typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
}
object Datetime {
  
  inline def apply(): Datetime = {
    val __obj = js.Dynamic.literal(color = "color", datetime = "datetime", disabled = "disabled", mode = "mode")
    __obj.asInstanceOf[Datetime]
  }
  
  extension [Self <: Datetime](x: Self) {
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDatetime(value: datetime): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: disabled): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
