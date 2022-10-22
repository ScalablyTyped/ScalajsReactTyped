package typingsJapgolly.rtpParser.anon

import typingsJapgolly.rtpParser.rtpParserInts.`90000`
import typingsJapgolly.rtpParser.rtpParserStrings.H261
import typingsJapgolly.rtpParser.rtpParserStrings.V
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var clockRate: `90000`
  
  var mediaType: V
  
  var name: H261
}
object `13` {
  
  inline def apply(): `13` = {
    val __obj = js.Dynamic.literal(clockRate = 90000, mediaType = "V", name = "H261")
    __obj.asInstanceOf[`13`]
  }
  
  extension [Self <: `13`](x: Self) {
    
    inline def setClockRate(value: `90000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: V): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: H261): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
