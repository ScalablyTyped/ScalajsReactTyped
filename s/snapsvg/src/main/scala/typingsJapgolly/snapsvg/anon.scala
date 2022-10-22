package typingsJapgolly.snapsvg

import typingsJapgolly.mina.mina.AnimationDescriptor
import typingsJapgolly.snapsvg.mod.Animation_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alpha extends StObject {
    
    var alpha: Double
    
    var x: Double
    
    var y: Double
  }
  object Alpha {
    
    inline def apply(alpha: Double, x: Double, y: Double): Alpha = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alpha]
    }
    
    extension [Self <: Alpha](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Anim extends StObject {
    
    var anim: Animation_ = js.native
    
    var curStatus: Double = js.native
    
    var mina: AnimationDescriptor = js.native
    
    def status(): Double = js.native
    def status(n: Double): Double = js.native
    
    def stop(): Unit = js.native
  }
}
