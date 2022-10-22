package typingsJapgolly.box2d.Box2D.Dynamics

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.box2d.Box2D.Common.Math.b2Transform
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import typingsJapgolly.box2d.Box2D.Common.b2Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2DebugDraw extends StObject {
  
  /**
    * Append flags to the current flags.
    * @param flags Flags to add.
    **/
  def AppendFlags(flags: Double): Unit
  
  /**
    * Clear flags from the current flags.
    * @param flags flags to clear.
    **/
  def ClearFlags(flags: Double): Unit
  
  /**
    * Draw a circle.
    * @param center Circle center point.
    * @param radius Circle radius.
    * @param color Circle draw color.
    **/
  def DrawCircle(center: b2Vec2, radius: Double, color: b2Color): Unit
  
  /**
    * Draw a closed polygon provided in CCW order.
    * @param vertices Polygon verticies.
    * @param vertexCount Number of vertices in the polygon, usually vertices.length.
    * @param color Polygon draw color.
    **/
  def DrawPolygon(vertices: js.Array[b2Vec2], vertexCount: Double, color: b2Color): Unit
  
  /**
    * Draw a line segment.
    * @param p1 Line beginpoint.
    * @param p2 Line endpoint.
    * @param color Line color.
    **/
  def DrawSegment(p1: b2Vec2, p2: b2Vec2, color: b2Color): Unit
  
  /**
    * Draw a solid circle.
    * @param center Circle center point.
    * @param radius Circle radius.
    * @param axis Circle axis.
    * @param color Circle color.
    **/
  def DrawSolidCircle(center: b2Vec2, radius: Double, axis: b2Vec2, color: b2Color): Unit
  
  /**
    * Draw a solid closed polygon provided in CCW order.
    * @param vertices Polygon verticies.
    * @param vertexCount Number of vertices in the polygon, usually vertices.length.
    * @param color Polygon draw color.
    **/
  def DrawSolidPolygon(vertices: js.Array[b2Vec2], vertexCount: Double, color: b2Color): Unit
  
  /**
    * Draw a transform. Choose your own length scale.
    * @param xf Transform to draw.
    **/
  def DrawTransform(xf: b2Transform): Unit
  
  /**
    * Get the alpha value used for lines.
    * @return Alpha value used for drawing lines.
    **/
  def GetAlpha(): Double
  
  /**
    * Get the draw scale.
    * @return Draw scale ratio.
    **/
  def GetDrawScale(): Double
  
  /**
    * Get the alpha value used for fills.
    * @return Alpha value used for drawing fills.
    **/
  def GetFillAlpha(): Double
  
  /**
    * Get the drawing flags.
    * @return Drawing flags.
    **/
  def GetFlags(): Double
  
  /**
    * Get the line thickness.
    * @return Line thickness.
    **/
  def GetLineThickness(): Double
  
  /**
    * Get the HTML Canvas Element for drawing.
    * @note box2dflash uses Sprite object, box2dweb uses CanvasRenderingContext2D, that is why this function is called GetSprite().
    * @return The HTML Canvas Element used for debug drawing.
    **/
  def GetSprite(): CanvasRenderingContext2D
  
  /**
    * Get the scale used for drawing XForms.
    * @return Scale for drawing transforms.
    **/
  def GetXFormScale(): Double
  
  /**
    * Set the alpha value used for lines.
    * @param alpha Alpha value for drawing lines.
    **/
  def SetAlpha(alpha: Double): Unit
  
  /**
    * Set the draw scale.
    * @param drawScale Draw scale ratio.
    **/
  def SetDrawScale(drawScale: Double): Unit
  
  /**
    * Set the alpha value used for fills.
    * @param alpha Alpha value for drawing fills.
    **/
  def SetFillAlpha(alpha: Double): Unit
  
  /**
    * Set the drawing flags.
    * @param flags Sets the drawing flags.
    **/
  def SetFlags(flags: Double): Unit
  
  /**
    * Set the line thickness.
    * @param lineThickness The new line thickness.
    **/
  def SetLineThickness(lineThickness: Double): Unit
  
  /**
    * Set the HTML Canvas Element for drawing.
    * @note box2dflash uses Sprite object, box2dweb uses CanvasRenderingContext2D, that is why this function is called SetSprite().
    * @param canvas HTML Canvas Element to draw debug information to.
    **/
  def SetSprite(canvas: CanvasRenderingContext2D): Unit
  
  /**
    * Set the scale used for drawing XForms.
    * @param xformScale The transform scale.
    **/
  def SetXFormScale(xformScale: Double): Unit
}
object b2DebugDraw {
  
