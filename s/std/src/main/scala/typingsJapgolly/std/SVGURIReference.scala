package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGURIReference extends StObject {
  
  /* standard dom */
  val href: org.scalajs.dom.SVGAnimatedString
}
object SVGURIReference {
  
  inline def apply(href: org.scalajs.dom.SVGAnimatedString): SVGURIReference = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGURIReference]
  }
  
  extension [Self <: SVGURIReference](x: Self) {
    
    inline def setHref(value: org.scalajs.dom.SVGAnimatedString): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
  }
}
