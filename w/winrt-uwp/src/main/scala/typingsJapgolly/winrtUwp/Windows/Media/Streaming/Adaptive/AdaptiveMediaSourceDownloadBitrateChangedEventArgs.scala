package typingsJapgolly.winrtUwp.Windows.Media.Streaming.Adaptive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the DownloadBitrateChanged event. */
@JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadBitrateChangedEventArgs")
@js.native
abstract class AdaptiveMediaSourceDownloadBitrateChangedEventArgs () extends js.Object {
  /** Gets a value indicating the new download bitrate for the media source. */
  var newValue: Double = js.native
  /** Gets a value indicating the previous download bitrate for the media source. */
  var oldValue: Double = js.native
}

