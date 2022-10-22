package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XmlDataBinding extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  def ClearSettings(): Unit
  
  val Creator: XlCreator
  
  /* private */ @JSName("Excel.XmlDataBinding_typekey")
  var ExcelDotXmlDataBinding_typekey: XmlDataBinding
  
  def LoadSettings(Url: String): Unit
  
  val Parent: Any
  
  def Refresh(): XlXmlImportResult
  
  val SourceUrl: String
  
  val _Default: String
}
object XmlDataBinding {
  
  inline def apply(
    Application: Application,
    ClearSettings: Callback,
    Creator: XlCreator,
    ExcelDotXmlDataBinding_typekey: XmlDataBinding,
    LoadSettings: String => Callback,
    Parent: Any,
    Refresh: CallbackTo[XlXmlImportResult],
    SourceUrl: String,
    _Default: String
  ): XmlDataBinding = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClearSettings = ClearSettings.toJsFn, Creator = Creator.asInstanceOf[js.Any], LoadSettings = js.Any.fromFunction1((t0: String) => LoadSettings(t0).runNow()), Parent = Parent.asInstanceOf[js.Any], Refresh = Refresh.toJsFn, SourceUrl = SourceUrl.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.XmlDataBinding_typekey")(ExcelDotXmlDataBinding_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlDataBinding]
  }
  
  extension [Self <: XmlDataBinding](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClearSettings(value: Callback): Self = StObject.set(x, "ClearSettings", value.toJsFn)
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExcelDotXmlDataBinding_typekey(value: XmlDataBinding): Self = StObject.set(x, "Excel.XmlDataBinding_typekey", value.asInstanceOf[js.Any])
    
    inline def setLoadSettings(value: String => Callback): Self = StObject.set(x, "LoadSettings", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: CallbackTo[XlXmlImportResult]): Self = StObject.set(x, "Refresh", value.toJsFn)
    
    inline def setSourceUrl(value: String): Self = StObject.set(x, "SourceUrl", value.asInstanceOf[js.Any])
    
    inline def set_Default(value: String): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
