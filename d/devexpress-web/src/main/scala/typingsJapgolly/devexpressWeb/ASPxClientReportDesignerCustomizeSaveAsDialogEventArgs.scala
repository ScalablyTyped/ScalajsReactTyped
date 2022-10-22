package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeSaveAsDialog event.
  */
trait ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Customizes the Save Report dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model A model of the Save Report dialog.
    */
  def Customize(template: String, model: ASPxDesignerDialogModel): Unit
  
  /**
    * Provides access to the Save Report dialog.
    */
  var Popup: ASPxDesignerSaveAsDialog
}
object ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs {
  
  inline def apply(Customize: (String, ASPxDesignerDialogModel) => Callback, Popup: ASPxDesignerSaveAsDialog): ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs = {
    val __obj = js.Dynamic.literal(Customize = js.Any.fromFunction2((t0: String, t1: ASPxDesignerDialogModel) => (Customize(t0, t1)).runNow()), Popup = Popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs]
  }
  
  extension [Self <: ASPxClientReportDesignerCustomizeSaveAsDialogEventArgs](x: Self) {
    
    inline def setCustomize(value: (String, ASPxDesignerDialogModel) => Callback): Self = StObject.set(x, "Customize", js.Any.fromFunction2((t0: String, t1: ASPxDesignerDialogModel) => (value(t0, t1)).runNow()))
    
    inline def setPopup(value: ASPxDesignerSaveAsDialog): Self = StObject.set(x, "Popup", value.asInstanceOf[js.Any])
  }
}
