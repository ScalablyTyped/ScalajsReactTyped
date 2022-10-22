package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveTabIndex extends StObject {
  
  var activeTabIndex: Double
  
  def dangerouslyDisableOnNavigation(): Unit
  
  var event: ReactEventFrom[ReactMouseEventFrom[Element] & Element]
}
object ActiveTabIndex {
  
  inline def apply(
    activeTabIndex: Double,
    dangerouslyDisableOnNavigation: Callback,
    event: ReactEventFrom[ReactMouseEventFrom[Element] & Element]
  ): ActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], dangerouslyDisableOnNavigation = dangerouslyDisableOnNavigation.toJsFn, event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTabIndex]
  }
  
  extension [Self <: ActiveTabIndex](x: Self) {
    
    inline def setActiveTabIndex(value: Double): Self = StObject.set(x, "activeTabIndex", value.asInstanceOf[js.Any])
    
    inline def setDangerouslyDisableOnNavigation(value: Callback): Self = StObject.set(x, "dangerouslyDisableOnNavigation", value.toJsFn)
    
    inline def setEvent(value: ReactEventFrom[ReactMouseEventFrom[Element] & Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
