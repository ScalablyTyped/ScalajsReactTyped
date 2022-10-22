package typingsJapgolly.semanticUiSidebar.anon

import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl, 'omitted'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl>> */
trait PickImplomittedPartialPic
  extends StObject
     with Param {
  
  var fixed: js.UndefOr[String] = js.undefined
  
  var omitted: String & js.UndefOr[String]
  
  var pusher: js.UndefOr[String] = js.undefined
  
  var sidebar: js.UndefOr[String] = js.undefined
}
object PickImplomittedPartialPic {
  
  inline def apply(omitted: String & js.UndefOr[String]): PickImplomittedPartialPic = {
    val __obj = js.Dynamic.literal(omitted = omitted.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplomittedPartialPic]
  }
  
  extension [Self <: PickImplomittedPartialPic](x: Self) {
    
    inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setOmitted(value: String & js.UndefOr[String]): Self = StObject.set(x, "omitted", value.asInstanceOf[js.Any])
    
    inline def setPusher(value: String): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
    
    inline def setPusherUndefined: Self = StObject.set(x, "pusher", js.undefined)
    
    inline def setSidebar(value: String): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
    
    inline def setSidebarUndefined: Self = StObject.set(x, "sidebar", js.undefined)
  }
}
