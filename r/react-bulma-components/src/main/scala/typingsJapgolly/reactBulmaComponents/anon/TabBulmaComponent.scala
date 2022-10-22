package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.a
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import typingsJapgolly.reactBulmaComponents.srcComponentsTabsMod.TabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabBulmaComponent extends StObject {
  
  var Tab: BulmaComponent[TabProps, a]
}
object TabBulmaComponent {
  
  inline def apply(Tab: /* props */ TabProps & (ElementProps[TabProps, a]) => Element): TabBulmaComponent = {
    val __obj = js.Dynamic.literal(Tab = js.Any.fromFunction1(Tab))
    __obj.asInstanceOf[TabBulmaComponent]
  }
  
  extension [Self <: TabBulmaComponent](x: Self) {
    
    inline def setTab(value: /* props */ TabProps & (ElementProps[TabProps, a]) => Element): Self = StObject.set(x, "Tab", js.Any.fromFunction1(value))
  }
}
