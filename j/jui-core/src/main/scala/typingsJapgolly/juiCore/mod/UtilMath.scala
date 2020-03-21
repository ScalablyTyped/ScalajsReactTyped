package typingsJapgolly.juiCore.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilMath extends js.Object {
  def angle(x1: Double, y1: Double, x2: Double, y2: Double): Double
  /**
    * convert radian to degree
    *
    * @return degree
    */
  def degree(radian: Double): Double
  def div(a: Double, b: Double): Double
  /**
    * a, b 의 중간값 계산을 위한 callback 함수 만들기
    *
    * @param a	first value
    * @param b 	second value
    */
  def interpolateNumber(a: Double, b: Double): js.Function0[Unit]
  // 중간값 round 해서 계산하기
  def interpolateRound(a: Double, b: Double): js.Function0[Unit]
  def inverseMatrix3d(a: js.Array[_]): js.Array[_]
  def matrix[T](a: js.Array[T], b: js.Array[T]): js.Array[T]
  def matrix3d[T](a: js.Array[T], b: js.Array[T]): js.Array[T]
  def minus(a: Double, b: Double): Double
  def multi(a: Double, b: Double): Double
  /**
    * 특정 구간의 값을 자동으로 계산
    */
  def nice(min: Double, max: Double, ticks: Double, isNice: Boolean): js.Any
  def plus(a: Double, b: Double): Double
  /**
    * convert degree to radian
    *
    * @return radian
    */
  def radian(degree: Double): Double
  def remain(a: Double, b: Double): Double
  def resize(maxWidth: Double, maxHeight: Double, objectWidth: Double, objectHeight: Double): js.Any
  /**
    * 2d rotate
    *
    * @param radian	roate 할 radian
    * @return return.x  변환된 x
    * @return return.y  변환된 y
    *
    */
  def rotate(x: Double, y: Double, radian: Double): js.Any
  def round(num: Double, fixed: Double): Double
}

object UtilMath {
  @scala.inline
  def apply(
    angle: (Double, Double, Double, Double) => CallbackTo[Double],
    degree: Double => CallbackTo[Double],
    div: (Double, Double) => CallbackTo[Double],
    interpolateNumber: (Double, Double) => CallbackTo[js.Function0[Unit]],
    interpolateRound: (Double, Double) => CallbackTo[js.Function0[Unit]],
    inverseMatrix3d: js.Array[js.Any] => CallbackTo[js.Array[js.Any]],
    matrix: (js.Array[js.Any], js.Array[js.Any]) => CallbackTo[js.Array[js.Any]],
    matrix3d: (js.Array[js.Any], js.Array[js.Any]) => CallbackTo[js.Array[js.Any]],
    minus: (Double, Double) => CallbackTo[Double],
    multi: (Double, Double) => CallbackTo[Double],
    nice: (Double, Double, Double, Boolean) => CallbackTo[js.Any],
    plus: (Double, Double) => CallbackTo[Double],
    radian: Double => CallbackTo[Double],
    remain: (Double, Double) => CallbackTo[Double],
    resize: (Double, Double, Double, Double) => CallbackTo[js.Any],
    rotate: (Double, Double, Double) => CallbackTo[js.Any],
    round: (Double, Double) => CallbackTo[Double]
  ): UtilMath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("angle")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => angle(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("degree")(js.Any.fromFunction1((t0: scala.Double) => degree(t0).runNow()))
    __obj.updateDynamic("div")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => div(t0, t1).runNow()))
    __obj.updateDynamic("interpolateNumber")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => interpolateNumber(t0, t1).runNow()))
    __obj.updateDynamic("interpolateRound")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => interpolateRound(t0, t1).runNow()))
    __obj.updateDynamic("inverseMatrix3d")(js.Any.fromFunction1((t0: js.Array[js.Any]) => inverseMatrix3d(t0).runNow()))
    __obj.updateDynamic("matrix")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: js.Array[js.Any]) => matrix(t0, t1).runNow()))
    __obj.updateDynamic("matrix3d")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: js.Array[js.Any]) => matrix3d(t0, t1).runNow()))
    __obj.updateDynamic("minus")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => minus(t0, t1).runNow()))
    __obj.updateDynamic("multi")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => multi(t0, t1).runNow()))
    __obj.updateDynamic("nice")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Boolean) => nice(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("plus")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => plus(t0, t1).runNow()))
    __obj.updateDynamic("radian")(js.Any.fromFunction1((t0: scala.Double) => radian(t0).runNow()))
    __obj.updateDynamic("remain")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => remain(t0, t1).runNow()))
    __obj.updateDynamic("resize")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => resize(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("rotate")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => rotate(t0, t1, t2).runNow()))
    __obj.updateDynamic("round")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => round(t0, t1).runNow()))
    __obj.asInstanceOf[UtilMath]
  }
}

