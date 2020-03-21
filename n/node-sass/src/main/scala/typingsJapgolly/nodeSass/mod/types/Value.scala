package typingsJapgolly.nodeSass.mod.types

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeSass.mod.types.Null
  - typingsJapgolly.nodeSass.mod.types.Number
  - typingsJapgolly.nodeSass.mod.types.String
  - typingsJapgolly.nodeSass.mod.types.Color
  - typingsJapgolly.nodeSass.mod.types.Boolean
  - typingsJapgolly.nodeSass.mod.types.List
  - typingsJapgolly.nodeSass.mod.types.Map
*/
trait Value extends ReturnValue

object Value {
  @scala.inline
  def String(getValue: CallbackTo[java.lang.String], setValue: java.lang.String => Callback): Value = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: java.lang.String) => setValue(t0).runNow()))
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  def List(
    getLength: CallbackTo[Double],
    getSeparator: CallbackTo[scala.Boolean],
    getValue: Double => CallbackTo[Value],
    setSeparator: scala.Boolean => Callback,
    setValue: (Double, Value) => Callback
  ): Value = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getSeparator")(getSeparator.toJsFn)
    __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: scala.Double) => getValue(t0).runNow()))
    __obj.updateDynamic("setSeparator")(js.Any.fromFunction1((t0: scala.Boolean) => setSeparator(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.nodeSass.mod.types.Value) => setValue(t0, t1).runNow()))
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  def Number(
    getUnit: CallbackTo[java.lang.String],
    getValue: CallbackTo[Double],
    setUnit: java.lang.String => Callback,
    setValue: Double => Callback
  ): Value = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getUnit")(getUnit.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("setUnit")(js.Any.fromFunction1((t0: java.lang.String) => setUnit(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: scala.Double) => setValue(t0).runNow()))
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  def Null(___NULL___ : js.Symbol): Value = {
    val __obj = js.Dynamic.literal(___NULL___ = ___NULL___.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  def Boolean(getValue: CallbackTo[scala.Boolean]): Value = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  def Map(
    getKey: Double => CallbackTo[Value],
    getLength: CallbackTo[Double],
    getValue: Double => CallbackTo[Value],
    setKey: (Double, Value) => Callback,
    setValue: (Double, Value) => Callback
  ): Value = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getKey")(js.Any.fromFunction1((t0: scala.Double) => getKey(t0).runNow()))
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: scala.Double) => getValue(t0).runNow()))
    __obj.updateDynamic("setKey")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.nodeSass.mod.types.Value) => setKey(t0, t1).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.nodeSass.mod.types.Value) => setValue(t0, t1).runNow()))
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  def Color(
    getA: CallbackTo[Double],
    getB: CallbackTo[Double],
    getG: CallbackTo[Double],
    getR: CallbackTo[Double],
    setA: Double => Callback,
    setB: Double => Callback,
    setG: Double => Callback,
    setR: Double => Callback
  ): Value = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getA")(getA.toJsFn)
    __obj.updateDynamic("getB")(getB.toJsFn)
    __obj.updateDynamic("getG")(getG.toJsFn)
    __obj.updateDynamic("getR")(getR.toJsFn)
    __obj.updateDynamic("setA")(js.Any.fromFunction1((t0: scala.Double) => setA(t0).runNow()))
    __obj.updateDynamic("setB")(js.Any.fromFunction1((t0: scala.Double) => setB(t0).runNow()))
    __obj.updateDynamic("setG")(js.Any.fromFunction1((t0: scala.Double) => setG(t0).runNow()))
    __obj.updateDynamic("setR")(js.Any.fromFunction1((t0: scala.Double) => setR(t0).runNow()))
    __obj.asInstanceOf[Value]
  }
}

