package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.in_
import typingsJapgolly.chromeApps.chromeAppsStrings.out_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IN extends StObject {
  
  var IN: in_
  
  var OUT: out_
}
object IN {
  
  inline def apply(): IN = {
    val __obj = js.Dynamic.literal(IN = "in", OUT = "out")
    __obj.asInstanceOf[IN]
  }
  
  extension [Self <: IN](x: Self) {
    
    inline def setIN(value: in_): Self = StObject.set(x, "IN", value.asInstanceOf[js.Any])
    
    inline def setOUT(value: out_): Self = StObject.set(x, "OUT", value.asInstanceOf[js.Any])
  }
}
