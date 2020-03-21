package typingsJapgolly.chromeApps.chrome

import typingsJapgolly.chromeApps.AnonAUDIO
import typingsJapgolly.chromeApps.chromeAppsStrings.screen
import typingsJapgolly.chromeApps.chromeAppsStrings.tab
import typingsJapgolly.chromeApps.chromeAppsStrings.window
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region chrome.desktopCapture
/////////////////////
// Desktop Capture //
/////////////////////
/**
  * Desktop Capture API that can be used to capture content of screen or individual windows.
  * @since Chrome 34.
  * @requires Permissions: 'desktopCapture'
  */
@JSGlobal("chrome.desktopCapture")
@js.native
object desktopCapture extends js.Object {
  /**
    * Hides desktop media picker dialog shown by chooseDesktopMedia().
    * @param desktopMediaRequestId Id returned by chooseDesktopMedia()
    */
  def cancelChooseDesktopMedia(desktopMediaRequestId: integer): Unit = js.native
  /**
    * Shows desktop media picker UI with the specified set of sources.
    * @param sources Set of sources that should be shown to the user.
    * @param callback Provides an opaque string that can be passed to getUserMedia() API to generate media stream that corresponds to the source selected by the user.
    *                 If user didn't select any source (i.e. canceled the prompt) then the callback is called with an empty streamId.
    *                 The created streamId can be used only once and expires after a few seconds when it is not used.
    * @return Request ID to be used by cancelChooseDesktopMedia
    */
  def chooseDesktopMedia(
    sources: js.Array[
      ToStringLiteral[
        AnonAUDIO, 
        String, 
        Exclude[String, screen | window | tab | typingsJapgolly.chromeApps.chromeAppsStrings.audio]
      ]
    ],
    callback: js.Function1[/* streamId */ String, Unit]
  ): integer = js.native
  @js.native
  object DesktopCaptureSourceType extends js.Object {
    var AUDIO: typingsJapgolly.chromeApps.chromeAppsStrings.audio = js.native
    var SCREEN: screen = js.native
    var TAB: tab = js.native
    var WINDOW: window = js.native
  }
  
}

