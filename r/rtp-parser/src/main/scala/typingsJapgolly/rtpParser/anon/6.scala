package typingsJapgolly.rtpParser.anon

import typingsJapgolly.rtpParser.rtpParserInts.`22050`
import typingsJapgolly.rtpParser.rtpParserStrings.A
import typingsJapgolly.rtpParser.rtpParserStrings.DVI4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var channels: typingsJapgolly.rtpParser.rtpParserInts.`1`
  
  var clockRate: `22050`
  
  var mediaType: A
  
  var name: DVI4
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal(channels = 1, clockRate = 22050, mediaType = "A", name = "DVI4")
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setChannels(value: typingsJapgolly.rtpParser.rtpParserInts.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setClockRate(value: `22050`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: DVI4): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
