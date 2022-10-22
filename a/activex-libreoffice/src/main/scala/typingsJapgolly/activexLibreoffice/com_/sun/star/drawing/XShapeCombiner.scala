package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the combine/split functionality. */
trait XShapeCombiner
  extends StObject
     with XInterface {
  
  /**
    * combines {@link Shapes}
    * @param xShapes the {@link Shapes} inside this container are converted to PolyPolygonBezierShapes and are than combined into one {@link PolyPolygonBezier
    * @returns a newly created {@link PolyPolygonBezierShape} which contains all converted {@link PolyPolygonBezierShape} combined. It is also added to the {@li
    */
  def combine(xShapes: XShapes): XShape
  
  /**
    * splits {@link Shapes} .
    * @param Group the {@link Shape} is converted to a PolyPolygonBezierShapes and then split into several PolyPolygonBezierShapes The {@link Shapes} in xShap
    */
  def split(Group: XShape): Unit
}
object XShapeCombiner {
  
  inline def apply(
    acquire: Callback,
    combine: XShapes => XShape,
    queryInterface: `type` => Any,
    release: Callback,
    split: XShape => Callback
  ): XShapeCombiner = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, combine = js.Any.fromFunction1(combine), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, split = js.Any.fromFunction1((t0: XShape) => split(t0).runNow()))
    __obj.asInstanceOf[XShapeCombiner]
  }
  
  extension [Self <: XShapeCombiner](x: Self) {
    
    inline def setCombine(value: XShapes => XShape): Self = StObject.set(x, "combine", js.Any.fromFunction1(value))
    
    inline def setSplit(value: XShape => Callback): Self = StObject.set(x, "split", js.Any.fromFunction1((t0: XShape) => value(t0).runNow()))
  }
}
