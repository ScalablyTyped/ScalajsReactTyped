package typingsJapgolly.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object printerProvider {
  type CapabilityRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* printerId */ java.lang.String, 
      /* resultCallback */ js.Function1[
        /* capabilities */ typingsJapgolly.chrome.chrome.printerProvider.PrinterCapabilities, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  type PrintRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* printJob */ typingsJapgolly.chrome.chrome.printerProvider.PrintJob, 
      /* resultCallback */ js.Function1[/* result */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type PrinterInfoRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* device */ js.Any, 
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.UndefOr[typingsJapgolly.chrome.chrome.printerProvider.PrinterInfo], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  type PrinterRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.Array[typingsJapgolly.chrome.chrome.printerProvider.PrinterInfo], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
}
