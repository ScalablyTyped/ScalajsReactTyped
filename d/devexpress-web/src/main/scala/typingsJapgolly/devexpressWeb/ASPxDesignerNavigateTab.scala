package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerNavigateTab extends StObject {
  
  var displayName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ Any
  
  var isModified: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  
  def refresh(): Unit
  
  var report: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
  
  def resetIsModified(): Unit
  
  var undoEngine: ASPxDesignerUndoEngine
  
  var url: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any
}
object ASPxDesignerNavigateTab {
  
  inline def apply(
    displayName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ Any,
    isModified: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    refresh: Callback,
    report: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any,
    resetIsModified: Callback,
    undoEngine: ASPxDesignerUndoEngine,
    url: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any
  ): ASPxDesignerNavigateTab = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], refresh = refresh.toJsFn, report = report.asInstanceOf[js.Any], resetIsModified = resetIsModified.toJsFn, undoEngine = undoEngine.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerNavigateTab]
  }
  
  extension [Self <: ASPxDesignerNavigateTab](x: Self) {
    
    inline def setDisplayName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ Any
    ): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIsModified(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setReport(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
    ): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setResetIsModified(value: Callback): Self = StObject.set(x, "resetIsModified", value.toJsFn)
    
    inline def setUndoEngine(value: ASPxDesignerUndoEngine): Self = StObject.set(x, "undoEngine", value.asInstanceOf[js.Any])
    
    inline def setUrl(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
