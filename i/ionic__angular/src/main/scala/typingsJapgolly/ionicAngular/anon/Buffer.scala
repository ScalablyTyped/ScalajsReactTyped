package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.`type`
import typingsJapgolly.ionicAngular.ionicAngularStrings.buffer
import typingsJapgolly.ionicAngular.ionicAngularStrings.color
import typingsJapgolly.ionicAngular.ionicAngularStrings.mode
import typingsJapgolly.ionicAngular.ionicAngularStrings.reversed
import typingsJapgolly.ionicAngular.ionicAngularStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffer extends StObject {
  
  var buffer: typingsJapgolly.ionicAngular.ionicAngularStrings.buffer
  
  var color: typingsJapgolly.ionicAngular.ionicAngularStrings.color
  
  var mode: typingsJapgolly.ionicAngular.ionicAngularStrings.mode
  
  var reversed: typingsJapgolly.ionicAngular.ionicAngularStrings.reversed
  
  var `type`: typingsJapgolly.ionicAngular.ionicAngularStrings.`type`
  
  var value: typingsJapgolly.ionicAngular.ionicAngularStrings.value
}
object Buffer {
  
  inline def apply(): Buffer = {
    val __obj = js.Dynamic.literal(buffer = "buffer", color = "color", mode = "mode", reversed = "reversed", value = "value")
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[Buffer]
  }
  
  extension [Self <: Buffer](x: Self) {
    
    inline def setBuffer(value: buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setColor(value: color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setReversed(value: reversed): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
