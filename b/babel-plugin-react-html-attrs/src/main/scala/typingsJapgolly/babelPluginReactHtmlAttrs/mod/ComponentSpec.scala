package typingsJapgolly.babelPluginReactHtmlAttrs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentSpec[P, S]
  extends StObject
     with Mixin[P, S]
     with /* propertyName */ StringDictionary[Any] {
  
  def render(): ReactNode
}
object ComponentSpec {
  
  inline def apply[P, S](render: CallbackTo[ReactNode]): ComponentSpec[P, S] = {
    val __obj = js.Dynamic.literal(render = render.toJsFn)
    __obj.asInstanceOf[ComponentSpec[P, S]]
  }
  
  extension [Self <: ComponentSpec[?, ?], P, S](x: Self & (ComponentSpec[P, S])) {
    
    inline def setRender(value: CallbackTo[ReactNode]): Self = StObject.set(x, "render", value.toJsFn)
  }
}
