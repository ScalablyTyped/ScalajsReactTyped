package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ADOAdapterObject extends StObject {
  
  def BuildSQLFromXMLNodes(pXmlNode: IXMLDOMNode): String
  
  var Command: String
  
  var Connection: String
  
  /* private */ @JSName("InfoPath.ADOAdapterObject_typekey")
  var InfoPathDotADOAdapterObject_typekey: ADOAdapterObject
  
  val Name: String
  
  def Query(): Unit
  
  val QueryAllowed: Boolean
  
  def Submit(): Unit
  
  val SubmitAllowed: Boolean
  
  var Timeout: Double
}
object ADOAdapterObject {
  
  inline def apply(
    BuildSQLFromXMLNodes: IXMLDOMNode => String,
    Command: String,
    Connection: String,
    InfoPathDotADOAdapterObject_typekey: ADOAdapterObject,
    Name: String,
    Query: Callback,
    QueryAllowed: Boolean,
    Submit: Callback,
    SubmitAllowed: Boolean,
    Timeout: Double
  ): ADOAdapterObject = {
    val __obj = js.Dynamic.literal(BuildSQLFromXMLNodes = js.Any.fromFunction1(BuildSQLFromXMLNodes), Command = Command.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = Query.toJsFn, QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = Submit.toJsFn, SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.ADOAdapterObject_typekey")(InfoPathDotADOAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADOAdapterObject]
  }
  
  extension [Self <: ADOAdapterObject](x: Self) {
    
    inline def setBuildSQLFromXMLNodes(value: IXMLDOMNode => String): Self = StObject.set(x, "BuildSQLFromXMLNodes", js.Any.fromFunction1(value))
    
    inline def setCommand(value: String): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setConnection(value: String): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotADOAdapterObject_typekey(value: ADOAdapterObject): Self = StObject.set(x, "InfoPath.ADOAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Callback): Self = StObject.set(x, "Query", value.toJsFn)
    
    inline def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: Callback): Self = StObject.set(x, "Submit", value.toJsFn)
    
    inline def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
  }
}
