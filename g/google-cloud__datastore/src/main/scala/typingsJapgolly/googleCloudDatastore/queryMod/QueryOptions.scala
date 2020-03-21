package typingsJapgolly.googleCloudDatastore.queryMod

import typingsJapgolly.googleCloudDatastore.googleCloudDatastoreStrings.eventual
import typingsJapgolly.googleCloudDatastore.googleCloudDatastoreStrings.strong
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var consistency: js.UndefOr[strong | eventual] = js.undefined
  var maxApiCalls: js.UndefOr[Double] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(consistency: strong | eventual = null, maxApiCalls: Int | Double = null): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (consistency != null) __obj.updateDynamic("consistency")(consistency.asInstanceOf[js.Any])
    if (maxApiCalls != null) __obj.updateDynamic("maxApiCalls")(maxApiCalls.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

