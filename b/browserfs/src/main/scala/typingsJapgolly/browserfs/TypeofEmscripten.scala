package typingsJapgolly.browserfs

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.browserfs.emscriptenMod.EmscriptenFileSystem
import typingsJapgolly.browserfs.emscriptenMod.EmscriptenFileSystemOptions
import typingsJapgolly.browserfs.emscriptenMod.default
import typingsJapgolly.browserfs.fileSystemMod.BFSCallback
import typingsJapgolly.browserfs.fileSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofEmscripten
  extends Instantiable1[/* _FS */ js.Any, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Create an EmscriptenFileSystem instance with the given options.
    */
  def Create(opts: EmscriptenFileSystemOptions, cb: BFSCallback[EmscriptenFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

