package typingsJapgolly.winrt.global.Windows.Graphics.Printing

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
open class PrintManager ()
  extends StObject
     with typingsJapgolly.winrt.Windows.Graphics.Printing.PrintManager {
  
  /* CompleteClass */
  var onprinttaskrequested: Any = js.native
}
/* static members */
object PrintManager {
  
  @JSGlobal("Windows.Graphics.Printing.PrintManager")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getForCurrentView(): typingsJapgolly.winrt.Windows.Graphics.Printing.PrintManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typingsJapgolly.winrt.Windows.Graphics.Printing.PrintManager]
  
  inline def showPrintUIAsync(): IAsyncOperation[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("showPrintUIAsync")().asInstanceOf[IAsyncOperation[Boolean]]
}
