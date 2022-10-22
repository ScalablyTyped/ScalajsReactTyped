package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitToHostAdapterObject extends StObject {
  
  /* private */ @JSName("InfoPath.SubmitToHostAdapterObject_typekey")
  var InfoPathDotSubmitToHostAdapterObject_typekey: SubmitToHostAdapterObject
  
  val Name: String
  
  def Query(): Unit
  
  val QueryAllowed: Boolean
  
  def Submit(): Unit
  
  val SubmitAllowed: Boolean
}
object SubmitToHostAdapterObject {
  
  inline def apply(
    InfoPathDotSubmitToHostAdapterObject_typekey: SubmitToHostAdapterObject,
    Name: String,
    Query: Callback,
    QueryAllowed: Boolean,
    Submit: Callback,
    SubmitAllowed: Boolean
  ): SubmitToHostAdapterObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Query = Query.toJsFn, QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = Submit.toJsFn, SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SubmitToHostAdapterObject_typekey")(InfoPathDotSubmitToHostAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitToHostAdapterObject]
  }
  
  extension [Self <: SubmitToHostAdapterObject](x: Self) {
    
    inline def setInfoPathDotSubmitToHostAdapterObject_typekey(value: SubmitToHostAdapterObject): Self = StObject.set(x, "InfoPath.SubmitToHostAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Callback): Self = StObject.set(x, "Query", value.toJsFn)
    
    inline def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: Callback): Self = StObject.set(x, "Submit", value.toJsFn)
    
    inline def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
  }
}
