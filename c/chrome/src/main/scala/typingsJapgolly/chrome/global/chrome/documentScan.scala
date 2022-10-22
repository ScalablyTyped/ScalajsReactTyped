package typingsJapgolly.chrome.global.chrome

import typingsJapgolly.chrome.chrome.documentScan.DocumentScanCallbackArg
import typingsJapgolly.chrome.chrome.documentScan.DocumentScanOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Document Scan
////////////////////
/**
  * Use the chrome.documentScan API to discover and retrieve images from attached paper document scanners.
  * Availability: Since Chrome 44.
  * Permissions:  "documentScan"
  * Important: This API works only on Chrome OS.
  */
object documentScan {
  
  @JSGlobal("chrome.documentScan")
  @js.native
  val ^ : js.Any = js.native
  
  inline def scan(options: DocumentScanOptions, callback: js.Function1[/* result */ DocumentScanCallbackArg, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
