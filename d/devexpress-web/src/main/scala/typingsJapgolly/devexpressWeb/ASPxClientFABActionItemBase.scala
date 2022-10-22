package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base class for classes that serves as a client-side equivalent of the floating action button's action and action item objects.
  */
trait ASPxClientFABActionItemBase extends StObject {
  
  /**
    * Gets the action item's name.
    */
  def GetActionName(): String
  
  /**
    * Gets the action item's text.
    */
  def GetText(): String
  
  /**
    * Returns a value specifying whether an action item is displayed.
    */
  def GetVisible(): Boolean
  
  /**
    * Specifies the action item's text.
    * @param value A string value that specifies the action item's text.
    */
  def SetText(value: String): Unit
  
  /**
    * Specifies the action item's visibility.
    * @param value true, if the action item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit
}
object ASPxClientFABActionItemBase {
  
  inline def apply(
    GetActionName: CallbackTo[String],
    GetText: CallbackTo[String],
    GetVisible: CallbackTo[Boolean],
    SetText: String => Callback,
    SetVisible: Boolean => Callback
  ): ASPxClientFABActionItemBase = {
    val __obj = js.Dynamic.literal(GetActionName = GetActionName.toJsFn, GetText = GetText.toJsFn, GetVisible = GetVisible.toJsFn, SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()))
    __obj.asInstanceOf[ASPxClientFABActionItemBase]
  }
  
  extension [Self <: ASPxClientFABActionItemBase](x: Self) {
    
    inline def setGetActionName(value: CallbackTo[String]): Self = StObject.set(x, "GetActionName", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "GetText", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetVisible", value.toJsFn)
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "SetText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "SetVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
