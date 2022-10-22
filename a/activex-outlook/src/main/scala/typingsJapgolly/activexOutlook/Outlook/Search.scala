package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Search extends StObject {
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Filter: String
  
  def GetTable(): Table
  
  val IsSynchronous: Boolean
  
  /* private */ @JSName("Outlook.Search_typekey")
  var OutlookDotSearch_typekey: Search
  
  val Parent: Any
  
  val Results: typingsJapgolly.activexOutlook.Outlook.Results
  
  def Save(Name: String): Folder
  
  val Scope: String
  
  val SearchSubFolders: Boolean
  
  val Session: NameSpace
  
  def Stop(): Unit
  
  val Tag: String
}
object Search {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Filter: String,
    GetTable: CallbackTo[Table],
    IsSynchronous: Boolean,
    OutlookDotSearch_typekey: Search,
    Parent: Any,
    Results: Results,
    Save: String => Folder,
    Scope: String,
    SearchSubFolders: Boolean,
    Session: NameSpace,
    Stop: Callback,
    Tag: String
  ): Search = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], GetTable = GetTable.toJsFn, IsSynchronous = IsSynchronous.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Results = Results.asInstanceOf[js.Any], Save = js.Any.fromFunction1(Save), Scope = Scope.asInstanceOf[js.Any], SearchSubFolders = SearchSubFolders.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Stop = Stop.toJsFn, Tag = Tag.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Search_typekey")(OutlookDotSearch_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Search]
  }
  
  extension [Self <: Search](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setGetTable(value: CallbackTo[Table]): Self = StObject.set(x, "GetTable", value.toJsFn)
    
    inline def setIsSynchronous(value: Boolean): Self = StObject.set(x, "IsSynchronous", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotSearch_typekey(value: Search): Self = StObject.set(x, "Outlook.Search_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setResults(value: Results): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setSave(value: String => Folder): Self = StObject.set(x, "Save", js.Any.fromFunction1(value))
    
    inline def setScope(value: String): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setSearchSubFolders(value: Boolean): Self = StObject.set(x, "SearchSubFolders", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Callback): Self = StObject.set(x, "Stop", value.toJsFn)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
  }
}
