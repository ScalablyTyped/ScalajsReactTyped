package typingsJapgolly.onfidoActiveVideoCapture

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @js.native
  sealed trait LivenessError extends StObject
  @JSImport("@onfido/active-video-capture/dist/types", "LivenessError")
  @js.native
  object LivenessError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LivenessError & String] = js.native
    
    @js.native
    sealed trait FACE_DETECTION_TIMEOUT
      extends StObject
         with LivenessError
    /* "face_detection_timeout" */ val FACE_DETECTION_TIMEOUT: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.LivenessError.FACE_DETECTION_TIMEOUT & String = js.native
  }
  
  @js.native
  sealed trait TrackingEvent extends StObject
  @JSImport("@onfido/active-video-capture/dist/types", "TrackingEvent")
  @js.native
  object TrackingEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TrackingEvent & String] = js.native
    
    @js.native
    sealed trait ALIGNMENT_SCREEN_SHOWN
      extends StObject
         with TrackingEvent
    /* "alignment" */ val ALIGNMENT_SCREEN_SHOWN: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.ALIGNMENT_SCREEN_SHOWN & String = js.native
    
    @js.native
    sealed trait ALIGNMENT_STATUS_UPDATED_ALIGNED
      extends StObject
         with TrackingEvent
    /* "alignment_status_aligned" */ val ALIGNMENT_STATUS_UPDATED_ALIGNED: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.ALIGNMENT_STATUS_UPDATED_ALIGNED & String = js.native
    
    @js.native
    sealed trait ALIGNMENT_STATUS_UPDATED_NOT_CENTERED
      extends StObject
         with TrackingEvent
    /* "alignment_status_not_centered" */ val ALIGNMENT_STATUS_UPDATED_NOT_CENTERED: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.ALIGNMENT_STATUS_UPDATED_NOT_CENTERED & String = js.native
    
    @js.native
    sealed trait ALIGNMENT_STATUS_UPDATED_TOO_CLOSE
      extends StObject
         with TrackingEvent
    /* "alignment_status_too_close" */ val ALIGNMENT_STATUS_UPDATED_TOO_CLOSE: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.ALIGNMENT_STATUS_UPDATED_TOO_CLOSE & String = js.native
    
    @js.native
    sealed trait ALIGNMENT_STATUS_UPDATED_TOO_FAR
      extends StObject
         with TrackingEvent
    /* "alignment_status_too_far" */ val ALIGNMENT_STATUS_UPDATED_TOO_FAR: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.ALIGNMENT_STATUS_UPDATED_TOO_FAR & String = js.native
    
    @js.native
    sealed trait CAPTURE_ERROR_TIMEOUT_RESTART_CLICKED
      extends StObject
         with TrackingEvent
    /* "capture_error_timeout_restart_clicked" */ val CAPTURE_ERROR_TIMEOUT_RESTART_CLICKED: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.CAPTURE_ERROR_TIMEOUT_RESTART_CLICKED & String = js.native
    
    @js.native
    sealed trait CAPTURE_ERROR_TIMEOUT_SHOWN
      extends StObject
         with TrackingEvent
    /* "capture_error_timeout" */ val CAPTURE_ERROR_TIMEOUT_SHOWN: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.CAPTURE_ERROR_TIMEOUT_SHOWN & String = js.native
    
    @js.native
    sealed trait CAPTURE_ERROR_TOO_FAST_RESTART_CLICKED
      extends StObject
         with TrackingEvent
    /* "capture_error_too_fast_restart_clicked" */ val CAPTURE_ERROR_TOO_FAST_RESTART_CLICKED: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.CAPTURE_ERROR_TOO_FAST_RESTART_CLICKED & String = js.native
    
    @js.native
    sealed trait CAPTURE_ERROR_TOO_FAST_SHOWN
      extends StObject
         with TrackingEvent
    /* "capture_error_too_fast" */ val CAPTURE_ERROR_TOO_FAST_SHOWN: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.CAPTURE_ERROR_TOO_FAST_SHOWN & String = js.native
    
    @js.native
    sealed trait CAPTURE_PERFORMANCE
      extends StObject
         with TrackingEvent
    /* "capture_performance" */ val CAPTURE_PERFORMANCE: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.CAPTURE_PERFORMANCE & String = js.native
    
    @js.native
    sealed trait CAPTURE_SCREEN_SHOWN
      extends StObject
         with TrackingEvent
    /* "capture" */ val CAPTURE_SCREEN_SHOWN: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.CAPTURE_SCREEN_SHOWN & String = js.native
    
    @js.native
    sealed trait CAPTURE_STATUS_UPDATED
      extends StObject
         with TrackingEvent
    /* "capture_status" */ val CAPTURE_STATUS_UPDATED: typingsJapgolly.onfidoActiveVideoCapture.distTypesMod.TrackingEvent.CAPTURE_STATUS_UPDATED & String = js.native
  }
  
  trait BoundingBox extends StObject {
    
    var height: Double
    
    var left: Double
    
    var top: Double
    
    var width: Double
  }
  object BoundingBox {
    
    inline def apply(height: Double, left: Double, top: Double, width: Double): BoundingBox = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundingBox]
    }
    
    extension [Self <: BoundingBox](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Euler extends StObject {
    
    var pitch: Double
    
    var roll: Double
    
    var yaw: Double
  }
  object Euler {
    
    inline def apply(pitch: Double, roll: Double, yaw: Double): Euler = {
      val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], yaw = yaw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Euler]
    }
    
    extension [Self <: Euler](x: Self) {
      
      inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
      
      inline def setYaw(value: Double): Self = StObject.set(x, "yaw", value.asInstanceOf[js.Any])
    }
  }
  
  type TrackingCallback = js.Function2[/* event */ TrackingEvent, /* properties */ js.UndefOr[Record[String, Any]], Unit]
  
  type TranslateCallback = js.Function2[/* key */ String, /* options */ js.UndefOr[Record[String, Any]], String]
  
  trait Vertex extends StObject {
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object Vertex {
    
    inline def apply(x: Double, y: Double, z: Double): Vertex = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vertex]
    }
    
    extension [Self <: Vertex](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
