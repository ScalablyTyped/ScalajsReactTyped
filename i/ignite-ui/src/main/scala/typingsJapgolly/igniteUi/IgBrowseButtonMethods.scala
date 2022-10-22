package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgBrowseButtonMethods extends StObject {
  
  def attachFilePicker(e: js.Object, isHidden: js.Object): Unit
  
  /**
    * $(".selector").igUpload("destroy");
    */
  def destroy(): Unit
  
  def getFilePicker(): Unit
}
object IgBrowseButtonMethods {
  
  inline def apply(attachFilePicker: (js.Object, js.Object) => Callback, destroy: Callback, getFilePicker: Callback): IgBrowseButtonMethods = {
    val __obj = js.Dynamic.literal(attachFilePicker = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (attachFilePicker(t0, t1)).runNow()), destroy = destroy.toJsFn, getFilePicker = getFilePicker.toJsFn)
    __obj.asInstanceOf[IgBrowseButtonMethods]
  }
  
  extension [Self <: IgBrowseButtonMethods](x: Self) {
    
    inline def setAttachFilePicker(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "attachFilePicker", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetFilePicker(value: Callback): Self = StObject.set(x, "getFilePicker", value.toJsFn)
  }
}