  inline def apply(
    AppendFlags: Double => Callback,
    ClearFlags: Double => Callback,
    DrawCircle: (b2Vec2, Double, b2Color) => Callback,
    DrawPolygon: (js.Array[b2Vec2], Double, b2Color) => Callback,
    DrawSegment: (b2Vec2, b2Vec2, b2Color) => Callback,
    DrawSolidCircle: (b2Vec2, Double, b2Vec2, b2Color) => Callback,
    DrawSolidPolygon: (js.Array[b2Vec2], Double, b2Color) => Callback,
    DrawTransform: b2Transform => Callback,
    GetAlpha: CallbackTo[Double],
    GetDrawScale: CallbackTo[Double],
    GetFillAlpha: CallbackTo[Double],
    GetFlags: CallbackTo[Double],
    GetLineThickness: CallbackTo[Double],
    GetSprite: CallbackTo[CanvasRenderingContext2D],
    GetXFormScale: CallbackTo[Double],
    SetAlpha: Double => Callback,
    SetDrawScale: Double => Callback,
    SetFillAlpha: Double => Callback,
    SetFlags: Double => Callback,
    SetLineThickness: Double => Callback,
    SetSprite: CanvasRenderingContext2D => Callback,
    SetXFormScale: Double => Callback
  ): b2DebugDraw = {
    val __obj = js.Dynamic.literal(AppendFlags = js.Any.fromFunction1((t0: Double) => AppendFlags(t0).runNow()), ClearFlags = js.Any.fromFunction1((t0: Double) => ClearFlags(t0).runNow()), DrawCircle = js.Any.fromFunction3((t0: b2Vec2, t1: Double, t2: b2Color) => (DrawCircle(t0, t1, t2)).runNow()), DrawPolygon = js.Any.fromFunction3((t0: js.Array[b2Vec2], t1: Double, t2: b2Color) => (DrawPolygon(t0, t1, t2)).runNow()), DrawSegment = js.Any.fromFunction3((t0: b2Vec2, t1: b2Vec2, t2: b2Color) => (DrawSegment(t0, t1, t2)).runNow()), DrawSolidCircle = js.Any.fromFunction4((t0: b2Vec2, t1: Double, t2: b2Vec2, t3: b2Color) => (DrawSolidCircle(t0, t1, t2, t3)).runNow()), DrawSolidPolygon = js.Any.fromFunction3((t0: js.Array[b2Vec2], t1: Double, t2: b2Color) => (DrawSolidPolygon(t0, t1, t2)).runNow()), DrawTransform = js.Any.fromFunction1((t0: b2Transform) => DrawTransform(t0).runNow()), GetAlpha = GetAlpha.toJsFn, GetDrawScale = GetDrawScale.toJsFn, GetFillAlpha = GetFillAlpha.toJsFn, GetFlags = GetFlags.toJsFn, GetLineThickness = GetLineThickness.toJsFn, GetSprite = GetSprite.toJsFn, GetXFormScale = GetXFormScale.toJsFn, SetAlpha = js.Any.fromFunction1((t0: Double) => SetAlpha(t0).runNow()), SetDrawScale = js.Any.fromFunction1((t0: Double) => SetDrawScale(t0).runNow()), SetFillAlpha = js.Any.fromFunction1((t0: Double) => SetFillAlpha(t0).runNow()), SetFlags = js.Any.fromFunction1((t0: Double) => SetFlags(t0).runNow()), SetLineThickness = js.Any.fromFunction1((t0: Double) => SetLineThickness(t0).runNow()), SetSprite = js.Any.fromFunction1((t0: CanvasRenderingContext2D) => SetSprite(t0).runNow()), SetXFormScale = js.Any.fromFunction1((t0: Double) => SetXFormScale(t0).runNow()))
    __obj.asInstanceOf[b2DebugDraw]
  }
  
