package typingsJapgolly.semanticUiSidebar.anon

import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings
import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings
import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl, 'computer'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl>> */
trait PickImplcomputerPartialPi
  extends StObject
     with Param {
  
  var computer: ComputerSettings & js.UndefOr[ComputerSettings]
  
  var mobile: js.UndefOr[MobileSettings] = js.undefined
}
object PickImplcomputerPartialPi {
  
  inline def apply(computer: ComputerSettings & js.UndefOr[ComputerSettings]): PickImplcomputerPartialPi = {
    val __obj = js.Dynamic.literal(computer = computer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcomputerPartialPi]
  }
  
  extension [Self <: PickImplcomputerPartialPi](x: Self) {
    
    inline def setComputer(value: ComputerSettings & js.UndefOr[ComputerSettings]): Self = StObject.set(x, "computer", value.asInstanceOf[js.Any])
    
    inline def setMobile(value: MobileSettings): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
  }
}
