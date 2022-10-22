package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexAdodb.ADODB.Error
import typingsJapgolly.activexAdodb.ADODB.Errors
import typingsJapgolly.activexMsxml2.MSXML2.IXMLDOMDocument
import typingsJapgolly.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XDocument extends StObject {
  
  def CreateDOM(): IXMLDOMDocument
  
  val DOM: IXMLDOMDocument
  
  val DataAdapters: DataAdaptersCollection
  
  val DataObjects: DataObjectsCollection
  
  def Errors(Index: Any): Error
  @JSName("Errors")
  val Errors_Original: Errors
  
  val Extension: Any
  
  def GetDOM(bstrName: String): IXMLDOMDocument
  
  def GetDataVariable(lVariableNumber: Double): String
  
  def GetNamedNodeProperty(varMainDOMNode: Any, bstrPropertyName: String, bstrDefaultValue: String): String
  
  def ImportDOM(pxDoc: IXMLDOMDocument): Unit
  
  def ImportFile(bstrFileURI: String): Unit
  
  /* private */ @JSName("InfoPath.XDocument_typekey")
  var InfoPathDotXDocument_typekey: XDocument
  
  val IsDOMReadOnly: Boolean
  
  val IsDirty: Boolean
  
  val IsNew: Boolean
  
  val IsReadOnly: Boolean
  
  val IsRecovered: Boolean
  
  val IsSigned: Boolean
  
  var Language: String
  
  def PrintOut(): Unit
  
  def Query(): Unit
  
  val QueryAdapter: Any
  
  var Role: String
  
  def Save(): Unit
  
  def SaveAs(bstrFileUrl: String): Unit
  
  def SetDataVariable(lVariableNumber: Double, bstrVariableValue: String): Unit
  
  def SetDirty(vfIsDirty: Boolean): Unit
  
  def SetNamedNodeProperty(pxmlMainDOMNode: IXMLDOMNode, bstrPropertyName: String, bstrValue: String): Unit
  
  val SignedDataBlocks: SignedDataBlocksCollection
  
  val Solution: SolutionObject
  
  def Submit(): Unit
  
  val UI: typingsJapgolly.activexInfopath.InfoPath.UI
  
  val URI: String
  
  val Util: UtilObject
  
  val View: ViewObject
  
  val ViewInfos: ViewInfosCollection
}
object XDocument {
  
