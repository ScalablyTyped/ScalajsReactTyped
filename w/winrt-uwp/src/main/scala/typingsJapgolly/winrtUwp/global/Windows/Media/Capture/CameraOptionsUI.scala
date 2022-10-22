package typingsJapgolly.winrtUwp.global.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a method for displaying a UI, by which the UI contains options for the capture of photos, audio recordings and videos. */
/* note: abstract class */ @JSGlobal("Windows.Media.Capture.CameraOptionsUI")
@js.native
open class CameraOptionsUI ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Capture.CameraOptionsUI
object CameraOptionsUI {
  
  @JSGlobal("Windows.Media.Capture.CameraOptionsUI")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Displays a UI that contains options for the capture of photos, audio recordings and videos.
    * @param mediaCapture The MediaCapture object that provides methods for the capture of photos, audio recordings and videos.
    */
  /* static member */
  inline def show(mediaCapture: typingsJapgolly.winrtUwp.Windows.Media.Capture.MediaCapture): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(mediaCapture.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
