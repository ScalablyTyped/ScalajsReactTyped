package typingsJapgolly.winrt.global.Windows.Graphics.Printing

import typingsJapgolly.winrt.Windows.Graphics.Printing.PrintTaskSourceRequestedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Graphics.Printing.PrintTaskRequest")
@js.native
open class PrintTaskRequest ()
  extends StObject
     with typingsJapgolly.winrt.Windows.Graphics.Printing.PrintTaskRequest {
  
  /* CompleteClass */
  override def createPrintTask(title: String, handler: PrintTaskSourceRequestedHandler): typingsJapgolly.winrt.Windows.Graphics.Printing.PrintTask = js.native
  
  /* CompleteClass */
  var deadline: js.Date = js.native
  
  /* CompleteClass */
  override def getDeferral(): typingsJapgolly.winrt.Windows.Graphics.Printing.PrintTaskRequestedDeferral = js.native
}
