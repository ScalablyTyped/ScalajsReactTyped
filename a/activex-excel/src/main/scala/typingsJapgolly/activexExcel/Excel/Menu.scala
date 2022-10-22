package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menu extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  var Caption: String
  
  val Creator: XlCreator
  
  def Delete(): Unit
  
  var Enabled: Boolean
  
  /* private */ @JSName("Excel.Menu_typekey")
  var ExcelDotMenu_typekey: Menu
  
  val Index: Double
  
  def MenuItems(Index: Any): Any
  @JSName("MenuItems")
  val MenuItems_Original: MenuItems
  
  val Parent: Any
}
object Menu {
  
  inline def apply(
    Application: Application,
    Caption: String,
    Creator: XlCreator,
    Delete: Callback,
    Enabled: Boolean,
    ExcelDotMenu_typekey: Menu,
    Index: Double,
    MenuItems: MenuItems,
    Parent: Any
  ): Menu = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Enabled = Enabled.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MenuItems = MenuItems.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Menu_typekey")(ExcelDotMenu_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Menu]
  }
  
  extension [Self <: Menu](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setExcelDotMenu_typekey(value: Menu): Self = StObject.set(x, "Excel.Menu_typekey", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setMenuItems(value: MenuItems): Self = StObject.set(x, "MenuItems", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
