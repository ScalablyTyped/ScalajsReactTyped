package typingsJapgolly.materialTabScroller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait MDCTabScrollerAnimation extends StObject {
    
    var finalScrollPosition: Double
    
    var scrollDelta: Double
  }
  object MDCTabScrollerAnimation {
    
    inline def apply(finalScrollPosition: Double, scrollDelta: Double): MDCTabScrollerAnimation = {
      val __obj = js.Dynamic.literal(finalScrollPosition = finalScrollPosition.asInstanceOf[js.Any], scrollDelta = scrollDelta.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCTabScrollerAnimation]
    }
    
    extension [Self <: MDCTabScrollerAnimation](x: Self) {
      
      inline def setFinalScrollPosition(value: Double): Self = StObject.set(x, "finalScrollPosition", value.asInstanceOf[js.Any])
      
      inline def setScrollDelta(value: Double): Self = StObject.set(x, "scrollDelta", value.asInstanceOf[js.Any])
    }
  }
  
  trait MDCTabScrollerHorizontalEdges extends StObject {
    
    var left: Double
    
    var right: Double
  }
  object MDCTabScrollerHorizontalEdges {
    
    inline def apply(left: Double, right: Double): MDCTabScrollerHorizontalEdges = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCTabScrollerHorizontalEdges]
    }
    
    extension [Self <: MDCTabScrollerHorizontalEdges](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
}
