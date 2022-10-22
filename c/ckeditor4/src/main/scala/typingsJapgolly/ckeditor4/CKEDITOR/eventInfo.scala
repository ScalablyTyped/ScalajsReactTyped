package typingsJapgolly.ckeditor4.CKEDITOR

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait eventInfo extends StObject {
  
  def cancel(): Unit
  
  var data: Any
  
  var editor: typingsJapgolly.ckeditor4.CKEDITOR.editor
  
  var listenerData: Any
  
  var name: String
  
  def removeListener(): Unit
  
  var sender: StringDictionary[Any]
  
  def stop(): Unit
}
object eventInfo {
  
  inline def apply(
    cancel: Callback,
    data: Any,
    editor: editor,
    listenerData: Any,
    name: String,
    removeListener: Callback,
    sender: StringDictionary[Any],
    stop: Callback
  ): eventInfo = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, data = data.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], listenerData = listenerData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removeListener = removeListener.toJsFn, sender = sender.asInstanceOf[js.Any], stop = stop.toJsFn)
    __obj.asInstanceOf[eventInfo]
  }
  
  extension [Self <: eventInfo](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEditor(value: editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setListenerData(value: Any): Self = StObject.set(x, "listenerData", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemoveListener(value: Callback): Self = StObject.set(x, "removeListener", value.toJsFn)
    
    inline def setSender(value: StringDictionary[Any]): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
