package typingsJapgolly.reactScrollbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ContainerHeight extends StObject {
    
    var containerHeight: Double
    
    var containerWidth: Double
    
    var leftPosition: Double
    
    var realHeight: Double
    
    var realWidth: Double
    
    var topPosition: Double
  }
  object ContainerHeight {
    
    inline def apply(
      containerHeight: Double,
      containerWidth: Double,
      leftPosition: Double,
      realHeight: Double,
      realWidth: Double,
      topPosition: Double
    ): ContainerHeight = {
      val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], leftPosition = leftPosition.asInstanceOf[js.Any], realHeight = realHeight.asInstanceOf[js.Any], realWidth = realWidth.asInstanceOf[js.Any], topPosition = topPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerHeight]
    }
    
    extension [Self <: ContainerHeight](x: Self) {
      
      inline def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
      
      inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      inline def setLeftPosition(value: Double): Self = StObject.set(x, "leftPosition", value.asInstanceOf[js.Any])
      
      inline def setRealHeight(value: Double): Self = StObject.set(x, "realHeight", value.asInstanceOf[js.Any])
      
      inline def setRealWidth(value: Double): Self = StObject.set(x, "realWidth", value.asInstanceOf[js.Any])
      
      inline def setTopPosition(value: Double): Self = StObject.set(x, "topPosition", value.asInstanceOf[js.Any])
    }
  }
}
