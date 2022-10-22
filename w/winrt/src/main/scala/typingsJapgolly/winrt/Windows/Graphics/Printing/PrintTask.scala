package typingsJapgolly.winrt.Windows.Graphics.Printing

import typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer.DataPackagePropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintTask
  extends StObject
     with IPrintTask
object PrintTask {
  
  inline def apply(
    oncompleted: Any,
    onpreviewing: Any,
    onprogressing: Any,
    onsubmitting: Any,
    options: PrintTaskOptions,
    properties: DataPackagePropertySet,
    source: IPrintDocumentSource
  ): PrintTask = {
    val __obj = js.Dynamic.literal(oncompleted = oncompleted.asInstanceOf[js.Any], onpreviewing = onpreviewing.asInstanceOf[js.Any], onprogressing = onprogressing.asInstanceOf[js.Any], onsubmitting = onsubmitting.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTask]
  }
}
