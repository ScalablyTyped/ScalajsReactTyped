package typingsJapgolly.winrtUwp.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a data cue that can be included in a TimedMetadataTrack . */
@JSGlobal("Windows.Media.Core.DataCue")
@js.native
/** Initializes a new instance of the DataCue class. */
class DataCue () extends js.Object {
  /** Gets the data associated with the cue. */
  var data: IBuffer = js.native
  /** Gets or sets the duration of the cue. */
  var duration: Double = js.native
  /** Gets the identifier for the timed metadata track. */
  var id: String = js.native
  /** Gets the start time of the cue. */
  var startTime: Double = js.native
}

