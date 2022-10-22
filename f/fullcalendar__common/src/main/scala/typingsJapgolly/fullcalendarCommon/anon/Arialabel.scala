package typingsJapgolly.fullcalendarCommon.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arialabel extends StObject {
  
  var `aria-label`: scala.Unit
  
  var `data-navlink`: String
  
  def onClick(ev: UIEvent): scala.Unit
  
  def onKeyDown(ev: KeyboardEvent): scala.Unit
  
  var tabIndex: Double
  
  var title: Any
}
object Arialabel {
  
  inline def apply(
    `aria-label`: scala.Unit,
    `data-navlink`: String,
    onClick: UIEvent => Callback,
    onKeyDown: KeyboardEvent => Callback,
    tabIndex: Double,
    title: Any
  ): Arialabel = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: UIEvent) => onClick(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: KeyboardEvent) => onKeyDown(t0).runNow()), tabIndex = tabIndex.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-navlink")(`data-navlink`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialabel]
  }
  
  extension [Self <: Arialabel](x: Self) {
    
    inline def `setAria-label`(value: scala.Unit): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setData-navlink`(value: String): Self = StObject.set(x, "data-navlink", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: UIEvent => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: UIEvent) => value(t0).runNow()))
    
    inline def setOnKeyDown(value: KeyboardEvent => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
