package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.a
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import typingsJapgolly.reactBulmaComponents.srcComponentsPanelMod.PanelTabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tab extends StObject {
  
  var Tab: BulmaComponent[PanelTabProps, a]
}
object Tab {
  
  inline def apply(Tab: /* props */ PanelTabProps & (ElementProps[PanelTabProps, a]) => Element): Tab = {
    val __obj = js.Dynamic.literal(Tab = js.Any.fromFunction1(Tab))
    __obj.asInstanceOf[Tab]
  }
  
  extension [Self <: Tab](x: Self) {
    
    inline def setTab(value: /* props */ PanelTabProps & (ElementProps[PanelTabProps, a]) => Element): Self = StObject.set(x, "Tab", js.Any.fromFunction1(value))
  }
}
