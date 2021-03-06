package typingsJapgolly.dojo.dojox.grid.enhanced.plugins.filter.FilterExpr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_FilterExpr.Matches.html
  *
  * A "regular expression match" condition expression.
  * The second operand's value will be regarded as an regular expression string.
  *
  */
@JSGlobal("dojox.grid.enhanced.plugins.filter._FilterExpr.Matches")
@js.native
class Matches () extends js.Object {
  /**
    * Implement _ConditionExpr.applyRow.
    * Apply the restriction of "two operands" and confirm operands are valid _ConditionExpr's.
    *
    * @param datarow
    * @param getter
    */
  def applyRow(datarow: js.Object, getter: js.Function2[/* row */ js.Object, /* colArg */ js.Object, js.Object]): js.Any = js.native
  /**
    * Get the name of this kind of expression.
    *
    */
  def getName(): js.Any = js.native
  /**
    * Overrided from _ConditionExpr.toObject
    *
    */
  def toObject(): js.Object = js.native
}

