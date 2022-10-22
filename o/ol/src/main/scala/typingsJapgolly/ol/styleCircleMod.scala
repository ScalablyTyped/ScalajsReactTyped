package typingsJapgolly.ol

import typingsJapgolly.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleCircleMod {
  
  @JSImport("ol/style/Circle", JSImport.Default)
  @js.native
  open class default () extends CircleStyle {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait CircleStyle
    extends typingsJapgolly.ol.styleRegularShapeMod.default {
    
    /**
      * Set the circle radius.
      */
    def setRadius(radius: Double): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var displacement: js.UndefOr[js.Array[Double]] = js.undefined
    
    var fill: js.UndefOr[typingsJapgolly.ol.styleFillMod.default] = js.undefined
    
    var radius: Double
    
    var rotateWithView: js.UndefOr[Boolean] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double | Size] = js.undefined
    
    var stroke: js.UndefOr[typingsJapgolly.ol.styleStrokeMod.default] = js.undefined
  }
  object Options {
    
    inline def apply(radius: Double): Options = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDisplacement(value: js.Array[Double]): Self = StObject.set(x, "displacement", value.asInstanceOf[js.Any])
      
      inline def setDisplacementUndefined: Self = StObject.set(x, "displacement", js.undefined)
      
      inline def setDisplacementVarargs(value: Double*): Self = StObject.set(x, "displacement", js.Array(value*))
      
      inline def setFill(value: typingsJapgolly.ol.styleFillMod.default): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      inline def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Double | Size): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setStroke(value: typingsJapgolly.ol.styleStrokeMod.default): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
}
