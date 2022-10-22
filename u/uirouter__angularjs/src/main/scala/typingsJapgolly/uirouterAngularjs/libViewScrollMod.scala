package typingsJapgolly.uirouterAngularjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewScrollMod {
  
  trait UIViewScrollProvider extends StObject {
    
    /**
      * Uses standard anchorScroll behavior
      *
      * Reverts [[$uiViewScroll]] back to using the core [`$anchorScroll`](http://docs.angularjs.org/api/ng.$anchorScroll)
      * service for scrolling based on the url anchor.
      */
    def useAnchorScroll(): Unit
  }
  object UIViewScrollProvider {
    
    inline def apply(useAnchorScroll: Callback): UIViewScrollProvider = {
      val __obj = js.Dynamic.literal(useAnchorScroll = useAnchorScroll.toJsFn)
      __obj.asInstanceOf[UIViewScrollProvider]
    }
    
    extension [Self <: UIViewScrollProvider](x: Self) {
      
      inline def setUseAnchorScroll(value: Callback): Self = StObject.set(x, "useAnchorScroll", value.toJsFn)
    }
  }
}
