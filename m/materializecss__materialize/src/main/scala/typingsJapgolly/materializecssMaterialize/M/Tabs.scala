package typingsJapgolly.materializecssMaterialize.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tabs
  extends StObject
     with Component[TabsOptions] {
  
  /**
    * The index of tab that is currently shown
    */
  var index: Double
  
  /**
    * Show tab content that corresponds to the tab with the id
    * @param tabId The id of the tab that you want to switch to
    */
  def select(tabId: String): Unit
  
  /**
    * Recalculate tab indicator position. This is useful when the indicator position is not correct
    */
  def updateTabIndicator(): Unit
}
object Tabs {
  
  inline def apply(
    destroy: Callback,
    el: Element,
    index: Double,
    options: TabsOptions,
    select: String => Callback,
    updateTabIndicator: Callback
  ): Tabs = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, el = el.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], select = js.Any.fromFunction1((t0: String) => select(t0).runNow()), updateTabIndicator = updateTabIndicator.toJsFn)
    __obj.asInstanceOf[Tabs]
  }
  
  extension [Self <: Tabs](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: String => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUpdateTabIndicator(value: Callback): Self = StObject.set(x, "updateTabIndicator", value.toJsFn)
  }
}
