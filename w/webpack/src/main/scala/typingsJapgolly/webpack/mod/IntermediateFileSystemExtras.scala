package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntermediateFileSystemExtras extends StObject {
  
  def close(arg0: Double, arg1: js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]): Unit
  
  def createWriteStream(arg0: String): WritableStream[Any]
  
  def mkdirSync(arg0: String): Unit
  
  def open(
    arg0: String,
    arg1: String,
    arg2: js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[Double], Unit]
  ): Unit
  
  def read(
    arg0: Double,
    arg1: Buffer,
    arg2: Double,
    arg3: Double,
    arg4: Double,
    arg5: js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[Double], Unit]
  ): Unit
  
  def rename(arg0: String, arg1: String, arg2: js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]): Unit
}
object IntermediateFileSystemExtras {
  
  inline def apply(
    close: (Double, js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]) => Callback,
    createWriteStream: String => WritableStream[Any],
    mkdirSync: String => Callback,
    open: (String, String, js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[Double], Unit]) => Callback,
    read: (Double, Buffer, Double, Double, Double, js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[Double], Unit]) => Callback,
    rename: (String, String, js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]) => Callback
  ): IntermediateFileSystemExtras = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction2((t0: Double, t1: js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]) => (close(t0, t1)).runNow()), createWriteStream = js.Any.fromFunction1(createWriteStream), mkdirSync = js.Any.fromFunction1((t0: String) => mkdirSync(t0).runNow()), open = js.Any.fromFunction3((t0: String, t1: String, t2: js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[Double], Unit]) => (open(t0, t1, t2)).runNow()), read = js.Any.fromFunction6((t0: Double, t1: Buffer, t2: Double, t3: Double, t4: Double, t5: js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[Double], Unit]) => (read(t0, t1, t2, t3, t4, t5)).runNow()), rename = js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]) => (rename(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[IntermediateFileSystemExtras]
  }
  
  extension [Self <: IntermediateFileSystemExtras](x: Self) {
    
    inline def setClose(value: (Double, js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]) => Callback): Self = StObject.set(x, "close", js.Any.fromFunction2((t0: Double, t1: js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setCreateWriteStream(value: String => WritableStream[Any]): Self = StObject.set(x, "createWriteStream", js.Any.fromFunction1(value))
    
    inline def setMkdirSync(value: String => Callback): Self = StObject.set(x, "mkdirSync", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setOpen(
      value: (String, String, js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[Double], Unit]) => Callback
    ): Self = StObject.set(x, "open", js.Any.fromFunction3((t0: String, t1: String, t2: js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[Double], Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setRead(
      value: (Double, Buffer, Double, Double, Double, js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[Double], Unit]) => Callback
    ): Self = StObject.set(x, "read", js.Any.fromFunction6((t0: Double, t1: Buffer, t2: Double, t3: Double, t4: Double, t5: js.Function2[/* arg0 */ js.UndefOr[Null | ErrnoException], /* arg1 */ js.UndefOr[Double], Unit]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setRename(
      value: (String, String, js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]) => Callback
    ): Self = StObject.set(x, "rename", js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
