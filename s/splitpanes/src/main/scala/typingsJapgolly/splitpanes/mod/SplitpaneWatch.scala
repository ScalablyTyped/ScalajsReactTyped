package typingsJapgolly.splitpanes.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitpaneWatch extends StObject {
  
  def dblClickSplitter(enable: Boolean): Unit
  
  def firstSplitter(): Unit
  
  def horizontal(): Unit
  
  var panes: SplitpaneWatchPaneType
}
object SplitpaneWatch {
  
  inline def apply(
    dblClickSplitter: Boolean => Callback,
    firstSplitter: Callback,
    horizontal: Callback,
    panes: SplitpaneWatchPaneType
  ): SplitpaneWatch = {
    val __obj = js.Dynamic.literal(dblClickSplitter = js.Any.fromFunction1((t0: Boolean) => dblClickSplitter(t0).runNow()), firstSplitter = firstSplitter.toJsFn, horizontal = horizontal.toJsFn, panes = panes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitpaneWatch]
  }
  
  extension [Self <: SplitpaneWatch](x: Self) {
    
    inline def setDblClickSplitter(value: Boolean => Callback): Self = StObject.set(x, "dblClickSplitter", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setFirstSplitter(value: Callback): Self = StObject.set(x, "firstSplitter", value.toJsFn)
    
    inline def setHorizontal(value: Callback): Self = StObject.set(x, "horizontal", value.toJsFn)
    
    inline def setPanes(value: SplitpaneWatchPaneType): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
  }
}
