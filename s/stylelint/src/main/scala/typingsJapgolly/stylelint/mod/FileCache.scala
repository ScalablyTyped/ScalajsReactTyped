package typingsJapgolly.stylelint.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileCache extends StObject {
  
  def calcHashOfConfig(config: Config): Unit
  
  def destroy(): Unit
  
  def hasFileChanged(absoluteFilepath: String): Boolean
  
  def reconcile(): Unit
  
  def removeEntry(absoluteFilepath: String): Unit
}
object FileCache {
  
  inline def apply(
    calcHashOfConfig: Config => Callback,
    destroy: Callback,
    hasFileChanged: String => Boolean,
    reconcile: Callback,
    removeEntry: String => Callback
  ): FileCache = {
    val __obj = js.Dynamic.literal(calcHashOfConfig = js.Any.fromFunction1((t0: Config) => calcHashOfConfig(t0).runNow()), destroy = destroy.toJsFn, hasFileChanged = js.Any.fromFunction1(hasFileChanged), reconcile = reconcile.toJsFn, removeEntry = js.Any.fromFunction1((t0: String) => removeEntry(t0).runNow()))
    __obj.asInstanceOf[FileCache]
  }
  
  extension [Self <: FileCache](x: Self) {
    
    inline def setCalcHashOfConfig(value: Config => Callback): Self = StObject.set(x, "calcHashOfConfig", js.Any.fromFunction1((t0: Config) => value(t0).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setHasFileChanged(value: String => Boolean): Self = StObject.set(x, "hasFileChanged", js.Any.fromFunction1(value))
    
    inline def setReconcile(value: Callback): Self = StObject.set(x, "reconcile", value.toJsFn)
    
    inline def setRemoveEntry(value: String => Callback): Self = StObject.set(x, "removeEntry", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
