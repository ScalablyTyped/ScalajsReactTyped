package typingsJapgolly.winrtUwp.global.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines an video media stream. */
@JSGlobal("Windows.Media.Core.VideoStreamDescriptor")
@js.native
open class VideoStreamDescriptor protected ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Core.VideoStreamDescriptor {
  /**
    * Creates an instance of the VideoEncodingProperties class using the specified video encoding.
    * @param encodingProperties The encoding properties for the video stream.
    */
  def this(encodingProperties: VideoEncodingProperties) = this()
  
  /** Gets the encoding properties on the video stream. */
  /* CompleteClass */
  var encodingProperties: VideoEncodingProperties = js.native
  
  /** Specifies whether the stream is currently in use by the MediaStreamSource . */
  /* CompleteClass */
  var isSelected: Boolean = js.native
  
  /** Gets or sets the RFC-1766 language code for the stream. */
  /* CompleteClass */
  var language: String = js.native
  
  /** Gets or sets the name of the stream. */
  /* CompleteClass */
  var name: String = js.native
}
