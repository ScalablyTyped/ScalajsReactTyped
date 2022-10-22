package typingsJapgolly.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transformation extends StObject {
  
  /**
    * Clock-wise rotation in radians. Defaults to \`0\`.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * Horizontal scale factor. Defaults to \`1\`.
    */
  var scaleX: js.UndefOr[Double] = js.undefined
  
  /**
    * Vertical scale factor. Defaults to \`1\`.
    */
  var scaleY: js.UndefOr[Double] = js.undefined
  
  /**
    * Horizontal translation (shift) in dip. Defaults to \`0\`.
    */
  var translationX: js.UndefOr[Double] = js.undefined
  
  /**
    * Vertical translation (shift) in dip. Defaults to \`0\`.
    */
  var translationY: js.UndefOr[Double] = js.undefined
  
  /**
    * Z-axis translation (shift) in dip. Defaults to \`0\`. Android 5.0+ only.
    */
  var translationZ: js.UndefOr[Double] = js.undefined
}
object Transformation {
  
  inline def apply(): Transformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transformation]
  }
  
  extension [Self <: Transformation](x: Self) {
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setTranslationX(value: Double): Self = StObject.set(x, "translationX", value.asInstanceOf[js.Any])
    
    inline def setTranslationXUndefined: Self = StObject.set(x, "translationX", js.undefined)
    
    inline def setTranslationY(value: Double): Self = StObject.set(x, "translationY", value.asInstanceOf[js.Any])
    
    inline def setTranslationYUndefined: Self = StObject.set(x, "translationY", js.undefined)
    
    inline def setTranslationZ(value: Double): Self = StObject.set(x, "translationZ", value.asInstanceOf[js.Any])
    
    inline def setTranslationZUndefined: Self = StObject.set(x, "translationZ", js.undefined)
  }
}
