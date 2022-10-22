package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexAdodb.ADODB.Error
import typingsJapgolly.activexAdodb.ADODB.Errors
import typingsJapgolly.activexMsxml2.MSXML2.IXMLDOMDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _XDocument extends StObject {
  
  val DOM: IXMLDOMDocument
  
  val DataObjects: DataObjectsCollection
  
  def Errors(Index: Any): Error
  @JSName("Errors")
  val Errors_Original: Errors
  
  val Extension: Any
  
  def GetDOM(bstrName: String): IXMLDOMDocument
  
  def GetDataVariable(lVariableNumber: Double): String
  
  def ImportFile(bstrFileURI: String): Unit
  
  /* private */ @JSName("InfoPath._XDocument_typekey")
  var InfoPathDot_XDocument_typekey: _XDocument
  
  val IsDOMReadOnly: Boolean
  
  val IsDirty: Boolean
  
  val IsNew: Boolean
  
  val IsReadOnly: Boolean
  
  val IsSigned: Boolean
  
  var Language: String
  
  def PrintOut(): Unit
  
  def Query(): Unit
  
  val QueryAdapter: Any
  
  def Save(): Unit
  
  def SaveAs(bstrFileUrl: String): Unit
  
  def SetDataVariable(lVariableNumber: Double, bstrVariableValue: String): Unit
  
  val Solution: SolutionObject
  
  def Submit(): Unit
  
  val UI: typingsJapgolly.activexInfopath.InfoPath.UI
  
  val URI: String
  
  val View: ViewObject
  
  val ViewInfos: ViewInfosCollection
}
object _XDocument {
  
  inline def apply(
    DOM: IXMLDOMDocument,
    DataObjects: DataObjectsCollection,
    Errors: Errors,
    Extension: Any,
    GetDOM: String => IXMLDOMDocument,
    GetDataVariable: Double => String,
    ImportFile: String => Callback,
    InfoPathDot_XDocument_typekey: _XDocument,
    IsDOMReadOnly: Boolean,
    IsDirty: Boolean,
    IsNew: Boolean,
    IsReadOnly: Boolean,
    IsSigned: Boolean,
    Language: String,
    PrintOut: Callback,
    Query: Callback,
    QueryAdapter: Any,
    Save: Callback,
    SaveAs: String => Callback,
    SetDataVariable: (Double, String) => Callback,
    Solution: SolutionObject,
    Submit: Callback,
    UI: UI,
    URI: String,
    View: ViewObject,
    ViewInfos: ViewInfosCollection
  ): _XDocument = {
    val __obj = js.Dynamic.literal(DOM = DOM.asInstanceOf[js.Any], DataObjects = DataObjects.asInstanceOf[js.Any], Errors = Errors.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], GetDOM = js.Any.fromFunction1(GetDOM), GetDataVariable = js.Any.fromFunction1(GetDataVariable), ImportFile = js.Any.fromFunction1((t0: String) => ImportFile(t0).runNow()), IsDOMReadOnly = IsDOMReadOnly.asInstanceOf[js.Any], IsDirty = IsDirty.asInstanceOf[js.Any], IsNew = IsNew.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], IsSigned = IsSigned.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], PrintOut = PrintOut.toJsFn, Query = Query.toJsFn, QueryAdapter = QueryAdapter.asInstanceOf[js.Any], Save = Save.toJsFn, SaveAs = js.Any.fromFunction1((t0: String) => SaveAs(t0).runNow()), SetDataVariable = js.Any.fromFunction2((t0: Double, t1: String) => (SetDataVariable(t0, t1)).runNow()), Solution = Solution.asInstanceOf[js.Any], Submit = Submit.toJsFn, UI = UI.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], ViewInfos = ViewInfos.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath._XDocument_typekey")(InfoPathDot_XDocument_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[_XDocument]
  }
  
  extension [Self <: _XDocument](x: Self) {
    
    inline def setDOM(value: IXMLDOMDocument): Self = StObject.set(x, "DOM", value.asInstanceOf[js.Any])
    
    inline def setDataObjects(value: DataObjectsCollection): Self = StObject.set(x, "DataObjects", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: Errors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setExtension(value: Any): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
    
    inline def setGetDOM(value: String => IXMLDOMDocument): Self = StObject.set(x, "GetDOM", js.Any.fromFunction1(value))
    
    inline def setGetDataVariable(value: Double => String): Self = StObject.set(x, "GetDataVariable", js.Any.fromFunction1(value))
    
    inline def setImportFile(value: String => Callback): Self = StObject.set(x, "ImportFile", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setInfoPathDot_XDocument_typekey(value: _XDocument): Self = StObject.set(x, "InfoPath._XDocument_typekey", value.asInstanceOf[js.Any])
    
    inline def setIsDOMReadOnly(value: Boolean): Self = StObject.set(x, "IsDOMReadOnly", value.asInstanceOf[js.Any])
    
    inline def setIsDirty(value: Boolean): Self = StObject.set(x, "IsDirty", value.asInstanceOf[js.Any])
    
    inline def setIsNew(value: Boolean): Self = StObject.set(x, "IsNew", value.asInstanceOf[js.Any])
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "IsReadOnly", value.asInstanceOf[js.Any])
    
    inline def setIsSigned(value: Boolean): Self = StObject.set(x, "IsSigned", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setPrintOut(value: Callback): Self = StObject.set(x, "PrintOut", value.toJsFn)
    
    inline def setQuery(value: Callback): Self = StObject.set(x, "Query", value.toJsFn)
    
    inline def setQueryAdapter(value: Any): Self = StObject.set(x, "QueryAdapter", value.asInstanceOf[js.Any])
    
    inline def setSave(value: Callback): Self = StObject.set(x, "Save", value.toJsFn)
    
    inline def setSaveAs(value: String => Callback): Self = StObject.set(x, "SaveAs", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetDataVariable(value: (Double, String) => Callback): Self = StObject.set(x, "SetDataVariable", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSolution(value: SolutionObject): Self = StObject.set(x, "Solution", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: Callback): Self = StObject.set(x, "Submit", value.toJsFn)
    
    inline def setUI(value: UI): Self = StObject.set(x, "UI", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewObject): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    
    inline def setViewInfos(value: ViewInfosCollection): Self = StObject.set(x, "ViewInfos", value.asInstanceOf[js.Any])
  }
}
