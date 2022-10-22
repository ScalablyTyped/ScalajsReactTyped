package typingsJapgolly.semanticUiSidebar.anon

import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl, 'mobile'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl>> */
trait PickImplmobilePartialPickIos
  extends StObject
     with Param {
  
  var ios: js.UndefOr[js.RegExp] = js.undefined
  
  var mobile: js.RegExp & js.UndefOr[js.RegExp]
}
object PickImplmobilePartialPickIos {
  
  inline def apply(mobile: js.RegExp & js.UndefOr[js.RegExp]): PickImplmobilePartialPickIos = {
    val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmobilePartialPickIos]
  }
  
  extension [Self <: PickImplmobilePartialPickIos](x: Self) {
    
    inline def setIos(value: js.RegExp): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    inline def setMobile(value: js.RegExp & js.UndefOr[js.RegExp]): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
  }
}
