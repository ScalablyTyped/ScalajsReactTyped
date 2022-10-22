package typingsJapgolly.jsqrcode

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitMatrix extends StObject {
  
  val Dimension: Double
  
  val Height: Double
  
  val Width: Double
  
  var bits: js.Array[Double]
  
  def clear(): Unit
  
  def flip(x: Double, y: Double): Unit
  
  def get_Renamed(x: Double, y: Double): Boolean
  
  /* private */ var height: Double
  
  var rowSize: Double
  
  def setRegion(left: Double, top: Double, width: Double, height: Double): Unit
  
  def set_Renamed(x: Double, y: Double): Unit
  
  /* private */ var width: Double
}
object BitMatrix {
  
  inline def apply(
    Dimension: Double,
    Height: Double,
    Width: Double,
    bits: js.Array[Double],
    clear: Callback,
    flip: (Double, Double) => Callback,
    get_Renamed: (Double, Double) => Boolean,
    height: Double,
    rowSize: Double,
    setRegion: (Double, Double, Double, Double) => Callback,
    set_Renamed: (Double, Double) => Callback,
    width: Double
  ): BitMatrix = {
    val __obj = js.Dynamic.literal(Dimension = Dimension.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], bits = bits.asInstanceOf[js.Any], clear = clear.toJsFn, flip = js.Any.fromFunction2((t0: Double, t1: Double) => (flip(t0, t1)).runNow()), get_Renamed = js.Any.fromFunction2(get_Renamed), height = height.asInstanceOf[js.Any], rowSize = rowSize.asInstanceOf[js.Any], setRegion = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (setRegion(t0, t1, t2, t3)).runNow()), set_Renamed = js.Any.fromFunction2((t0: Double, t1: Double) => (set_Renamed(t0, t1)).runNow()), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitMatrix]
  }
  
  extension [Self <: BitMatrix](x: Self) {
    
    inline def setBits(value: js.Array[Double]): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    
    inline def setBitsVarargs(value: Double*): Self = StObject.set(x, "bits", js.Array(value*))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setDimension(value: Double): Self = StObject.set(x, "Dimension", value.asInstanceOf[js.Any])
    
    inline def setFlip(value: (Double, Double) => Callback): Self = StObject.set(x, "flip", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setGet_Renamed(value: (Double, Double) => Boolean): Self = StObject.set(x, "get_Renamed", js.Any.fromFunction2(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setRowSize(value: Double): Self = StObject.set(x, "rowSize", value.asInstanceOf[js.Any])
    
    inline def setSetRegion(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "setRegion", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSet_Renamed(value: (Double, Double) => Callback): Self = StObject.set(x, "set_Renamed", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
