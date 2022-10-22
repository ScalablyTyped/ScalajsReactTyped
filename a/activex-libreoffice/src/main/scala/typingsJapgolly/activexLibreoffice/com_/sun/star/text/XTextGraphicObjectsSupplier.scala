package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the collection of all embedded and linked graphics within this context (i.e. within this document). */
trait XTextGraphicObjectsSupplier
  extends StObject
     with XInterface {
  
  /** @returns the collection of graphic objects in this object (document). */
  val GraphicObjects: XNameAccess
  
  /** @returns the collection of graphic objects in this object (document). */
  def getGraphicObjects(): XNameAccess
}
object XTextGraphicObjectsSupplier {
  
  inline def apply(
    GraphicObjects: XNameAccess,
    acquire: Callback,
    getGraphicObjects: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XTextGraphicObjectsSupplier = {
    val __obj = js.Dynamic.literal(GraphicObjects = GraphicObjects.asInstanceOf[js.Any], acquire = acquire.toJsFn, getGraphicObjects = getGraphicObjects.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextGraphicObjectsSupplier]
  }
  
  extension [Self <: XTextGraphicObjectsSupplier](x: Self) {
    
    inline def setGetGraphicObjects(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getGraphicObjects", value.toJsFn)
    
    inline def setGraphicObjects(value: XNameAccess): Self = StObject.set(x, "GraphicObjects", value.asInstanceOf[js.Any])
  }
}
