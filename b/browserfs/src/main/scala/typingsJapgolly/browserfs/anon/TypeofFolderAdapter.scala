package typingsJapgolly.browserfs.anon

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.browserfs.distNodeBackendFolderAdapterMod.FolderAdapter
import typingsJapgolly.browserfs.distNodeBackendFolderAdapterMod.FolderAdapterOptions
import typingsJapgolly.browserfs.distNodeBackendFolderAdapterMod.default
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystem
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFolderAdapter
  extends StObject
     with Instantiable2[/* folder */ String, /* wrapped */ FileSystem, default] {
  
  /**
    * Creates a FolderAdapter instance with the given options.
    */
  def Create(opts: FolderAdapterOptions, cb: BFSCallback[FolderAdapter]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
