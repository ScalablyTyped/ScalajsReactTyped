package typingsJapgolly.winrtUwp.Windows.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Printing {
  /** Occurs when a print task requests the document to print. The supplied print document must implement the IPrintDocumentSource interface. */
  type PrintTaskSourceRequestedHandler = js.Function1[
    /* args */ typingsJapgolly.winrtUwp.Windows.Graphics.Printing.PrintTaskSourceRequestedArgs, 
    scala.Unit
  ]
}
