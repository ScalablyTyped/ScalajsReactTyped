package typingsJapgolly.winrtUwp.Windows.UI.ApplicationSettings

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables the app to signal when it has finished populating command collections while handling the AccountCommandsRequested event. */
trait AccountsSettingsPaneEventDeferral extends StObject {
  
  /** Signals that the app has finished populating command collections while handling the AccountCommandsRequested event. */
  def complete(): Unit
}
object AccountsSettingsPaneEventDeferral {
  
  inline def apply(complete: Callback): AccountsSettingsPaneEventDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[AccountsSettingsPaneEventDeferral]
  }
  
  extension [Self <: AccountsSettingsPaneEventDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
