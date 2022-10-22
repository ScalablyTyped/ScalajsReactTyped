package typingsJapgolly.jqueryTimeentry

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITimeEntryStatic extends StObject {
  
  var regionalOptions: ITimeEntryLocales
  
  def setDefaults(settings: ITimeEntryOptions): Unit
}
object ITimeEntryStatic {
  
  inline def apply(regionalOptions: ITimeEntryLocales, setDefaults: ITimeEntryOptions => Callback): ITimeEntryStatic = {
    val __obj = js.Dynamic.literal(regionalOptions = regionalOptions.asInstanceOf[js.Any], setDefaults = js.Any.fromFunction1((t0: ITimeEntryOptions) => setDefaults(t0).runNow()))
    __obj.asInstanceOf[ITimeEntryStatic]
  }
  
  extension [Self <: ITimeEntryStatic](x: Self) {
    
    inline def setRegionalOptions(value: ITimeEntryLocales): Self = StObject.set(x, "regionalOptions", value.asInstanceOf[js.Any])
    
    inline def setSetDefaults(value: ITimeEntryOptions => Callback): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1((t0: ITimeEntryOptions) => value(t0).runNow()))
  }
}
