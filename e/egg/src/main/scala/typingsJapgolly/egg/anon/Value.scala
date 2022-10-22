package typingsJapgolly.egg.anon

import typingsJapgolly.egg.eggStrings.DENY
import typingsJapgolly.egg.eggStrings.SAMEORIGIN
import typingsJapgolly.egg.eggStrings.`ALLOW-FROM`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var enable: Boolean
  
  var value: SAMEORIGIN | DENY | `ALLOW-FROM`
}
object Value {
  
  inline def apply(enable: Boolean, value: SAMEORIGIN | DENY | `ALLOW-FROM`): Value = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setValue(value: SAMEORIGIN | DENY | `ALLOW-FROM`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
