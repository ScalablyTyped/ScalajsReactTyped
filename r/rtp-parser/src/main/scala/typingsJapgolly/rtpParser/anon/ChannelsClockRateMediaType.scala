package typingsJapgolly.rtpParser.anon

import typingsJapgolly.rtpParser.rtpParserInts.`8000`
import typingsJapgolly.rtpParser.rtpParserStrings.A
import typingsJapgolly.rtpParser.rtpParserStrings.PCMA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelsClockRateMediaType extends StObject {
  
  var channels: typingsJapgolly.rtpParser.rtpParserInts.`1`
  
  var clockRate: `8000`
  
  var mediaType: A
  
  var name: PCMA
}
object ChannelsClockRateMediaType {
  
  inline def apply(): ChannelsClockRateMediaType = {
    val __obj = js.Dynamic.literal(channels = 1, clockRate = 8000, mediaType = "A", name = "PCMA")
    __obj.asInstanceOf[ChannelsClockRateMediaType]
  }
  
  extension [Self <: ChannelsClockRateMediaType](x: Self) {
    
    inline def setChannels(value: typingsJapgolly.rtpParser.rtpParserInts.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setClockRate(value: `8000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: PCMA): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
