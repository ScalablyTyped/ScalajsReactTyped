package typingsJapgolly.filewriter

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface lets users write, truncate, and append to files using simple synchronous calls.
  * This interface is specified to be used only within Web Workers (WorkerUtils [WEBWORKERS]).
  */
trait FileWriterSync extends StObject {
  
  /**
    * The length of the file. If the user does not have read access to the file, this must be the highest byte offset at which the user has written.
    */
  var length: Double
  
  /**
    * The byte offset at which the next write to the file will occur. This must be no greater than length.
    */
  var position: Double
  
  /**
    * Seek sets the file position at which the next write will occur.
    * @param offset An absolute byte offset into the file. If offset is greater than length, length is used instead. If offset is less than zero, length is added to it, so that it is treated as an offset back from the end of the file. If it is still less than zero, zero is used.
    */
  def seek(offset: Double): Unit
  
  /**
    * Changes the length of the file to that specified. If shortening the file, data beyond the new length must be discarded. If extending the file, the existing data must be zero-padded up to the new length.
    * Upon successful completion:
    * <ul>
    *     <li>length must be equal to size.</li>
    *     <li>position must be the lesser of
    *          <ul>
    *              <li>its pre-truncate value,</li>
    *              <li>size.</li>
    *          </ul>
    *      </li>
    *  </ul>
    * @param size The size to which the length of the file is to be adjusted, measured in bytes.
    */
  def truncate(size: Double): Unit
  
  /**
    * Write the supplied data to the file at position. Upon completion, position will increase by data.size.
    * @param data The blob to write.
    */
  def write(data: Blob): Unit
}
object FileWriterSync {
  
  inline def apply(
    length: Double,
    position: Double,
    seek: Double => Callback,
    truncate: Double => Callback,
    write: Blob => Callback
  ): FileWriterSync = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), truncate = js.Any.fromFunction1((t0: Double) => truncate(t0).runNow()), write = js.Any.fromFunction1((t0: Blob) => write(t0).runNow()))
    __obj.asInstanceOf[FileWriterSync]
  }
  
  extension [Self <: FileWriterSync](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setTruncate(value: Double => Callback): Self = StObject.set(x, "truncate", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setWrite(value: Blob => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: Blob) => value(t0).runNow()))
  }
}
