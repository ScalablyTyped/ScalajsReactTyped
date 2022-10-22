package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to a {@link LayerManager} .
  * @see LayerManager
  */
trait XLayerSupplier
  extends StObject
     with XInterface {
  
  /** @returns the {@link LayerManager} . */
  val LayerManager: XNameAccess
  
  /** @returns the {@link LayerManager} . */
  def getLayerManager(): XNameAccess
}
object XLayerSupplier {
  
  inline def apply(
    LayerManager: XNameAccess,
    acquire: Callback,
    getLayerManager: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XLayerSupplier = {
    val __obj = js.Dynamic.literal(LayerManager = LayerManager.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLayerManager = getLayerManager.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLayerSupplier]
  }
  
  extension [Self <: XLayerSupplier](x: Self) {
    
    inline def setGetLayerManager(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getLayerManager", value.toJsFn)
    
    inline def setLayerManager(value: XNameAccess): Self = StObject.set(x, "LayerManager", value.asInstanceOf[js.Any])
  }
}
