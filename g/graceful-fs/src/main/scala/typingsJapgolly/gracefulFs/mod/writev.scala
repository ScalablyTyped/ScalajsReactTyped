package typingsJapgolly.gracefulFs.mod

import typingsJapgolly.node.NodeJS.ArrayBufferView
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.fsMod.WriteVResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "writev")
@js.native
object writev extends js.Object {
  /**
    * Write an array of ArrayBufferViews to the file specified by fd using writev().
    * position is the offset from the beginning of the file where this data should be written.
    * It is unsafe to use fs.writev() multiple times on the same file without waiting for the callback. For this scenario, use fs.createWriteStream().
    * On Linux, positional writes don't work when the file is opened in append mode.
    * The kernel ignores the position argument and always appends the data to the end of the file.
    */
  def apply(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    position: Double,
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffers: js.Array[ArrayBufferView]): js.Promise[WriteVResult] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): js.Promise[WriteVResult] = js.native
}

