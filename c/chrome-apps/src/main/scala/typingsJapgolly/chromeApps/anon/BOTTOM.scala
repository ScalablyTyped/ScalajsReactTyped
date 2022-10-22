package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.bottom_
import typingsJapgolly.chromeApps.chromeAppsStrings.left_
import typingsJapgolly.chromeApps.chromeAppsStrings.right_
import typingsJapgolly.chromeApps.chromeAppsStrings.top_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BOTTOM extends StObject {
  
  var BOTTOM: bottom_
  
  var LEFT: left_
  
  var RIGHT: right_
  
  var TOP: top_
}
object BOTTOM {
  
  inline def apply(): BOTTOM = {
    val __obj = js.Dynamic.literal(BOTTOM = "bottom", LEFT = "left", RIGHT = "right", TOP = "top")
    __obj.asInstanceOf[BOTTOM]
  }
  
  extension [Self <: BOTTOM](x: Self) {
    
    inline def setBOTTOM(value: bottom_): Self = StObject.set(x, "BOTTOM", value.asInstanceOf[js.Any])
    
    inline def setLEFT(value: left_): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    inline def setRIGHT(value: right_): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
    
    inline def setTOP(value: top_): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
  }
}
