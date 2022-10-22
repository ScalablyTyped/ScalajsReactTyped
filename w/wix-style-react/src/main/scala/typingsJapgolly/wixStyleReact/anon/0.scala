package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def render(): Node
}
object `0` {
  
  inline def apply(render: CallbackTo[Node]): `0` = {
    val __obj = js.Dynamic.literal(render = render.toJsFn)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setRender(value: CallbackTo[Node]): Self = StObject.set(x, "render", value.toJsFn)
  }
}
