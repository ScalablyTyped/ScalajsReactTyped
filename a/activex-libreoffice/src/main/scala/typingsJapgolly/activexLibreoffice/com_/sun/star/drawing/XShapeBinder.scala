package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** connects or breaks the lines of {@link Shapes} */
trait XShapeBinder
  extends StObject
     with XInterface {
  
  /**
    * binds {@link Shapes} together.
    * @param xShapes a container with {@link Shapes} that will be bind together. All {@link Shapes} will be converted to a {@link PolyPolygonBezierShape} and
    * @returns a newly created {@link PolyPolygonBezierShape} which contains all line segment from the supplied {@link Shapes} . It is also added to the {@link
    */
  def bind(xShapes: XShapes): XShape
  
  /**
    * breaks a {@link Shape} into its line segments
    * @param xShape the given {@link Shape} will be converted to a {@link PolyPolygonBezierShape} and the line segments of this {@link Shape} will be used to
    */
  def unbind(xShape: XShape): Unit
}
object XShapeBinder {
  
  inline def apply(
    acquire: Callback,
    bind: XShapes => XShape,
    queryInterface: `type` => Any,
    release: Callback,
    unbind: XShape => Callback
  ): XShapeBinder = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, bind = js.Any.fromFunction1(bind), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, unbind = js.Any.fromFunction1((t0: XShape) => unbind(t0).runNow()))
    __obj.asInstanceOf[XShapeBinder]
  }
  
  extension [Self <: XShapeBinder](x: Self) {
    
    inline def setBind(value: XShapes => XShape): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    inline def setUnbind(value: XShape => Callback): Self = StObject.set(x, "unbind", js.Any.fromFunction1((t0: XShape) => value(t0).runNow()))
  }
}
