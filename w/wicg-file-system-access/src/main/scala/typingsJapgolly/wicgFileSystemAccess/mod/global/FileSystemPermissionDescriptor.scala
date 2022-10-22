package typingsJapgolly.wicgFileSystemAccess.mod.global

import typingsJapgolly.std.PermissionDescriptor
import typingsJapgolly.std.PermissionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemPermissionDescriptor
  extends StObject
     with PermissionDescriptor {
  
  var handle: FileSystemHandle
  
  var mode: js.UndefOr[FileSystemPermissionMode] = js.undefined
}
object FileSystemPermissionDescriptor {
  
  inline def apply(handle: FileSystemHandle, name: PermissionName): FileSystemPermissionDescriptor = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemPermissionDescriptor]
  }
  
  extension [Self <: FileSystemPermissionDescriptor](x: Self) {
    
    inline def setHandle(value: FileSystemHandle): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setMode(value: FileSystemPermissionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
