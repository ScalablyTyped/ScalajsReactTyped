package typingsJapgolly.browserfs

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.browserfs.fileSystemMod.BFSCallback
import typingsJapgolly.browserfs.fileSystemMod.FileSystem
import typingsJapgolly.browserfs.fileSystemMod.FileSystemOptions
import typingsJapgolly.browserfs.folderAdapterMod.FolderAdapter
import typingsJapgolly.browserfs.folderAdapterMod.FolderAdapterOptions
import typingsJapgolly.browserfs.folderAdapterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofFolderAdapter extends Instantiable2[/* folder */ String, /* wrapped */ FileSystem, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a FolderAdapter instance with the given options.
    */
  def Create(opts: FolderAdapterOptions, cb: BFSCallback[FolderAdapter]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

