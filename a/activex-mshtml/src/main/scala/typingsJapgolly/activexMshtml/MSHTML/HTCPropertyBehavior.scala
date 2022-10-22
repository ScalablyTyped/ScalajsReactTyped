package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTCPropertyBehavior extends StObject {
  
  /* private */ @JSName("MSHTML.HTCPropertyBehavior_typekey")
  var MSHTMLDotHTCPropertyBehavior_typekey: HTCPropertyBehavior
  
  def fireChange(): Unit
  
  var value: Any
}
object HTCPropertyBehavior {
  
  inline def apply(MSHTMLDotHTCPropertyBehavior_typekey: HTCPropertyBehavior, fireChange: Callback, value: Any): HTCPropertyBehavior = {
    val __obj = js.Dynamic.literal(fireChange = fireChange.toJsFn, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTCPropertyBehavior_typekey")(MSHTMLDotHTCPropertyBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCPropertyBehavior]
  }
  
  extension [Self <: HTCPropertyBehavior](x: Self) {
    
    inline def setFireChange(value: Callback): Self = StObject.set(x, "fireChange", value.toJsFn)
    
    inline def setMSHTMLDotHTCPropertyBehavior_typekey(value: HTCPropertyBehavior): Self = StObject.set(x, "MSHTML.HTCPropertyBehavior_typekey", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
