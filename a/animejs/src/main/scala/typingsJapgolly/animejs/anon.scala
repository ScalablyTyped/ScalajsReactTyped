package typingsJapgolly.animejs

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait El extends StObject {
    
    var el: HTMLElement | SVGElement
    
    var property: String
    
    var totalLength: Double
  }
  object El {
    
    inline def apply(el: HTMLElement | SVGElement, property: String, totalLength: Double): El = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], totalLength = totalLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[El]
    }
    
    extension [Self <: El](x: Self) {
      
      inline def setEl(value: HTMLElement | SVGElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setTotalLength(value: Double): Self = StObject.set(x, "totalLength", value.asInstanceOf[js.Any])
    }
  }
}
