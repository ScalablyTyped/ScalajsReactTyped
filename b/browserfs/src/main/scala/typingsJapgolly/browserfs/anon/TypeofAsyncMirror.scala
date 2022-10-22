package typingsJapgolly.browserfs.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.browserfs.distNodeBackendAsyncMirrorMod.AsyncMirrorOptions
import typingsJapgolly.browserfs.distNodeBackendAsyncMirrorMod.default
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystem
import typingsJapgolly.browserfs.distNodeCoreFileSystemMod.FileSystemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAsyncMirror
  extends StObject
     with Instantiable2[/* sync */ FileSystem, /* async */ FileSystem, default]
     with Instantiable3[/* sync */ FileSystem, /* async */ FileSystem, /* deprecateMsg */ Boolean, default] {
  
  /**
    * Constructs and initializes an AsyncMirror file system with the given options.
    */
  def Create(
    opts: AsyncMirrorOptions,
    cb: BFSCallback[typingsJapgolly.browserfs.distNodeBackendAsyncMirrorMod.AsyncMirror]
  ): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
