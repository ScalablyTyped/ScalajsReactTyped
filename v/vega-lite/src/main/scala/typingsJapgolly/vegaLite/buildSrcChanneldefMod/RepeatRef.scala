package typingsJapgolly.vegaLite.buildSrcChanneldefMod

import typingsJapgolly.vegaLite.vegaLiteStrings.column
import typingsJapgolly.vegaLite.vegaLiteStrings.layer
import typingsJapgolly.vegaLite.vegaLiteStrings.repeat
import typingsJapgolly.vegaLite.vegaLiteStrings.row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepeatRef extends StObject {
  
  var repeat: row | column | typingsJapgolly.vegaLite.vegaLiteStrings.repeat | layer
}
object RepeatRef {
  
  inline def apply(repeat: row | column | repeat | layer): RepeatRef = {
    val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatRef]
  }
  
  extension [Self <: RepeatRef](x: Self) {
    
    inline def setRepeat(value: row | column | repeat | layer): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
  }
}
