package typingsJapgolly.typesettable

import japgolly.scalajs.react.Callback
import typingsJapgolly.typesettable.buildSrcWritersWriterMod.IXAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Destroy extends StObject {
    
    def destroy(): Unit
    
    def write(line: String, width: Double, xAlign: IXAlign, xOffset: Double, yOffset: Double): Unit
  }
  object Destroy {
    
    inline def apply(destroy: Callback, write: (String, Double, IXAlign, Double, Double) => Callback): Destroy = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, write = js.Any.fromFunction5((t0: String, t1: Double, t2: IXAlign, t3: Double, t4: Double) => (write(t0, t1, t2, t3, t4)).runNow()))
      __obj.asInstanceOf[Destroy]
    }
    
    extension [Self <: Destroy](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setWrite(value: (String, Double, IXAlign, Double, Double) => Callback): Self = StObject.set(x, "write", js.Any.fromFunction5((t0: String, t1: Double, t2: IXAlign, t3: Double, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ K in typesettable.typesettable/build/src/writers/writer.IXAlign ]: number} */
  trait KinIXAlignnumber extends StObject {
    
    var center: Double
    
    var left: Double
    
    var right: Double
  }
  object KinIXAlignnumber {
    
    inline def apply(center: Double, left: Double, right: Double): KinIXAlignnumber = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinIXAlignnumber]
    }
    
    extension [Self <: KinIXAlignnumber](x: Self) {
      
      inline def setCenter(value: Double): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ K in typesettable.typesettable/build/src/writers/writer.IYAlign ]: number} */
  trait KinIYAlignnumber extends StObject {
    
    var bottom: Double
    
    var center: Double
    
    var top: Double
  }
  object KinIYAlignnumber {
    
    inline def apply(bottom: Double, center: Double, top: Double): KinIYAlignnumber = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinIYAlignnumber]
    }
    
    extension [Self <: KinIYAlignnumber](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setCenter(value: Double): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Write extends StObject {
    
    def write(line: String, width: Double, xAlign: IXAlign, xOffset: Double, yOffset: Double): Unit
  }
  object Write {
    
    inline def apply(write: (String, Double, IXAlign, Double, Double) => Callback): Write = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction5((t0: String, t1: Double, t2: IXAlign, t3: Double, t4: Double) => (write(t0, t1, t2, t3, t4)).runNow()))
      __obj.asInstanceOf[Write]
    }
    
    extension [Self <: Write](x: Self) {
      
      inline def setWrite(value: (String, Double, IXAlign, Double, Double) => Callback): Self = StObject.set(x, "write", js.Any.fromFunction5((t0: String, t1: Double, t2: IXAlign, t3: Double, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    }
  }
}
