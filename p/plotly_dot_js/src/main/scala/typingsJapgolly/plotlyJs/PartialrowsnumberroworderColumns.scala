package typingsJapgolly.plotlyJs

import typingsJapgolly.plotlyJs.plotlyJsStrings.`bottom plot`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`bottom to top`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`left plot`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`right plot`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`top plot`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`top to bottom`
import typingsJapgolly.plotlyJs.plotlyJsStrings.bottom
import typingsJapgolly.plotlyJs.plotlyJsStrings.coupled
import typingsJapgolly.plotlyJs.plotlyJsStrings.independent
import typingsJapgolly.plotlyJs.plotlyJsStrings.left
import typingsJapgolly.plotlyJs.plotlyJsStrings.right
import typingsJapgolly.plotlyJs.plotlyJsStrings.top
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  rows  :number,   roworder  :'top to bottom' | 'bottom to top',   columns  :number,   subplots  :std.Array<string>,   xaxes  :std.Array<string>,   yaxes  :std.Array<string>,   pattern  :'independent' | 'coupled',   xgap  :number,   ygap  :number,   domain  :std.Partial<{  x  :std.Array<number>,   y  :std.Array<number>}>,   xside  :'bottom' | 'bottom plot' | 'top plot' | 'top',   yside  :'left' | 'left plot' | 'right plot' | 'right'}> */
trait PartialrowsnumberroworderColumns extends js.Object {
  var columns: js.UndefOr[Double] = js.undefined
  var domain: js.UndefOr[Partial[AnonX]] = js.undefined
  var pattern: js.UndefOr[independent | coupled] = js.undefined
  var roworder: js.UndefOr[(`top to bottom`) | (`bottom to top`)] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var subplots: js.UndefOr[js.Array[String]] = js.undefined
  var xaxes: js.UndefOr[js.Array[String]] = js.undefined
  var xgap: js.UndefOr[Double] = js.undefined
  var xside: js.UndefOr[bottom | (`bottom plot`) | (`top plot`) | top] = js.undefined
  var yaxes: js.UndefOr[js.Array[String]] = js.undefined
  var ygap: js.UndefOr[Double] = js.undefined
  var yside: js.UndefOr[left | (`left plot`) | (`right plot`) | right] = js.undefined
}

object PartialrowsnumberroworderColumns {
  @scala.inline
  def apply(
    columns: Int | Double = null,
    domain: Partial[AnonX] = null,
    pattern: independent | coupled = null,
    roworder: (`top to bottom`) | (`bottom to top`) = null,
    rows: Int | Double = null,
    subplots: js.Array[String] = null,
    xaxes: js.Array[String] = null,
    xgap: Int | Double = null,
    xside: bottom | (`bottom plot`) | (`top plot`) | top = null,
    yaxes: js.Array[String] = null,
    ygap: Int | Double = null,
    yside: left | (`left plot`) | (`right plot`) | right = null
  ): PartialrowsnumberroworderColumns = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (roworder != null) __obj.updateDynamic("roworder")(roworder.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (subplots != null) __obj.updateDynamic("subplots")(subplots.asInstanceOf[js.Any])
    if (xaxes != null) __obj.updateDynamic("xaxes")(xaxes.asInstanceOf[js.Any])
    if (xgap != null) __obj.updateDynamic("xgap")(xgap.asInstanceOf[js.Any])
    if (xside != null) __obj.updateDynamic("xside")(xside.asInstanceOf[js.Any])
    if (yaxes != null) __obj.updateDynamic("yaxes")(yaxes.asInstanceOf[js.Any])
    if (ygap != null) __obj.updateDynamic("ygap")(ygap.asInstanceOf[js.Any])
    if (yside != null) __obj.updateDynamic("yside")(yside.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialrowsnumberroworderColumns]
  }
}

