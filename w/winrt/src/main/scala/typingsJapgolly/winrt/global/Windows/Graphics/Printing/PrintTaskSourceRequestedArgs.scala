package typingsJapgolly.winrt.global.Windows.Graphics.Printing

import typingsJapgolly.winrt.Windows.Graphics.Printing.IPrintDocumentSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Graphics.Printing.PrintTaskSourceRequestedArgs")
@js.native
open class PrintTaskSourceRequestedArgs ()
  extends StObject
     with typingsJapgolly.winrt.Windows.Graphics.Printing.PrintTaskSourceRequestedArgs {
  
  /* CompleteClass */
  var deadline: js.Date = js.native
  
  /* CompleteClass */
  override def getDeferral(): typingsJapgolly.winrt.Windows.Graphics.Printing.PrintTaskSourceRequestedDeferral = js.native
  
  /* CompleteClass */
  override def setSource(source: IPrintDocumentSource): Unit = js.native
}
