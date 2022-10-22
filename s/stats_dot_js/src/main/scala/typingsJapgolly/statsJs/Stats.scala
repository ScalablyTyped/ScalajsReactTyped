package typingsJapgolly.statsJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.statsJs.Stats.Panel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stats extends StObject {
  
  var REVISION: Double
  
  def addPanel(panel: Panel): Panel
  
  def begin(): Unit
  
  var dom: HTMLDivElement
  
  def end(): Double
  
  /**
    * @param value 0:fps, 1: ms, 2: mb, 3+: custom
    */
  def showPanel(value: Double): Unit
  
  def update(): Unit
}
object Stats {
  
  inline def apply(
    REVISION: Double,
    addPanel: Panel => Panel,
    begin: Callback,
    dom: HTMLDivElement,
    end: CallbackTo[Double],
    showPanel: Double => Callback,
    update: Callback
  ): Stats = {
    val __obj = js.Dynamic.literal(REVISION = REVISION.asInstanceOf[js.Any], addPanel = js.Any.fromFunction1(addPanel), begin = begin.toJsFn, dom = dom.asInstanceOf[js.Any], end = end.toJsFn, showPanel = js.Any.fromFunction1((t0: Double) => showPanel(t0).runNow()), update = update.toJsFn)
    __obj.asInstanceOf[Stats]
  }
  
  trait Panel extends StObject {
    
    var dom: HTMLCanvasElement
    
    def update(value: Double, maxValue: Double): Unit
  }
  object Panel {
    
    inline def apply(dom: HTMLCanvasElement, update: (Double, Double) => Callback): Panel = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction2((t0: Double, t1: Double) => (update(t0, t1)).runNow()))
      __obj.asInstanceOf[Panel]
    }
    
    extension [Self <: Panel](x: Self) {
      
      inline def setDom(value: HTMLCanvasElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: (Double, Double) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    }
  }
  
  extension [Self <: Stats](x: Self) {
    
    inline def setAddPanel(value: Panel => Panel): Self = StObject.set(x, "addPanel", js.Any.fromFunction1(value))
    
    inline def setBegin(value: Callback): Self = StObject.set(x, "begin", value.toJsFn)
    
    inline def setDom(value: HTMLDivElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: CallbackTo[Double]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setREVISION(value: Double): Self = StObject.set(x, "REVISION", value.asInstanceOf[js.Any])
    
    inline def setShowPanel(value: Double => Callback): Self = StObject.set(x, "showPanel", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
  }
}
