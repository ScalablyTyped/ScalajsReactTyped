package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasRenderingContext2D extends StObject {
  
  /* private */ @JSName("MSHTML.CanvasRenderingContext2D_typekey")
  var MSHTMLDotCanvasRenderingContext2D_typekey: CanvasRenderingContext2D
  
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Double): Unit
  
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit
  
  def beginPath(): Unit
  
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit
  
  val canvas: IHTMLCanvasElement
  
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit
  
  def clip(): Unit
  
  def closePath(): Unit
  
  def createImageData(a1: Any, a2: Any): ICanvasImageData
  
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): ICanvasGradient
  
  def createPattern(Image: Any, repetition: Any): ICanvasPattern
  
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): ICanvasGradient
  
  def drawImage(pSrc: Any, a1: Any, a2: Any, a3: Any, a4: Any, a5: Any, a6: Any, a7: Any, a8: Any): Unit
  
  def fill(): Unit
  
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit
  
  var fillStyle: Any
  
  def fillText(text: String, x: Double, y: Double, maxWidth: Any): Unit
  
  var font: String
  
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ICanvasImageData
  
  var globalAlpha: Double
  
  var globalCompositeOperation: String
  
  def isPointInPath(x: Double, y: Double): Boolean
  
  var lineCap: String
  
  var lineJoin: String
  
  def lineTo(x: Double, y: Double): Unit
  
  var lineWidth: Double
  
  def measureText(text: String): ICanvasTextMetrics
  
  var miterLimit: Double
  
  def moveTo(x: Double, y: Double): Unit
  
  def putImageData(
    imagedata: ICanvasImageData,
    dx: Double,
    dy: Double,
    dirtyX: Any,
    dirtyY: Any,
    dirtyWidth: Any,
    dirtyHeight: Any
  ): Unit
  
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit
  
  def rect(x: Double, y: Double, w: Double, h: Double): Unit
  
  def restore(): Unit
  
  def rotate(angle: Double): Unit
  
  def save(): Unit
  
  def scale(x: Double, y: Double): Unit
  
  def setTransform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit
  
  var shadowBlur: Double
  
  var shadowColor: String
  
  var shadowOffsetX: Double
  
  var shadowOffsetY: Double
  
  def stroke(): Unit
  
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit
  
  var strokeStyle: Any
  
  def strokeText(text: String, x: Double, y: Double, maxWidth: Any): Unit
  
  var textAlign: String
  
  var textBaseline: String
  
  def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): Unit
  
  def translate(x: Double, y: Double): Unit
}
object CanvasRenderingContext2D {
  
