package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerReportDialogBase extends StObject {
  
  var buttons: js.Array[Any]
  
  def cancel(): Unit
  
  def customize(template: String, model: ASPxDesignerDialogModel): Unit
  
  var height: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
  
  var model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerDialogModel> */ Any
  
  def show(tab: ASPxDesignerNavigateTab): Unit
  
  var tab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerNavigateTab> */ Any
  
  var template: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any
  
  var title: String
  
  var visible: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  
  var width: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
}
object ASPxDesignerReportDialogBase {
  
  inline def apply(
    buttons: js.Array[Any],
    cancel: Callback,
    customize: (String, ASPxDesignerDialogModel) => Callback,
    height: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any,
    model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerDialogModel> */ Any,
    show: ASPxDesignerNavigateTab => Callback,
    tab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerNavigateTab> */ Any,
    template: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any,
    title: String,
    visible: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    width: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
  ): ASPxDesignerReportDialogBase = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], cancel = cancel.toJsFn, customize = js.Any.fromFunction2((t0: String, t1: ASPxDesignerDialogModel) => (customize(t0, t1)).runNow()), height = height.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], show = js.Any.fromFunction1((t0: ASPxDesignerNavigateTab) => show(t0).runNow()), tab = tab.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerReportDialogBase]
  }
  
  extension [Self <: ASPxDesignerReportDialogBase](x: Self) {
    
    inline def setButtons(value: js.Array[Any]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: Any*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setCustomize(value: (String, ASPxDesignerDialogModel) => Callback): Self = StObject.set(x, "customize", js.Any.fromFunction2((t0: String, t1: ASPxDesignerDialogModel) => (value(t0, t1)).runNow()))
    
    inline def setHeight(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
    ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setModel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerDialogModel> */ Any
    ): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setShow(value: ASPxDesignerNavigateTab => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: ASPxDesignerNavigateTab) => value(t0).runNow()))
    
    inline def setTab(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<ASPxDesignerNavigateTab> */ Any
    ): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    inline def setTemplate(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any
    ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVisible(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWidth(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
    ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
