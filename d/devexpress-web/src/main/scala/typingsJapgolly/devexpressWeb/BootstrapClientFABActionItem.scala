package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the Floating Action Button's BootstrapFABActionItem object.
  */
trait BootstrapClientFABActionItem
  extends StObject
     with ASPxClientFABActionItemBase {
  
  def GetBadgeCssClass(): String
  
  def GetBadgeIconCssClass(): String
  
  def GetBadgeText(): String
  
  def GetIconCssClass(): String
  
  def SetBadgeCssClass(cssClass: String): Unit
  
  def SetBadgeIconCssClass(cssClass: String): Unit
  
  def SetBadgeText(text: String): Unit
  
  def SetIconCssClass(cssClass: String): Unit
}
object BootstrapClientFABActionItem {
  
  inline def apply(
    GetActionName: CallbackTo[String],
    GetBadgeCssClass: CallbackTo[String],
    GetBadgeIconCssClass: CallbackTo[String],
    GetBadgeText: CallbackTo[String],
    GetIconCssClass: CallbackTo[String],
    GetText: CallbackTo[String],
    GetVisible: CallbackTo[Boolean],
    SetBadgeCssClass: String => Callback,
    SetBadgeIconCssClass: String => Callback,
    SetBadgeText: String => Callback,
    SetIconCssClass: String => Callback,
    SetText: String => Callback,
    SetVisible: Boolean => Callback
  ): BootstrapClientFABActionItem = {
    val __obj = js.Dynamic.literal(GetActionName = GetActionName.toJsFn, GetBadgeCssClass = GetBadgeCssClass.toJsFn, GetBadgeIconCssClass = GetBadgeIconCssClass.toJsFn, GetBadgeText = GetBadgeText.toJsFn, GetIconCssClass = GetIconCssClass.toJsFn, GetText = GetText.toJsFn, GetVisible = GetVisible.toJsFn, SetBadgeCssClass = js.Any.fromFunction1((t0: String) => SetBadgeCssClass(t0).runNow()), SetBadgeIconCssClass = js.Any.fromFunction1((t0: String) => SetBadgeIconCssClass(t0).runNow()), SetBadgeText = js.Any.fromFunction1((t0: String) => SetBadgeText(t0).runNow()), SetIconCssClass = js.Any.fromFunction1((t0: String) => SetIconCssClass(t0).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()))
    __obj.asInstanceOf[BootstrapClientFABActionItem]
  }
  
  extension [Self <: BootstrapClientFABActionItem](x: Self) {
    
    inline def setGetBadgeCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeCssClass", value.toJsFn)
    
    inline def setGetBadgeIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeIconCssClass", value.toJsFn)
    
    inline def setGetBadgeText(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeText", value.toJsFn)
    
    inline def setGetIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetIconCssClass", value.toJsFn)
    
    inline def setSetBadgeCssClass(value: String => Callback): Self = StObject.set(x, "SetBadgeCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetBadgeIconCssClass(value: String => Callback): Self = StObject.set(x, "SetBadgeIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetBadgeText(value: String => Callback): Self = StObject.set(x, "SetBadgeText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetIconCssClass(value: String => Callback): Self = StObject.set(x, "SetIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
