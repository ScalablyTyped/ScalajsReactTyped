package typingsJapgolly.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdBreak extends StObject {
  
  /** Start time in seconds for the ad break, relative to the output file timeline. The default is `0s`. */
  var startTimeOffset: js.UndefOr[String] = js.undefined
}
object AdBreak {
  
  inline def apply(): AdBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdBreak]
  }
  
  extension [Self <: AdBreak](x: Self) {
    
    inline def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
  }
}
