package typingsJapgolly.titanium.Titanium.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The 3D Matrix is an object for holding values for a 3D affine transform.
		 */
trait Matrix3D extends Proxy {
  /**
  			 * The entry at position [1,1] in the matrix.
  			 */
  var m11: Double
  /**
  			 * The entry at position [1,2] in the matrix.
  			 */
  var m12: Double
  /**
  			 * The entry at position [1,3] in the matrix.
  			 */
  var m13: Double
  /**
  			 * The entry at position [1,4] in the matrix.
  			 */
  var m14: Double
  /**
  			 * The entry at position [2,1] in the matrix.
  			 */
  var m21: Double
  /**
  			 * The entry at position [2,2] in the matrix.
  			 */
  var m22: Double
  /**
  			 * The entry at position [2,3] in the matrix.
  			 */
  var m23: Double
  /**
  			 * The entry at position [2,4] in the matrix.
  			 */
  var m24: Double
  /**
  			 * The entry at position [3,1] in the matrix.
  			 */
  var m31: Double
  /**
  			 * The entry at position [3,2] in the matrix.
  			 */
  var m32: Double
  /**
  			 * The entry at position [3,3] in the matrix.
  			 */
  var m33: Double
  /**
  			 * The entry at position [3,4] in the matrix.
  			 */
  var m34: Double
  /**
  			 * The entry at position [4,1] in the matrix.
  			 */
  var m41: Double
  /**
  			 * The entry at position [4,2] in the matrix.
  			 */
  var m42: Double
  /**
  			 * The entry at position [4,3] in the matrix.
  			 */
  var m43: Double
  /**
  			 * The entry at position [4,4] in the matrix.
  			 */
  var m44: Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m11> property.
  			 */
  def getM11(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m12> property.
  			 */
  def getM12(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m13> property.
  			 */
  def getM13(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m14> property.
  			 */
  def getM14(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m21> property.
  			 */
  def getM21(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m22> property.
  			 */
  def getM22(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m23> property.
  			 */
  def getM23(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m24> property.
  			 */
  def getM24(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m31> property.
  			 */
  def getM31(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m32> property.
  			 */
  def getM32(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m33> property.
  			 */
  def getM33(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m34> property.
  			 */
  def getM34(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m41> property.
  			 */
  def getM41(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m42> property.
  			 */
  def getM42(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m43> property.
  			 */
  def getM43(): Double
  /**
  			 * Gets the value of the <Titanium.UI.3DMatrix.m44> property.
  			 */
  def getM44(): Double
  /**
  			 * Returns a matrix constructed by inverting this matrix.
  			 */
  def invert(): Matrix3D
  /**
  			 * Returns a matrix constructed by combining two existing matrix.
  			 */
  def multiply(t2: Matrix3D): Matrix3D
  /**
  			 * Returns a matrix constructed by rotating this matrix.
  			 */
  def rotate(angle: Double, x: Double, y: Double, z: Double): Matrix3D
  /**
  			 * Returns a matrix constructed by scaling this matrix.
  			 */
  def scale(sx: Double, sy: Double, sz: Double): Matrix3D
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m11> property.
  			 */
  def setM11(m11: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m12> property.
  			 */
  def setM12(m12: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m13> property.
  			 */
  def setM13(m13: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m14> property.
  			 */
  def setM14(m14: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m21> property.
  			 */
  def setM21(m21: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m22> property.
  			 */
  def setM22(m22: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m23> property.
  			 */
  def setM23(m23: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m24> property.
  			 */
  def setM24(m24: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m31> property.
  			 */
  def setM31(m31: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m32> property.
  			 */
  def setM32(m32: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m33> property.
  			 */
  def setM33(m33: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m34> property.
  			 */
  def setM34(m34: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m41> property.
  			 */
  def setM41(m41: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m42> property.
  			 */
  def setM42(m42: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m43> property.
  			 */
  def setM43(m43: Double): Unit
  /**
  			 * Sets the value of the <Titanium.UI.3DMatrix.m44> property.
  			 */
  def setM44(m44: Double): Unit
  /**
  			 * Returns a matrix constructed by translating an existing matrix.
  			 */
  def translate(tx: Double, ty: Double, tz: Double): Matrix3D
}

object Matrix3D {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getM11: CallbackTo[Double],
    getM12: CallbackTo[Double],
    getM13: CallbackTo[Double],
    getM14: CallbackTo[Double],
    getM21: CallbackTo[Double],
    getM22: CallbackTo[Double],
    getM23: CallbackTo[Double],
    getM24: CallbackTo[Double],
    getM31: CallbackTo[Double],
    getM32: CallbackTo[Double],
    getM33: CallbackTo[Double],
    getM34: CallbackTo[Double],
    getM41: CallbackTo[Double],
    getM42: CallbackTo[Double],
    getM43: CallbackTo[Double],
    getM44: CallbackTo[Double],
    invert: CallbackTo[Matrix3D],
    m11: Double,
    m12: Double,
    m13: Double,
    m14: Double,
    m21: Double,
    m22: Double,
    m23: Double,
    m24: Double,
    m31: Double,
    m32: Double,
    m33: Double,
    m34: Double,
    m41: Double,
    m42: Double,
    m43: Double,
    m44: Double,
    multiply: Matrix3D => CallbackTo[Matrix3D],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    rotate: (Double, Double, Double, Double) => CallbackTo[Matrix3D],
    scale: (Double, Double, Double) => CallbackTo[Matrix3D],
    setBubbleParent: Boolean => Callback,
    setM11: Double => Callback,
    setM12: Double => Callback,
    setM13: Double => Callback,
    setM14: Double => Callback,
    setM21: Double => Callback,
    setM22: Double => Callback,
    setM23: Double => Callback,
    setM24: Double => Callback,
    setM31: Double => Callback,
    setM32: Double => Callback,
    setM33: Double => Callback,
    setM34: Double => Callback,
    setM41: Double => Callback,
    setM42: Double => Callback,
    setM43: Double => Callback,
    setM44: Double => Callback,
    translate: (Double, Double, Double) => CallbackTo[Matrix3D],
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Matrix3D = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], m11 = m11.asInstanceOf[js.Any], m12 = m12.asInstanceOf[js.Any], m13 = m13.asInstanceOf[js.Any], m14 = m14.asInstanceOf[js.Any], m21 = m21.asInstanceOf[js.Any], m22 = m22.asInstanceOf[js.Any], m23 = m23.asInstanceOf[js.Any], m24 = m24.asInstanceOf[js.Any], m31 = m31.asInstanceOf[js.Any], m32 = m32.asInstanceOf[js.Any], m33 = m33.asInstanceOf[js.Any], m34 = m34.asInstanceOf[js.Any], m41 = m41.asInstanceOf[js.Any], m42 = m42.asInstanceOf[js.Any], m43 = m43.asInstanceOf[js.Any], m44 = m44.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getM11")(getM11.toJsFn)
    __obj.updateDynamic("getM12")(getM12.toJsFn)
    __obj.updateDynamic("getM13")(getM13.toJsFn)
    __obj.updateDynamic("getM14")(getM14.toJsFn)
    __obj.updateDynamic("getM21")(getM21.toJsFn)
    __obj.updateDynamic("getM22")(getM22.toJsFn)
    __obj.updateDynamic("getM23")(getM23.toJsFn)
    __obj.updateDynamic("getM24")(getM24.toJsFn)
    __obj.updateDynamic("getM31")(getM31.toJsFn)
    __obj.updateDynamic("getM32")(getM32.toJsFn)
    __obj.updateDynamic("getM33")(getM33.toJsFn)
    __obj.updateDynamic("getM34")(getM34.toJsFn)
    __obj.updateDynamic("getM41")(getM41.toJsFn)
    __obj.updateDynamic("getM42")(getM42.toJsFn)
    __obj.updateDynamic("getM43")(getM43.toJsFn)
    __obj.updateDynamic("getM44")(getM44.toJsFn)
    __obj.updateDynamic("invert")(invert.toJsFn)
    __obj.updateDynamic("multiply")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.UI.Matrix3D) => multiply(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("rotate")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => rotate(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("scale")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => scale(t0, t1, t2).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setM11")(js.Any.fromFunction1((t0: scala.Double) => setM11(t0).runNow()))
    __obj.updateDynamic("setM12")(js.Any.fromFunction1((t0: scala.Double) => setM12(t0).runNow()))
    __obj.updateDynamic("setM13")(js.Any.fromFunction1((t0: scala.Double) => setM13(t0).runNow()))
    __obj.updateDynamic("setM14")(js.Any.fromFunction1((t0: scala.Double) => setM14(t0).runNow()))
    __obj.updateDynamic("setM21")(js.Any.fromFunction1((t0: scala.Double) => setM21(t0).runNow()))
    __obj.updateDynamic("setM22")(js.Any.fromFunction1((t0: scala.Double) => setM22(t0).runNow()))
    __obj.updateDynamic("setM23")(js.Any.fromFunction1((t0: scala.Double) => setM23(t0).runNow()))
    __obj.updateDynamic("setM24")(js.Any.fromFunction1((t0: scala.Double) => setM24(t0).runNow()))
    __obj.updateDynamic("setM31")(js.Any.fromFunction1((t0: scala.Double) => setM31(t0).runNow()))
    __obj.updateDynamic("setM32")(js.Any.fromFunction1((t0: scala.Double) => setM32(t0).runNow()))
    __obj.updateDynamic("setM33")(js.Any.fromFunction1((t0: scala.Double) => setM33(t0).runNow()))
    __obj.updateDynamic("setM34")(js.Any.fromFunction1((t0: scala.Double) => setM34(t0).runNow()))
    __obj.updateDynamic("setM41")(js.Any.fromFunction1((t0: scala.Double) => setM41(t0).runNow()))
    __obj.updateDynamic("setM42")(js.Any.fromFunction1((t0: scala.Double) => setM42(t0).runNow()))
    __obj.updateDynamic("setM43")(js.Any.fromFunction1((t0: scala.Double) => setM43(t0).runNow()))
    __obj.updateDynamic("setM44")(js.Any.fromFunction1((t0: scala.Double) => setM44(t0).runNow()))
    __obj.updateDynamic("translate")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => translate(t0, t1, t2).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix3D]
  }
}

