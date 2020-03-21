package typingsJapgolly.browserfs

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.browserfs.fileSystemMod.BFSCallback
import typingsJapgolly.browserfs.fileSystemMod.FileSystemOptions
import typingsJapgolly.browserfs.inMemoryMod.InMemoryFileSystem
import typingsJapgolly.browserfs.inMemoryMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofInMemory extends Instantiable0[default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates an InMemoryFileSystem instance.
    */
  def Create(options: js.Any, cb: BFSCallback[InMemoryFileSystem]): Unit = js.native
}

