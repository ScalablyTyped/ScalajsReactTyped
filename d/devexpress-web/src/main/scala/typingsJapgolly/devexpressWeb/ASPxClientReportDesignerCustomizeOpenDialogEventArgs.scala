package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeOpenDialog event.
  */
trait ASPxClientReportDesignerCustomizeOpenDialogEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Customizes the Open Report dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Open Report dialog.
    */
  def Customize(template: String, model: ASPxDesignerDialogModel): Unit
  
  /**
    * Provides access to the Open Report dialog.
    */
  var Popup: ASPxDesignerOpenDialog
}
object ASPxClientReportDesignerCustomizeOpenDialogEventArgs {
  
  inline def apply(Customize: (String, ASPxDesignerDialogModel) => Callback, Popup: ASPxDesignerOpenDialog): ASPxClientReportDesignerCustomizeOpenDialogEventArgs = {
    val __obj = js.Dynamic.literal(Customize = js.Any.fromFunction2((t0: String, t1: ASPxDesignerDialogModel) => (Customize(t0, t1)).runNow()), Popup = Popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeOpenDialogEventArgs]
  }
  
  extension [Self <: ASPxClientReportDesignerCustomizeOpenDialogEventArgs](x: Self) {
    
    inline def setCustomize(value: (String, ASPxDesignerDialogModel) => Callback): Self = StObject.set(x, "Customize", js.Any.fromFunction2((t0: String, t1: ASPxDesignerDialogModel) => (value(t0, t1)).runNow()))
    
    inline def setPopup(value: ASPxDesignerOpenDialog): Self = StObject.set(x, "Popup", value.asInstanceOf[js.Any])
  }
}