  inline def apply(
    MSHTMLDotCanvasRenderingContext2D_typekey: CanvasRenderingContext2D,
    arc: (Double, Double, Double, Double, Double, Double) => Callback,
    arcTo: (Double, Double, Double, Double, Double) => Callback,
    beginPath: Callback,
    bezierCurveTo: (Double, Double, Double, Double, Double, Double) => Callback,
    canvas: IHTMLCanvasElement,
    clearRect: (Double, Double, Double, Double) => Callback,
    clip: Callback,
    closePath: Callback,
    createImageData: (Any, Any) => ICanvasImageData,
    createLinearGradient: (Double, Double, Double, Double) => ICanvasGradient,
    createPattern: (Any, Any) => ICanvasPattern,
    createRadialGradient: (Double, Double, Double, Double, Double, Double) => ICanvasGradient,
    drawImage: (Any, Any, Any, Any, Any, Any, Any, Any, Any) => Callback,
    fill: Callback,
    fillRect: (Double, Double, Double, Double) => Callback,
    fillStyle: Any,
    fillText: (String, Double, Double, Any) => Callback,
    font: String,
    getImageData: (Double, Double, Double, Double) => ICanvasImageData,
    globalAlpha: Double,
    globalCompositeOperation: String,
    isPointInPath: (Double, Double) => Boolean,
    lineCap: String,
    lineJoin: String,
    lineTo: (Double, Double) => Callback,
    lineWidth: Double,
    measureText: String => ICanvasTextMetrics,
    miterLimit: Double,
    moveTo: (Double, Double) => Callback,
    putImageData: (ICanvasImageData, Double, Double, Any, Any, Any, Any) => Callback,
    quadraticCurveTo: (Double, Double, Double, Double) => Callback,
    rect: (Double, Double, Double, Double) => Callback,
    restore: Callback,
    rotate: Double => Callback,
    save: Callback,
    scale: (Double, Double) => Callback,
    setTransform: (Double, Double, Double, Double, Double, Double) => Callback,
    shadowBlur: Double,
    shadowColor: String,
    shadowOffsetX: Double,
    shadowOffsetY: Double,
    stroke: Callback,
    strokeRect: (Double, Double, Double, Double) => Callback,
    strokeStyle: Any,
    strokeText: (String, Double, Double, Any) => Callback,
    textAlign: String,
    textBaseline: String,
    transform: (Double, Double, Double, Double, Double, Double) => Callback,
    translate: (Double, Double) => Callback
  ): CanvasRenderingContext2D = {
    val __obj = js.Dynamic.literal(arc = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (arc(t0, t1, t2, t3, t4, t5)).runNow()), arcTo = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (arcTo(t0, t1, t2, t3, t4)).runNow()), beginPath = beginPath.toJsFn, bezierCurveTo = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (bezierCurveTo(t0, t1, t2, t3, t4, t5)).runNow()), canvas = canvas.asInstanceOf[js.Any], clearRect = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (clearRect(t0, t1, t2, t3)).runNow()), clip = clip.toJsFn, closePath = closePath.toJsFn, createImageData = js.Any.fromFunction2(createImageData), createLinearGradient = js.Any.fromFunction4(createLinearGradient), createPattern = js.Any.fromFunction2(createPattern), createRadialGradient = js.Any.fromFunction6(createRadialGradient), drawImage = js.Any.fromFunction9((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any, t5: Any, t6: Any, t7: Any, t8: Any) => (drawImage(t0, t1, t2, t3, t4, t5, t6, t7, t8)).runNow()), fill = fill.toJsFn, fillRect = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (fillRect(t0, t1, t2, t3)).runNow()), fillStyle = fillStyle.asInstanceOf[js.Any], fillText = js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: Any) => (fillText(t0, t1, t2, t3)).runNow()), font = font.asInstanceOf[js.Any], getImageData = js.Any.fromFunction4(getImageData), globalAlpha = globalAlpha.asInstanceOf[js.Any], globalCompositeOperation = globalCompositeOperation.asInstanceOf[js.Any], isPointInPath = js.Any.fromFunction2(isPointInPath), lineCap = lineCap.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], lineTo = js.Any.fromFunction2((t0: Double, t1: Double) => (lineTo(t0, t1)).runNow()), lineWidth = lineWidth.asInstanceOf[js.Any], measureText = js.Any.fromFunction1(measureText), miterLimit = miterLimit.asInstanceOf[js.Any], moveTo = js.Any.fromFunction2((t0: Double, t1: Double) => (moveTo(t0, t1)).runNow()), putImageData = js.Any.fromFunction7((t0: ICanvasImageData, t1: Double, t2: Double, t3: Any, t4: Any, t5: Any, t6: Any) => (putImageData(t0, t1, t2, t3, t4, t5, t6)).runNow()), quadraticCurveTo = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (quadraticCurveTo(t0, t1, t2, t3)).runNow()), rect = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (rect(t0, t1, t2, t3)).runNow()), restore = restore.toJsFn, rotate = js.Any.fromFunction1((t0: Double) => rotate(t0).runNow()), save = save.toJsFn, scale = js.Any.fromFunction2((t0: Double, t1: Double) => (scale(t0, t1)).runNow()), setTransform = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (setTransform(t0, t1, t2, t3, t4, t5)).runNow()), shadowBlur = shadowBlur.asInstanceOf[js.Any], shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffsetX = shadowOffsetX.asInstanceOf[js.Any], shadowOffsetY = shadowOffsetY.asInstanceOf[js.Any], stroke = stroke.toJsFn, strokeRect = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (strokeRect(t0, t1, t2, t3)).runNow()), strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeText = js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: Any) => (strokeText(t0, t1, t2, t3)).runNow()), textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any], transform = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (transform(t0, t1, t2, t3, t4, t5)).runNow()), translate = js.Any.fromFunction2((t0: Double, t1: Double) => (translate(t0, t1)).runNow()))
    __obj.updateDynamic("MSHTML.CanvasRenderingContext2D_typekey")(MSHTMLDotCanvasRenderingContext2D_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasRenderingContext2D]
  }
  
  extension [Self <: CanvasRenderingContext2D](x: Self) {
    
    inline def setArc(value: (Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "arc", js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setArcTo(value: (Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "arcTo", js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setBeginPath(value: Callback): Self = StObject.set(x, "beginPath", value.toJsFn)
    
    inline def setBezierCurveTo(value: (Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "bezierCurveTo", js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setCanvas(value: IHTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setClearRect(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "clearRect", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setClip(value: Callback): Self = StObject.set(x, "clip", value.toJsFn)
    
    inline def setClosePath(value: Callback): Self = StObject.set(x, "closePath", value.toJsFn)
    
    inline def setCreateImageData(value: (Any, Any) => ICanvasImageData): Self = StObject.set(x, "createImageData", js.Any.fromFunction2(value))
    
    inline def setCreateLinearGradient(value: (Double, Double, Double, Double) => ICanvasGradient): Self = StObject.set(x, "createLinearGradient", js.Any.fromFunction4(value))
    
    inline def setCreatePattern(value: (Any, Any) => ICanvasPattern): Self = StObject.set(x, "createPattern", js.Any.fromFunction2(value))
    
    inline def setCreateRadialGradient(value: (Double, Double, Double, Double, Double, Double) => ICanvasGradient): Self = StObject.set(x, "createRadialGradient", js.Any.fromFunction6(value))
    
    inline def setDrawImage(value: (Any, Any, Any, Any, Any, Any, Any, Any, Any) => Callback): Self = StObject.set(x, "drawImage", js.Any.fromFunction9((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any, t5: Any, t6: Any, t7: Any, t8: Any) => (value(t0, t1, t2, t3, t4, t5, t6, t7, t8)).runNow()))
    
    inline def setFill(value: Callback): Self = StObject.set(x, "fill", value.toJsFn)
    
    inline def setFillRect(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "fillRect", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setFillStyle(value: Any): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
    
    inline def setFillText(value: (String, Double, Double, Any) => Callback): Self = StObject.set(x, "fillText", js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setGetImageData(value: (Double, Double, Double, Double) => ICanvasImageData): Self = StObject.set(x, "getImageData", js.Any.fromFunction4(value))
    
    inline def setGlobalAlpha(value: Double): Self = StObject.set(x, "globalAlpha", value.asInstanceOf[js.Any])
    
    inline def setGlobalCompositeOperation(value: String): Self = StObject.set(x, "globalCompositeOperation", value.asInstanceOf[js.Any])
    
    inline def setIsPointInPath(value: (Double, Double) => Boolean): Self = StObject.set(x, "isPointInPath", js.Any.fromFunction2(value))
    
    inline def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineJoin(value: String): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    inline def setLineTo(value: (Double, Double) => Callback): Self = StObject.set(x, "lineTo", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotCanvasRenderingContext2D_typekey(value: CanvasRenderingContext2D): Self = StObject.set(x, "MSHTML.CanvasRenderingContext2D_typekey", value.asInstanceOf[js.Any])
    
    inline def setMeasureText(value: String => ICanvasTextMetrics): Self = StObject.set(x, "measureText", js.Any.fromFunction1(value))
    
    inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    inline def setMoveTo(value: (Double, Double) => Callback): Self = StObject.set(x, "moveTo", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setPutImageData(value: (ICanvasImageData, Double, Double, Any, Any, Any, Any) => Callback): Self = StObject.set(x, "putImageData", js.Any.fromFunction7((t0: ICanvasImageData, t1: Double, t2: Double, t3: Any, t4: Any, t5: Any, t6: Any) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setQuadraticCurveTo(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "quadraticCurveTo", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setRect(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "rect", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setRestore(value: Callback): Self = StObject.set(x, "restore", value.toJsFn)
    
    inline def setRotate(value: Double => Callback): Self = StObject.set(x, "rotate", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSave(value: Callback): Self = StObject.set(x, "save", value.toJsFn)
    
    inline def setScale(value: (Double, Double) => Callback): Self = StObject.set(x, "scale", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetTransform(value: (Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "setTransform", js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    inline def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    inline def setStroke(value: Callback): Self = StObject.set(x, "stroke", value.toJsFn)
    
    inline def setStrokeRect(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "strokeRect", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setStrokeStyle(value: Any): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeText(value: (String, Double, Double, Any) => Callback): Self = StObject.set(x, "strokeText", js.Any.fromFunction4((t0: String, t1: Double, t2: Double, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: (Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "transform", js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setTranslate(value: (Double, Double) => Callback): Self = StObject.set(x, "translate", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
