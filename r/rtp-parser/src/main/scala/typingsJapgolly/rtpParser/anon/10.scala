package typingsJapgolly.rtpParser.anon

import typingsJapgolly.rtpParser.rtpParserInts.`90000`
import typingsJapgolly.rtpParser.rtpParserStrings.CelB
import typingsJapgolly.rtpParser.rtpParserStrings.V
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var clockRate: `90000`
  
  var mediaType: V
  
  var name: CelB
}
object `10` {
  
  inline def apply(): `10` = {
    val __obj = js.Dynamic.literal(clockRate = 90000, mediaType = "V", name = "CelB")
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setClockRate(value: `90000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: V): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: CelB): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
