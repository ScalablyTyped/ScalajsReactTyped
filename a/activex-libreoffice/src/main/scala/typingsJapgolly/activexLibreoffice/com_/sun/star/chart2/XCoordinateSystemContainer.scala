package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XCoordinateSystemContainer
  extends StObject
     with XInterface {
  
  /** retrieve all coordinate systems */
  var CoordinateSystems: SafeArray[XCoordinateSystem]
  
  /**
    * add an coordinate system to the coordinate system container
    * @throws IllegalArgumentException If the given coordinate system is already contained in the container.
    */
  def addCoordinateSystem(aCoordSys: XCoordinateSystem): Unit
  
  /** retrieve all coordinate systems */
  def getCoordinateSystems(): SafeArray[XCoordinateSystem]
  
  /** removes one coordinate system from the coordinate system container. */
  def removeCoordinateSystem(aCoordSys: XCoordinateSystem): Unit
  
  /** set all coordinate systems */
  def setCoordinateSystems(aCoordinateSystems: SeqEquiv[XCoordinateSystem]): Unit
}
object XCoordinateSystemContainer {
  
  inline def apply(
    CoordinateSystems: SafeArray[XCoordinateSystem],
    acquire: Callback,
    addCoordinateSystem: XCoordinateSystem => Callback,
    getCoordinateSystems: CallbackTo[SafeArray[XCoordinateSystem]],
    queryInterface: `type` => Any,
    release: Callback,
    removeCoordinateSystem: XCoordinateSystem => Callback,
    setCoordinateSystems: SeqEquiv[XCoordinateSystem] => Callback
  ): XCoordinateSystemContainer = {
    val __obj = js.Dynamic.literal(CoordinateSystems = CoordinateSystems.asInstanceOf[js.Any], acquire = acquire.toJsFn, addCoordinateSystem = js.Any.fromFunction1((t0: XCoordinateSystem) => addCoordinateSystem(t0).runNow()), getCoordinateSystems = getCoordinateSystems.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeCoordinateSystem = js.Any.fromFunction1((t0: XCoordinateSystem) => removeCoordinateSystem(t0).runNow()), setCoordinateSystems = js.Any.fromFunction1((t0: SeqEquiv[XCoordinateSystem]) => setCoordinateSystems(t0).runNow()))
    __obj.asInstanceOf[XCoordinateSystemContainer]
  }
  
  extension [Self <: XCoordinateSystemContainer](x: Self) {
    
    inline def setAddCoordinateSystem(value: XCoordinateSystem => Callback): Self = StObject.set(x, "addCoordinateSystem", js.Any.fromFunction1((t0: XCoordinateSystem) => value(t0).runNow()))
    
    inline def setCoordinateSystems(value: SafeArray[XCoordinateSystem]): Self = StObject.set(x, "CoordinateSystems", value.asInstanceOf[js.Any])
    
    inline def setGetCoordinateSystems(value: CallbackTo[SafeArray[XCoordinateSystem]]): Self = StObject.set(x, "getCoordinateSystems", value.toJsFn)
    
    inline def setRemoveCoordinateSystem(value: XCoordinateSystem => Callback): Self = StObject.set(x, "removeCoordinateSystem", js.Any.fromFunction1((t0: XCoordinateSystem) => value(t0).runNow()))
    
    inline def setSetCoordinateSystems(value: SeqEquiv[XCoordinateSystem] => Callback): Self = StObject.set(x, "setCoordinateSystems", js.Any.fromFunction1((t0: SeqEquiv[XCoordinateSystem]) => value(t0).runNow()))
  }
}
