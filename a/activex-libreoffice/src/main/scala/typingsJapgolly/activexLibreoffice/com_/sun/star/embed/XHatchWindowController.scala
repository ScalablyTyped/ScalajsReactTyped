package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the operations for a hatch window.
  *
  * A hatch window owner is responsible to handle resize/move requests sent by the window. It is also responsible to validate tracking rectangle size.
  */
trait XHatchWindowController
  extends StObject
     with XInterface {
  
  def activated(): Unit
  
  /**
    * returns the closest valid rectangle to the provided one.
    * @param aRect a new selected position and size of the tracking rectangle
    * @returns the closest valid position and size to the provided one
    */
  def calcAdjustedRectangle(aRect: Rectangle): Rectangle
  
  def deactivated(): Unit
  
  /**
    * requests window owner to resize/move the window.
    * @param aRect the new requested position and size of the window
    */
  def requestPositioning(aRect: Rectangle): Unit
}
object XHatchWindowController {
  
  inline def apply(
    acquire: Callback,
    activated: Callback,
    calcAdjustedRectangle: Rectangle => Rectangle,
    deactivated: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    requestPositioning: Rectangle => Callback
  ): XHatchWindowController = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, activated = activated.toJsFn, calcAdjustedRectangle = js.Any.fromFunction1(calcAdjustedRectangle), deactivated = deactivated.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, requestPositioning = js.Any.fromFunction1((t0: Rectangle) => requestPositioning(t0).runNow()))
    __obj.asInstanceOf[XHatchWindowController]
  }
  
  extension [Self <: XHatchWindowController](x: Self) {
    
    inline def setActivated(value: Callback): Self = StObject.set(x, "activated", value.toJsFn)
    
    inline def setCalcAdjustedRectangle(value: Rectangle => Rectangle): Self = StObject.set(x, "calcAdjustedRectangle", js.Any.fromFunction1(value))
    
    inline def setDeactivated(value: Callback): Self = StObject.set(x, "deactivated", value.toJsFn)
    
    inline def setRequestPositioning(value: Rectangle => Callback): Self = StObject.set(x, "requestPositioning", js.Any.fromFunction1((t0: Rectangle) => value(t0).runNow()))
  }
}
