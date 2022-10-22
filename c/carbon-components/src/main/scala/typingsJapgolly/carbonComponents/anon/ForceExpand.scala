package typingsJapgolly.carbonComponents.anon

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceExpand extends StObject {
  
  var element: HTMLElement
  
  var forceExpand: Boolean
}
object ForceExpand {
  
  inline def apply(element: HTMLElement, forceExpand: Boolean): ForceExpand = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], forceExpand = forceExpand.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceExpand]
  }
  
  extension [Self <: ForceExpand](x: Self) {
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setForceExpand(value: Boolean): Self = StObject.set(x, "forceExpand", value.asInstanceOf[js.Any])
  }
}
