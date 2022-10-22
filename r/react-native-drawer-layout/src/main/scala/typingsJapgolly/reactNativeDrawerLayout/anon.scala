package typingsJapgolly.reactNativeDrawerLayout

import typingsJapgolly.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.left
import typingsJapgolly.reactNativeDrawerLayout.reactNativeDrawerLayoutStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Left extends StObject {
    
    var Left: left
    
    var Right: right
  }
  object Left {
    
    inline def apply(): Left = {
      val __obj = js.Dynamic.literal(Left = "left", Right = "right")
      __obj.asInstanceOf[Left]
    }
    
    extension [Self <: Left](x: Self) {
      
      inline def setLeft(value: left): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: right): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
    }
  }
  
  trait Offset extends StObject {
    
    var offset: Double
  }
  object Offset {
    
    inline def apply(offset: Double): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
