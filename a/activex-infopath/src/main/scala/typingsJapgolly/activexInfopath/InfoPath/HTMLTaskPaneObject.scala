package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexMshtml.MSHTML.IHTMLDocument2
import typingsJapgolly.activexMshtml.MSHTML.IHTMLWindow2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLTaskPaneObject extends StObject {
  
  val HTMLDocument: IHTMLDocument2
  
  def HTMLWindow(pvarIndex: Any): Any
  @JSName("HTMLWindow")
  val HTMLWindow_Original: IHTMLWindow2
  
  /* private */ @JSName("InfoPath.HTMLTaskPaneObject_typekey")
  var InfoPathDotHTMLTaskPaneObject_typekey: HTMLTaskPaneObject
  
  def Navigate(bstrURL: String): Unit
  
  val Type: XdTaskPaneType
  
  var Visible: Boolean
}
object HTMLTaskPaneObject {
  
  inline def apply(
    HTMLDocument: IHTMLDocument2,
    HTMLWindow: IHTMLWindow2,
    InfoPathDotHTMLTaskPaneObject_typekey: HTMLTaskPaneObject,
    Navigate: String => Callback,
    Type: XdTaskPaneType,
    Visible: Boolean
  ): HTMLTaskPaneObject = {
    val __obj = js.Dynamic.literal(HTMLDocument = HTMLDocument.asInstanceOf[js.Any], HTMLWindow = HTMLWindow.asInstanceOf[js.Any], Navigate = js.Any.fromFunction1((t0: String) => Navigate(t0).runNow()), Type = Type.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.HTMLTaskPaneObject_typekey")(InfoPathDotHTMLTaskPaneObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLTaskPaneObject]
  }
  
  extension [Self <: HTMLTaskPaneObject](x: Self) {
    
    inline def setHTMLDocument(value: IHTMLDocument2): Self = StObject.set(x, "HTMLDocument", value.asInstanceOf[js.Any])
    
    inline def setHTMLWindow(value: IHTMLWindow2): Self = StObject.set(x, "HTMLWindow", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotHTMLTaskPaneObject_typekey(value: HTMLTaskPaneObject): Self = StObject.set(x, "InfoPath.HTMLTaskPaneObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setNavigate(value: String => Callback): Self = StObject.set(x, "Navigate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setType(value: XdTaskPaneType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
