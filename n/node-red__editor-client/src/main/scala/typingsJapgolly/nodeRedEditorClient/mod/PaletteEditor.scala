package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteEditor extends StObject {
  
  def init(): Unit
  
  def install(entry: js.Object, container: js.Object, done: js.Function1[/* ret */ js.Error | js.Object, Unit]): Unit
}
object PaletteEditor {
  
  inline def apply(
    init: Callback,
    install: (js.Object, js.Object, js.Function1[/* ret */ js.Error | js.Object, Unit]) => Callback
  ): PaletteEditor = {
    val __obj = js.Dynamic.literal(init = init.toJsFn, install = js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Function1[/* ret */ js.Error | js.Object, Unit]) => (install(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[PaletteEditor]
  }
  
  extension [Self <: PaletteEditor](x: Self) {
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setInstall(value: (js.Object, js.Object, js.Function1[/* ret */ js.Error | js.Object, Unit]) => Callback): Self = StObject.set(x, "install", js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Function1[/* ret */ js.Error | js.Object, Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
