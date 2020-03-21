package typingsJapgolly.browserfs

import typingsJapgolly.browserfs.fileSystemMod.BFSOneArgCallback
import typingsJapgolly.browserfs.fileSystemMod.FileSystem
import typingsJapgolly.browserfs.fileSystemMod.FileSystemConstructor
import typingsJapgolly.browserfs.utilMod.Arrayish
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBFSUtils extends js.Object {
  val isIE: Boolean = js.native
  val isWebWorker: Boolean = js.native
  def arrayBuffer2Buffer(ab: scala.scalajs.js.typedarray.ArrayBuffer): Buffer = js.native
  def arrayish2Buffer(arr: Arrayish[Double]): Buffer = js.native
  def buffer2ArrayBuffer(buff: Buffer): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def buffer2Uint8array(buff: Buffer): scala.scalajs.js.typedarray.Uint8Array = js.native
  def bufferValidator(v: js.Object, cb: BFSOneArgCallback): Unit = js.native
  def checkOptions(fsType: FileSystemConstructor, opts: js.Any, cb: BFSOneArgCallback): Unit = js.native
  def copyingSlice(buff: Buffer): Buffer = js.native
  def copyingSlice(buff: Buffer, start: Double): Buffer = js.native
  def copyingSlice(buff: Buffer, start: Double, end: Double): Buffer = js.native
  def deprecationMessage(print: Boolean, fsName: String, opts: js.Any): Unit = js.native
  def emptyBuffer(): Buffer = js.native
  def fail(): Unit = js.native
  def mkdirpSync(p: String, mode: Double, fs: FileSystem): Unit = js.native
  def uint8Array2Buffer(u8: scala.scalajs.js.typedarray.Uint8Array): Buffer = js.native
}

