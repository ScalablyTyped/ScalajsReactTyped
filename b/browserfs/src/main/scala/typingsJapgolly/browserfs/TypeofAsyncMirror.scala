package typingsJapgolly.browserfs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.browserfs.asyncMirrorMod.AsyncMirror
import typingsJapgolly.browserfs.asyncMirrorMod.AsyncMirrorOptions
import typingsJapgolly.browserfs.asyncMirrorMod.default
import typingsJapgolly.browserfs.fileSystemMod.BFSCallback
import typingsJapgolly.browserfs.fileSystemMod.FileSystem
import typingsJapgolly.browserfs.fileSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofAsyncMirror
  extends Instantiable2[/* sync */ FileSystem, /* async */ FileSystem, default]
     with Instantiable3[/* sync */ FileSystem, /* async */ FileSystem, /* deprecateMsg */ Boolean, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Constructs and initializes an AsyncMirror file system with the given options.
    */
  def Create(opts: AsyncMirrorOptions, cb: BFSCallback[AsyncMirror]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

