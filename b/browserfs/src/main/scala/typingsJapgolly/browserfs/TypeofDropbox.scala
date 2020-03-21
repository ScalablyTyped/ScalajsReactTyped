package typingsJapgolly.browserfs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.browserfs.dropboxMod.DropboxFileSystem
import typingsJapgolly.browserfs.dropboxMod.DropboxFileSystemOptions
import typingsJapgolly.browserfs.dropboxMod.default
import typingsJapgolly.browserfs.fileSystemMod.BFSCallback
import typingsJapgolly.browserfs.fileSystemMod.FileSystemOptions
import typingsJapgolly.dropboxjs.Dropbox.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDropbox
  extends Instantiable1[/* client */ Client, default]
     with Instantiable2[/* client */ Client, /* deprecateMsg */ Boolean, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a new DropboxFileSystem instance with the given options.
    * Must be given an *authenticated* DropboxJS client from the old v0.10 version of the Dropbox JS SDK.
    */
  def Create(opts: DropboxFileSystemOptions, cb: BFSCallback[DropboxFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

