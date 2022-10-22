package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLPopup extends StObject {
  
  def Hide(): Unit
  
  /* private */ @JSName("MSHTML.HTMLPopup_typekey")
  var MSHTMLDotHTMLPopup_typekey: HTMLPopup
  
  def Show(x: Double, y: Double, w: Double, h: Double, pElement: Any): Unit
  
  val constructor: Any
  
  val document: IHTMLDocument
  
  val isOpen: Boolean
}
object HTMLPopup {
  
  inline def apply(
    Hide: Callback,
    MSHTMLDotHTMLPopup_typekey: HTMLPopup,
    Show: (Double, Double, Double, Double, Any) => Callback,
    constructor: Any,
    document: IHTMLDocument,
    isOpen: Boolean
  ): HTMLPopup = {
    val __obj = js.Dynamic.literal(Hide = Hide.toJsFn, Show = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Any) => (Show(t0, t1, t2, t3, t4)).runNow()), constructor = constructor.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLPopup_typekey")(MSHTMLDotHTMLPopup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPopup]
  }
  
  extension [Self <: HTMLPopup](x: Self) {
    
    inline def setConstructor(value: Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: IHTMLDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setHide(value: Callback): Self = StObject.set(x, "Hide", value.toJsFn)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTMLPopup_typekey(value: HTMLPopup): Self = StObject.set(x, "MSHTML.HTMLPopup_typekey", value.asInstanceOf[js.Any])
    
    inline def setShow(value: (Double, Double, Double, Double, Any) => Callback): Self = StObject.set(x, "Show", js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Any) => (value(t0, t1, t2, t3, t4)).runNow()))
  }
}
