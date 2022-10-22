package typingsJapgolly.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableElementDropzone extends StObject {
  
  var draggableElement: typingsJapgolly.interactjsTypes.coreTypesMod.Element
  
  var dropzone: this.type
}
object DraggableElementDropzone {
  
  inline def apply(
    draggableElement: typingsJapgolly.interactjsTypes.coreTypesMod.Element,
    dropzone: DraggableElementDropzone
  ): DraggableElementDropzone = {
    val __obj = js.Dynamic.literal(draggableElement = draggableElement.asInstanceOf[js.Any], dropzone = dropzone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableElementDropzone]
  }
  
  extension [Self <: DraggableElementDropzone](x: Self) {
    
    inline def setDraggableElement(value: typingsJapgolly.interactjsTypes.coreTypesMod.Element): Self = StObject.set(x, "draggableElement", value.asInstanceOf[js.Any])
    
    inline def setDropzone(value: DraggableElementDropzone): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
  }
}
