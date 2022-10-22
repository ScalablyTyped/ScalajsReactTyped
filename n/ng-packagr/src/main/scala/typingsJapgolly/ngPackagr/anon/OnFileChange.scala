package typingsJapgolly.ngPackagr.anon

import typingsJapgolly.chokidar.mod.FSWatcher
import typingsJapgolly.ngPackagr.libFileSystemFileWatcherMod.FileChangedEvent
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnFileChange extends StObject {
  
  var onFileChange: Observable_[FileChangedEvent]
  
  var watcher: FSWatcher
}
object OnFileChange {
  
  inline def apply(onFileChange: Observable_[FileChangedEvent], watcher: FSWatcher): OnFileChange = {
    val __obj = js.Dynamic.literal(onFileChange = onFileChange.asInstanceOf[js.Any], watcher = watcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFileChange]
  }
  
  extension [Self <: OnFileChange](x: Self) {
    
    inline def setOnFileChange(value: Observable_[FileChangedEvent]): Self = StObject.set(x, "onFileChange", value.asInstanceOf[js.Any])
    
    inline def setWatcher(value: FSWatcher): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
  }
}
