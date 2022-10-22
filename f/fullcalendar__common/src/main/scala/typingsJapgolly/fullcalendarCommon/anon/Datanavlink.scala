package typingsJapgolly.fullcalendarCommon.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datanavlink extends StObject {
  
  var `aria-label`: scala.Unit
  
  var `data-navlink`: String
  
  def onClick(ev: UIEvent): scala.Unit
  
  var title: Any
}
object Datanavlink {
  
  inline def apply(`aria-label`: scala.Unit, `data-navlink`: String, onClick: UIEvent => Callback, title: Any): Datanavlink = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: UIEvent) => onClick(t0).runNow()), title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-navlink")(`data-navlink`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datanavlink]
  }
  
  extension [Self <: Datanavlink](x: Self) {
    
    inline def `setAria-label`(value: scala.Unit): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setData-navlink`(value: String): Self = StObject.set(x, "data-navlink", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: UIEvent => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: UIEvent) => value(t0).runNow()))
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
