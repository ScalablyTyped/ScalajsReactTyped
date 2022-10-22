package typingsJapgolly.winrtUwp.global.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a data cue that can be included in a TimedMetadataTrack . */
@JSGlobal("Windows.Media.Core.DataCue")
@js.native
/** Initializes a new instance of the DataCue class. */
open class DataCue ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Core.DataCue {
  
  /** Gets the data associated with the cue. */
  /* CompleteClass */
  var data: IBuffer = js.native
  
  /** Gets or sets the duration of the cue. */
  /* CompleteClass */
  var duration: Double = js.native
  
  /** Gets the identifier for the timed metadata track. */
  /* CompleteClass */
  var id: String = js.native
  
  /** Gets the start time of the cue. */
  /* CompleteClass */
  var startTime: Double = js.native
}
