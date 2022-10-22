package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerSaveDialog
  extends StObject
     with ASPxDesignerReportDialogBase {
  
  def notSave(): Unit
  
  def save(url: String): Unit
  
  var saveReportDialog: ASPxDesignerSaveAsDialog
}
object ASPxDesignerSaveDialog {
  
  inline def apply(
    buttons: js.Array[Any],
    cancel: Callback,
    customize: (String, ASPxDesignerDialogModel) => Callback,
    height: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any,
    model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerDialogModel> */ Any,
    notSave: Callback,
    save: String => Callback,
    saveReportDialog: ASPxDesignerSaveAsDialog,
    show: ASPxDesignerNavigateTab => Callback,
    tab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerNavigateTab> */ Any,
    template: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any,
    title: String,
    visible: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    width: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
  ): ASPxDesignerSaveDialog = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], cancel = cancel.toJsFn, customize = js.Any.fromFunction2((t0: String, t1: ASPxDesignerDialogModel) => (customize(t0, t1)).runNow()), height = height.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], notSave = notSave.toJsFn, save = js.Any.fromFunction1((t0: String) => save(t0).runNow()), saveReportDialog = saveReportDialog.asInstanceOf[js.Any], show = js.Any.fromFunction1((t0: ASPxDesignerNavigateTab) => show(t0).runNow()), tab = tab.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerSaveDialog]
  }
  
  extension [Self <: ASPxDesignerSaveDialog](x: Self) {
    
    inline def setNotSave(value: Callback): Self = StObject.set(x, "notSave", value.toJsFn)
    
    inline def setSave(value: String => Callback): Self = StObject.set(x, "save", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSaveReportDialog(value: ASPxDesignerSaveAsDialog): Self = StObject.set(x, "saveReportDialog", value.asInstanceOf[js.Any])
  }
}
