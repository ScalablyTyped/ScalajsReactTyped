package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLSelectionObject extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLSelectionObject_typekey")
  var MSHTMLDotIHTMLSelectionObject_typekey: IHTMLSelectionObject
  
  def clear(): Unit
  
  def createRange(): Any
  
  def empty(): Unit
  
  val `type`: String
}
object IHTMLSelectionObject {
  
  inline def apply(
    MSHTMLDotIHTMLSelectionObject_typekey: IHTMLSelectionObject,
    clear: Callback,
    createRange: CallbackTo[Any],
    empty: Callback,
    `type`: String
  ): IHTMLSelectionObject = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, createRange = createRange.toJsFn, empty = empty.toJsFn)
    __obj.updateDynamic("MSHTML.IHTMLSelectionObject_typekey")(MSHTMLDotIHTMLSelectionObject_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLSelectionObject]
  }
  
  extension [Self <: IHTMLSelectionObject](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setCreateRange(value: CallbackTo[Any]): Self = StObject.set(x, "createRange", value.toJsFn)
    
    inline def setEmpty(value: Callback): Self = StObject.set(x, "empty", value.toJsFn)
    
    inline def setMSHTMLDotIHTMLSelectionObject_typekey(value: IHTMLSelectionObject): Self = StObject.set(x, "MSHTML.IHTMLSelectionObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
