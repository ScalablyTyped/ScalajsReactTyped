package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RippleFeedbackProps extends StObject {
  
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  var children: Element
  
  var color: js.UndefOr[String] = js.undefined
}
object RippleFeedbackProps {
  
  inline def apply(children: VdomElement): RippleFeedbackProps = {
    val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleFeedbackProps]
  }
  
  extension [Self <: RippleFeedbackProps](x: Self) {
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
