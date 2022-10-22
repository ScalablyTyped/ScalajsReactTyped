package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A selection in the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorSelection extends StObject {
  
  /**
    * Returns an array of the currently selected elements.
    */
  def GetElements(): js.Array[Any]
  
  /**
    * Returns the HTML markup specifying the currently selected ASPxHtmlEditor content.
    */
  def GetHtml(): String
  
  /**
    * Returns a DOM element that relates to the current selection.
    */
  def GetSelectedElement(): Any
  
  /**
    * Returns the text within the currently selected ASPxHtmlEditor content.
    */
  def GetText(): String
  
  /**
    * Sets the new HTML markup in place of the currently selected within ASPxHtmlEditor content.
    * @param html A string value specifying the new HTML markup.
    * @param addToHistory true to add this operation to the history; otherwise, false.
    */
  def SetHtml(html: String, addToHistory: Boolean): Unit
}
object ASPxClientHtmlEditorSelection {
  
  inline def apply(
    GetElements: CallbackTo[js.Array[Any]],
    GetHtml: CallbackTo[String],
    GetSelectedElement: CallbackTo[Any],
    GetText: CallbackTo[String],
    SetHtml: (String, Boolean) => Callback
  ): ASPxClientHtmlEditorSelection = {
    val __obj = js.Dynamic.literal(GetElements = GetElements.toJsFn, GetHtml = GetHtml.toJsFn, GetSelectedElement = GetSelectedElement.toJsFn, GetText = GetText.toJsFn, SetHtml = js.Any.fromFunction2((t0: String, t1: Boolean) => (SetHtml(t0, t1)).runNow()))
    __obj.asInstanceOf[ASPxClientHtmlEditorSelection]
  }
  
  extension [Self <: ASPxClientHtmlEditorSelection](x: Self) {
    
    inline def setGetElements(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "GetElements", value.toJsFn)
    
    inline def setGetHtml(value: CallbackTo[String]): Self = StObject.set(x, "GetHtml", value.toJsFn)
    
    inline def setGetSelectedElement(value: CallbackTo[Any]): Self = StObject.set(x, "GetSelectedElement", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "GetText", value.toJsFn)
    
    inline def setSetHtml(value: (String, Boolean) => Callback): Self = StObject.set(x, "SetHtml", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
