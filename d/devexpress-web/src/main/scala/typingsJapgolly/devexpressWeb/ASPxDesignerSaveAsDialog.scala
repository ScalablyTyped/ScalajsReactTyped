package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerSaveAsDialog
  extends StObject
     with ASPxDesignerReportDialogBase {
  
  def save(url: String): Unit
}
object ASPxDesignerSaveAsDialog {
  
  inline def apply(
    buttons: js.Array[Any],
    cancel: Callback,
    customize: (String, ASPxDesignerDialogModel) => Callback,
    height: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any,
    model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerDialogModel> */ Any,
    save: String => Callback,
    show: ASPxDesignerNavigateTab => Callback,
    tab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerNavigateTab> */ Any,
    template: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any,
    title: String,
    visible: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    width: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
  ): ASPxDesignerSaveAsDialog = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], cancel = cancel.toJsFn, customize = js.Any.fromFunction2((t0: String, t1: ASPxDesignerDialogModel) => (customize(t0, t1)).runNow()), height = height.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], save = js.Any.fromFunction1((t0: String) => save(t0).runNow()), show = js.Any.fromFunction1((t0: ASPxDesignerNavigateTab) => show(t0).runNow()), tab = tab.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerSaveAsDialog]
  }
  
  extension [Self <: ASPxDesignerSaveAsDialog](x: Self) {
    
    inline def setSave(value: String => Callback): Self = StObject.set(x, "save", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
