package typingsJapgolly.dojo.dojox.gfx3d

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dojo.dojox.gfx3d.matrix.Matrix3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait objectInstance extends js.Object {
  /**
    * multiplies the existing matrix with an argument on left side
    * (matrix * this.matrix)
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx.matrix.Matrixconstructor for a list of acceptable arguments)
    */
  def applyLeftTransform(matrix: Matrix3D): js.Function
  /**
    * multiplies the existing matrix with an argument on right side
    * (this.matrix * matrix)
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx.matrix.Matrixconstructor for a list of acceptable arguments)
    */
  def applyRightTransform(matrix: Matrix3D): js.Function
  /**
    * a shortcut for dojox.gfx.shape.Shape.applyRightTransform
    *
    * @param matrix a matrix or a matrix-like object(see an argument of dojox.gfx.matrix.Matrixconstructor for a list of acceptable arguments)
    */
  def applyTransform(matrix: Matrix3D): js.Function
  /**
    *
    */
  def destroy(): Unit
  /**
    *
    * @param lighting
    */
  def draw(lighting: js.Any): Unit
  /**
    *
    */
  def getOutline(): js.Any
  /**
    *
    */
  def getZOrder(): Double
  /**
    *
    */
  def invalidate(): Unit
  /**
    *
    * @param camera
    */
  def render(camera: js.Any): Unit
  /**
    * sets a fill object
    * (the default implementation is to delegate to
    * the underlying 2D shape).
    *
    * @param fill a fill object(see dojox.gfx.defaultLinearGradient,dojox.gfx.defaultRadialGradient,dojox.gfx.defaultPattern,dojo._base.Coloror dojox.gfx.MODEL)
    */
  def setFill(fill: js.Object): js.Function
  /**
    * sets a Object object
    *
    * @param newObject
    */
  def setObject(newObject: js.Any): js.Function
  /**
    * sets a stroke object
    * (the default implementation simply ignores it)
    *
    * @param stroke a stroke object(see dojox.gfx.defaultStroke)
    */
  def setStroke(stroke: js.Object): js.Function
  /**
    * sets a transformation matrix
    *
    * @param matrix
    */
  def setTransform(matrix: js.Any): js.Function
  /**
    *
    * @param lighting
    * @param normal
    */
  def toStdFill(lighting: js.Any, normal: js.Any): js.Any
}

object objectInstance {
  @scala.inline
  def apply(
    applyLeftTransform: Matrix3D => CallbackTo[js.Function],
    applyRightTransform: Matrix3D => CallbackTo[js.Function],
    applyTransform: Matrix3D => CallbackTo[js.Function],
    destroy: Callback,
    draw: js.Any => Callback,
    getOutline: CallbackTo[js.Any],
    getZOrder: CallbackTo[Double],
    invalidate: Callback,
    render: js.Any => Callback,
    setFill: js.Object => CallbackTo[js.Function],
    setObject: js.Any => CallbackTo[js.Function],
    setStroke: js.Object => CallbackTo[js.Function],
    setTransform: js.Any => CallbackTo[js.Function],
    toStdFill: (js.Any, js.Any) => CallbackTo[js.Any]
  ): objectInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyLeftTransform")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojox.gfx3d.matrix.Matrix3D) => applyLeftTransform(t0).runNow()))
    __obj.updateDynamic("applyRightTransform")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojox.gfx3d.matrix.Matrix3D) => applyRightTransform(t0).runNow()))
    __obj.updateDynamic("applyTransform")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojox.gfx3d.matrix.Matrix3D) => applyTransform(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("draw")(js.Any.fromFunction1((t0: js.Any) => draw(t0).runNow()))
    __obj.updateDynamic("getOutline")(getOutline.toJsFn)
    __obj.updateDynamic("getZOrder")(getZOrder.toJsFn)
    __obj.updateDynamic("invalidate")(invalidate.toJsFn)
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: js.Any) => render(t0).runNow()))
    __obj.updateDynamic("setFill")(js.Any.fromFunction1((t0: js.Object) => setFill(t0).runNow()))
    __obj.updateDynamic("setObject")(js.Any.fromFunction1((t0: js.Any) => setObject(t0).runNow()))
    __obj.updateDynamic("setStroke")(js.Any.fromFunction1((t0: js.Object) => setStroke(t0).runNow()))
    __obj.updateDynamic("setTransform")(js.Any.fromFunction1((t0: js.Any) => setTransform(t0).runNow()))
    __obj.updateDynamic("toStdFill")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => toStdFill(t0, t1).runNow()))
    __obj.asInstanceOf[objectInstance]
  }
}

