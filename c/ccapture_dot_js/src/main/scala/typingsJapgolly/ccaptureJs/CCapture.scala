package typingsJapgolly.ccaptureJs

import org.scalajs.dom.Blob
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ccaptureJs.ccaptureJsStrings.ffmpegserver
import typingsJapgolly.ccaptureJs.ccaptureJsStrings.gif
import typingsJapgolly.ccaptureJs.ccaptureJsStrings.jpg
import typingsJapgolly.ccaptureJs.ccaptureJsStrings.png
import typingsJapgolly.ccaptureJs.ccaptureJsStrings.webm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CCapture extends StObject {
  
  def capture(canvas: HTMLElement): Unit = js.native
  
  def save(): Unit = js.native
  def save(cb: js.Function1[/* blob */ Blob, Unit]): Unit = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
}
object CCapture {
  
  trait Settings extends StObject {
    
    /**
      * It will automatically download the captured data every n seconds (only available for webm/png/jpg)
      */
    var autoSaveTime: js.UndefOr[Double] = js.undefined
    
    /**
      * Adds a widget with capturing info
      */
    var display: js.UndefOr[Boolean] = js.undefined
    
    var format: webm | gif | png | jpg | ffmpegserver
    
    /**
      * Target framerate for the capture
      */
    var framerate: js.UndefOr[Double] = js.undefined
    
    /**
      * Super-sampling of frames to create a motion-blurred frame (0 or 1 make no effect)
      */
    var motionBlurFrames: js.UndefOr[Double] = js.undefined
    
    /**
      * Name of the files to be exported. if no name is provided, a GUID will be generated
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Quality for webm/jpg
      */
    var quality: js.UndefOr[Double] = js.undefined
    
    /**
      * Skip to that mark (seconds)
      */
    var startTime: js.UndefOr[Double] = js.undefined
    
    /**
      * Automatically stops and downloads when reaching that time (seconds).
      * Very convenient for long captures: set it and forget it (remember autoSaveTime!)
      */
    var timeLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Dumps info on the console
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Path to the gif worker script
      */
    var workersPath: js.UndefOr[String] = js.undefined
  }
  object Settings {
    
    inline def apply(format: webm | gif | png | jpg | ffmpegserver): Settings = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setAutoSaveTime(value: Double): Self = StObject.set(x, "autoSaveTime", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveTimeUndefined: Self = StObject.set(x, "autoSaveTime", js.undefined)
      
      inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFormat(value: webm | gif | png | jpg | ffmpegserver): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
      
      inline def setFramerateUndefined: Self = StObject.set(x, "framerate", js.undefined)
      
      inline def setMotionBlurFrames(value: Double): Self = StObject.set(x, "motionBlurFrames", value.asInstanceOf[js.Any])
      
      inline def setMotionBlurFramesUndefined: Self = StObject.set(x, "motionBlurFrames", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
      
      inline def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWorkersPath(value: String): Self = StObject.set(x, "workersPath", value.asInstanceOf[js.Any])
      
      inline def setWorkersPathUndefined: Self = StObject.set(x, "workersPath", js.undefined)
    }
  }
}
