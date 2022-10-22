package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the Floating Action Button's BootstrapFABAction object.
  */
trait BootstrapClientFABAction
  extends StObject
     with ASPxClientFABAction {
  
  def GetActionIconCssClass(): String
  
  def GetBadgeCssClass(): String
  
  def GetBadgeIconCssClass(): String
  
  def GetBadgeText(): String
  
  def GetCollapseIconCssClass(): String
  
  def GetExpandIconCssClass(): String
  
  def SetActionIconCssClass(cssClass: String): Unit
  
  def SetBadgeCssClass(cssClass: String): Unit
  
  def SetBadgeIconCssClass(cssClass: String): Unit
  
  def SetBadgeText(text: String): Unit
  
  def SetCollapseIconCssClass(cssClass: String): Unit
  
  def SetExpandIconCssClass(cssClass: String): Unit
}
object BootstrapClientFABAction {
  
  inline def apply(
    GetActionIconCssClass: CallbackTo[String],
    GetActionItem: Double => ASPxClientFABActionItem,
    GetActionItemByName: String => ASPxClientFABActionItem,
    GetActionItemCount: CallbackTo[Double],
    GetActionName: CallbackTo[String],
    GetBadgeCssClass: CallbackTo[String],
    GetBadgeIconCssClass: CallbackTo[String],
    GetBadgeText: CallbackTo[String],
    GetCollapseIconCssClass: CallbackTo[String],
    GetContextName: CallbackTo[String],
    GetExpandIconCssClass: CallbackTo[String],
    GetText: CallbackTo[String],
    GetVisible: CallbackTo[Boolean],
    SetActionIconCssClass: String => Callback,
    SetBadgeCssClass: String => Callback,
    SetBadgeIconCssClass: String => Callback,
    SetBadgeText: String => Callback,
    SetCollapseIconCssClass: String => Callback,
    SetExpandIconCssClass: String => Callback,
    SetText: String => Callback,
    SetVisible: Boolean => Callback
  ): BootstrapClientFABAction = {
    val __obj = js.Dynamic.literal(GetActionIconCssClass = GetActionIconCssClass.toJsFn, GetActionItem = js.Any.fromFunction1(GetActionItem), GetActionItemByName = js.Any.fromFunction1(GetActionItemByName), GetActionItemCount = GetActionItemCount.toJsFn, GetActionName = GetActionName.toJsFn, GetBadgeCssClass = GetBadgeCssClass.toJsFn, GetBadgeIconCssClass = GetBadgeIconCssClass.toJsFn, GetBadgeText = GetBadgeText.toJsFn, GetCollapseIconCssClass = GetCollapseIconCssClass.toJsFn, GetContextName = GetContextName.toJsFn, GetExpandIconCssClass = GetExpandIconCssClass.toJsFn, GetText = GetText.toJsFn, GetVisible = GetVisible.toJsFn, SetActionIconCssClass = js.Any.fromFunction1((t0: String) => SetActionIconCssClass(t0).runNow()), SetBadgeCssClass = js.Any.fromFunction1((t0: String) => SetBadgeCssClass(t0).runNow()), SetBadgeIconCssClass = js.Any.fromFunction1((t0: String) => SetBadgeIconCssClass(t0).runNow()), SetBadgeText = js.Any.fromFunction1((t0: String) => SetBadgeText(t0).runNow()), SetCollapseIconCssClass = js.Any.fromFunction1((t0: String) => SetCollapseIconCssClass(t0).runNow()), SetExpandIconCssClass = js.Any.fromFunction1((t0: String) => SetExpandIconCssClass(t0).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()))
    __obj.asInstanceOf[BootstrapClientFABAction]
  }
  
  extension [Self <: BootstrapClientFABAction](x: Self) {
    
    inline def setGetActionIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetActionIconCssClass", value.toJsFn)
    
    inline def setGetBadgeCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeCssClass", value.toJsFn)
    
    inline def setGetBadgeIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeIconCssClass", value.toJsFn)
    
    inline def setGetBadgeText(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeText", value.toJsFn)
    
    inline def setGetCollapseIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetCollapseIconCssClass", value.toJsFn)
    
    inline def setGetExpandIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetExpandIconCssClass", value.toJsFn)
    
    inline def setSetActionIconCssClass(value: String => Callback): Self = StObject.set(x, "SetActionIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetBadgeCssClass(value: String => Callback): Self = StObject.set(x, "SetBadgeCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetBadgeIconCssClass(value: String => Callback): Self = StObject.set(x, "SetBadgeIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetBadgeText(value: String => Callback): Self = StObject.set(x, "SetBadgeText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetCollapseIconCssClass(value: String => Callback): Self = StObject.set(x, "SetCollapseIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetExpandIconCssClass(value: String => Callback): Self = StObject.set(x, "SetExpandIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
