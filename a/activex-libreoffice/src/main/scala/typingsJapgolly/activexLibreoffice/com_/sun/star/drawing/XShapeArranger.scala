package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Objects implementing this interface can be used to arrange {@link Shapes} .
  * @deprecated Deprecated
  */
trait XShapeArranger
  extends StObject
     with XInterface {
  
  /** applies the specified Arrangement to the specified collection of {@link Shapes} . */
  def arrange(xShapes: XShapes, eType: Arrangement): Unit
  
  /** moves the specified {@link Shapes} by a specified number of objects more to the front. */
  def bringToFront(xShapes: XShapes, nSteps: Double): Unit
  
  /** reverses the order of the specified collection of {@link Shapes} . */
  def reverseOrder(xShapes: XShapes): Unit
  
  /** moves the specified {@link Shapes}**nSteps** objects more to the back. */
  def sendToBack(xShapes: XShapes, nSteps: Double): Unit
  
  /** moves the specified collection of {@link Shapes} behind the specified single {@link Shape} . */
  def setBehindShape(xShapes: XShapes, xShape: XShape): Unit
  
  /** moves the specified collection of {@link Shapes} in front of the specified single {@link Shape} . */
  def setInFrontOf(xShapes: XShapes, xShape: XShape): Unit
}
object XShapeArranger {
  
  inline def apply(
    acquire: Callback,
    arrange: (XShapes, Arrangement) => Callback,
    bringToFront: (XShapes, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    reverseOrder: XShapes => Callback,
    sendToBack: (XShapes, Double) => Callback,
    setBehindShape: (XShapes, XShape) => Callback,
    setInFrontOf: (XShapes, XShape) => Callback
  ): XShapeArranger = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, arrange = js.Any.fromFunction2((t0: XShapes, t1: Arrangement) => (arrange(t0, t1)).runNow()), bringToFront = js.Any.fromFunction2((t0: XShapes, t1: Double) => (bringToFront(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reverseOrder = js.Any.fromFunction1((t0: XShapes) => reverseOrder(t0).runNow()), sendToBack = js.Any.fromFunction2((t0: XShapes, t1: Double) => (sendToBack(t0, t1)).runNow()), setBehindShape = js.Any.fromFunction2((t0: XShapes, t1: XShape) => (setBehindShape(t0, t1)).runNow()), setInFrontOf = js.Any.fromFunction2((t0: XShapes, t1: XShape) => (setInFrontOf(t0, t1)).runNow()))
    __obj.asInstanceOf[XShapeArranger]
  }
  
  extension [Self <: XShapeArranger](x: Self) {
    
    inline def setArrange(value: (XShapes, Arrangement) => Callback): Self = StObject.set(x, "arrange", js.Any.fromFunction2((t0: XShapes, t1: Arrangement) => (value(t0, t1)).runNow()))
    
    inline def setBringToFront(value: (XShapes, Double) => Callback): Self = StObject.set(x, "bringToFront", js.Any.fromFunction2((t0: XShapes, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setReverseOrder(value: XShapes => Callback): Self = StObject.set(x, "reverseOrder", js.Any.fromFunction1((t0: XShapes) => value(t0).runNow()))
    
    inline def setSendToBack(value: (XShapes, Double) => Callback): Self = StObject.set(x, "sendToBack", js.Any.fromFunction2((t0: XShapes, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetBehindShape(value: (XShapes, XShape) => Callback): Self = StObject.set(x, "setBehindShape", js.Any.fromFunction2((t0: XShapes, t1: XShape) => (value(t0, t1)).runNow()))
    
    inline def setSetInFrontOf(value: (XShapes, XShape) => Callback): Self = StObject.set(x, "setInFrontOf", js.Any.fromFunction2((t0: XShapes, t1: XShape) => (value(t0, t1)).runNow()))
  }
}
