package typingsJapgolly.threeTdsLoader.mod

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
import typingsJapgolly.three.mod.Color
import typingsJapgolly.three.mod.Mesh
import typingsJapgolly.three.mod.Object3D
import typingsJapgolly.three.mod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TDSLoader extends js.Object {
  /**
    * Print debug message to the console.
    *
    * Is controlled by a flag to show or hide debug messages.
    *
    * @param message Debug message to print to the console.
    */
  def debugMessage(message: String): Unit = js.native
  /**
    * Set position to the end of the current chunk of data.
    *
    * @param chunk Data chunk.
    */
  def endChunk(chunk: js.Object): Unit = js.native
  /**
    * Load 3ds file from url.
    *
    * @param url URL for the file.
    * @param onLoad onLoad callback, receives group object3D as argument.
    * @param onProgress onProgress callback.
    * @param onError onError callback.
    */
  def load(url: String, onLoad: js.Function1[/* object3D */ Object3D, Unit]): Unit = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* object3D */ Object3D, Unit],
    onProgress: js.Function1[/* progress */ ProgressEvent, Unit]
  ): Unit = js.native
  def load(
    url: String,
    onLoad: js.Function1[/* object3D */ Object3D, Unit],
    onProgress: js.Function1[/* progress */ ProgressEvent, Unit],
    onError: js.Function1[/* event */ ErrorEvent, Unit]
  ): Unit = js.native
  /**
    * Move to the next data chunk.
    *
    * @param data Dataview.
    * @param chunk Data chunk.
    */
  def nextChunk(data: scala.scalajs.js.typedarray.DataView, chunk: js.Object): Double = js.native
  /**
    * Parse arraybuffer data and load 3ds file.
    *
    * @param arraybuffer Arraybuffer data to be loaded.
    * @param path Path for external resources.
    * @return Group loaded from 3ds file.
    */
  def parse(arraybuffer: scala.scalajs.js.typedarray.ArrayBuffer, path: String): Object3D = js.native
  /**
    * Read byte value.
    *
    * @param data Dataview to read data from.
    * @return Data read from the dataview.
    */
  def readByte(data: scala.scalajs.js.typedarray.DataView): Double = js.native
  /**
    * Read next chunk of data.
    *
    * @param data Dataview.
    * @return Chunk of data read.
    */
  def readChunk(data: scala.scalajs.js.typedarray.DataView): js.Object = js.native
  /**
    * Read a color value.
    *
    * @param data Dataview.
    * @return Color value read..
    */
  def readColor(data: scala.scalajs.js.typedarray.DataView): Color = js.native
  /**
    * Read 64 bit unsigned integer value.
    *
    * @param data Dataview to read data from.
    * @return Data read from the dataview.
    */
  def readDWord(data: scala.scalajs.js.typedarray.DataView): Double = js.native
  /**
    * Read face array data chunk.
    *
    * @param data Dataview in use.
    * @param mesh Mesh to be filled with the data read.
    */
  def readFaceArray(data: scala.scalajs.js.typedarray.DataView, mesh: Mesh): Unit = js.native
  /**
    * Decode file content to read 3ds data.
    *
    * @param arraybuffer Arraybuffer data to be loaded.
    */
  def readFile(arraybuffer: scala.scalajs.js.typedarray.ArrayBuffer, path: String): Unit = js.native
  /**
    * Read 32 bit float value.
    *
    * @param data Dataview to read data from.
    * @return Data read from the dataview.
    */
  def readFloat(data: scala.scalajs.js.typedarray.DataView): Double = js.native
  /**
    * Read 32 bit signed integer value.
    *
    * @param data Dataview to read data from.
    * @return Data read from the dataview.
    */
  def readInt(data: scala.scalajs.js.typedarray.DataView): Double = js.native
  /**
    * Read texture map data chunk.
    *
    * @param data Dataview in use.
    * @return Texture read from this data chunk.
    */
  def readMap(data: scala.scalajs.js.typedarray.DataView, path: String): Texture = js.native
  /**
    * Read material data chunk and add it to the material list.
    *
    * @param data Dataview in use.
    */
  def readMaterialEntry(data: scala.scalajs.js.typedarray.DataView, path: String): Unit = js.native
  /**
    * Read material group data chunk.
    *
    * @param data Dataview in use.
    * @return object with name and index of the object.
    */
  def readMaterialGroup(data: scala.scalajs.js.typedarray.DataView): js.Object = js.native
  /**
    * Read mesh data chunk.
    *
    * @param data Dataview in use.
    */
  def readMesh(data: scala.scalajs.js.typedarray.DataView): Unit = js.native
  /**
    * Read mesh data chunk.
    *
    * @param data Dataview in use.
    */
  def readMeshData(data: scala.scalajs.js.typedarray.DataView, path: String): Unit = js.native
  /**
    * Read named object chunk.
    *
    * @param data Dataview in use.
    */
  def readNamedobject(data: scala.scalajs.js.typedarray.DataView): Unit = js.native
  /**
    * Read 16 bit signed integer value.
    *
    * @param data Dataview to read data from.
    * @return Data read from the dataview.
    */
  def readShort(data: scala.scalajs.js.typedarray.DataView): Double = js.native
  /**
    * Read string value.
    *
    * @param data Dataview to read data from.
    * @param maxLength Max size of the string to be read.
    * @return Data read from the dataview.
    */
  def readString(data: scala.scalajs.js.typedarray.DataView, maxLength: Double): String = js.native
  /**
    * Read 32 bit unsigned integer value.
    *
    * @param data Dataview to read data from.
    * @return Data read from the dataview.
    */
  def readWord(data: scala.scalajs.js.typedarray.DataView): Double = js.native
  /**
    * Reset dataview position.
    */
  def resetPosition(): Unit = js.native
  /**
    * Set resource path used to determine the file path to attached resources.
    *
    * @param path Path to resources.
    * @return Self for chaining.
    */
  def setPath(path: String): TDSLoader = js.native
}

