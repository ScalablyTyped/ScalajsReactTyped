package typingsJapgolly.antvG2plot.anon

import typingsJapgolly.antvG2plot.antvG2plotStrings.reflectX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  /** send (x, y) to (-x, y) */
  var `type`: reflectX
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("reflectX")
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setType(value: reflectX): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
