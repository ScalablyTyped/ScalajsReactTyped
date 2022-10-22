package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardOption extends StObject {
  
  val Events: IEvents
  
  def GetExplanation(): String
  
  def GetName(): String
  
  def GetOptionValue(): Any
  
  def IsEnabled(): Boolean
  
  def IsVisible(): Boolean
  
  def SetOptionValue(value: Any): Unit
}
object IMetadataCardOption {
  
  inline def apply(
    Events: IEvents,
    GetExplanation: CallbackTo[String],
    GetName: CallbackTo[String],
    GetOptionValue: CallbackTo[Any],
    IsEnabled: CallbackTo[Boolean],
    IsVisible: CallbackTo[Boolean],
    SetOptionValue: Any => Callback
  ): IMetadataCardOption = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], GetExplanation = GetExplanation.toJsFn, GetName = GetName.toJsFn, GetOptionValue = GetOptionValue.toJsFn, IsEnabled = IsEnabled.toJsFn, IsVisible = IsVisible.toJsFn, SetOptionValue = js.Any.fromFunction1((t0: Any) => SetOptionValue(t0).runNow()))
    __obj.asInstanceOf[IMetadataCardOption]
  }
  
  extension [Self <: IMetadataCardOption](x: Self) {
    
    inline def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setGetExplanation(value: CallbackTo[String]): Self = StObject.set(x, "GetExplanation", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "GetName", value.toJsFn)
    
    inline def setGetOptionValue(value: CallbackTo[Any]): Self = StObject.set(x, "GetOptionValue", value.toJsFn)
    
    inline def setIsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsEnabled", value.toJsFn)
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsVisible", value.toJsFn)
    
    inline def setSetOptionValue(value: Any => Callback): Self = StObject.set(x, "SetOptionValue", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
