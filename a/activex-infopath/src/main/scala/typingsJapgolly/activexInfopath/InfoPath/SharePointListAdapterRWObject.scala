package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharePointListAdapterRWObject extends StObject {
  
  var ContentTypeId: String
  
  /* private */ @JSName("InfoPath.SharePointListAdapterRWObject_typekey")
  var InfoPathDotSharePointListAdapterRWObject_typekey: SharePointListAdapterRWObject
  
  var ListId: String
  
  val Name: String
  
  def Query(): Unit
  
  val QueryAllowed: Boolean
  
  var SiteUrl: String
  
  def Submit(): Unit
  
  val SubmitAllowed: Boolean
}
object SharePointListAdapterRWObject {
  
  inline def apply(
    ContentTypeId: String,
    InfoPathDotSharePointListAdapterRWObject_typekey: SharePointListAdapterRWObject,
    ListId: String,
    Name: String,
    Query: Callback,
    QueryAllowed: Boolean,
    SiteUrl: String,
    Submit: Callback,
    SubmitAllowed: Boolean
  ): SharePointListAdapterRWObject = {
    val __obj = js.Dynamic.literal(ContentTypeId = ContentTypeId.asInstanceOf[js.Any], ListId = ListId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = Query.toJsFn, QueryAllowed = QueryAllowed.asInstanceOf[js.Any], SiteUrl = SiteUrl.asInstanceOf[js.Any], Submit = Submit.toJsFn, SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SharePointListAdapterRWObject_typekey")(InfoPathDotSharePointListAdapterRWObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePointListAdapterRWObject]
  }
  
  extension [Self <: SharePointListAdapterRWObject](x: Self) {
    
    inline def setContentTypeId(value: String): Self = StObject.set(x, "ContentTypeId", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotSharePointListAdapterRWObject_typekey(value: SharePointListAdapterRWObject): Self = StObject.set(x, "InfoPath.SharePointListAdapterRWObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setListId(value: String): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Callback): Self = StObject.set(x, "Query", value.toJsFn)
    
    inline def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    inline def setSiteUrl(value: String): Self = StObject.set(x, "SiteUrl", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: Callback): Self = StObject.set(x, "Submit", value.toJsFn)
    
    inline def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
  }
}
