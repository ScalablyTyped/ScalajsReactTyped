package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ribbon's RibbonItemBase object.
  */
trait ASPxClientRibbonItem extends StObject {
  
  /**
    * Returns a value indicating whether a ribbon item is enabled.
    */
  def GetEnabled(): Boolean
  
  /**
    * Returns the item value.
    */
  def GetValue(): Any
  
  /**
    * Returns a value specifying whether a ribbon item is displayed.
    */
  def GetVisible(): Boolean
  
  /**
    * Sets a value specifying whether the item is enabled.
    * @param enabled true to enable the item; false to disable it.
    */
  def SetEnabled(enabled: Boolean): Unit
  
  /**
    * Sets the item value.
    * @param value An  that specifies the item value.
    */
  def SetValue(value: Any): Unit
  
  /**
    * Gets the client group object to which the current item belongs.
    */
  var group: ASPxClientRibbonGroup
  
  /**
    * Gets or sets the item's index within the collection.
    */
  var index: Double
  
  /**
    * Gets the name of the current ribbon item.
    */
  var name: String
  
  /**
    * Gets the client ribbon object to which the current item belongs.
    */
  var ribbon: ASPxClientRibbon
}
object ASPxClientRibbonItem {
  
  inline def apply(
    GetEnabled: CallbackTo[Boolean],
    GetValue: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    SetEnabled: Boolean => Callback,
    SetValue: Any => Callback,
    group: ASPxClientRibbonGroup,
    index: Double,
    name: String,
    ribbon: ASPxClientRibbon
  ): ASPxClientRibbonItem = {
    val __obj = js.Dynamic.literal(GetEnabled = GetEnabled.toJsFn, GetValue = GetValue.toJsFn, GetVisible = GetVisible.toJsFn, SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetValue = js.Any.fromFunction1((t0: Any) => SetValue(t0).runNow()), group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ribbon = ribbon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonItem]
  }
  
  extension [Self <: ASPxClientRibbonItem](x: Self) {
    
    inline def setGetEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetEnabled", value.toJsFn)
    
    inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "GetValue", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetVisible", value.toJsFn)
    
    inline def setGroup(value: ASPxClientRibbonGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRibbon(value: ASPxClientRibbon): Self = StObject.set(x, "ribbon", value.asInstanceOf[js.Any])
    
    inline def setSetEnabled(value: Boolean => Callback): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetValue(value: Any => Callback): Self = StObject.set(x, "SetValue", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
