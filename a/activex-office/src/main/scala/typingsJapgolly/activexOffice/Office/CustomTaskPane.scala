package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTaskPane extends StObject {
  
  val Application: Any
  
  val ContentControl: Any
  
  def Delete(): Unit
  
  var DockPosition: MsoCTPDockPosition
  
  var DockPositionRestrict: MsoCTPDockPositionRestrict
  
  var Height: Double
  
  /* private */ @JSName("Office.CustomTaskPane_typekey")
  var OfficeDotCustomTaskPane_typekey: CustomTaskPane
  
  val Title: String
  
  var Visible: Boolean
  
  var Width: Double
  
  val Window: Any
}
object CustomTaskPane {
  
  inline def apply(
    Application: Any,
    ContentControl: Any,
    Delete: Callback,
    DockPosition: MsoCTPDockPosition,
    DockPositionRestrict: MsoCTPDockPositionRestrict,
    Height: Double,
    OfficeDotCustomTaskPane_typekey: CustomTaskPane,
    Title: String,
    Visible: Boolean,
    Width: Double,
    Window: Any
  ): CustomTaskPane = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ContentControl = ContentControl.asInstanceOf[js.Any], Delete = Delete.toJsFn, DockPosition = DockPosition.asInstanceOf[js.Any], DockPositionRestrict = DockPositionRestrict.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], Window = Window.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.CustomTaskPane_typekey")(OfficeDotCustomTaskPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTaskPane]
  }
  
  extension [Self <: CustomTaskPane](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setContentControl(value: Any): Self = StObject.set(x, "ContentControl", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setDockPosition(value: MsoCTPDockPosition): Self = StObject.set(x, "DockPosition", value.asInstanceOf[js.Any])
    
    inline def setDockPositionRestrict(value: MsoCTPDockPositionRestrict): Self = StObject.set(x, "DockPositionRestrict", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotCustomTaskPane_typekey(value: CustomTaskPane): Self = StObject.set(x, "Office.CustomTaskPane_typekey", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: Any): Self = StObject.set(x, "Window", value.asInstanceOf[js.Any])
  }
}
