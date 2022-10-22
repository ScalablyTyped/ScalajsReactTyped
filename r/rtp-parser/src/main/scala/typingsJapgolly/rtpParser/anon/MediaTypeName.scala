package typingsJapgolly.rtpParser.anon

import typingsJapgolly.rtpParser.rtpParserInts.`8000`
import typingsJapgolly.rtpParser.rtpParserStrings.A
import typingsJapgolly.rtpParser.rtpParserStrings.LPC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTypeName extends StObject {
  
  var channels: typingsJapgolly.rtpParser.rtpParserInts.`1`
  
  var clockRate: `8000`
  
  var mediaType: A
  
  var name: LPC
}
object MediaTypeName {
  
  inline def apply(): MediaTypeName = {
    val __obj = js.Dynamic.literal(channels = 1, clockRate = 8000, mediaType = "A", name = "LPC")
    __obj.asInstanceOf[MediaTypeName]
  }
  
  extension [Self <: MediaTypeName](x: Self) {
    
    inline def setChannels(value: typingsJapgolly.rtpParser.rtpParserInts.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setClockRate(value: `8000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: LPC): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
