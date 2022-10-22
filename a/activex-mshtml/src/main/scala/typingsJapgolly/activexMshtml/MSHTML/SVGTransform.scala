package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGTransform extends StObject {
  
  /* private */ @JSName("MSHTML.SVGTransform_typekey")
  var MSHTMLDotSVGTransform_typekey: SVGTransform
  
  var angle: Double
  
  var matrix: SVGMatrix
  
  def setMatrix(matrix: SVGMatrix): Unit
  
  def setRotate(angle: Double, cx: Double, cy: Double): Unit
  
  def setScale(sx: Double, sy: Double): Unit
  
  def setSkewX(angle: Double): Unit
  
  def setSkewY(angle: Double): Unit
  
  def setTranslate(tx: Double, ty: Double): Unit
  
  var `type`: Double
}
object SVGTransform {
  
  inline def apply(
    MSHTMLDotSVGTransform_typekey: SVGTransform,
    angle: Double,
    matrix: SVGMatrix,
    setMatrix: SVGMatrix => Callback,
    setRotate: (Double, Double, Double) => Callback,
    setScale: (Double, Double) => Callback,
    setSkewX: Double => Callback,
    setSkewY: Double => Callback,
    setTranslate: (Double, Double) => Callback,
    `type`: Double
  ): SVGTransform = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], setMatrix = js.Any.fromFunction1((t0: SVGMatrix) => setMatrix(t0).runNow()), setRotate = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setRotate(t0, t1, t2)).runNow()), setScale = js.Any.fromFunction2((t0: Double, t1: Double) => (setScale(t0, t1)).runNow()), setSkewX = js.Any.fromFunction1((t0: Double) => setSkewX(t0).runNow()), setSkewY = js.Any.fromFunction1((t0: Double) => setSkewY(t0).runNow()), setTranslate = js.Any.fromFunction2((t0: Double, t1: Double) => (setTranslate(t0, t1)).runNow()))
    __obj.updateDynamic("MSHTML.SVGTransform_typekey")(MSHTMLDotSVGTransform_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTransform]
  }
  
  extension [Self <: SVGTransform](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGTransform_typekey(value: SVGTransform): Self = StObject.set(x, "MSHTML.SVGTransform_typekey", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: SVGMatrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setSetMatrix(value: SVGMatrix => Callback): Self = StObject.set(x, "setMatrix", js.Any.fromFunction1((t0: SVGMatrix) => value(t0).runNow()))
    
    inline def setSetRotate(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setRotate", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetScale(value: (Double, Double) => Callback): Self = StObject.set(x, "setScale", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetSkewX(value: Double => Callback): Self = StObject.set(x, "setSkewX", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetSkewY(value: Double => Callback): Self = StObject.set(x, "setSkewY", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTranslate(value: (Double, Double) => Callback): Self = StObject.set(x, "setTranslate", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
