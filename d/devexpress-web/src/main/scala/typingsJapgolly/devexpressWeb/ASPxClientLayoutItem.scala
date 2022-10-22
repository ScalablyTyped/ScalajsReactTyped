package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxFormLayout's LayoutItem object.
  */
trait ASPxClientLayoutItem extends StObject {
  
  /**
    * Returns the text displayed in the layout item caption.
    */
  def GetCaption(): String
  
  /**
    * Returns the current layout item's subitem specified by its name. An ASPxClientLayoutItem object that represents the current layout item's subitem with the specified name.
    * @param name A string value specifying the name of the layout item.
    */
  def GetItemByName(name: String): ASPxClientLayoutItem
  
  /**
    * Returns a value specifying whether a layout item is displayed.
    */
  def GetVisible(): Boolean
  
  /**
    * Specifies the text displayed in the layout item caption.
    * @param caption A string value specifying the item caption.
    */
  def SetCaption(caption: String): Unit
  
  /**
    * Specifies the layout item's visibility.
    * @param value true, if the layout item is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit
  
  /**
    * Gets the form layout object to which the current item belongs.
    */
  var formLayout: ASPxClientFormLayout
  
  /**
    * Gets the name that uniquely identifies the layout item.
    */
  var name: String
  
  /**
    * Gets the immediate parent layout item to which the current layout item belongs.
    */
  var parent: ASPxClientLayoutItem
}
object ASPxClientLayoutItem {
  
  inline def apply(
    GetCaption: CallbackTo[String],
    GetItemByName: String => ASPxClientLayoutItem,
    GetVisible: CallbackTo[Boolean],
    SetCaption: String => Callback,
    SetVisible: Boolean => Callback,
    formLayout: ASPxClientFormLayout,
    name: String,
    parent: ASPxClientLayoutItem
  ): ASPxClientLayoutItem = {
    val __obj = js.Dynamic.literal(GetCaption = GetCaption.toJsFn, GetItemByName = js.Any.fromFunction1(GetItemByName), GetVisible = GetVisible.toJsFn, SetCaption = js.Any.fromFunction1((t0: String) => SetCaption(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), formLayout = formLayout.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientLayoutItem]
  }
  
  extension [Self <: ASPxClientLayoutItem](x: Self) {
    
    inline def setFormLayout(value: ASPxClientFormLayout): Self = StObject.set(x, "formLayout", value.asInstanceOf[js.Any])
    
    inline def setGetCaption(value: CallbackTo[String]): Self = StObject.set(x, "GetCaption", value.toJsFn)
    
    inline def setGetItemByName(value: String => ASPxClientLayoutItem): Self = StObject.set(x, "GetItemByName", js.Any.fromFunction1(value))
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetVisible", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ASPxClientLayoutItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setSetCaption(value: String => Callback): Self = StObject.set(x, "SetCaption", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "SetVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
