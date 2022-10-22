package typingsJapgolly.nodeSass.mod.types

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeSass.mod.types.Null
  - typingsJapgolly.nodeSass.mod.types.Number
  - typingsJapgolly.nodeSass.mod.types.String
  - typingsJapgolly.nodeSass.mod.types.Color
  - typingsJapgolly.nodeSass.mod.types.Boolean
  - typingsJapgolly.nodeSass.mod.types.List
  - typingsJapgolly.nodeSass.mod.types.Map
*/
trait Value
  extends StObject
     with ReturnValue
object Value {
  
  inline def Boolean(getValue: CallbackTo[scala.Boolean]): typingsJapgolly.nodeSass.mod.types.Boolean = {
    val __obj = js.Dynamic.literal(getValue = getValue.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.nodeSass.mod.types.Boolean]
  }
  
  inline def Color(
    getA: CallbackTo[Double],
    getB: CallbackTo[Double],
    getG: CallbackTo[Double],
    getR: CallbackTo[Double],
    setA: Double => Callback,
    setB: Double => Callback,
    setG: Double => Callback,
    setR: Double => Callback
  ): typingsJapgolly.nodeSass.mod.types.Color = {
    val __obj = js.Dynamic.literal(getA = getA.toJsFn, getB = getB.toJsFn, getG = getG.toJsFn, getR = getR.toJsFn, setA = js.Any.fromFunction1((t0: Double) => setA(t0).runNow()), setB = js.Any.fromFunction1((t0: Double) => setB(t0).runNow()), setG = js.Any.fromFunction1((t0: Double) => setG(t0).runNow()), setR = js.Any.fromFunction1((t0: Double) => setR(t0).runNow()))
    __obj.asInstanceOf[typingsJapgolly.nodeSass.mod.types.Color]
  }
  
  inline def List(
    getLength: CallbackTo[Double],
    getSeparator: CallbackTo[scala.Boolean],
    getValue: Double => Value,
    setSeparator: scala.Boolean => Callback,
    setValue: (Double, Value) => Callback
  ): typingsJapgolly.nodeSass.mod.types.List = {
    val __obj = js.Dynamic.literal(getLength = getLength.toJsFn, getSeparator = getSeparator.toJsFn, getValue = js.Any.fromFunction1(getValue), setSeparator = js.Any.fromFunction1((t0: scala.Boolean) => setSeparator(t0).runNow()), setValue = js.Any.fromFunction2((t0: Double, t1: Value) => (setValue(t0, t1)).runNow()))
    __obj.asInstanceOf[typingsJapgolly.nodeSass.mod.types.List]
  }
  
  inline def Map(
    getKey: Double => Value,
    getLength: CallbackTo[Double],
    getValue: Double => Value,
    setKey: (Double, Value) => Callback,
    setValue: (Double, Value) => Callback
  ): typingsJapgolly.nodeSass.mod.types.Map = {
    val __obj = js.Dynamic.literal(getKey = js.Any.fromFunction1(getKey), getLength = getLength.toJsFn, getValue = js.Any.fromFunction1(getValue), setKey = js.Any.fromFunction2((t0: Double, t1: Value) => (setKey(t0, t1)).runNow()), setValue = js.Any.fromFunction2((t0: Double, t1: Value) => (setValue(t0, t1)).runNow()))
    __obj.asInstanceOf[typingsJapgolly.nodeSass.mod.types.Map]
  }
  
  inline def Null(___NULL___ : js.Symbol): typingsJapgolly.nodeSass.mod.types.Null = {
    val __obj = js.Dynamic.literal(___NULL___ = ___NULL___.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nodeSass.mod.types.Null]
  }
  
  inline def Number(
    getUnit: CallbackTo[java.lang.String],
    getValue: CallbackTo[Double],
    setUnit: java.lang.String => Callback,
    setValue: Double => Callback
  ): typingsJapgolly.nodeSass.mod.types.Number = {
    val __obj = js.Dynamic.literal(getUnit = getUnit.toJsFn, getValue = getValue.toJsFn, setUnit = js.Any.fromFunction1((t0: java.lang.String) => setUnit(t0).runNow()), setValue = js.Any.fromFunction1((t0: Double) => setValue(t0).runNow()))
    __obj.asInstanceOf[typingsJapgolly.nodeSass.mod.types.Number]
  }
  
  inline def String(getValue: CallbackTo[java.lang.String], setValue: java.lang.String => Callback): typingsJapgolly.nodeSass.mod.types.String = {
    val __obj = js.Dynamic.literal(getValue = getValue.toJsFn, setValue = js.Any.fromFunction1((t0: java.lang.String) => setValue(t0).runNow()))
    __obj.asInstanceOf[typingsJapgolly.nodeSass.mod.types.String]
  }
}
