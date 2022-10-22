package typingsJapgolly.semanticUiSidebar.anon

import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings._Impl, 'left'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings._Impl>> */
trait PickImplleftPartialPickIm
  extends StObject
     with Param
     with typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings.Param {
  
  var bottom: js.UndefOr[String] = js.undefined
  
  var left: String & js.UndefOr[String]
  
  var right: js.UndefOr[String] = js.undefined
  
  var top: js.UndefOr[String] = js.undefined
}
object PickImplleftPartialPickIm {
  
  inline def apply(left: String & js.UndefOr[String]): PickImplleftPartialPickIm = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplleftPartialPickIm]
  }
  
  extension [Self <: PickImplleftPartialPickIm](x: Self) {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: String & js.UndefOr[String]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
