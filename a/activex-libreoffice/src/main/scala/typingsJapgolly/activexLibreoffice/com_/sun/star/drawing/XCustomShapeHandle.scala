package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The {@link XCustomShapeHandle} */
trait XCustomShapeHandle
  extends StObject
     with XInterface {
  
  /**
    * is getting the actual handle position
    * @returns a the actual handle position
    */
  val Position: Point
  
  /**
    * is getting the actual handle position
    * @returns a the actual handle position
    */
  def getPosition(): Point
  
  /** is setting a new position for the handle */
  def setControllerPosition(aPoint: Point): Unit
}
object XCustomShapeHandle {
  
  inline def apply(
    Position: Point,
    acquire: Callback,
    getPosition: CallbackTo[Point],
    queryInterface: `type` => Any,
    release: Callback,
    setControllerPosition: Point => Callback
  ): XCustomShapeHandle = {
    val __obj = js.Dynamic.literal(Position = Position.asInstanceOf[js.Any], acquire = acquire.toJsFn, getPosition = getPosition.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setControllerPosition = js.Any.fromFunction1((t0: Point) => setControllerPosition(t0).runNow()))
    __obj.asInstanceOf[XCustomShapeHandle]
  }
  
  extension [Self <: XCustomShapeHandle](x: Self) {
    
    inline def setGetPosition(value: CallbackTo[Point]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setPosition(value: Point): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setSetControllerPosition(value: Point => Callback): Self = StObject.set(x, "setControllerPosition", js.Any.fromFunction1((t0: Point) => value(t0).runNow()))
  }
}
