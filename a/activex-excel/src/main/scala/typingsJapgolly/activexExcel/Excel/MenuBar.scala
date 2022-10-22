package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuBar extends StObject {
  
  def Activate(): Unit
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  val BuiltIn: Boolean
  
  var Caption: String
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  /* private */ @JSName("Excel.MenuBar_typekey")
  var ExcelDotMenuBar_typekey: MenuBar
  
  val Index: Double
  
  def Menus(Index: Any): Menu
  @JSName("Menus")
  val Menus_Original: Menus
  
  val Parent: Any
  
  def Reset(): Unit
}
object MenuBar {
  
  inline def apply(
    Activate: Callback,
    Application: Application,
    BuiltIn: Boolean,
    Caption: String,
    Creator: XlCreator,
    Delete: Callback,
    ExcelDotMenuBar_typekey: MenuBar,
    Index: Double,
    Menus: Menus,
    Parent: Any,
    Reset: Callback
  ): MenuBar = {
    val __obj = js.Dynamic.literal(Activate = Activate.toJsFn, Application = Application.asInstanceOf[js.Any], BuiltIn = BuiltIn.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Index = Index.asInstanceOf[js.Any], Menus = Menus.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = Reset.toJsFn)
    __obj.updateDynamic("Excel.MenuBar_typekey")(ExcelDotMenuBar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuBar]
  }
  
  extension [Self <: MenuBar](x: Self) {
    
    inline def setActivate(value: Callback): Self = StObject.set(x, "Activate", value.toJsFn)
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBuiltIn(value: Boolean): Self = StObject.set(x, "BuiltIn", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setExcelDotMenuBar_typekey(value: MenuBar): Self = StObject.set(x, "Excel.MenuBar_typekey", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setMenus(value: Menus): Self = StObject.set(x, "Menus", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "Reset", value.toJsFn)
  }
}
