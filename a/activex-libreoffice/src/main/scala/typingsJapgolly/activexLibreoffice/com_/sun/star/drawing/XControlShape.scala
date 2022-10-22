package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControlModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is implemented by a {@link ControlShape} to access the controls model.
  * @see com.sun.star.drawing.ControlShape
  * @see com.sun.star.awt.UnoControlModel
  */
trait XControlShape
  extends StObject
     with XShape {
  
  /**
    * returns the control model of this {@link Shape} .
    * @returns if there is already a control model assigned to this {@link ControlShape} , than its returned. Otherwise you get an empty reference.
    */
  var Control: XControlModel
  
  /**
    * returns the control model of this {@link Shape} .
    * @returns if there is already a control model assigned to this {@link ControlShape} , than its returned. Otherwise you get an empty reference.
    */
  def getControl(): XControlModel
  
  /**
    * sets the control model for this {@link Shape} .
    * @param xControl this will be the new control model that is displayed with this shape. You may change the model more than once during the lifetime of a {
    */
  def setControl(xControl: XControlModel): Unit
}
object XControlShape {
  
  inline def apply(
    Control: XControlModel,
    Position: Point,
    ShapeType: String,
    Size: Size,
    acquire: Callback,
    getControl: CallbackTo[XControlModel],
    getPosition: CallbackTo[Point],
    getShapeType: CallbackTo[String],
    getSize: CallbackTo[Size],
    queryInterface: `type` => Any,
    release: Callback,
    setControl: XControlModel => Callback,
    setPosition: Point => Callback,
    setSize: Size => Callback
  ): XControlShape = {
    val __obj = js.Dynamic.literal(Control = Control.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = acquire.toJsFn, getControl = getControl.toJsFn, getPosition = getPosition.toJsFn, getShapeType = getShapeType.toJsFn, getSize = getSize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setControl = js.Any.fromFunction1((t0: XControlModel) => setControl(t0).runNow()), setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), setSize = js.Any.fromFunction1((t0: Size) => setSize(t0).runNow()))
    __obj.asInstanceOf[XControlShape]
  }
  
  extension [Self <: XControlShape](x: Self) {
    
    inline def setControl(value: XControlModel): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
    
    inline def setGetControl(value: CallbackTo[XControlModel]): Self = StObject.set(x, "getControl", value.toJsFn)
    
    inline def setSetControl(value: XControlModel => Callback): Self = StObject.set(x, "setControl", js.Any.fromFunction1((t0: XControlModel) => value(t0).runNow()))
  }
}
