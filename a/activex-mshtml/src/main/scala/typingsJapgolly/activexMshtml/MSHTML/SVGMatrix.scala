package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGMatrix extends StObject {
  
  /* private */ @JSName("MSHTML.SVGMatrix_typekey")
  var MSHTMLDotSVGMatrix_typekey: SVGMatrix
  
  var a: Double
  
  var b: Double
  
  var c: Double
  
  var d: Double
  
  var e: Double
  
  var f: Double
  
  def flipX(): SVGMatrix
  
  def flipY(): SVGMatrix
  
  def inverse(): SVGMatrix
  
  def multiply(secondMatrix: SVGMatrix): SVGMatrix
  
  def rotate(angle: Double): SVGMatrix
  
  def rotateFromVector(x: Double, y: Double): SVGMatrix
  
  def scale(scaleFactor: Double): SVGMatrix
  
  def scaleNonUniform(scaleFactorX: Double, scaleFactorY: Double): SVGMatrix
  
  def skewX(angle: Double): SVGMatrix
  
  def skewY(angle: Double): SVGMatrix
  
  def translate(x: Double, y: Double): SVGMatrix
}
object SVGMatrix {
  
  inline def apply(
    MSHTMLDotSVGMatrix_typekey: SVGMatrix,
    a: Double,
    b: Double,
    c: Double,
    d: Double,
    e: Double,
    f: Double,
    flipX: CallbackTo[SVGMatrix],
    flipY: CallbackTo[SVGMatrix],
    inverse: CallbackTo[SVGMatrix],
    multiply: SVGMatrix => SVGMatrix,
    rotate: Double => SVGMatrix,
    rotateFromVector: (Double, Double) => SVGMatrix,
    scale: Double => SVGMatrix,
    scaleNonUniform: (Double, Double) => SVGMatrix,
    skewX: Double => SVGMatrix,
    skewY: Double => SVGMatrix,
    translate: (Double, Double) => SVGMatrix
  ): SVGMatrix = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], flipX = flipX.toJsFn, flipY = flipY.toJsFn, inverse = inverse.toJsFn, multiply = js.Any.fromFunction1(multiply), rotate = js.Any.fromFunction1(rotate), rotateFromVector = js.Any.fromFunction2(rotateFromVector), scale = js.Any.fromFunction1(scale), scaleNonUniform = js.Any.fromFunction2(scaleNonUniform), skewX = js.Any.fromFunction1(skewX), skewY = js.Any.fromFunction1(skewY), translate = js.Any.fromFunction2(translate))
    __obj.updateDynamic("MSHTML.SVGMatrix_typekey")(MSHTMLDotSVGMatrix_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGMatrix]
  }
  
  extension [Self <: SVGMatrix](x: Self) {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setFlipX(value: CallbackTo[SVGMatrix]): Self = StObject.set(x, "flipX", value.toJsFn)
    
    inline def setFlipY(value: CallbackTo[SVGMatrix]): Self = StObject.set(x, "flipY", value.toJsFn)
    
    inline def setInverse(value: CallbackTo[SVGMatrix]): Self = StObject.set(x, "inverse", value.toJsFn)
    
    inline def setMSHTMLDotSVGMatrix_typekey(value: SVGMatrix): Self = StObject.set(x, "MSHTML.SVGMatrix_typekey", value.asInstanceOf[js.Any])
    
    inline def setMultiply(value: SVGMatrix => SVGMatrix): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
    
    inline def setRotate(value: Double => SVGMatrix): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
    
    inline def setRotateFromVector(value: (Double, Double) => SVGMatrix): Self = StObject.set(x, "rotateFromVector", js.Any.fromFunction2(value))
    
    inline def setScale(value: Double => SVGMatrix): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setScaleNonUniform(value: (Double, Double) => SVGMatrix): Self = StObject.set(x, "scaleNonUniform", js.Any.fromFunction2(value))
    
    inline def setSkewX(value: Double => SVGMatrix): Self = StObject.set(x, "skewX", js.Any.fromFunction1(value))
    
    inline def setSkewY(value: Double => SVGMatrix): Self = StObject.set(x, "skewY", js.Any.fromFunction1(value))
    
    inline def setTranslate(value: (Double, Double) => SVGMatrix): Self = StObject.set(x, "translate", js.Any.fromFunction2(value))
  }
}
