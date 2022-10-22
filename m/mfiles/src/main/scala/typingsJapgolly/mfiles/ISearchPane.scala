package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchPane extends StObject {
  
  val Available: Boolean
  
  val Events: ISearchPaneEvents
  
  def SetTheme(theme: ITheme): Unit
  
  var Visible: Boolean
}
object ISearchPane {
  
  inline def apply(Available: Boolean, Events: ISearchPaneEvents, SetTheme: ITheme => Callback, Visible: Boolean): ISearchPane = {
    val __obj = js.Dynamic.literal(Available = Available.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], SetTheme = js.Any.fromFunction1((t0: ITheme) => SetTheme(t0).runNow()), Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPane]
  }
  
  extension [Self <: ISearchPane](x: Self) {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "Available", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: ISearchPaneEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setSetTheme(value: ITheme => Callback): Self = StObject.set(x, "SetTheme", js.Any.fromFunction1((t0: ITheme) => value(t0).runNow()))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
