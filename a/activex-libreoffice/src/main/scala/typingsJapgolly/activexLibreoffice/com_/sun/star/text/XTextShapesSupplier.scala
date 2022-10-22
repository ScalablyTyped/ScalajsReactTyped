package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the collection of com::sun::star::drawing::TextShapes. */
trait XTextShapesSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of shapes.
    * @see com.sun.star.drawing.DrawPage
    */
  val Shapes: XIndexAccess
  
  /**
    * returns the collection of shapes.
    * @see com.sun.star.drawing.DrawPage
    */
  def getShapes(): XIndexAccess
}
object XTextShapesSupplier {
  
  inline def apply(
    Shapes: XIndexAccess,
    acquire: Callback,
    getShapes: CallbackTo[XIndexAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XTextShapesSupplier = {
    val __obj = js.Dynamic.literal(Shapes = Shapes.asInstanceOf[js.Any], acquire = acquire.toJsFn, getShapes = getShapes.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextShapesSupplier]
  }
  
  extension [Self <: XTextShapesSupplier](x: Self) {
    
    inline def setGetShapes(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getShapes", value.toJsFn)
    
    inline def setShapes(value: XIndexAccess): Self = StObject.set(x, "Shapes", value.asInstanceOf[js.Any])
  }
}
