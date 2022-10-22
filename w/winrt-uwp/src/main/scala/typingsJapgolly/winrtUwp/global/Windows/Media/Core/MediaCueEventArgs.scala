package typingsJapgolly.winrtUwp.global.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.Media.Core.IMediaCue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TimedMetadataTrack::CueEntered and TimedMetadataTrack::CueExited events. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.MediaCueEventArgs")
@js.native
open class MediaCueEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Core.MediaCueEventArgs {
  
  /** Gets the cue that triggered the event. */
  /* CompleteClass */
  var cue: IMediaCue = js.native
}
