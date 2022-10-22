package typingsJapgolly.dmx.mod

import typingsJapgolly.dmx.anon.Label
import typingsJapgolly.dmx.dmxStrings.option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionRange
  extends StObject
     with Range {
  
  var options: js.Array[Label]
  
  var `type`: option
}
object OptionRange {
  
  inline def apply(options: js.Array[Label]): OptionRange = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("option")
    __obj.asInstanceOf[OptionRange]
  }
  
  extension [Self <: OptionRange](x: Self) {
    
    inline def setOptions(value: js.Array[Label]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Label*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setType(value: option): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
