package typingsJapgolly.agGrid.iAggFuncServiceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.agGrid.colDefMod.IAggFunc
import typingsJapgolly.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAggFuncService extends js.Object {
  def addAggFunc(key: String, aggFunc: IAggFunc): Unit
  def addAggFuncs(aggFuncs: StringDictionary[IAggFunc]): Unit
  def clear(): Unit
  def getDefaultAggFunc(column: Column): String
}

object IAggFuncService {
  @scala.inline
  def apply(
    addAggFunc: (String, IAggFunc) => Callback,
    addAggFuncs: StringDictionary[IAggFunc] => Callback,
    clear: Callback,
    getDefaultAggFunc: Column => CallbackTo[String]
  ): IAggFuncService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addAggFunc")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.agGrid.colDefMod.IAggFunc) => addAggFunc(t0, t1).runNow()))
    __obj.updateDynamic("addAggFuncs")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[typingsJapgolly.agGrid.colDefMod.IAggFunc]) => addAggFuncs(t0).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("getDefaultAggFunc")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.columnMod.Column) => getDefaultAggFunc(t0).runNow()))
    __obj.asInstanceOf[IAggFuncService]
  }
}