  extension [Self <: b2DebugDraw](x: Self) {
    
    inline def setAppendFlags(value: Double => Callback): Self = StObject.set(x, "AppendFlags", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setClearFlags(value: Double => Callback): Self = StObject.set(x, "ClearFlags", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setDrawCircle(value: (b2Vec2, Double, b2Color) => Callback): Self = StObject.set(x, "DrawCircle", js.Any.fromFunction3((t0: b2Vec2, t1: Double, t2: b2Color) => (value(t0, t1, t2)).runNow()))
    
    inline def setDrawPolygon(value: (js.Array[b2Vec2], Double, b2Color) => Callback): Self = StObject.set(x, "DrawPolygon", js.Any.fromFunction3((t0: js.Array[b2Vec2], t1: Double, t2: b2Color) => (value(t0, t1, t2)).runNow()))
    
    inline def setDrawSegment(value: (b2Vec2, b2Vec2, b2Color) => Callback): Self = StObject.set(x, "DrawSegment", js.Any.fromFunction3((t0: b2Vec2, t1: b2Vec2, t2: b2Color) => (value(t0, t1, t2)).runNow()))
    
    inline def setDrawSolidCircle(value: (b2Vec2, Double, b2Vec2, b2Color) => Callback): Self = StObject.set(x, "DrawSolidCircle", js.Any.fromFunction4((t0: b2Vec2, t1: Double, t2: b2Vec2, t3: b2Color) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setDrawSolidPolygon(value: (js.Array[b2Vec2], Double, b2Color) => Callback): Self = StObject.set(x, "DrawSolidPolygon", js.Any.fromFunction3((t0: js.Array[b2Vec2], t1: Double, t2: b2Color) => (value(t0, t1, t2)).runNow()))
    
    inline def setDrawTransform(value: b2Transform => Callback): Self = StObject.set(x, "DrawTransform", js.Any.fromFunction1((t0: b2Transform) => value(t0).runNow()))
    
    inline def setGetAlpha(value: CallbackTo[Double]): Self = StObject.set(x, "GetAlpha", value.toJsFn)
    
    inline def setGetDrawScale(value: CallbackTo[Double]): Self = StObject.set(x, "GetDrawScale", value.toJsFn)
    
    inline def setGetFillAlpha(value: CallbackTo[Double]): Self = StObject.set(x, "GetFillAlpha", value.toJsFn)
    
    inline def setGetFlags(value: CallbackTo[Double]): Self = StObject.set(x, "GetFlags", value.toJsFn)
    
    inline def setGetLineThickness(value: CallbackTo[Double]): Self = StObject.set(x, "GetLineThickness", value.toJsFn)
    
    inline def setGetSprite(value: CallbackTo[CanvasRenderingContext2D]): Self = StObject.set(x, "GetSprite", value.toJsFn)
    
    inline def setGetXFormScale(value: CallbackTo[Double]): Self = StObject.set(x, "GetXFormScale", value.toJsFn)
    
    inline def setSetAlpha(value: Double => Callback): Self = StObject.set(x, "SetAlpha", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetDrawScale(value: Double => Callback): Self = StObject.set(x, "SetDrawScale", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetFillAlpha(value: Double => Callback): Self = StObject.set(x, "SetFillAlpha", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetFlags(value: Double => Callback): Self = StObject.set(x, "SetFlags", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLineThickness(value: Double => Callback): Self = StObject.set(x, "SetLineThickness", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetSprite(value: CanvasRenderingContext2D => Callback): Self = StObject.set(x, "SetSprite", js.Any.fromFunction1((t0: CanvasRenderingContext2D) => value(t0).runNow()))
    
    inline def setSetXFormScale(value: Double => Callback): Self = StObject.set(x, "SetXFormScale", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
