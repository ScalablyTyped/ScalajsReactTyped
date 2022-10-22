package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarButton extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  val BuiltIn: Boolean
  
  var BuiltInFace: Boolean
  
  def Copy(Toolbar: Toolbar, Before: Double): Unit
  
  def CopyFace(): Unit
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  def Edit(): Unit
  
  var Enabled: Boolean
  
  /* private */ @JSName("Excel.ToolbarButton_typekey")
  var ExcelDotToolbarButton_typekey: ToolbarButton
  
  var HelpContextID: Double
  
  var HelpFile: String
  
  val ID: Double
  
  val IsGap: Boolean
  
  def Move(Toolbar: Toolbar, Before: Double): Unit
  
  var Name: String
  
  var OnAction: String
  
  val Parent: Any
  
  def PasteFace(): Unit
  
  var Pushed: Boolean
  
  def Reset(): Unit
  
  var StatusBar: String
  
  var Width: Double
}
object ToolbarButton {
  
  inline def apply(
    Application: Application,
    BuiltIn: Boolean,
    BuiltInFace: Boolean,
    Copy: (Toolbar, Double) => Callback,
    CopyFace: Callback,
    Creator: XlCreator,
    Delete: Callback,
    Edit: Callback,
    Enabled: Boolean,
    ExcelDotToolbarButton_typekey: ToolbarButton,
    HelpContextID: Double,
    HelpFile: String,
    ID: Double,
    IsGap: Boolean,
    Move: (Toolbar, Double) => Callback,
    Name: String,
    OnAction: String,
    Parent: Any,
    PasteFace: Callback,
    Pushed: Boolean,
    Reset: Callback,
    StatusBar: String,
    Width: Double
  ): ToolbarButton = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BuiltIn = BuiltIn.asInstanceOf[js.Any], BuiltInFace = BuiltInFace.asInstanceOf[js.Any], Copy = js.Any.fromFunction2((t0: Toolbar, t1: Double) => (Copy(t0, t1)).runNow()), CopyFace = CopyFace.toJsFn, Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Edit = Edit.toJsFn, Enabled = Enabled.asInstanceOf[js.Any], HelpContextID = HelpContextID.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IsGap = IsGap.asInstanceOf[js.Any], Move = js.Any.fromFunction2((t0: Toolbar, t1: Double) => (Move(t0, t1)).runNow()), Name = Name.asInstanceOf[js.Any], OnAction = OnAction.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PasteFace = PasteFace.toJsFn, Pushed = Pushed.asInstanceOf[js.Any], Reset = Reset.toJsFn, StatusBar = StatusBar.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ToolbarButton_typekey")(ExcelDotToolbarButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarButton]
  }
  
  extension [Self <: ToolbarButton](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBuiltIn(value: Boolean): Self = StObject.set(x, "BuiltIn", value.asInstanceOf[js.Any])
    
    inline def setBuiltInFace(value: Boolean): Self = StObject.set(x, "BuiltInFace", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: (Toolbar, Double) => Callback): Self = StObject.set(x, "Copy", js.Any.fromFunction2((t0: Toolbar, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setCopyFace(value: Callback): Self = StObject.set(x, "CopyFace", value.toJsFn)
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setEdit(value: Callback): Self = StObject.set(x, "Edit", value.toJsFn)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setExcelDotToolbarButton_typekey(value: ToolbarButton): Self = StObject.set(x, "Excel.ToolbarButton_typekey", value.asInstanceOf[js.Any])
    
    inline def setHelpContextID(value: Double): Self = StObject.set(x, "HelpContextID", value.asInstanceOf[js.Any])
    
    inline def setHelpFile(value: String): Self = StObject.set(x, "HelpFile", value.asInstanceOf[js.Any])
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIsGap(value: Boolean): Self = StObject.set(x, "IsGap", value.asInstanceOf[js.Any])
    
    inline def setMove(value: (Toolbar, Double) => Callback): Self = StObject.set(x, "Move", js.Any.fromFunction2((t0: Toolbar, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOnAction(value: String): Self = StObject.set(x, "OnAction", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPasteFace(value: Callback): Self = StObject.set(x, "PasteFace", value.toJsFn)
    
    inline def setPushed(value: Boolean): Self = StObject.set(x, "Pushed", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "Reset", value.toJsFn)
    
    inline def setStatusBar(value: String): Self = StObject.set(x, "StatusBar", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
