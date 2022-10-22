package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Context information in case of a {@link FilePicker} event. */
trait FilePickerEvent
  extends StObject
     with EventObject {
  
  /**
    * @param ElementId Identifies the affected element
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    */
  var ElementId: Double
}
object FilePickerEvent {
  
  inline def apply(ElementId: Double, Source: XInterface): FilePickerEvent = {
    val __obj = js.Dynamic.literal(ElementId = ElementId.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePickerEvent]
  }
  
  extension [Self <: FilePickerEvent](x: Self) {
    
    inline def setElementId(value: Double): Self = StObject.set(x, "ElementId", value.asInstanceOf[js.Any])
  }
}
