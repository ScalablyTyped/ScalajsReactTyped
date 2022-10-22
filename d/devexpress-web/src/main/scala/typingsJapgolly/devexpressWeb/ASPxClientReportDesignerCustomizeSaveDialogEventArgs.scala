package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeSaveDialog event.
  */
trait ASPxClientReportDesignerCustomizeSaveDialogEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Customizes the Save dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Save dialog.
    */
  def Customize(template: String, model: ASPxDesignerDialogModel): Unit
  
  /**
    * Provides access to the Save dialog.
    */
  var Popup: ASPxDesignerSaveDialog
}
object ASPxClientReportDesignerCustomizeSaveDialogEventArgs {
  
  inline def apply(Customize: (String, ASPxDesignerDialogModel) => Callback, Popup: ASPxDesignerSaveDialog): ASPxClientReportDesignerCustomizeSaveDialogEventArgs = {
    val __obj = js.Dynamic.literal(Customize = js.Any.fromFunction2((t0: String, t1: ASPxDesignerDialogModel) => (Customize(t0, t1)).runNow()), Popup = Popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeSaveDialogEventArgs]
  }
  
  extension [Self <: ASPxClientReportDesignerCustomizeSaveDialogEventArgs](x: Self) {
    
    inline def setCustomize(value: (String, ASPxDesignerDialogModel) => Callback): Self = StObject.set(x, "Customize", js.Any.fromFunction2((t0: String, t1: ASPxDesignerDialogModel) => (value(t0, t1)).runNow()))
    
    inline def setPopup(value: ASPxDesignerSaveDialog): Self = StObject.set(x, "Popup", value.asInstanceOf[js.Any])
  }
}
