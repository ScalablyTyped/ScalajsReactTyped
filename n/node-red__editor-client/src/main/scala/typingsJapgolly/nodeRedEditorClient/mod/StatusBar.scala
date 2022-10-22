package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodeRedEditorClient.anon.AlignElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusBar extends StObject {
  
  def add(options: AlignElement): Unit
  
  def init(): Unit
}
object StatusBar {
  
  inline def apply(add: AlignElement => Callback, init: Callback): StatusBar = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: AlignElement) => add(t0).runNow()), init = init.toJsFn)
    __obj.asInstanceOf[StatusBar]
  }
  
  extension [Self <: StatusBar](x: Self) {
    
    inline def setAdd(value: AlignElement => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: AlignElement) => value(t0).runNow()))
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
  }
}
