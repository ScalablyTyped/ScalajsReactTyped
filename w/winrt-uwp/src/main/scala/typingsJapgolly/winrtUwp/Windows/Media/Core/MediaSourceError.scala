package typingsJapgolly.winrtUwp.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an error that occurred with a MediaSource . */
@JSGlobal("Windows.Media.Core.MediaSourceError")
@js.native
abstract class MediaSourceError () extends js.Object {
  /** Gets the extended error code for the MediaSourceError . */
  var extendedError: WinRTError = js.native
}

