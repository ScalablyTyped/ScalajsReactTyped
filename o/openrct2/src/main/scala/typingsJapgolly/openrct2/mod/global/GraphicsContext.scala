package typingsJapgolly.openrct2.mod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * API for drawing graphics.
  */
trait GraphicsContext extends StObject {
  
  def box(x: Double, y: Double, width: Double, height: Double): Unit
  
  def clear(): Unit
  
  def clip(x: Double, y: Double, width: Double, height: Double): Unit
  
  var colour: js.UndefOr[Double] = js.undefined
  
  var fill: Double
  
  def getImage(id: Double): js.UndefOr[ImageInfo]
  
  val height: Double
  
  def image(id: Double, x: Double, y: Double): Unit
  
  def line(x1: Double, y1: Double, x2: Double, y2: Double): Unit
  
  def measureText(text: String): ScreenSize
  
  var paletteId: js.UndefOr[Double] = js.undefined
  
  def rect(x: Double, y: Double, width: Double, height: Double): Unit
  
  var secondaryColour: js.UndefOr[Double] = js.undefined
  
  var stroke: Double
  
  var ternaryColour: js.UndefOr[Double] = js.undefined
  
  def text(text: String, x: Double, y: Double): Unit
  
  def well(x: Double, y: Double, width: Double, height: Double): Unit
  
  val width: Double
}
object GraphicsContext {
  
  inline def apply(
    box: (Double, Double, Double, Double) => Callback,
    clear: Callback,
    clip: (Double, Double, Double, Double) => Callback,
    fill: Double,
    getImage: Double => js.UndefOr[ImageInfo],
    height: Double,
    image: (Double, Double, Double) => Callback,
    line: (Double, Double, Double, Double) => Callback,
    measureText: String => ScreenSize,
    rect: (Double, Double, Double, Double) => Callback,
    stroke: Double,
    text: (String, Double, Double) => Callback,
    well: (Double, Double, Double, Double) => Callback,
    width: Double
  ): GraphicsContext = {
    val __obj = js.Dynamic.literal(box = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (box(t0, t1, t2, t3)).runNow()), clear = clear.toJsFn, clip = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (clip(t0, t1, t2, t3)).runNow()), fill = fill.asInstanceOf[js.Any], getImage = js.Any.fromFunction1(getImage), height = height.asInstanceOf[js.Any], image = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (image(t0, t1, t2)).runNow()), line = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (line(t0, t1, t2, t3)).runNow()), measureText = js.Any.fromFunction1(measureText), rect = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (rect(t0, t1, t2, t3)).runNow()), stroke = stroke.asInstanceOf[js.Any], text = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (text(t0, t1, t2)).runNow()), well = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (well(t0, t1, t2, t3)).runNow()), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsContext]
  }
  
  extension [Self <: GraphicsContext](x: Self) {
    
    inline def setBox(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "box", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setClip(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "clip", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setColour(value: Double): Self = StObject.set(x, "colour", value.asInstanceOf[js.Any])
    
    inline def setColourUndefined: Self = StObject.set(x, "colour", js.undefined)
    
    inline def setFill(value: Double): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setGetImage(value: Double => js.UndefOr[ImageInfo]): Self = StObject.set(x, "getImage", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImage(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "image", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setLine(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "line", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setMeasureText(value: String => ScreenSize): Self = StObject.set(x, "measureText", js.Any.fromFunction1(value))
    
    inline def setPaletteId(value: Double): Self = StObject.set(x, "paletteId", value.asInstanceOf[js.Any])
    
    inline def setPaletteIdUndefined: Self = StObject.set(x, "paletteId", js.undefined)
    
    inline def setRect(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "rect", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setSecondaryColour(value: Double): Self = StObject.set(x, "secondaryColour", value.asInstanceOf[js.Any])
    
    inline def setSecondaryColourUndefined: Self = StObject.set(x, "secondaryColour", js.undefined)
    
    inline def setStroke(value: Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setTernaryColour(value: Double): Self = StObject.set(x, "ternaryColour", value.asInstanceOf[js.Any])
    
    inline def setTernaryColourUndefined: Self = StObject.set(x, "ternaryColour", js.undefined)
    
    inline def setText(value: (String, Double, Double) => Callback): Self = StObject.set(x, "text", js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setWell(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "well", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
