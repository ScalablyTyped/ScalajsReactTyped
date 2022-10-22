package typingsJapgolly.semanticUiSidebar.anon

import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings._Impl, 'right'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings._Impl>> */
trait PickImplrightPartialPickI
  extends StObject
     with Param
     with typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings.Param {
  
  var bottom: js.UndefOr[String] = js.undefined
  
  var left: js.UndefOr[String] = js.undefined
  
  var right: String & js.UndefOr[String]
  
  var top: js.UndefOr[String] = js.undefined
}
object PickImplrightPartialPickI {
  
  inline def apply(right: String & js.UndefOr[String]): PickImplrightPartialPickI = {
    val __obj = js.Dynamic.literal(right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrightPartialPickI]
  }
  
  extension [Self <: PickImplrightPartialPickI](x: Self) {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: String & js.UndefOr[String]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
