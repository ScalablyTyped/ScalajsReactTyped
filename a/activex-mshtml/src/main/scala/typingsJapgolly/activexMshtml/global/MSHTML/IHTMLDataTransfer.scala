package typingsJapgolly.activexMshtml.global.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.IHTMLDataTransfer")
@js.native
/* private */ open class IHTMLDataTransfer ()
  extends StObject
     with typingsJapgolly.activexMshtml.MSHTML.IHTMLDataTransfer {
  
  /* private */ /* CompleteClass */
  @JSName("MSHTML.IHTMLDataTransfer_typekey")
  var MSHTMLDotIHTMLDataTransfer_typekey: typingsJapgolly.activexMshtml.MSHTML.IHTMLDataTransfer = js.native
  
  /* CompleteClass */
  override def clearData(format: String): Boolean = js.native
  
  /* CompleteClass */
  var dropEffect: String = js.native
  
  /* CompleteClass */
  var effectAllowed: String = js.native
  
  /* CompleteClass */
  override def getData(format: String): Any = js.native
  
  /* CompleteClass */
  override def setData(format: String, data: Any): Boolean = js.native
}
