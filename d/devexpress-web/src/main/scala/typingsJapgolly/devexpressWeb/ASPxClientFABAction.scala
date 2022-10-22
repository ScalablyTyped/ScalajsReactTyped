package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the floating action button's action object.
  */
trait ASPxClientFABAction
  extends StObject
     with ASPxClientFABActionItemBase {
  
  /**
    * Gets the FAB action item. Specifies the FAB action item.
    * @param index Specifies the item's index in the collection.
    */
  def GetActionItem(index: Double): ASPxClientFABActionItem
  
  /**
    * Returns an action item with the specified name. An ASPxClientFABActionItem that is the action item with the specified name.
    * @param name A string value specifying the action item name.
    */
  def GetActionItemByName(name: String): ASPxClientFABActionItem
  
  /**
    * Returns the number of items in the action/action group.
    */
  def GetActionItemCount(): Double
  
  /**
    * Gets the FAB action's context name.
    */
  def GetContextName(): String
}
object ASPxClientFABAction {
  
  inline def apply(
    GetActionItem: Double => ASPxClientFABActionItem,
    GetActionItemByName: String => ASPxClientFABActionItem,
    GetActionItemCount: CallbackTo[Double],
    GetActionName: CallbackTo[String],
    GetContextName: CallbackTo[String],
    GetText: CallbackTo[String],
    GetVisible: CallbackTo[Boolean],
    SetText: String => Callback,
    SetVisible: Boolean => Callback
  ): ASPxClientFABAction = {
    val __obj = js.Dynamic.literal(GetActionItem = js.Any.fromFunction1(GetActionItem), GetActionItemByName = js.Any.fromFunction1(GetActionItemByName), GetActionItemCount = GetActionItemCount.toJsFn, GetActionName = GetActionName.toJsFn, GetContextName = GetContextName.toJsFn, GetText = GetText.toJsFn, GetVisible = GetVisible.toJsFn, SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()))
    __obj.asInstanceOf[ASPxClientFABAction]
  }
  
  extension [Self <: ASPxClientFABAction](x: Self) {
    
    inline def setGetActionItem(value: Double => ASPxClientFABActionItem): Self = StObject.set(x, "GetActionItem", js.Any.fromFunction1(value))
    
    inline def setGetActionItemByName(value: String => ASPxClientFABActionItem): Self = StObject.set(x, "GetActionItemByName", js.Any.fromFunction1(value))
    
    inline def setGetActionItemCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetActionItemCount", value.toJsFn)
    
    inline def setGetContextName(value: CallbackTo[String]): Self = StObject.set(x, "GetContextName", value.toJsFn)
  }
}
