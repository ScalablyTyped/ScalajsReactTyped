package typingsJapgolly.reactPortalTooltip

import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ArrowStyle extends StObject {
    
    var arrowStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ArrowStyle {
    
    inline def apply(): ArrowStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowStyle]
    }
    
    extension [Self <: ArrowStyle](x: Self) {
      
      inline def setArrowStyle(value: CSSProperties): Self = StObject.set(x, "arrowStyle", value.asInstanceOf[js.Any])
      
      inline def setArrowStyleUndefined: Self = StObject.set(x, "arrowStyle", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
