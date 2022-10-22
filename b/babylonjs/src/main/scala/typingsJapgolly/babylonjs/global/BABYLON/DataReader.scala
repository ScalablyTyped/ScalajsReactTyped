package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.IDataBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DataReader")
@js.native
open class DataReader protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.DataReader {
  /**
    * Constructor
    * @param buffer The buffer to read
    */
  def this(buffer: IDataBuffer) = this()
  
  /* private */ /* CompleteClass */
  var _dataByteOffset: Any = js.native
  
  /* private */ /* CompleteClass */
  var _dataView: Any = js.native
  
  /**
    * The data buffer associated with this data reader.
    */
  /* CompleteClass */
  override val buffer: IDataBuffer = js.native
  
  /**
    * The current byte offset from the beginning of the data buffer.
    */
  /* CompleteClass */
  var byteOffset: Double = js.native
  
  /**
    * Loads the given byte length.
    * @param byteLength The byte length to load
    * @returns A promise that resolves when the load is complete
    */
  /* CompleteClass */
  override def loadAsync(byteLength: Double): js.Promise[Unit] = js.native
  
  /**
    * Read a string from the currently loaded data range.
    * @param byteLength The byte length to read
    * @returns The string read
    */
  /* CompleteClass */
  override def readString(byteLength: Double): String = js.native
  
  /**
    * Read a unsigned 32-bit integer from the currently loaded data range.
    * @returns The 32-bit integer read
    */
  /* CompleteClass */
  override def readUint32(): Double = js.native
  
  /**
    * Read a byte array from the currently loaded data range.
    * @param byteLength The byte length to read
    * @returns The byte array read
    */
  /* CompleteClass */
  override def readUint8Array(byteLength: Double): js.typedarray.Uint8Array = js.native
  
  /**
    * Skips the given byte length the currently loaded data range.
    * @param byteLength The byte length to skip
    */
  /* CompleteClass */
  override def skipBytes(byteLength: Double): Unit = js.native
}
