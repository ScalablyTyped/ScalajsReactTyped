package typingsJapgolly.rcTable.anon

import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentTarget extends StObject {
  
  var currentTarget: HTMLDivElement
  
  var scrollLeft: js.UndefOr[Double] = js.undefined
}
object CurrentTarget {
  
  inline def apply(currentTarget: HTMLDivElement): CurrentTarget = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTarget]
  }
  
  extension [Self <: CurrentTarget](x: Self) {
    
    inline def setCurrentTarget(value: HTMLDivElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
  }
}
