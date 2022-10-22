package typingsJapgolly.onfidoActiveVideoCapture

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import typingsJapgolly.preact.mod.ComponentChild
import typingsJapgolly.preact.mod.ComponentChildren
import typingsJapgolly.preact.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsButtonMod {
  
  @JSImport("@onfido/active-video-capture/dist/components/Button", "Button")
  @js.native
  val Button: FunctionComponent[Props] = js.native
  
  trait Props extends StObject {
    
    var children: js.UndefOr[ComponentChildren] = js.undefined
    
    def onClick(event: MouseEvent): Unit
  }
  object Props {
    
    inline def apply(onClick: MouseEvent => Callback): Props = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: MouseEvent) => onClick(t0).runNow()))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setOnClick(value: MouseEvent => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
    }
  }
}
