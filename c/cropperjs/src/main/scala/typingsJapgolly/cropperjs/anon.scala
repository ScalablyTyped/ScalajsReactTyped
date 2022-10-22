package typingsJapgolly.cropperjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cropper extends StObject {
    
    var cropper: typingsJapgolly.cropperjs.Cropper
  }
  object Cropper {
    
    inline def apply(cropper: typingsJapgolly.cropperjs.Cropper): typingsJapgolly.cropperjs.anon.Cropper = {
      val __obj = js.Dynamic.literal(cropper = cropper.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.cropperjs.anon.Cropper]
    }
    
    extension [Self <: typingsJapgolly.cropperjs.anon.Cropper](x: Self) {
      
      inline def setCropper(value: typingsJapgolly.cropperjs.Cropper): Self = StObject.set(x, "cropper", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
