package typingsJapgolly.chromeApps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chrome.integer
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdesktopCapture extends js.Object {
  val DesktopCaptureSourceType: AnonAUDIO
  /**
    * Hides desktop media picker dialog shown by chooseDesktopMedia().
    * @param desktopMediaRequestId Id returned by chooseDesktopMedia()
    */
  def cancelChooseDesktopMedia(desktopMediaRequestId: integer): Unit
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
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DesktopCaptureSourceType */ js.Any, 
        String, 
        Exclude[
          String, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DesktopCaptureSourceType[keyof typeof DesktopCaptureSourceType] */ js.Any
        ]
      ]
    ],
    callback: js.Function1[/* streamId */ String, Unit]
  ): integer
}

object TypeofdesktopCapture {
  @scala.inline
  def apply(
    DesktopCaptureSourceType: AnonAUDIO,
    cancelChooseDesktopMedia: integer => Callback,
    chooseDesktopMedia: (js.Array[
      ToStringLiteral[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof DesktopCaptureSourceType */ js.Any, 
        String, 
        Exclude[
          String, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof DesktopCaptureSourceType[keyof typeof DesktopCaptureSourceType] */ js.Any
        ]
      ]
    ], js.Function1[/* streamId */ String, Unit]) => CallbackTo[integer]
  ): TypeofdesktopCapture = {
    val __obj = js.Dynamic.literal(DesktopCaptureSourceType = DesktopCaptureSourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("cancelChooseDesktopMedia")(js.Any.fromFunction1((t0: typingsJapgolly.chromeApps.chrome.integer) => cancelChooseDesktopMedia(t0).runNow()))
    __obj.updateDynamic("chooseDesktopMedia")(js.Any.fromFunction2((t0: js.Array[
  typingsJapgolly.chromeApps.chrome.ToStringLiteral[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof DesktopCaptureSourceType */ js.Any, 
    java.lang.String, 
    typingsJapgolly.std.Exclude[
      java.lang.String, 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof DesktopCaptureSourceType[keyof typeof DesktopCaptureSourceType] */ js.Any
    ]
  ]], t1: js.Function1[/* streamId */ java.lang.String, scala.Unit]) => chooseDesktopMedia(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofdesktopCapture]
  }
}

