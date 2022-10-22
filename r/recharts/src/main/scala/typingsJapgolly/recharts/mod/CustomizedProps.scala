package typingsJapgolly.recharts.mod

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomizedProps extends StObject {
  
  var component: ContentRenderer[Any] | Element
}
object CustomizedProps {
  
  inline def apply(component: ContentRenderer[Any] | Element): CustomizedProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizedProps]
  }
  
  extension [Self <: CustomizedProps](x: Self) {
    
    inline def setComponent(value: ContentRenderer[Any] | Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentFunction1(value: Any => Node): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
    
    inline def setComponentVdomElement(value: VdomElement): Self = StObject.set(x, "component", value.rawElement.asInstanceOf[js.Any])
  }
}
