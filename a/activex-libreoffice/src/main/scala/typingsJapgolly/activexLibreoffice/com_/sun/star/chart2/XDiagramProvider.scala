package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gives access to a single diagram. This interface is needed by the wrapper for the old API (namespace {@link com.sun.star.chart} ). */
trait XDiagramProvider
  extends StObject
     with XInterface {
  
  var Diagram: XDiagram
  
  def getDiagram(): XDiagram
  
  def setDiagram(xDiagram: XDiagram): Unit
}
object XDiagramProvider {
  
  inline def apply(
    Diagram: XDiagram,
    acquire: Callback,
    getDiagram: CallbackTo[XDiagram],
    queryInterface: `type` => Any,
    release: Callback,
    setDiagram: XDiagram => Callback
  ): XDiagramProvider = {
    val __obj = js.Dynamic.literal(Diagram = Diagram.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDiagram = getDiagram.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDiagram = js.Any.fromFunction1((t0: XDiagram) => setDiagram(t0).runNow()))
    __obj.asInstanceOf[XDiagramProvider]
  }
  
  extension [Self <: XDiagramProvider](x: Self) {
    
    inline def setDiagram(value: XDiagram): Self = StObject.set(x, "Diagram", value.asInstanceOf[js.Any])
    
    inline def setGetDiagram(value: CallbackTo[XDiagram]): Self = StObject.set(x, "getDiagram", value.toJsFn)
    
    inline def setSetDiagram(value: XDiagram => Callback): Self = StObject.set(x, "setDiagram", js.Any.fromFunction1((t0: XDiagram) => value(t0).runNow()))
  }
}
