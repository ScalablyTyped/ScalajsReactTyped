package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLFileAdapterObject extends StObject {
  
  var FileURL: String
  
  /* private */ @JSName("InfoPath.XMLFileAdapterObject_typekey")
  var InfoPathDotXMLFileAdapterObject_typekey: XMLFileAdapterObject
  
  val Name: String
  
  def Query(): Unit
  
  val QueryAllowed: Boolean
  
  def Submit(): Unit
  
  val SubmitAllowed: Boolean
}
object XMLFileAdapterObject {
  
  inline def apply(
    FileURL: String,
    InfoPathDotXMLFileAdapterObject_typekey: XMLFileAdapterObject,
    Name: String,
    Query: Callback,
    QueryAllowed: Boolean,
    Submit: Callback,
    SubmitAllowed: Boolean
  ): XMLFileAdapterObject = {
    val __obj = js.Dynamic.literal(FileURL = FileURL.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = Query.toJsFn, QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = Submit.toJsFn, SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.XMLFileAdapterObject_typekey")(InfoPathDotXMLFileAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLFileAdapterObject]
  }
  
  extension [Self <: XMLFileAdapterObject](x: Self) {
    
    inline def setFileURL(value: String): Self = StObject.set(x, "FileURL", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotXMLFileAdapterObject_typekey(value: XMLFileAdapterObject): Self = StObject.set(x, "InfoPath.XMLFileAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Callback): Self = StObject.set(x, "Query", value.toJsFn)
    
    inline def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: Callback): Self = StObject.set(x, "Submit", value.toJsFn)
    
    inline def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
  }
}
