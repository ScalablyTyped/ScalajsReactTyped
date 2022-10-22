package typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.expoFileSystem.anon.DirectoryUri
  - typingsJapgolly.expoFileSystem.anon.Granted
*/
trait FileSystemRequestDirectoryPermissionsResult extends StObject
object FileSystemRequestDirectoryPermissionsResult {
  
  inline def DirectoryUri(directoryUri: String): typingsJapgolly.expoFileSystem.anon.DirectoryUri = {
    val __obj = js.Dynamic.literal(directoryUri = directoryUri.asInstanceOf[js.Any], granted = true)
    __obj.asInstanceOf[typingsJapgolly.expoFileSystem.anon.DirectoryUri]
  }
  
  inline def Granted(): typingsJapgolly.expoFileSystem.anon.Granted = {
    val __obj = js.Dynamic.literal(granted = false)
    __obj.asInstanceOf[typingsJapgolly.expoFileSystem.anon.Granted]
  }
}
