package typingsJapgolly.webpack.mod

import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.webpack.mod.OutputFileSystem because var conflicts: dirname, join, lstat, readdir, relative. Inlined writeFile, writeFile, mkdir, rmdir, unlink */ @js.native
trait IntermediateFileSystem
  extends StObject
     with InputFileSystem
     with IntermediateFileSystemExtras {
  
  def mkdir(arg0: String, arg1: js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]): Unit = js.native
  
  var rmdir: js.UndefOr[
    js.Function2[
      /* arg0 */ String, 
      /* arg1 */ js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit], 
      Unit
    ]
  ] = js.native
  
  var unlink: js.UndefOr[
    js.Function2[
      /* arg0 */ String, 
      /* arg1 */ js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit], 
      Unit
    ]
  ] = js.native
  
  def writeFile(arg0: String, arg1: String, arg2: js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]): Unit = js.native
  def writeFile(arg0: String, arg1: Buffer, arg2: js.Function1[/* arg0 */ js.UndefOr[Null | ErrnoException], Unit]): Unit = js.native
}
