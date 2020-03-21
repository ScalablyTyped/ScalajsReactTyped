package typingsJapgolly.chromeApps.chrome.printerProvider

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event fired when print manager requests printers provided by extensions. */
@JSGlobal("chrome.printerProvider.onGetPrintersRequested")
@js.native
object onGetPrintersRequested
  extends TopLevel[
      Event[
        js.Function1[
          /* resultCallback */ js.Function1[/* printerInfo */ js.Array[PrinterInfo], Unit], 
          Unit
        ]
      ]
    ]

