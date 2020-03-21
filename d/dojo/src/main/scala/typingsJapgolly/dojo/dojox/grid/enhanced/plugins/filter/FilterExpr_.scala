package typingsJapgolly.dojo.dojox.grid.enhanced.plugins.filter

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_FilterExpr.html
  *
  *
  */
trait FilterExpr_ extends js.Object {
  /**
    *
    */
  def BooleanExpr(): Unit
  /**
    *
    */
  def Contains(): Unit
  /**
    *
    */
  def DateExpr(): Unit
  /**
    *
    */
  def EndsWith(): Unit
  /**
    *
    */
  def EqualTo(): Unit
  /**
    *
    */
  def IsEmpty(): Unit
  /**
    *
    */
  def LargerThan(): Unit
  /**
    *
    */
  def LargerThanOrEqualTo(): Unit
  /**
    *
    */
  def LessThan(): Unit
  /**
    *
    */
  def LessThanOrEqualTo(): Unit
  /**
    *
    */
  def LogicALL(): Unit
  /**
    *
    */
  def LogicAND(): Unit
  /**
    *
    */
  def LogicANY(): Unit
  /**
    *
    */
  def LogicNOT(): Unit
  /**
    *
    */
  def LogicOR(): Unit
  /**
    *
    */
  def LogicXOR(): Unit
  /**
    *
    */
  def Matches(): Unit
  /**
    *
    */
  def NumberExpr(): Unit
  /**
    *
    */
  def StartsWith(): Unit
  /**
    *
    */
  def StringExpr(): Unit
  /**
    *
    */
  def TimeExpr(): Unit
}

object FilterExpr_ {
  @scala.inline
  def apply(
    BooleanExpr: Callback,
    Contains: Callback,
    DateExpr: Callback,
    EndsWith: Callback,
    EqualTo: Callback,
    IsEmpty: Callback,
    LargerThan: Callback,
    LargerThanOrEqualTo: Callback,
    LessThan: Callback,
    LessThanOrEqualTo: Callback,
    LogicALL: Callback,
    LogicAND: Callback,
    LogicANY: Callback,
    LogicNOT: Callback,
    LogicOR: Callback,
    LogicXOR: Callback,
    Matches: Callback,
    NumberExpr: Callback,
    StartsWith: Callback,
    StringExpr: Callback,
    TimeExpr: Callback
  ): FilterExpr_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BooleanExpr")(BooleanExpr.toJsFn)
    __obj.updateDynamic("Contains")(Contains.toJsFn)
    __obj.updateDynamic("DateExpr")(DateExpr.toJsFn)
    __obj.updateDynamic("EndsWith")(EndsWith.toJsFn)
    __obj.updateDynamic("EqualTo")(EqualTo.toJsFn)
    __obj.updateDynamic("IsEmpty")(IsEmpty.toJsFn)
    __obj.updateDynamic("LargerThan")(LargerThan.toJsFn)
    __obj.updateDynamic("LargerThanOrEqualTo")(LargerThanOrEqualTo.toJsFn)
    __obj.updateDynamic("LessThan")(LessThan.toJsFn)
    __obj.updateDynamic("LessThanOrEqualTo")(LessThanOrEqualTo.toJsFn)
    __obj.updateDynamic("LogicALL")(LogicALL.toJsFn)
    __obj.updateDynamic("LogicAND")(LogicAND.toJsFn)
    __obj.updateDynamic("LogicANY")(LogicANY.toJsFn)
    __obj.updateDynamic("LogicNOT")(LogicNOT.toJsFn)
    __obj.updateDynamic("LogicOR")(LogicOR.toJsFn)
    __obj.updateDynamic("LogicXOR")(LogicXOR.toJsFn)
    __obj.updateDynamic("Matches")(Matches.toJsFn)
    __obj.updateDynamic("NumberExpr")(NumberExpr.toJsFn)
    __obj.updateDynamic("StartsWith")(StartsWith.toJsFn)
    __obj.updateDynamic("StringExpr")(StringExpr.toJsFn)
    __obj.updateDynamic("TimeExpr")(TimeExpr.toJsFn)
    __obj.asInstanceOf[FilterExpr_]
  }
}

