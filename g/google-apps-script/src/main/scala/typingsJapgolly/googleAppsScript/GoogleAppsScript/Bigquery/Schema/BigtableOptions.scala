package typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigtableOptions extends js.Object {
  var columnFamilies: js.UndefOr[js.Array[BigtableColumnFamily]] = js.undefined
  var ignoreUnspecifiedColumnFamilies: js.UndefOr[Boolean] = js.undefined
  var readRowkeyAsString: js.UndefOr[Boolean] = js.undefined
}

object BigtableOptions {
  @scala.inline
  def apply(
    columnFamilies: js.Array[BigtableColumnFamily] = null,
    ignoreUnspecifiedColumnFamilies: js.UndefOr[Boolean] = js.undefined,
    readRowkeyAsString: js.UndefOr[Boolean] = js.undefined
  ): BigtableOptions = {
    val __obj = js.Dynamic.literal()
    if (columnFamilies != null) __obj.updateDynamic("columnFamilies")(columnFamilies.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnspecifiedColumnFamilies)) __obj.updateDynamic("ignoreUnspecifiedColumnFamilies")(ignoreUnspecifiedColumnFamilies.asInstanceOf[js.Any])
    if (!js.isUndefined(readRowkeyAsString)) __obj.updateDynamic("readRowkeyAsString")(readRowkeyAsString.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigtableOptions]
  }
}

