package typingsJapgolly.rtpParser.anon

import typingsJapgolly.rtpParser.rtpParserInts.`90000`
import typingsJapgolly.rtpParser.rtpParserStrings.AV
import typingsJapgolly.rtpParser.rtpParserStrings.MP2T
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var clockRate: `90000`
  
  var mediaType: AV
  
  var name: MP2T
}
object `15` {
  
  inline def apply(): `15` = {
    val __obj = js.Dynamic.literal(clockRate = 90000, mediaType = "AV", name = "MP2T")
    __obj.asInstanceOf[`15`]
  }
  
  extension [Self <: `15`](x: Self) {
    
    inline def setClockRate(value: `90000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: AV): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: MP2T): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
