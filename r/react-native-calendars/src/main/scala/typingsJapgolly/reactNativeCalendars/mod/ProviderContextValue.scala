package typingsJapgolly.reactNativeCalendars.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderContextValue extends StObject {
  
  var date: String
  
  var prevDate: String
  
  def setDate(date: String, updateSource: UpdateSource): Unit
  
  def setDisabled(disabled: Boolean): Unit
  
  var updateSource: UpdateSource
}
object ProviderContextValue {
  
  inline def apply(
    date: String,
    prevDate: String,
    setDate: (String, UpdateSource) => Callback,
    setDisabled: Boolean => Callback,
    updateSource: UpdateSource
  ): ProviderContextValue = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], prevDate = prevDate.asInstanceOf[js.Any], setDate = js.Any.fromFunction2((t0: String, t1: UpdateSource) => (setDate(t0, t1)).runNow()), setDisabled = js.Any.fromFunction1((t0: Boolean) => setDisabled(t0).runNow()), updateSource = updateSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderContextValue]
  }
  
  extension [Self <: ProviderContextValue](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setPrevDate(value: String): Self = StObject.set(x, "prevDate", value.asInstanceOf[js.Any])
    
    inline def setSetDate(value: (String, UpdateSource) => Callback): Self = StObject.set(x, "setDate", js.Any.fromFunction2((t0: String, t1: UpdateSource) => (value(t0, t1)).runNow()))
    
    inline def setSetDisabled(value: Boolean => Callback): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setUpdateSource(value: UpdateSource): Self = StObject.set(x, "updateSource", value.asInstanceOf[js.Any])
  }
}
