package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is implemented by {@link Shapes} that contain other {@link Shapes} .
  * @deprecated Deprecated
  */
trait XShapeGroup
  extends StObject
     with XShape {
  
  /**
    * enters the group which enables the editing function for the parts of a grouped {@link Shape} . Then the parts can be edited instead of the group as a
    * whole.
    *
    * This affects only the user interface. The behavior is not specified if this instance is not visible on any view. In this case it may or may not work.
    */
  def enterGroup(): Unit
  
  /**
    * leaves the group, which disables the editing function for the parts of a grouped {@link Shape} . Then only the group as a whole can be edited.
    *
    * This affects only the user interface. The behavior is not specified if this instance is not visible on any view. In this case it may or may not work.
    */
  def leaveGroup(): Unit
}
object XShapeGroup {
  
  inline def apply(
    Position: Point,
    ShapeType: String,
    Size: Size,
    acquire: Callback,
    enterGroup: Callback,
    getPosition: CallbackTo[Point],
    getShapeType: CallbackTo[String],
    getSize: CallbackTo[Size],
    leaveGroup: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setPosition: Point => Callback,
    setSize: Size => Callback
  ): XShapeGroup = {
    val __obj = js.Dynamic.literal(Position = Position.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = acquire.toJsFn, enterGroup = enterGroup.toJsFn, getPosition = getPosition.toJsFn, getShapeType = getShapeType.toJsFn, getSize = getSize.toJsFn, leaveGroup = leaveGroup.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), setSize = js.Any.fromFunction1((t0: Size) => setSize(t0).runNow()))
    __obj.asInstanceOf[XShapeGroup]
  }
  
  extension [Self <: XShapeGroup](x: Self) {
    
    inline def setEnterGroup(value: Callback): Self = StObject.set(x, "enterGroup", value.toJsFn)
    
    inline def setLeaveGroup(value: Callback): Self = StObject.set(x, "leaveGroup", value.toJsFn)
  }
}
