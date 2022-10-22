package typingsJapgolly.photonui.photonui

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//Widgets
trait FileManager
  extends StObject
     with Base {
  
  var acceptedExts: js.Array[String]
  
  var acceptedMimes: js.Array[String]
  
  var dropZone: HTMLElement
  
  var multiselect: Boolean
  
  def open(): Unit
}
object FileManager {
  
  inline def apply(
    acceptedExts: js.Array[String],
    acceptedMimes: js.Array[String],
    destroy: Callback,
    dropZone: HTMLElement,
    multiselect: Boolean,
    open: Callback,
    registerCallback: (String, String, js.Function, Any) => Callback,
    removeCallback: String => Callback
  ): FileManager = {
    val __obj = js.Dynamic.literal(acceptedExts = acceptedExts.asInstanceOf[js.Any], acceptedMimes = acceptedMimes.asInstanceOf[js.Any], destroy = destroy.toJsFn, dropZone = dropZone.asInstanceOf[js.Any], multiselect = multiselect.asInstanceOf[js.Any], open = open.toJsFn, registerCallback = js.Any.fromFunction4((t0: String, t1: String, t2: js.Function, t3: Any) => (registerCallback(t0, t1, t2, t3)).runNow()), removeCallback = js.Any.fromFunction1((t0: String) => removeCallback(t0).runNow()))
    __obj.asInstanceOf[FileManager]
  }
  
  extension [Self <: FileManager](x: Self) {
    
    inline def setAcceptedExts(value: js.Array[String]): Self = StObject.set(x, "acceptedExts", value.asInstanceOf[js.Any])
    
    inline def setAcceptedExtsVarargs(value: String*): Self = StObject.set(x, "acceptedExts", js.Array(value*))
    
    inline def setAcceptedMimes(value: js.Array[String]): Self = StObject.set(x, "acceptedMimes", value.asInstanceOf[js.Any])
    
    inline def setAcceptedMimesVarargs(value: String*): Self = StObject.set(x, "acceptedMimes", js.Array(value*))
    
    inline def setDropZone(value: HTMLElement): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
    
    inline def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
  }
}
