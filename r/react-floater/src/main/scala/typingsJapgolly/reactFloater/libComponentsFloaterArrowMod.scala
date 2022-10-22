package typingsJapgolly.reactFloater

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactFloater.libTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFloaterArrowMod {
  
  @JSImport("react-floater/lib/components/Floater/Arrow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var arrowRef: Ref[HTMLSpanElement]
    
    var placement: String
    
    var styles: Styles
  }
  object Props {
    
    inline def apply(placement: String, styles: Styles): Props = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], arrowRef = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setArrowRef(value: Ref[HTMLSpanElement]): Self = StObject.set(x, "arrowRef", value.asInstanceOf[js.Any])
      
      inline def setArrowRefFunction1(value: HTMLSpanElement | Null => Callback): Self = StObject.set(x, "arrowRef", js.Any.fromFunction1((t0: HTMLSpanElement | Null) => value(t0).runNow()))
      
      inline def setArrowRefNull: Self = StObject.set(x, "arrowRef", null)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: Styles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
}
