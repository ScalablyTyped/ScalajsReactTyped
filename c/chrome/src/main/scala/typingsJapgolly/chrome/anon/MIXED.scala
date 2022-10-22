package typingsJapgolly.chrome.anon

import typingsJapgolly.chrome.chromeStrings.mixed
import typingsJapgolly.chrome.chromeStrings.normal
import typingsJapgolly.chrome.chromeStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MIXED extends StObject {
  
  var MIXED: mixed
  
  var NORMAL: normal
  
  var OFF: off
}
object MIXED {
  
  inline def apply(): MIXED = {
    val __obj = js.Dynamic.literal(MIXED = "mixed", NORMAL = "normal", OFF = "off")
    __obj.asInstanceOf[MIXED]
  }
  
  extension [Self <: MIXED](x: Self) {
    
    inline def setMIXED(value: mixed): Self = StObject.set(x, "MIXED", value.asInstanceOf[js.Any])
    
    inline def setNORMAL(value: normal): Self = StObject.set(x, "NORMAL", value.asInstanceOf[js.Any])
    
    inline def setOFF(value: off): Self = StObject.set(x, "OFF", value.asInstanceOf[js.Any])
  }
}
