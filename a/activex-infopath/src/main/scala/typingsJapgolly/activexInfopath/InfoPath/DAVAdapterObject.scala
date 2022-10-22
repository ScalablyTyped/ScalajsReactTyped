package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DAVAdapterObject extends StObject {
  
  var FileName: String
  
  var FolderURL: String
  
  /* private */ @JSName("InfoPath.DAVAdapterObject_typekey")
  var InfoPathDotDAVAdapterObject_typekey: DAVAdapterObject
  
  val Name: String
  
  def Query(): Unit
  
  val QueryAllowed: Boolean
  
  def Submit(): Unit
  
  val SubmitAllowed: Boolean
  
  def SubmitData(pData: IXMLDOMNode): Unit
}
object DAVAdapterObject {
  
  inline def apply(
    FileName: String,
    FolderURL: String,
    InfoPathDotDAVAdapterObject_typekey: DAVAdapterObject,
    Name: String,
    Query: Callback,
    QueryAllowed: Boolean,
    Submit: Callback,
    SubmitAllowed: Boolean,
    SubmitData: IXMLDOMNode => Callback
  ): DAVAdapterObject = {
    val __obj = js.Dynamic.literal(FileName = FileName.asInstanceOf[js.Any], FolderURL = FolderURL.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = Query.toJsFn, QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = Submit.toJsFn, SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any], SubmitData = js.Any.fromFunction1((t0: IXMLDOMNode) => SubmitData(t0).runNow()))
    __obj.updateDynamic("InfoPath.DAVAdapterObject_typekey")(InfoPathDotDAVAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DAVAdapterObject]
  }
  
  extension [Self <: DAVAdapterObject](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
    
    inline def setFolderURL(value: String): Self = StObject.set(x, "FolderURL", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotDAVAdapterObject_typekey(value: DAVAdapterObject): Self = StObject.set(x, "InfoPath.DAVAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Callback): Self = StObject.set(x, "Query", value.toJsFn)
    
    inline def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: Callback): Self = StObject.set(x, "Submit", value.toJsFn)
    
    inline def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
    
    inline def setSubmitData(value: IXMLDOMNode => Callback): Self = StObject.set(x, "SubmitData", js.Any.fromFunction1((t0: IXMLDOMNode) => value(t0).runNow()))
  }
}
