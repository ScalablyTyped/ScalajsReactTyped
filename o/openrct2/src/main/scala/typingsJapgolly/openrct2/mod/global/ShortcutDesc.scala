package typingsJapgolly.openrct2.mod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShortcutDesc extends StObject {
  
  /**
    * Default bindings for the shortcut.
    * E.g. `["CTRL+SHIFT+L", "MOUSE 3"]`
    */
  var bindings: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Function to call when the shortcut is invoked.
    */
  def callback(): Unit
  
  /**
    * The unique identifier for the shortcut.
    * If the identifier already exists, the shortcut will not be registered.
    * Use full stops to group shortcuts together, e.g. `yourplugin.somewindow.apply`.
    */
  var id: String
  
  /**
    * The display text for the shortcut.
    */
  var text: String
}
object ShortcutDesc {
  
  inline def apply(callback: Callback, id: String, text: String): ShortcutDesc = {
    val __obj = js.Dynamic.literal(callback = callback.toJsFn, id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutDesc]
  }
  
  extension [Self <: ShortcutDesc](x: Self) {
    
    inline def setBindings(value: js.Array[String]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setBindingsVarargs(value: String*): Self = StObject.set(x, "bindings", js.Array(value*))
    
    inline def setCallback(value: Callback): Self = StObject.set(x, "callback", value.toJsFn)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