  inline def apply(
    CreateDOM: CallbackTo[IXMLDOMDocument],
    DOM: IXMLDOMDocument,
    DataAdapters: DataAdaptersCollection,
    DataObjects: DataObjectsCollection,
    Errors: Errors,
    Extension: Any,
    GetDOM: String => IXMLDOMDocument,
    GetDataVariable: Double => String,
    GetNamedNodeProperty: (Any, String, String) => String,
    ImportDOM: IXMLDOMDocument => Callback,
    ImportFile: String => Callback,
    InfoPathDotXDocument_typekey: XDocument,
    IsDOMReadOnly: Boolean,
    IsDirty: Boolean,
    IsNew: Boolean,
    IsReadOnly: Boolean,
    IsRecovered: Boolean,
    IsSigned: Boolean,
    Language: String,
    PrintOut: Callback,
    Query: Callback,
    QueryAdapter: Any,
    Role: String,
    Save: Callback,
    SaveAs: String => Callback,
    SetDataVariable: (Double, String) => Callback,
    SetDirty: Boolean => Callback,
    SetNamedNodeProperty: (IXMLDOMNode, String, String) => Callback,
    SignedDataBlocks: SignedDataBlocksCollection,
    Solution: SolutionObject,
    Submit: Callback,
    UI: UI,
    URI: String,
    Util: UtilObject,
    View: ViewObject,
    ViewInfos: ViewInfosCollection
  ): XDocument = {
    val __obj = js.Dynamic.literal(CreateDOM = CreateDOM.toJsFn, DOM = DOM.asInstanceOf[js.Any], DataAdapters = DataAdapters.asInstanceOf[js.Any], DataObjects = DataObjects.asInstanceOf[js.Any], Errors = Errors.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], GetDOM = js.Any.fromFunction1(GetDOM), GetDataVariable = js.Any.fromFunction1(GetDataVariable), GetNamedNodeProperty = js.Any.fromFunction3(GetNamedNodeProperty), ImportDOM = js.Any.fromFunction1((t0: IXMLDOMDocument) => ImportDOM(t0).runNow()), ImportFile = js.Any.fromFunction1((t0: String) => ImportFile(t0).runNow()), IsDOMReadOnly = IsDOMReadOnly.asInstanceOf[js.Any], IsDirty = IsDirty.asInstanceOf[js.Any], IsNew = IsNew.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], IsRecovered = IsRecovered.asInstanceOf[js.Any], IsSigned = IsSigned.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], PrintOut = PrintOut.toJsFn, Query = Query.toJsFn, QueryAdapter = QueryAdapter.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Save = Save.toJsFn, SaveAs = js.Any.fromFunction1((t0: String) => SaveAs(t0).runNow()), SetDataVariable = js.Any.fromFunction2((t0: Double, t1: String) => (SetDataVariable(t0, t1)).runNow()), SetDirty = js.Any.fromFunction1((t0: Boolean) => SetDirty(t0).runNow()), SetNamedNodeProperty = js.Any.fromFunction3((t0: IXMLDOMNode, t1: String, t2: String) => (SetNamedNodeProperty(t0, t1, t2)).runNow()), SignedDataBlocks = SignedDataBlocks.asInstanceOf[js.Any], Solution = Solution.asInstanceOf[js.Any], Submit = Submit.toJsFn, UI = UI.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any], Util = Util.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], ViewInfos = ViewInfos.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.XDocument_typekey")(InfoPathDotXDocument_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDocument]
  }
  
  extension [Self <: XDocument](x: Self) {
    
    inline def setCreateDOM(value: CallbackTo[IXMLDOMDocument]): Self = StObject.set(x, "CreateDOM", value.toJsFn)
    
    inline def setDOM(value: IXMLDOMDocument): Self = StObject.set(x, "DOM", value.asInstanceOf[js.Any])
    
    inline def setDataAdapters(value: DataAdaptersCollection): Self = StObject.set(x, "DataAdapters", value.asInstanceOf[js.Any])
    
    inline def setDataObjects(value: DataObjectsCollection): Self = StObject.set(x, "DataObjects", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: Errors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setExtension(value: Any): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
    
    inline def setGetDOM(value: String => IXMLDOMDocument): Self = StObject.set(x, "GetDOM", js.Any.fromFunction1(value))
    
    inline def setGetDataVariable(value: Double => String): Self = StObject.set(x, "GetDataVariable", js.Any.fromFunction1(value))
    
    inline def setGetNamedNodeProperty(value: (Any, String, String) => String): Self = StObject.set(x, "GetNamedNodeProperty", js.Any.fromFunction3(value))
    
    inline def setImportDOM(value: IXMLDOMDocument => Callback): Self = StObject.set(x, "ImportDOM", js.Any.fromFunction1((t0: IXMLDOMDocument) => value(t0).runNow()))
    
    inline def setImportFile(value: String => Callback): Self = StObject.set(x, "ImportFile", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setInfoPathDotXDocument_typekey(value: XDocument): Self = StObject.set(x, "InfoPath.XDocument_typekey", value.asInstanceOf[js.Any])
    
    inline def setIsDOMReadOnly(value: Boolean): Self = StObject.set(x, "IsDOMReadOnly", value.asInstanceOf[js.Any])
    
    inline def setIsDirty(value: Boolean): Self = StObject.set(x, "IsDirty", value.asInstanceOf[js.Any])
    
    inline def setIsNew(value: Boolean): Self = StObject.set(x, "IsNew", value.asInstanceOf[js.Any])
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "IsReadOnly", value.asInstanceOf[js.Any])
    
    inline def setIsRecovered(value: Boolean): Self = StObject.set(x, "IsRecovered", value.asInstanceOf[js.Any])
    
    inline def setIsSigned(value: Boolean): Self = StObject.set(x, "IsSigned", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setPrintOut(value: Callback): Self = StObject.set(x, "PrintOut", value.toJsFn)
    
    inline def setQuery(value: Callback): Self = StObject.set(x, "Query", value.toJsFn)
    
    inline def setQueryAdapter(value: Any): Self = StObject.set(x, "QueryAdapter", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setSave(value: Callback): Self = StObject.set(x, "Save", value.toJsFn)
    
    inline def setSaveAs(value: String => Callback): Self = StObject.set(x, "SaveAs", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetDataVariable(value: (Double, String) => Callback): Self = StObject.set(x, "SetDataVariable", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetDirty(value: Boolean => Callback): Self = StObject.set(x, "SetDirty", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetNamedNodeProperty(value: (IXMLDOMNode, String, String) => Callback): Self = StObject.set(x, "SetNamedNodeProperty", js.Any.fromFunction3((t0: IXMLDOMNode, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setSignedDataBlocks(value: SignedDataBlocksCollection): Self = StObject.set(x, "SignedDataBlocks", value.asInstanceOf[js.Any])
    
    inline def setSolution(value: SolutionObject): Self = StObject.set(x, "Solution", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: Callback): Self = StObject.set(x, "Submit", value.toJsFn)
    
    inline def setUI(value: UI): Self = StObject.set(x, "UI", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUtil(value: UtilObject): Self = StObject.set(x, "Util", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewObject): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    
    inline def setViewInfos(value: ViewInfosCollection): Self = StObject.set(x, "ViewInfos", value.asInstanceOf[js.Any])
  }
}
