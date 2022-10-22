package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var Container: BulmaComponent[js.Object, div]
}
object Container {
  
  inline def apply(Container: /* props */ js.Object & (ElementProps[js.Object, div]) => Element): Container = {
    val __obj = js.Dynamic.literal(Container = js.Any.fromFunction1(Container))
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setContainer(value: /* props */ js.Object & (ElementProps[js.Object, div]) => Element): Self = StObject.set(x, "Container", js.Any.fromFunction1(value))
  }
}
