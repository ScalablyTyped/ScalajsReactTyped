package typingsJapgolly.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaStreamType extends StObject
/** Specifies a type of stream on a media capture device. */
@JSGlobal("Windows.Media.Capture.MediaStreamType")
@js.native
object MediaStreamType extends StObject {
  
  /** An audio stream. */
  @js.native
  sealed trait audio
    extends StObject
       with MediaStreamType
  
  /** A photo stream. */
  @js.native
  sealed trait photo
    extends StObject
       with MediaStreamType
  
  /** A video preview stream. */
  @js.native
  sealed trait videoPreview
    extends StObject
       with MediaStreamType
  
  /** A video recording stream. */
  @js.native
  sealed trait videoRecord
    extends StObject
       with MediaStreamType
}
