package typingsJapgolly.tabulatorTables.Tabulator

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsDownload extends js.Object {
  /** The downloadComplete callback is triggered when the user has been prompted to download the file. */
  var downloadComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** By default Tabulator includes column headers, row groups and column calculations in the download output.
    You can choose to remove column headers groups, row groups or column calculations from the output data by setting the values in the downloadConfig option in the table definition: */
  var downloadConfig: js.UndefOr[AddditionalExportOptions] = js.undefined
  /** If you want to make any bulk changes to the table data before it is parsed into the download file you can pass a mutator function to the downloadDataFormatter option in the table definition */
  var downloadDataFormatter: js.UndefOr[js.Function1[/* data */ js.Array[_], _]] = js.undefined
  /** The downloadReady callback allows you to intercept the download file data before the users is prompted to save the file.
    In order for the download to proceed the downloadReady callback is expected to return a blob of file to be downloaded.
    If you would prefer to abort the download you can return false from this callback. This could be useful for example if you want to send the created file to a server via ajax rather than allowing the user to download the file. */
  var downloadReady: js.UndefOr[js.Function2[/* fileContents */ js.Any, /* blob */ js.Any, _]] = js.undefined
}

object OptionsDownload {
  @scala.inline
  def apply(
    downloadComplete: js.UndefOr[Callback] = js.undefined,
    downloadConfig: AddditionalExportOptions = null,
    downloadDataFormatter: /* data */ js.Array[js.Any] => CallbackTo[js.Any] = null,
    downloadReady: (/* fileContents */ js.Any, /* blob */ js.Any) => CallbackTo[js.Any] = null
  ): OptionsDownload = {
    val __obj = js.Dynamic.literal()
    downloadComplete.foreach(p => __obj.updateDynamic("downloadComplete")(p.toJsFn))
    if (downloadConfig != null) __obj.updateDynamic("downloadConfig")(downloadConfig.asInstanceOf[js.Any])
    if (downloadDataFormatter != null) __obj.updateDynamic("downloadDataFormatter")(js.Any.fromFunction1((t0: /* data */ js.Array[js.Any]) => downloadDataFormatter(t0).runNow()))
    if (downloadReady != null) __obj.updateDynamic("downloadReady")(js.Any.fromFunction2((t0: /* fileContents */ js.Any, t1: /* blob */ js.Any) => downloadReady(t0, t1).runNow()))
    __obj.asInstanceOf[OptionsDownload]
  }
}

