package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeConsumerProps extends StObject {
  
  def children(props: ThemeProps): Element
}
object ThemeConsumerProps {
  
  inline def apply(children: ThemeProps => Element): ThemeConsumerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ThemeConsumerProps]
  }
  
  extension [Self <: ThemeConsumerProps](x: Self) {
    
    inline def setChildren(value: ThemeProps => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
