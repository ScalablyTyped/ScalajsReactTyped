package typingsJapgolly.activexInfopath.global.InfoPath

import typingsJapgolly.activexInfopath.InfoPath.XdTaskPaneType
import typingsJapgolly.activexMshtml.MSHTML.IHTMLDocument2
import typingsJapgolly.activexMshtml.MSHTML.IHTMLWindow2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("InfoPath.HTMLTaskPaneObject")
@js.native
/* private */ open class HTMLTaskPaneObject ()
  extends StObject
     with typingsJapgolly.activexInfopath.InfoPath.HTMLTaskPaneObject {
  
  /* CompleteClass */
  override val HTMLDocument: IHTMLDocument2 = js.native
  
  /* CompleteClass */
  override def HTMLWindow(pvarIndex: Any): Any = js.native
  /* CompleteClass */
  @JSName("HTMLWindow")
  override val HTMLWindow_Original: IHTMLWindow2 = js.native
  
  /* private */ /* CompleteClass */
  @JSName("InfoPath.HTMLTaskPaneObject_typekey")
  var InfoPathDotHTMLTaskPaneObject_typekey: typingsJapgolly.activexInfopath.InfoPath.HTMLTaskPaneObject = js.native
  
  /* CompleteClass */
  override def Navigate(bstrURL: String): Unit = js.native
  
  /* CompleteClass */
  override val Type: XdTaskPaneType = js.native
  
  /* CompleteClass */
  var Visible: Boolean = js.native
}
