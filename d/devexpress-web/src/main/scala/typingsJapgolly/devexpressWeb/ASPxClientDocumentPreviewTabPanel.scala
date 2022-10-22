package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxClientDocumentPreviewTabPanel extends StObject {
  
  var collapsed: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  
  var tabs: js.Array[ASPxClientDocumentPreviewTab]
  
  var width: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
}
object ASPxClientDocumentPreviewTabPanel {
  
  inline def apply(
    collapsed: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    tabs: js.Array[ASPxClientDocumentPreviewTab],
    width: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
  ): ASPxClientDocumentPreviewTabPanel = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDocumentPreviewTabPanel]
  }
  
  extension [Self <: ASPxClientDocumentPreviewTabPanel](x: Self) {
    
    inline def setCollapsed(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setTabs(value: js.Array[ASPxClientDocumentPreviewTab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsVarargs(value: ASPxClientDocumentPreviewTab*): Self = StObject.set(x, "tabs", js.Array(value*))
    
    inline def setWidth(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any
    ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
