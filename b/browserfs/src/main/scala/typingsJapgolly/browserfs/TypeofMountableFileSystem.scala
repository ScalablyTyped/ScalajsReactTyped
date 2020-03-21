package typingsJapgolly.browserfs

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.browserfs.fileSystemMod.BFSCallback
import typingsJapgolly.browserfs.fileSystemMod.FileSystemOptions
import typingsJapgolly.browserfs.mountableFileSystemMod.MountableFileSystem
import typingsJapgolly.browserfs.mountableFileSystemMod.MountableFileSystemOptions
import typingsJapgolly.browserfs.mountableFileSystemMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofMountableFileSystem extends Instantiable0[default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a MountableFileSystem instance with the given options.
    */
  def Create(opts: MountableFileSystemOptions, cb: BFSCallback[MountableFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

