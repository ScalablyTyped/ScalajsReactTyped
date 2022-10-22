package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.microsoftAjax.Sys.UI.DomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowHeaderState extends StObject {
  
  def GetId(): String
  
  def GetImg(): Image
  
  def GetOnClick(): js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit]
  
  def GetPriority(): RowHeaderStatePriorities
  
  def GetTooltip(): String
}
object RowHeaderState {
  
  inline def apply(
    GetId: CallbackTo[String],
    GetImg: CallbackTo[Image],
    GetOnClick: CallbackTo[js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit]],
    GetPriority: CallbackTo[RowHeaderStatePriorities],
    GetTooltip: CallbackTo[String]
  ): RowHeaderState = {
    val __obj = js.Dynamic.literal(GetId = GetId.toJsFn, GetImg = GetImg.toJsFn, GetOnClick = GetOnClick.toJsFn, GetPriority = GetPriority.toJsFn, GetTooltip = GetTooltip.toJsFn)
    __obj.asInstanceOf[RowHeaderState]
  }
  
  extension [Self <: RowHeaderState](x: Self) {
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "GetId", value.toJsFn)
    
    inline def setGetImg(value: CallbackTo[Image]): Self = StObject.set(x, "GetImg", value.toJsFn)
    
    inline def setGetOnClick(value: CallbackTo[js.Function2[/* eventInfo */ DomEvent, /* recordKey */ Double, Unit]]): Self = StObject.set(x, "GetOnClick", value.toJsFn)
    
    inline def setGetPriority(value: CallbackTo[RowHeaderStatePriorities]): Self = StObject.set(x, "GetPriority", value.toJsFn)
    
    inline def setGetTooltip(value: CallbackTo[String]): Self = StObject.set(x, "GetTooltip", value.toJsFn)
  }
}
