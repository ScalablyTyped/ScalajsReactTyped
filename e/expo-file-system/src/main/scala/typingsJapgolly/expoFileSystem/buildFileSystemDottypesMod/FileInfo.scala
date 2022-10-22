package typingsJapgolly.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.expoFileSystem.anon.Exists
  - typingsJapgolly.expoFileSystem.anon.IsDirectory
*/
trait FileInfo extends StObject
object FileInfo {
  
  inline def Exists(isDirectory: Boolean, modificationTime: Double, size: Double, uri: String): typingsJapgolly.expoFileSystem.anon.Exists = {
    val __obj = js.Dynamic.literal(exists = true, isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.expoFileSystem.anon.Exists]
  }
  
  inline def IsDirectory(md5: Unit, modificationTime: Unit, size: Unit, uri: String): typingsJapgolly.expoFileSystem.anon.IsDirectory = {
    val __obj = js.Dynamic.literal(exists = false, isDirectory = false, md5 = md5.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.expoFileSystem.anon.IsDirectory]
  }
}
