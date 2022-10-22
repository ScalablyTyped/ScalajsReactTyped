package typingsJapgolly.reactAnchorLinkSmoothScroll

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-anchor-link-smooth-scroll", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AnchorLinkProps, js.Object, Any]
  
  type AnchorLink = japgolly.scalajs.react.facade.React.Component[AnchorLinkProps & js.Object, js.Object]
  
  trait AnchorLinkProps
    extends StObject
       with HTMLProps[HTMLAnchorElement] {
    
    var offset: js.UndefOr[String | Double | js.Function0[Double]] = js.undefined
  }
  object AnchorLinkProps {
    
    inline def apply(): AnchorLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorLinkProps]
    }
    
    extension [Self <: AnchorLinkProps](x: Self) {
      
      inline def setOffset(value: String | Double | js.Function0[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetCallbackTo(value: CallbackTo[Double]): Self = StObject.set(x, "offset", value.toJsFn)
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
}
