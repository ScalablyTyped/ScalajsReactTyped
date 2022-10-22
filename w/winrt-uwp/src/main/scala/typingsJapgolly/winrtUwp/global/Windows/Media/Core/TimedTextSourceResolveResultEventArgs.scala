package typingsJapgolly.winrtUwp.global.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TimedTextSource::Resolved event. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.TimedTextSourceResolveResultEventArgs")
@js.native
open class TimedTextSourceResolveResultEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Core.TimedTextSourceResolveResultEventArgs {
  
  /** Gets an object representing the asynchronous error that occurred when the TimedTextSource was resolved. */
  /* CompleteClass */
  var error: typingsJapgolly.winrtUwp.Windows.Media.Core.TimedMetadataTrackError = js.native
  
  /** Gets the list of TimedMetadataTrack objects resulting from resolving the TimedTextSource . */
  /* CompleteClass */
  var tracks: IVectorView[typingsJapgolly.winrtUwp.Windows.Media.Core.TimedMetadataTrack] = js.native
}
