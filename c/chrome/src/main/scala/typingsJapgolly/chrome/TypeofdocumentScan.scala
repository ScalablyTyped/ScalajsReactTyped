package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.documentScan.DocumentScanCallbackArg
import typingsJapgolly.chrome.chrome.documentScan.DocumentScanOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdocumentScan extends js.Object {
  def scan(options: DocumentScanOptions, callback: js.Function1[/* result */ DocumentScanCallbackArg, Unit]): Unit
}

object TypeofdocumentScan {
  @scala.inline
  def apply(scan: (DocumentScanOptions, js.Function1[/* result */ DocumentScanCallbackArg, Unit]) => Callback): TypeofdocumentScan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scan")(js.Any.fromFunction2((t0: typingsJapgolly.chrome.chrome.documentScan.DocumentScanOptions, t1: js.Function1[
  /* result */ typingsJapgolly.chrome.chrome.documentScan.DocumentScanCallbackArg, 
  scala.Unit]) => scan(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofdocumentScan]
  }
}

