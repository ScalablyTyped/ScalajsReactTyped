package typingsJapgolly.rtpParser.anon

import typingsJapgolly.rtpParser.rtpParserInts.`8000`
import typingsJapgolly.rtpParser.rtpParserStrings.A
import typingsJapgolly.rtpParser.rtpParserStrings.G722
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClockRateMediaTypeName extends StObject {
  
  var channels: typingsJapgolly.rtpParser.rtpParserInts.`1`
  
  var clockRate: `8000`
  
  var mediaType: A
  
  var name: G722
}
object ClockRateMediaTypeName {
  
  inline def apply(): ClockRateMediaTypeName = {
    val __obj = js.Dynamic.literal(channels = 1, clockRate = 8000, mediaType = "A", name = "G722")
    __obj.asInstanceOf[ClockRateMediaTypeName]
  }
  
  extension [Self <: ClockRateMediaTypeName](x: Self) {
    
    inline def setChannels(value: typingsJapgolly.rtpParser.rtpParserInts.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setClockRate(value: `8000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: G722): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
