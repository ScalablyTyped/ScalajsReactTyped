package typingsJapgolly.winrtUwp.Windows.Media

import typingsJapgolly.winrtUwp.Windows.Foundation.IMemoryBufferReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a buffer containing audio data. */
@JSGlobal("Windows.Media.AudioBuffer")
@js.native
abstract class AudioBuffer () extends js.Object {
  /** Gets the maximum number of bytes that the buffer can hold. */
  var capacity: Double = js.native
  /** Gets or sets the number of bytes currently in use in the buffer. */
  var length: Double = js.native
  /** Disposes of the object and associated resources. */
  def close(): Unit = js.native
  /**
    * Returns an IMemoryBufferReference representation of the audio buffer.
    * @return The IMemoryBufferReference representation of the audio buffer.
    */
  def createReference(): IMemoryBufferReference = js.native
}

