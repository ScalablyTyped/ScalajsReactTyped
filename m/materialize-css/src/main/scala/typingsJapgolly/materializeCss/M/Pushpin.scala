package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pushpin
  extends StObject
     with Component[PushpinOptions] {
  
  /**
    * Original offsetTop of element
    */
  var originalOffset: Double
}
object Pushpin {
  
  inline def apply(destroy: Callback, el: Element, options: PushpinOptions, originalOffset: Double): Pushpin = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, el = el.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalOffset = originalOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pushpin]
  }
  
  extension [Self <: Pushpin](x: Self) {
    
    inline def setOriginalOffset(value: Double): Self = StObject.set(x, "originalOffset", value.asInstanceOf[js.Any])
  }
}
