package typingsJapgolly.novaEditorNode

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/file-system-watcher/
trait FileSystemWatcher
  extends StObject
     with Disposable {
  
  def onDidChange(callback: js.Function1[/* path */ String, Unit]): Unit
}
object FileSystemWatcher {
  
  inline def apply(dispose: Callback, onDidChange: js.Function1[/* path */ String, Unit] => Callback): FileSystemWatcher = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, onDidChange = js.Any.fromFunction1((t0: js.Function1[/* path */ String, Unit]) => onDidChange(t0).runNow()))
    __obj.asInstanceOf[FileSystemWatcher]
  }
  
  extension [Self <: FileSystemWatcher](x: Self) {
    
    inline def setOnDidChange(value: js.Function1[/* path */ String, Unit] => Callback): Self = StObject.set(x, "onDidChange", js.Any.fromFunction1((t0: js.Function1[/* path */ String, Unit]) => value(t0).runNow()))
  }
}
