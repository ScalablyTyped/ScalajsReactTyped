package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlobEventInit extends StObject {
  
  /* standard dom */
  var data: org.scalajs.dom.Blob
  
  /* standard dom */
  var timecode: js.UndefOr[DOMHighResTimeStamp] = js.undefined
}
object BlobEventInit {
  
  inline def apply(data: org.scalajs.dom.Blob): BlobEventInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobEventInit]
  }
  
  extension [Self <: BlobEventInit](x: Self) {
    
    inline def setData(value: org.scalajs.dom.Blob): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setTimecode(value: DOMHighResTimeStamp): Self = StObject.set(x, "timecode", value.asInstanceOf[js.Any])
    
    inline def setTimecodeUndefined: Self = StObject.set(x, "timecode", js.undefined)
  }
}
