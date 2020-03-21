package typingsJapgolly.browserfs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.browserfs.fileSystemMod.BFSCallback
import typingsJapgolly.browserfs.fileSystemMod.FileSystemOptions
import typingsJapgolly.browserfs.indexedDBMod.IndexedDBFileSystem
import typingsJapgolly.browserfs.indexedDBMod.IndexedDBFileSystemOptions
import typingsJapgolly.browserfs.indexedDBMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofIndexedDB
  extends Instantiable1[/* cb */ BFSCallback[IndexedDBFileSystem], default]
     with Instantiable2[/* cb */ BFSCallback[IndexedDBFileSystem], /* storeName */ String, default]
     with Instantiable3[
      /* cb */ BFSCallback[IndexedDBFileSystem], 
      /* storeName */ String, 
      /* deprecateMsg */ Boolean, 
      default
    ] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Constructs an IndexedDB file system with the given options.
    */
  def Create(opts: IndexedDBFileSystemOptions, cb: BFSCallback[IndexedDBFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

