package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndedEventUIParam extends StObject {
  
  /**
    * Get the video duration in seconds.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Get the url of the playing video.
    */
  var source: js.UndefOr[String] = js.undefined
}
object EndedEventUIParam {
  
  inline def apply(): EndedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndedEventUIParam]
  }
  
  extension [Self <: EndedEventUIParam](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
