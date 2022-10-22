package typingsJapgolly.dashjs.mod

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.dashjs.dashjsStrings.captionRendered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionRenderedEvent
  extends StObject
     with Event {
  
  var captionDiv: HTMLDivElement
  
  var currentTrackIdx: Double
  
  @JSName("type")
  var type_CaptionRenderedEvent: captionRendered
}
object CaptionRenderedEvent {
  
  inline def apply(captionDiv: HTMLDivElement, currentTrackIdx: Double): CaptionRenderedEvent = {
    val __obj = js.Dynamic.literal(captionDiv = captionDiv.asInstanceOf[js.Any], currentTrackIdx = currentTrackIdx.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("captionRendered")
    __obj.asInstanceOf[CaptionRenderedEvent]
  }
  
  extension [Self <: CaptionRenderedEvent](x: Self) {
    
    inline def setCaptionDiv(value: HTMLDivElement): Self = StObject.set(x, "captionDiv", value.asInstanceOf[js.Any])
    
    inline def setCurrentTrackIdx(value: Double): Self = StObject.set(x, "currentTrackIdx", value.asInstanceOf[js.Any])
    
    inline def setType(value: captionRendered): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
