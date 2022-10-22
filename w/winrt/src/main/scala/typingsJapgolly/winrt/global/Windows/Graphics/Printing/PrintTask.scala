package typingsJapgolly.winrt.global.Windows.Graphics.Printing

import typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer.DataPackagePropertySet
import typingsJapgolly.winrt.Windows.Graphics.Printing.IPrintDocumentSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Graphics.Printing.PrintTask")
@js.native
open class PrintTask ()
  extends StObject
     with typingsJapgolly.winrt.Windows.Graphics.Printing.PrintTask {
  
  /* CompleteClass */
  var oncompleted: Any = js.native
  
  /* CompleteClass */
  var onpreviewing: Any = js.native
  
  /* CompleteClass */
  var onprogressing: Any = js.native
  
  /* CompleteClass */
  var onsubmitting: Any = js.native
  
  /* CompleteClass */
  var options: typingsJapgolly.winrt.Windows.Graphics.Printing.PrintTaskOptions = js.native
  
  /* CompleteClass */
  var properties: DataPackagePropertySet = js.native
  
  /* CompleteClass */
  var source: IPrintDocumentSource = js.native
}
