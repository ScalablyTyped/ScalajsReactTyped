package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeCustomEvent extends StObject {
  
  /** Unique ID of this event used by Reporting and Data Transfer. This is a read-only field. */
  var advertiserCustomEventId: js.UndefOr[String] = js.undefined
  
  /** User-entered name for the event. */
  var advertiserCustomEventName: js.UndefOr[String] = js.undefined
  
  /** Type of the event. This is a read-only field. */
  var advertiserCustomEventType: js.UndefOr[String] = js.undefined
  
  /** Artwork label column, used to link events in Campaign Manager back to events in Studio. This is a required field and should not be modified after insertion. */
  var artworkLabel: js.UndefOr[String] = js.undefined
  
  /** Artwork type used by the creative.This is a read-only field. */
  var artworkType: js.UndefOr[String] = js.undefined
  
  /** Exit click-through URL for the event. This field is used only for exit events. */
  var exitClickThroughUrl: js.UndefOr[CreativeClickThroughUrl] = js.undefined
  
  /** ID of this event. This is a required field and should not be modified after insertion. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Properties for rich media popup windows. This field is used only for exit events. */
  var popupWindowProperties: js.UndefOr[PopupWindowProperties] = js.undefined
  
  /** Target type used by the event. */
  var targetType: js.UndefOr[String] = js.undefined
  
  /** Video reporting ID, used to differentiate multiple videos in a single creative. This is a read-only field. */
  var videoReportingId: js.UndefOr[String] = js.undefined
}
object CreativeCustomEvent {
  
  inline def apply(): CreativeCustomEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeCustomEvent]
  }
  
  extension [Self <: CreativeCustomEvent](x: Self) {
    
    inline def setAdvertiserCustomEventId(value: String): Self = StObject.set(x, "advertiserCustomEventId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserCustomEventIdUndefined: Self = StObject.set(x, "advertiserCustomEventId", js.undefined)
    
    inline def setAdvertiserCustomEventName(value: String): Self = StObject.set(x, "advertiserCustomEventName", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserCustomEventNameUndefined: Self = StObject.set(x, "advertiserCustomEventName", js.undefined)
    
    inline def setAdvertiserCustomEventType(value: String): Self = StObject.set(x, "advertiserCustomEventType", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserCustomEventTypeUndefined: Self = StObject.set(x, "advertiserCustomEventType", js.undefined)
    
    inline def setArtworkLabel(value: String): Self = StObject.set(x, "artworkLabel", value.asInstanceOf[js.Any])
    
    inline def setArtworkLabelUndefined: Self = StObject.set(x, "artworkLabel", js.undefined)
    
    inline def setArtworkType(value: String): Self = StObject.set(x, "artworkType", value.asInstanceOf[js.Any])
    
    inline def setArtworkTypeUndefined: Self = StObject.set(x, "artworkType", js.undefined)
    
    inline def setExitClickThroughUrl(value: CreativeClickThroughUrl): Self = StObject.set(x, "exitClickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setExitClickThroughUrlUndefined: Self = StObject.set(x, "exitClickThroughUrl", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPopupWindowProperties(value: PopupWindowProperties): Self = StObject.set(x, "popupWindowProperties", value.asInstanceOf[js.Any])
    
    inline def setPopupWindowPropertiesUndefined: Self = StObject.set(x, "popupWindowProperties", js.undefined)
    
    inline def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    
    inline def setVideoReportingId(value: String): Self = StObject.set(x, "videoReportingId", value.asInstanceOf[js.Any])
    
    inline def setVideoReportingIdUndefined: Self = StObject.set(x, "videoReportingId", js.undefined)
  }
}
