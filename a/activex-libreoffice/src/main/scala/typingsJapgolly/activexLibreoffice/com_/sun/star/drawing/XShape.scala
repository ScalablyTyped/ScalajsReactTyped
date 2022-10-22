package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** lets you do a basic transformation on a {@link Shape} and get its type. */
trait XShape
  extends StObject
     with XShapeDescriptor {
  
  /**
    * gets the current position of this object.
    * @returns the position of the top left edge in 100/th mm
    */
  var Position: Point
  
  /**
    * gets the size of this object.
    * @returns the size in 100/th mm
    */
  var Size: typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
  
  /**
    * gets the current position of this object.
    * @returns the position of the top left edge in 100/th mm
    */
  def getPosition(): Point
  
  /**
    * gets the size of this object.
    * @returns the size in 100/th mm
    */
  def getSize(): Size
  
  /**
    * sets the current position of this object
    * @param aPosition the position of the top left edge in 100/th mm
    */
  def setPosition(aPosition: Point): Unit
  
  /**
    * sets the size of this object.
    * @param aSize the size in 100/th mm
    */
  def setSize(aSize: Size): Unit
}
object XShape {
  
  inline def apply(
    Position: Point,
    ShapeType: String,
    Size: Size,
    acquire: Callback,
    getPosition: CallbackTo[Point],
    getShapeType: CallbackTo[String],
    getSize: CallbackTo[Size],
    queryInterface: `type` => Any,
    release: Callback,
    setPosition: Point => Callback,
    setSize: Size => Callback
  ): XShape = {
    val __obj = js.Dynamic.literal(Position = Position.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = acquire.toJsFn, getPosition = getPosition.toJsFn, getShapeType = getShapeType.toJsFn, getSize = getSize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), setSize = js.Any.fromFunction1((t0: Size) => setSize(t0).runNow()))
    __obj.asInstanceOf[XShape]
  }
  
  extension [Self <: XShape](x: Self) {
    
    inline def setGetPosition(value: CallbackTo[Point]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setGetSize(value: CallbackTo[Size]): Self = StObject.set(x, "getSize", value.toJsFn)
    
    inline def setPosition(value: Point): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setSetPosition(value: Point => Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction1((t0: Point) => value(t0).runNow()))
    
    inline def setSetSize(value: Size => Callback): Self = StObject.set(x, "setSize", js.Any.fromFunction1((t0: Size) => value(t0).runNow()))
    
    inline def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
  }
}
