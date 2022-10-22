package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardAction extends StObject {
  
  def Activate(): Unit
  
  val Events: IEvents
  
  def GetExplanation(): String
  
  def GetName(): String
  
  def IsEnabled(): Boolean
  
  def IsVisible(): Boolean
}
object IMetadataCardAction {
  
  inline def apply(
    Activate: Callback,
    Events: IEvents,
    GetExplanation: CallbackTo[String],
    GetName: CallbackTo[String],
    IsEnabled: CallbackTo[Boolean],
    IsVisible: CallbackTo[Boolean]
  ): IMetadataCardAction = {
    val __obj = js.Dynamic.literal(Activate = Activate.toJsFn, Events = Events.asInstanceOf[js.Any], GetExplanation = GetExplanation.toJsFn, GetName = GetName.toJsFn, IsEnabled = IsEnabled.toJsFn, IsVisible = IsVisible.toJsFn)
    __obj.asInstanceOf[IMetadataCardAction]
  }
  
  extension [Self <: IMetadataCardAction](x: Self) {
    
    inline def setActivate(value: Callback): Self = StObject.set(x, "Activate", value.toJsFn)
    
    inline def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setGetExplanation(value: CallbackTo[String]): Self = StObject.set(x, "GetExplanation", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "GetName", value.toJsFn)
    
    inline def setIsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsEnabled", value.toJsFn)
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsVisible", value.toJsFn)
  }
}
