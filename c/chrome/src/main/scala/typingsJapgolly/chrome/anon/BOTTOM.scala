package typingsJapgolly.chrome.anon

import typingsJapgolly.chrome.chromeStrings.bottom
import typingsJapgolly.chrome.chromeStrings.left
import typingsJapgolly.chrome.chromeStrings.right
import typingsJapgolly.chrome.chromeStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BOTTOM extends StObject {
  
  var BOTTOM: bottom
  
  var LEFT: left
  
  var RIGHT: right
  
  var TOP: top
}
object BOTTOM {
  
  inline def apply(): BOTTOM = {
    val __obj = js.Dynamic.literal(BOTTOM = "bottom", LEFT = "left", RIGHT = "right", TOP = "top")
    __obj.asInstanceOf[BOTTOM]
  }
  
  extension [Self <: BOTTOM](x: Self) {
    
    inline def setBOTTOM(value: bottom): Self = StObject.set(x, "BOTTOM", value.asInstanceOf[js.Any])
    
    inline def setLEFT(value: left): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    inline def setRIGHT(value: right): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
    
    inline def setTOP(value: top): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
  }
}
