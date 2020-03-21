package typingsJapgolly.kdbxweb.mod

import typingsJapgolly.std.ArrayBuffer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "BinaryStream")
@js.native
class BinaryStream protected () extends js.Object {
  def this(arrayBuffer: scala.scalajs.js.typedarray.ArrayBuffer) = this()
  def getByteLength(): Double = js.native
  def getFloat32(): Double = js.native
  def getFloat32(littleEdian: Boolean): Double = js.native
  def getFloat64(): Double = js.native
  def getFloat64(littleEdian: Boolean): Double = js.native
  def getInt16(): Double = js.native
  def getInt16(littleEdian: Boolean): Double = js.native
  def getInt32(): Double = js.native
  def getInt32(littleEdian: Boolean): Double = js.native
  def getInt8(): Double = js.native
  def getInt8(littleEdian: Boolean): Double = js.native
  def getPos(): Double = js.native
  def getUint16(): Double = js.native
  def getUint16(littleEdian: Boolean): Double = js.native
  def getUint32(): Double = js.native
  def getUint32(littleEdian: Boolean): Double = js.native
  def getUint64(): Double = js.native
  def getUint64(littleEdian: Boolean): Double = js.native
  def getUint8(): Double = js.native
  def getUint8(littleEdian: Boolean): Double = js.native
  def getWrittenBytes(): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def readBytes(size: Double): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def readBytesNoAdvance(startPos: Double, endPos: Double): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def readBytesToEnd(): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def setFloat32(value: Double): Unit = js.native
  def setFloat32(value: Double, littleEdian: Boolean): Unit = js.native
  def setFloat64(value: Double): Unit = js.native
  def setFloat64(value: Double, littleEdian: Boolean): Unit = js.native
  def setInt16(value: Double): Unit = js.native
  def setInt16(value: Double, littleEdian: Boolean): Unit = js.native
  def setInt32(value: Double): Unit = js.native
  def setInt32(value: Double, littleEdian: Boolean): Unit = js.native
  def setInt8(value: Double): Unit = js.native
  def setInt8(value: Double, littleEdian: Boolean): Unit = js.native
  def setUint16(value: Double): Unit = js.native
  def setUint16(value: Double, littleEdian: Boolean): Unit = js.native
  def setUint32(value: Double): Unit = js.native
  def setUint32(value: Double, littleEdian: Boolean): Unit = js.native
  def setUint64(value: Double): Unit = js.native
  def setUint64(value: Double, littleEdian: Boolean): Unit = js.native
  def setUint8(value: Double): Unit = js.native
  def setUint8(value: Double, littleEdian: Boolean): Unit = js.native
  def writeBytes(bytes: ArrayBuffer): Unit = js.native
  def writeBytes(bytes: Uint8Array): Unit = js.native
}

