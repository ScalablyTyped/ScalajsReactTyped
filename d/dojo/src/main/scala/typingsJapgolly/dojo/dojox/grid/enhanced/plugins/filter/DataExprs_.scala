package typingsJapgolly.dojo.dojox.grid.enhanced.plugins.filter

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_DataExprs.html
  *
  *
  */
trait DataExprs_ extends js.Object {
  /**
    *
    */
  def BooleanExpr(): Unit
  /**
    *
    */
  def DateExpr(): Unit
  /**
    *
    */
  def NumberExpr(): Unit
  /**
    *
    */
  def StringExpr(): Unit
  /**
    *
    */
  def TimeExpr(): Unit
}

object DataExprs_ {
  @scala.inline
  def apply(
    BooleanExpr: Callback,
    DateExpr: Callback,
    NumberExpr: Callback,
    StringExpr: Callback,
    TimeExpr: Callback
  ): DataExprs_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BooleanExpr")(BooleanExpr.toJsFn)
    __obj.updateDynamic("DateExpr")(DateExpr.toJsFn)
    __obj.updateDynamic("NumberExpr")(NumberExpr.toJsFn)
    __obj.updateDynamic("StringExpr")(StringExpr.toJsFn)
    __obj.updateDynamic("TimeExpr")(TimeExpr.toJsFn)
    __obj.asInstanceOf[DataExprs_]
  }
}

