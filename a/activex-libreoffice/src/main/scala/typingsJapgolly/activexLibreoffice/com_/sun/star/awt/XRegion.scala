package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** manages multiple rectangles which make up a region. */
trait XRegion
  extends StObject
     with XInterface {
  
  /** returns the bounding box of the shape. */
  val Bounds: Rectangle
  
  /** returns all rectangles which are making up this region. */
  val Rectangles: SafeArray[Rectangle]
  
  /** makes this region an empty region. */
  def clear(): Unit
  
  /** removes the area of the specified rectangle from this region. */
  def excludeRectangle(Rect: Rectangle): Unit
  
  /** removes the area of the specified region from this region. */
  def excludeRegion(Region: XRegion): Unit
  
  /** returns the bounding box of the shape. */
  def getBounds(): Rectangle
  
  /** returns all rectangles which are making up this region. */
  def getRectangles(): SafeArray[Rectangle]
  
  /** intersects the specified rectangle with the current region. */
  def intersectRectangle(Region: Rectangle): Unit
  
  /** intersects the specified region with the current region. */
  def intersectRegion(Region: XRegion): Unit
  
  /** moves this region by the specified horizontal and vertical delta. */
  def move(nHorzMove: Double, nVertMove: Double): Unit
  
  /** adds the specified rectangle to this region. */
  def unionRectangle(Rect: Rectangle): Unit
  
  /** adds the specified region to this region. */
  def unionRegion(Region: XRegion): Unit
  
  /** applies an exclusive-or operation with the specified rectangle to this region. */
  def xOrRectangle(Rect: Rectangle): Unit
  
  /** applies an exclusive-or operation with the specified region to this region. */
  def xOrRegion(Region: XRegion): Unit
}
object XRegion {
  
  inline def apply(
    Bounds: Rectangle,
    Rectangles: SafeArray[Rectangle],
    acquire: Callback,
    clear: Callback,
    excludeRectangle: Rectangle => Callback,
    excludeRegion: XRegion => Callback,
    getBounds: CallbackTo[Rectangle],
    getRectangles: CallbackTo[SafeArray[Rectangle]],
    intersectRectangle: Rectangle => Callback,
    intersectRegion: XRegion => Callback,
    move: (Double, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    unionRectangle: Rectangle => Callback,
    unionRegion: XRegion => Callback,
    xOrRectangle: Rectangle => Callback,
    xOrRegion: XRegion => Callback
  ): XRegion = {
    val __obj = js.Dynamic.literal(Bounds = Bounds.asInstanceOf[js.Any], Rectangles = Rectangles.asInstanceOf[js.Any], acquire = acquire.toJsFn, clear = clear.toJsFn, excludeRectangle = js.Any.fromFunction1((t0: Rectangle) => excludeRectangle(t0).runNow()), excludeRegion = js.Any.fromFunction1((t0: XRegion) => excludeRegion(t0).runNow()), getBounds = getBounds.toJsFn, getRectangles = getRectangles.toJsFn, intersectRectangle = js.Any.fromFunction1((t0: Rectangle) => intersectRectangle(t0).runNow()), intersectRegion = js.Any.fromFunction1((t0: XRegion) => intersectRegion(t0).runNow()), move = js.Any.fromFunction2((t0: Double, t1: Double) => (move(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, unionRectangle = js.Any.fromFunction1((t0: Rectangle) => unionRectangle(t0).runNow()), unionRegion = js.Any.fromFunction1((t0: XRegion) => unionRegion(t0).runNow()), xOrRectangle = js.Any.fromFunction1((t0: Rectangle) => xOrRectangle(t0).runNow()), xOrRegion = js.Any.fromFunction1((t0: XRegion) => xOrRegion(t0).runNow()))
    __obj.asInstanceOf[XRegion]
  }
  
  extension [Self <: XRegion](x: Self) {
    
    inline def setBounds(value: Rectangle): Self = StObject.set(x, "Bounds", value.asInstanceOf[js.Any])
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setExcludeRectangle(value: Rectangle => Callback): Self = StObject.set(x, "excludeRectangle", js.Any.fromFunction1((t0: Rectangle) => value(t0).runNow()))
    
    inline def setExcludeRegion(value: XRegion => Callback): Self = StObject.set(x, "excludeRegion", js.Any.fromFunction1((t0: XRegion) => value(t0).runNow()))
    
    inline def setGetBounds(value: CallbackTo[Rectangle]): Self = StObject.set(x, "getBounds", value.toJsFn)
    
    inline def setGetRectangles(value: CallbackTo[SafeArray[Rectangle]]): Self = StObject.set(x, "getRectangles", value.toJsFn)
    
    inline def setIntersectRectangle(value: Rectangle => Callback): Self = StObject.set(x, "intersectRectangle", js.Any.fromFunction1((t0: Rectangle) => value(t0).runNow()))
    
    inline def setIntersectRegion(value: XRegion => Callback): Self = StObject.set(x, "intersectRegion", js.Any.fromFunction1((t0: XRegion) => value(t0).runNow()))
    
    inline def setMove(value: (Double, Double) => Callback): Self = StObject.set(x, "move", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setRectangles(value: SafeArray[Rectangle]): Self = StObject.set(x, "Rectangles", value.asInstanceOf[js.Any])
    
    inline def setUnionRectangle(value: Rectangle => Callback): Self = StObject.set(x, "unionRectangle", js.Any.fromFunction1((t0: Rectangle) => value(t0).runNow()))
    
    inline def setUnionRegion(value: XRegion => Callback): Self = StObject.set(x, "unionRegion", js.Any.fromFunction1((t0: XRegion) => value(t0).runNow()))
    
    inline def setXOrRectangle(value: Rectangle => Callback): Self = StObject.set(x, "xOrRectangle", js.Any.fromFunction1((t0: Rectangle) => value(t0).runNow()))
    
    inline def setXOrRegion(value: XRegion => Callback): Self = StObject.set(x, "xOrRegion", js.Any.fromFunction1((t0: XRegion) => value(t0).runNow()))
  }
}
