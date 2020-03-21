package typingsJapgolly.chromeApps

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.documentScan.DocumentScanCallbackArg
import typingsJapgolly.chromeApps.chrome.documentScan.DocumentScanOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdocumentScan extends js.Object {
  /**
    * Performs a document scan. On success, the PNG data will be sent to the callback.
    * @param options Object containing scan parameters.
    * @param callback Called with the result and data from the scan.
    */
  def scan(options: DocumentScanOptions, callback: js.Function1[/* result */ DocumentScanCallbackArg, Unit]): Unit
}

object TypeofdocumentScan {
  @scala.inline
  def apply(scan: (DocumentScanOptions, js.Function1[/* result */ DocumentScanCallbackArg, Unit]) => Callback): TypeofdocumentScan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scan")(js.Any.fromFunction2((t0: typingsJapgolly.chromeApps.chrome.documentScan.DocumentScanOptions, t1: js.Function1[
  /* result */ typingsJapgolly.chromeApps.chrome.documentScan.DocumentScanCallbackArg, 
  scala.Unit]) => scan(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofdocumentScan]
  }
}

