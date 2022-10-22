package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** For Macintosh only */
trait IFind extends StObject {
  
  var Author: String
  
  var DateCreatedFrom: Any
  
  var DateCreatedTo: Any
  
  var DateSavedFrom: Any
  
  var DateSavedTo: Any
  
  def Delete(bstrQueryName: String): Unit
  
  def Execute(): Unit
  
  var FileType: Double
  
  var Keywords: String
  
  var ListBy: MsoFileFindListBy
  
  def Load(bstrQueryName: String): Unit
  
  var MatchCase: Boolean
  
  var Name: String
  
  /* private */ @JSName("Office.IFind_typekey")
  var OfficeDotIFind_typekey: IFind
  
  var Options: MsoFileFindOptions
  
  var PatternMatch: Boolean
  
  def Results(Index: Double): String
  @JSName("Results")
  val Results_Original: IFoundFiles
  
  def Save(bstrQueryName: String): Unit
  
  var SavedBy: String
  
  var SearchPath: String
  
  var SelectedFile: Double
  
  def Show(): Double
  
  var SortBy: MsoFileFindSortBy
  
  var SubDir: Boolean
  
  var Subject: String
  
  var Text: String
  
  var Title: String
  
  var View: MsoFileFindView
}
object IFind {
  
  inline def apply(
    Author: String,
    DateCreatedFrom: Any,
    DateCreatedTo: Any,
    DateSavedFrom: Any,
    DateSavedTo: Any,
    Delete: String => Callback,
    Execute: Callback,
    FileType: Double,
    Keywords: String,
    ListBy: MsoFileFindListBy,
    Load: String => Callback,
    MatchCase: Boolean,
    Name: String,
    OfficeDotIFind_typekey: IFind,
    Options: MsoFileFindOptions,
    PatternMatch: Boolean,
    Results: IFoundFiles,
    Save: String => Callback,
    SavedBy: String,
    SearchPath: String,
    SelectedFile: Double,
    Show: CallbackTo[Double],
    SortBy: MsoFileFindSortBy,
    SubDir: Boolean,
    Subject: String,
    Text: String,
    Title: String,
    View: MsoFileFindView
  ): IFind = {
    val __obj = js.Dynamic.literal(Author = Author.asInstanceOf[js.Any], DateCreatedFrom = DateCreatedFrom.asInstanceOf[js.Any], DateCreatedTo = DateCreatedTo.asInstanceOf[js.Any], DateSavedFrom = DateSavedFrom.asInstanceOf[js.Any], DateSavedTo = DateSavedTo.asInstanceOf[js.Any], Delete = js.Any.fromFunction1((t0: String) => Delete(t0).runNow()), Execute = Execute.toJsFn, FileType = FileType.asInstanceOf[js.Any], Keywords = Keywords.asInstanceOf[js.Any], ListBy = ListBy.asInstanceOf[js.Any], Load = js.Any.fromFunction1((t0: String) => Load(t0).runNow()), MatchCase = MatchCase.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], PatternMatch = PatternMatch.asInstanceOf[js.Any], Results = Results.asInstanceOf[js.Any], Save = js.Any.fromFunction1((t0: String) => Save(t0).runNow()), SavedBy = SavedBy.asInstanceOf[js.Any], SearchPath = SearchPath.asInstanceOf[js.Any], SelectedFile = SelectedFile.asInstanceOf[js.Any], Show = Show.toJsFn, SortBy = SortBy.asInstanceOf[js.Any], SubDir = SubDir.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IFind_typekey")(OfficeDotIFind_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFind]
  }
  
  extension [Self <: IFind](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedFrom(value: Any): Self = StObject.set(x, "DateCreatedFrom", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedTo(value: Any): Self = StObject.set(x, "DateCreatedTo", value.asInstanceOf[js.Any])
    
    inline def setDateSavedFrom(value: Any): Self = StObject.set(x, "DateSavedFrom", value.asInstanceOf[js.Any])
    
    inline def setDateSavedTo(value: Any): Self = StObject.set(x, "DateSavedTo", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: String => Callback): Self = StObject.set(x, "Delete", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setExecute(value: Callback): Self = StObject.set(x, "Execute", value.toJsFn)
    
    inline def setFileType(value: Double): Self = StObject.set(x, "FileType", value.asInstanceOf[js.Any])
    
    inline def setKeywords(value: String): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    inline def setListBy(value: MsoFileFindListBy): Self = StObject.set(x, "ListBy", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: String => Callback): Self = StObject.set(x, "Load", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setMatchCase(value: Boolean): Self = StObject.set(x, "MatchCase", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotIFind_typekey(value: IFind): Self = StObject.set(x, "Office.IFind_typekey", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: MsoFileFindOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setPatternMatch(value: Boolean): Self = StObject.set(x, "PatternMatch", value.asInstanceOf[js.Any])
    
    inline def setResults(value: IFoundFiles): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setSave(value: String => Callback): Self = StObject.set(x, "Save", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSavedBy(value: String): Self = StObject.set(x, "SavedBy", value.asInstanceOf[js.Any])
    
    inline def setSearchPath(value: String): Self = StObject.set(x, "SearchPath", value.asInstanceOf[js.Any])
    
    inline def setSelectedFile(value: Double): Self = StObject.set(x, "SelectedFile", value.asInstanceOf[js.Any])
    
    inline def setShow(value: CallbackTo[Double]): Self = StObject.set(x, "Show", value.toJsFn)
    
    inline def setSortBy(value: MsoFileFindSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSubDir(value: Boolean): Self = StObject.set(x, "SubDir", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setView(value: MsoFileFindView): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
  }
}
