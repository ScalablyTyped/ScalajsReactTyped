package typingsJapgolly.reactSvgMorph

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait From extends StObject {
    
    var from: Element
    
    var to: Element
  }
  object From {
    
    inline def apply(from: VdomElement, to: VdomElement): From = {
      val __obj = js.Dynamic.literal(from = from.rawElement.asInstanceOf[js.Any], to = to.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: VdomElement): Self = StObject.set(x, "from", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTo(value: VdomElement): Self = StObject.set(x, "to", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
