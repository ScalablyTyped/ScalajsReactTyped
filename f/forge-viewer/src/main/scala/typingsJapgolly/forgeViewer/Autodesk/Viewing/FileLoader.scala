package typingsJapgolly.forgeViewer.Autodesk.Viewing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileLoader extends StObject {
  
  def is3d(): Boolean
  
  def loadFile(
    url: String,
    options: FileLoaderOptions,
    onSuccess: js.Function0[Unit],
    onError: js.Function0[Unit]
  ): Unit
}
object FileLoader {
  
  inline def apply(
    is3d: CallbackTo[Boolean],
    loadFile: (String, FileLoaderOptions, js.Function0[Unit], js.Function0[Unit]) => Callback
  ): FileLoader = {
    val __obj = js.Dynamic.literal(is3d = is3d.toJsFn, loadFile = js.Any.fromFunction4((t0: String, t1: FileLoaderOptions, t2: js.Function0[Unit], t3: js.Function0[Unit]) => (loadFile(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[FileLoader]
  }
  
  extension [Self <: FileLoader](x: Self) {
    
    inline def setIs3d(value: CallbackTo[Boolean]): Self = StObject.set(x, "is3d", value.toJsFn)
    
    inline def setLoadFile(value: (String, FileLoaderOptions, js.Function0[Unit], js.Function0[Unit]) => Callback): Self = StObject.set(x, "loadFile", js.Any.fromFunction4((t0: String, t1: FileLoaderOptions, t2: js.Function0[Unit], t3: js.Function0[Unit]) => (value(t0, t1, t2, t3)).runNow()))
  }
}
