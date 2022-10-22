package typingsJapgolly.axel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axel extends StObject {
  
  def bg(r: Double, g: Double, b: Double): Unit
  
  def box(x1: Double, y1: Double, w: Double, h: Double): Unit
  
  var brush: String
  
  def circ(x: Double, y: Double, m: Double): Double
  
  def clear(): Unit
  
  var cols: Double
  
  var cursor: cursorInterface
  
  def dist(x1: Double, y1: Double, x2: Double, y2: Double): Double
  
  def draw(cb: js.Function): Unit
  
  def fg(r: Double, g: Double, b: Double): Unit
  
  def goto(x: Double, y: Double): Unit
  
  def lerp(p1: Double, p2: Double, m: Double): Double
  
  def line(x1: Double, y1: Double, x2: Double, y2: Double): Unit
  
  def point(x: Double, y: Double, char: String): Unit
  
  var rows: Double
  
  def scrub(x1: Double, y1: Double, w: Double, h: Double): Unit
  
  def text(x: Double, y: Double, text: String): Unit
}
object Axel {
  
  inline def apply(
    bg: (Double, Double, Double) => Callback,
    box: (Double, Double, Double, Double) => Callback,
    brush: String,
    circ: (Double, Double, Double) => Double,
    clear: Callback,
    cols: Double,
    cursor: cursorInterface,
    dist: (Double, Double, Double, Double) => Double,
    draw: js.Function => Callback,
    fg: (Double, Double, Double) => Callback,
    goto: (Double, Double) => Callback,
    lerp: (Double, Double, Double) => Double,
    line: (Double, Double, Double, Double) => Callback,
    point: (Double, Double, String) => Callback,
    rows: Double,
    scrub: (Double, Double, Double, Double) => Callback,
    text: (Double, Double, String) => Callback
  ): Axel = {
    val __obj = js.Dynamic.literal(bg = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (bg(t0, t1, t2)).runNow()), box = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (box(t0, t1, t2, t3)).runNow()), brush = brush.asInstanceOf[js.Any], circ = js.Any.fromFunction3(circ), clear = clear.toJsFn, cols = cols.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], dist = js.Any.fromFunction4(dist), draw = js.Any.fromFunction1((t0: js.Function) => draw(t0).runNow()), fg = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (fg(t0, t1, t2)).runNow()), goto = js.Any.fromFunction2((t0: Double, t1: Double) => (goto(t0, t1)).runNow()), lerp = js.Any.fromFunction3(lerp), line = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (line(t0, t1, t2, t3)).runNow()), point = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (point(t0, t1, t2)).runNow()), rows = rows.asInstanceOf[js.Any], scrub = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (scrub(t0, t1, t2, t3)).runNow()), text = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (text(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[Axel]
  }
  
  extension [Self <: Axel](x: Self) {
    
    inline def setBg(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "bg", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setBox(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "box", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setBrush(value: String): Self = StObject.set(x, "brush", value.asInstanceOf[js.Any])
    
    inline def setCirc(value: (Double, Double, Double) => Double): Self = StObject.set(x, "circ", js.Any.fromFunction3(value))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setCursor(value: cursorInterface): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setDist(value: (Double, Double, Double, Double) => Double): Self = StObject.set(x, "dist", js.Any.fromFunction4(value))
    
    inline def setDraw(value: js.Function => Callback): Self = StObject.set(x, "draw", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
    
    inline def setFg(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "fg", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setGoto(value: (Double, Double) => Callback): Self = StObject.set(x, "goto", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setLerp(value: (Double, Double, Double) => Double): Self = StObject.set(x, "lerp", js.Any.fromFunction3(value))
    
    inline def setLine(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "line", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setPoint(value: (Double, Double, String) => Callback): Self = StObject.set(x, "point", js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setScrub(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "scrub", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setText(value: (Double, Double, String) => Callback): Self = StObject.set(x, "text", js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (value(t0, t1, t2)).runNow()))
  }
}
