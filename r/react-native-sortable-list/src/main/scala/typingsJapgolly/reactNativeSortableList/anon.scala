package typingsJapgolly.reactNativeSortableList

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Animated extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var dx: js.UndefOr[Double] = js.undefined
    
    var dy: js.UndefOr[Double] = js.undefined
  }
  object Animated {
    
    inline def apply(): Animated = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Animated]
    }
    
    extension [Self <: Animated](x: Self) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    }
  }
  
  trait Key[K] extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[K] = js.undefined
  }
  object Key {
    
    inline def apply[K](): Key[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key[K]]
    }
    
    extension [Self <: Key[?], K](x: Self & Key[K]) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object X {
    
    inline def apply(): X = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
