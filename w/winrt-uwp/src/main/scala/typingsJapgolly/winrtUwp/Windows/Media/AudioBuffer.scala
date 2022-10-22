package typingsJapgolly.winrtUwp.Windows.Media

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IMemoryBufferReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a buffer containing audio data. */
trait AudioBuffer extends StObject {
  
  /** Gets the maximum number of bytes that the buffer can hold. */
  var capacity: Double
  
  /** Disposes of the object and associated resources. */
  def close(): Unit
  
  /**
    * Returns an IMemoryBufferReference representation of the audio buffer.
    * @return The IMemoryBufferReference representation of the audio buffer.
    */
  def createReference(): IMemoryBufferReference
  
  /** Gets or sets the number of bytes currently in use in the buffer. */
  var length: Double
}
object AudioBuffer {
  
  inline def apply(
    capacity: Double,
    close: Callback,
    createReference: CallbackTo[IMemoryBufferReference],
    length: Double
  ): AudioBuffer = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], close = close.toJsFn, createReference = createReference.toJsFn, length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBuffer]
  }
  
  extension [Self <: AudioBuffer](x: Self) {
    
    inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCreateReference(value: CallbackTo[IMemoryBufferReference]): Self = StObject.set(x, "createReference", value.toJsFn)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
