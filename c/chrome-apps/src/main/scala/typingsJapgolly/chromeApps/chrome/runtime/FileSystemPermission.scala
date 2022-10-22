package typingsJapgolly.chromeApps.chrome.runtime

import typingsJapgolly.chromeApps.chromeAppsStrings.directory
import typingsJapgolly.chromeApps.chromeAppsStrings.requestFileSystem
import typingsJapgolly.chromeApps.chromeAppsStrings.retainEntries
import typingsJapgolly.chromeApps.chromeAppsStrings.write_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemPermission
  extends StObject
     with ChromeOSOnlyPermissions {
  
  /**
    * @enum {string}
    * @requires(CrOS) 'requestFileSystem' is only for ChromeOS
    */
  var fileSystem: js.Array[write_ | retainEntries | directory | requestFileSystem]
}
object FileSystemPermission {
  
  inline def apply(fileSystem: js.Array[write_ | retainEntries | directory | requestFileSystem]): FileSystemPermission = {
    val __obj = js.Dynamic.literal(fileSystem = fileSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemPermission]
  }
  
  extension [Self <: FileSystemPermission](x: Self) {
    
    inline def setFileSystem(value: js.Array[write_ | retainEntries | directory | requestFileSystem]): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
    
    inline def setFileSystemVarargs(value: (write_ | retainEntries | directory | requestFileSystem)*): Self = StObject.set(x, "fileSystem", js.Array(value*))
  }
}
