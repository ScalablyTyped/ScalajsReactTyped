package typingsJapgolly.ngPackagr

import typingsJapgolly.ngPackagr.anon.OnFileChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileSystemFileWatcherMod {
  
  @JSImport("ng-packagr/lib/file-system/file-watcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFileWatch(basePaths: String): OnFileChange = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileWatch")(basePaths.asInstanceOf[js.Any]).asInstanceOf[OnFileChange]
  inline def createFileWatch(basePaths: String, ignoredPaths: js.Array[js.RegExp | String]): OnFileChange = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileWatch")(basePaths.asInstanceOf[js.Any], ignoredPaths.asInstanceOf[js.Any])).asInstanceOf[OnFileChange]
  inline def createFileWatch(basePaths: js.Array[String]): OnFileChange = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileWatch")(basePaths.asInstanceOf[js.Any]).asInstanceOf[OnFileChange]
  inline def createFileWatch(basePaths: js.Array[String], ignoredPaths: js.Array[js.RegExp | String]): OnFileChange = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileWatch")(basePaths.asInstanceOf[js.Any], ignoredPaths.asInstanceOf[js.Any])).asInstanceOf[OnFileChange]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ngPackagr.ngPackagrStrings.change
    - typingsJapgolly.ngPackagr.ngPackagrStrings.unlink
    - typingsJapgolly.ngPackagr.ngPackagrStrings.add
    - typingsJapgolly.ngPackagr.ngPackagrStrings.unlinkDir
    - typingsJapgolly.ngPackagr.ngPackagrStrings.addDir
  */
  trait AllFileWatchEvents extends StObject
  object AllFileWatchEvents {
    
    inline def add: typingsJapgolly.ngPackagr.ngPackagrStrings.add = "add".asInstanceOf[typingsJapgolly.ngPackagr.ngPackagrStrings.add]
    
    inline def addDir: typingsJapgolly.ngPackagr.ngPackagrStrings.addDir = "addDir".asInstanceOf[typingsJapgolly.ngPackagr.ngPackagrStrings.addDir]
    
    inline def change: typingsJapgolly.ngPackagr.ngPackagrStrings.change = "change".asInstanceOf[typingsJapgolly.ngPackagr.ngPackagrStrings.change]
    
    inline def unlink: typingsJapgolly.ngPackagr.ngPackagrStrings.unlink = "unlink".asInstanceOf[typingsJapgolly.ngPackagr.ngPackagrStrings.unlink]
    
    inline def unlinkDir: typingsJapgolly.ngPackagr.ngPackagrStrings.unlinkDir = "unlinkDir".asInstanceOf[typingsJapgolly.ngPackagr.ngPackagrStrings.unlinkDir]
  }
  
  trait FileChangedEvent extends StObject {
    
    var event: FileWatchEvent
    
    var filePath: String
  }
  object FileChangedEvent {
    
    inline def apply(event: FileWatchEvent, filePath: String): FileChangedEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileChangedEvent]
    }
    
    extension [Self <: FileChangedEvent](x: Self) {
      
      inline def setEvent(value: FileWatchEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Exclude<ng-packagr.ng-packagr/lib/file-system/file-watcher.AllFileWatchEvents, 'unlinkDir' | 'addDir'> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ngPackagr.ngPackagrStrings.add
    - typingsJapgolly.ngPackagr.ngPackagrStrings.unlink
    - typingsJapgolly.ngPackagr.ngPackagrStrings.change
  */
  trait FileWatchEvent extends StObject
  object FileWatchEvent {
    
    inline def add: typingsJapgolly.ngPackagr.ngPackagrStrings.add = "add".asInstanceOf[typingsJapgolly.ngPackagr.ngPackagrStrings.add]
    
    inline def change: typingsJapgolly.ngPackagr.ngPackagrStrings.change = "change".asInstanceOf[typingsJapgolly.ngPackagr.ngPackagrStrings.change]
    
    inline def unlink: typingsJapgolly.ngPackagr.ngPackagrStrings.unlink = "unlink".asInstanceOf[typingsJapgolly.ngPackagr.ngPackagrStrings.unlink]
  }
}
