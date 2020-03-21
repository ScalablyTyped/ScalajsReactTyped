package typingsJapgolly.distributionsPoissonQuantile

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint16
import typingsJapgolly.distributionsPoissonQuantile.mod.Data
import typingsJapgolly.distributionsPoissonQuantile.mod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined distributions-poisson-quantile.distributions-poisson-quantile.Options & {  dtype  :'uint16'} */
trait Optionsdtypeuint16 extends js.Object {
  /** accessor function for accessing array values */
  var accessor: js.UndefOr[js.Function2[/* d */ Data, /* i */ Double, _]] = js.undefined
  /** boolean indicating if the function should return a new data structure, default=true */
  var copy: js.UndefOr[Boolean] = js.undefined
  /** output data type, default="float64" */
  var dtype: js.UndefOr[DataType with uint16] = js.undefined
  /** mean parameter, default=1 */
  var lambda: js.UndefOr[Double] = js.undefined
  /** deep get/set key path */
  var path: js.UndefOr[String] = js.undefined
  /** deep get/set key path separator, default="." */
  var sep: js.UndefOr[String] = js.undefined
}

object Optionsdtypeuint16 {
  @scala.inline
  def apply(
    accessor: (/* d */ Data, /* i */ Double) => CallbackTo[js.Any] = null,
    copy: js.UndefOr[Boolean] = js.undefined,
    dtype: DataType with uint16 = null,
    lambda: Int | Double = null,
    path: String = null,
    sep: String = null
  ): Optionsdtypeuint16 = {
    val __obj = js.Dynamic.literal()
    if (accessor != null) __obj.updateDynamic("accessor")(js.Any.fromFunction2((t0: /* d */ typingsJapgolly.distributionsPoissonQuantile.mod.Data, t1: /* i */ scala.Double) => accessor(t0, t1).runNow()))
    if (!js.isUndefined(copy)) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sep != null) __obj.updateDynamic("sep")(sep.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsdtypeuint16]
  }
}

