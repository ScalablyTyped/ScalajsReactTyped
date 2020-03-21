package typingsJapgolly.connectAzuretables.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureTableStoreOptions extends js.Object {
  var accessKey: js.UndefOr[String] = js.undefined
  var errorLogger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  var logger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
   // sessionTimeOut in minutes
  var overrideCron: js.UndefOr[String] = js.undefined
  var sessionTimeOut: js.UndefOr[Double] = js.undefined
   // cron job description
  var storageAccount: js.UndefOr[String] = js.undefined
  var table: js.UndefOr[String] = js.undefined
}

object AzureTableStoreOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    errorLogger: /* message */ String => Callback = null,
    logger: /* message */ String => Callback = null,
    overrideCron: String = null,
    sessionTimeOut: Int | Double = null,
    storageAccount: String = null,
    table: String = null
  ): AzureTableStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (errorLogger != null) __obj.updateDynamic("errorLogger")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => errorLogger(t0).runNow()))
    if (logger != null) __obj.updateDynamic("logger")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => logger(t0).runNow()))
    if (overrideCron != null) __obj.updateDynamic("overrideCron")(overrideCron.asInstanceOf[js.Any])
    if (sessionTimeOut != null) __obj.updateDynamic("sessionTimeOut")(sessionTimeOut.asInstanceOf[js.Any])
    if (storageAccount != null) __obj.updateDynamic("storageAccount")(storageAccount.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureTableStoreOptions]
  }
}

