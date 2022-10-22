package typingsJapgolly.onfidoActiveVideoCapture

import typingsJapgolly.onfidoActiveVideoCapture.distComponentsActiveVideoCaptureMod.Props
import typingsJapgolly.preact.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@onfido/active-video-capture", "ActiveVideoCapture")
  @js.native
  val ActiveVideoCapture: FunctionComponent[Props] = js.native
  
  @JSImport("@onfido/active-video-capture", "LivenessError")
  @js.native
  object LivenessError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.LivenessError & String] = js.native
    
    /* "face_detection_timeout" */ val FACE_DETECTION_TIMEOUT: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.LivenessError.FACE_DETECTION_TIMEOUT & String = js.native
  }
  
  @JSImport("@onfido/active-video-capture", "TrackingEvent")
  @js.native
  object TrackingEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent & String] = js.native
    
    /* "alignment" */ val ALIGNMENT_SCREEN_SHOWN: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.ALIGNMENT_SCREEN_SHOWN & String = js.native
    
    /* "alignment_status_aligned" */ val ALIGNMENT_STATUS_UPDATED_ALIGNED: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.ALIGNMENT_STATUS_UPDATED_ALIGNED & String = js.native
    
    /* "alignment_status_not_centered" */ val ALIGNMENT_STATUS_UPDATED_NOT_CENTERED: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.ALIGNMENT_STATUS_UPDATED_NOT_CENTERED & String = js.native
    
    /* "alignment_status_too_close" */ val ALIGNMENT_STATUS_UPDATED_TOO_CLOSE: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.ALIGNMENT_STATUS_UPDATED_TOO_CLOSE & String = js.native
    
    /* "alignment_status_too_far" */ val ALIGNMENT_STATUS_UPDATED_TOO_FAR: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.ALIGNMENT_STATUS_UPDATED_TOO_FAR & String = js.native
    
    /* "capture_error_timeout_restart_clicked" */ val CAPTURE_ERROR_TIMEOUT_RESTART_CLICKED: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.CAPTURE_ERROR_TIMEOUT_RESTART_CLICKED & String = js.native
    
    /* "capture_error_timeout" */ val CAPTURE_ERROR_TIMEOUT_SHOWN: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.CAPTURE_ERROR_TIMEOUT_SHOWN & String = js.native
    
    /* "capture_error_too_fast_restart_clicked" */ val CAPTURE_ERROR_TOO_FAST_RESTART_CLICKED: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.CAPTURE_ERROR_TOO_FAST_RESTART_CLICKED & String = js.native
    
    /* "capture_error_too_fast" */ val CAPTURE_ERROR_TOO_FAST_SHOWN: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.CAPTURE_ERROR_TOO_FAST_SHOWN & String = js.native
    
    /* "capture_performance" */ val CAPTURE_PERFORMANCE: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.CAPTURE_PERFORMANCE & String = js.native
    
    /* "capture" */ val CAPTURE_SCREEN_SHOWN: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.CAPTURE_SCREEN_SHOWN & String = js.native
    
    /* "capture_status" */ val CAPTURE_STATUS_UPDATED: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.CAPTURE_STATUS_UPDATED & String = js.native
  }
}
