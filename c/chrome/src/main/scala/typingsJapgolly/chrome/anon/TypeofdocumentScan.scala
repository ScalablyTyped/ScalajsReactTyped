package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.documentScan.DocumentScanCallbackArg
import typingsJapgolly.chrome.chrome.documentScan.DocumentScanOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdocumentScan extends StObject {
  
  def scan(options: DocumentScanOptions, callback: js.Function1[/* result */ DocumentScanCallbackArg, Unit]): Unit
}
object TypeofdocumentScan {
  
  inline def apply(scan: (DocumentScanOptions, js.Function1[/* result */ DocumentScanCallbackArg, Unit]) => Callback): TypeofdocumentScan = {
    val __obj = js.Dynamic.literal(scan = js.Any.fromFunction2((t0: DocumentScanOptions, t1: js.Function1[/* result */ DocumentScanCallbackArg, Unit]) => (scan(t0, t1)).runNow()))
    __obj.asInstanceOf[TypeofdocumentScan]
  }
  
  extension [Self <: TypeofdocumentScan](x: Self) {
    
    inline def setScan(value: (DocumentScanOptions, js.Function1[/* result */ DocumentScanCallbackArg, Unit]) => Callback): Self = StObject.set(x, "scan", js.Any.fromFunction2((t0: DocumentScanOptions, t1: js.Function1[/* result */ DocumentScanCallbackArg, Unit]) => (value(t0, t1)).runNow()))
  }
}
