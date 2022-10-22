package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.BaseY
import typingsJapgolly.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stem extends StObject {
  
  def applyStyle(context: IRenderContext): Stem
  
  def draw(): Unit
  
  def getBoundingBox(): BoundingBox
  
  def getCategory(): String
  
  def getExtents(): BaseY
  
  def getHeight(): Double
  
  def getStyle(): FillStyle_
  
  //inconsistent API: this should be set via the options object in the constructor
  var hide: Boolean
  
  def setContext(context: IRenderContext): Stem
  
  def setDirection(direction: Double): Unit
  
  def setExtension(`extension`: Double): Unit
  
  def setNoteHeadXBounds(x_begin: Double, x_end: Double): Stem
  
  def setStyle(style: FillStyle_): Unit
  
  def setYBounds(y_top: Double, y_bottom: Double): Unit
}
object Stem {
  
  inline def apply(
    applyStyle: IRenderContext => Stem,
    draw: Callback,
    getBoundingBox: CallbackTo[BoundingBox],
    getCategory: CallbackTo[String],
    getExtents: CallbackTo[BaseY],
    getHeight: CallbackTo[Double],
    getStyle: CallbackTo[FillStyle_],
    hide: Boolean,
    setContext: IRenderContext => Stem,
    setDirection: Double => Callback,
    setExtension: Double => Callback,
    setNoteHeadXBounds: (Double, Double) => Stem,
    setStyle: FillStyle_ => Callback,
    setYBounds: (Double, Double) => Callback
  ): Stem = {
    val __obj = js.Dynamic.literal(applyStyle = js.Any.fromFunction1(applyStyle), draw = draw.toJsFn, getBoundingBox = getBoundingBox.toJsFn, getCategory = getCategory.toJsFn, getExtents = getExtents.toJsFn, getHeight = getHeight.toJsFn, getStyle = getStyle.toJsFn, hide = hide.asInstanceOf[js.Any], setContext = js.Any.fromFunction1(setContext), setDirection = js.Any.fromFunction1((t0: Double) => setDirection(t0).runNow()), setExtension = js.Any.fromFunction1((t0: Double) => setExtension(t0).runNow()), setNoteHeadXBounds = js.Any.fromFunction2(setNoteHeadXBounds), setStyle = js.Any.fromFunction1((t0: FillStyle_) => setStyle(t0).runNow()), setYBounds = js.Any.fromFunction2((t0: Double, t1: Double) => (setYBounds(t0, t1)).runNow()))
    __obj.asInstanceOf[Stem]
  }
  
  extension [Self <: Stem](x: Self) {
    
    inline def setApplyStyle(value: IRenderContext => Stem): Self = StObject.set(x, "applyStyle", js.Any.fromFunction1(value))
    
    inline def setDraw(value: Callback): Self = StObject.set(x, "draw", value.toJsFn)
    
    inline def setGetBoundingBox(value: CallbackTo[BoundingBox]): Self = StObject.set(x, "getBoundingBox", value.toJsFn)
    
    inline def setGetCategory(value: CallbackTo[String]): Self = StObject.set(x, "getCategory", value.toJsFn)
    
    inline def setGetExtents(value: CallbackTo[BaseY]): Self = StObject.set(x, "getExtents", value.toJsFn)
    
    inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getHeight", value.toJsFn)
    
    inline def setGetStyle(value: CallbackTo[FillStyle_]): Self = StObject.set(x, "getStyle", value.toJsFn)
    
    inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setSetContext(value: IRenderContext => Stem): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    inline def setSetDirection(value: Double => Callback): Self = StObject.set(x, "setDirection", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetExtension(value: Double => Callback): Self = StObject.set(x, "setExtension", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetNoteHeadXBounds(value: (Double, Double) => Stem): Self = StObject.set(x, "setNoteHeadXBounds", js.Any.fromFunction2(value))
    
    inline def setSetStyle(value: FillStyle_ => Callback): Self = StObject.set(x, "setStyle", js.Any.fromFunction1((t0: FillStyle_) => value(t0).runNow()))
    
    inline def setSetYBounds(value: (Double, Double) => Callback): Self = StObject.set(x, "setYBounds", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
