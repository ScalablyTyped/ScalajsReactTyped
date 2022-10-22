package typingsJapgolly.handsontable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import typingsJapgolly.handsontable.handsontableStrings.after
import typingsJapgolly.handsontable.handsontableStrings.before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortcutsContextMod {
  
  trait Context extends StObject {
    
    def addShortcut(shortcut: Shortcut): Unit
    
    def addShortcuts(shortcuts: js.Array[Shortcut]): Unit
    
    def getShortcuts(): js.Array[Shortcut]
    
    def hasShortcut(keys: js.Array[String]): Boolean
    
    def removeShortcutsByGroup(group: String): Unit
    
    def removeShortcutsByKeys(keys: js.Array[String]): Unit
  }
  object Context {
    
    inline def apply(
      addShortcut: Shortcut => Callback,
      addShortcuts: js.Array[Shortcut] => Callback,
      getShortcuts: CallbackTo[js.Array[Shortcut]],
      hasShortcut: js.Array[String] => Boolean,
      removeShortcutsByGroup: String => Callback,
      removeShortcutsByKeys: js.Array[String] => Callback
    ): Context = {
      val __obj = js.Dynamic.literal(addShortcut = js.Any.fromFunction1((t0: Shortcut) => addShortcut(t0).runNow()), addShortcuts = js.Any.fromFunction1((t0: js.Array[Shortcut]) => addShortcuts(t0).runNow()), getShortcuts = getShortcuts.toJsFn, hasShortcut = js.Any.fromFunction1(hasShortcut), removeShortcutsByGroup = js.Any.fromFunction1((t0: String) => removeShortcutsByGroup(t0).runNow()), removeShortcutsByKeys = js.Any.fromFunction1((t0: js.Array[String]) => removeShortcutsByKeys(t0).runNow()))
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setAddShortcut(value: Shortcut => Callback): Self = StObject.set(x, "addShortcut", js.Any.fromFunction1((t0: Shortcut) => value(t0).runNow()))
      
      inline def setAddShortcuts(value: js.Array[Shortcut] => Callback): Self = StObject.set(x, "addShortcuts", js.Any.fromFunction1((t0: js.Array[Shortcut]) => value(t0).runNow()))
      
      inline def setGetShortcuts(value: CallbackTo[js.Array[Shortcut]]): Self = StObject.set(x, "getShortcuts", value.toJsFn)
      
      inline def setHasShortcut(value: js.Array[String] => Boolean): Self = StObject.set(x, "hasShortcut", js.Any.fromFunction1(value))
      
      inline def setRemoveShortcutsByGroup(value: String => Callback): Self = StObject.set(x, "removeShortcutsByGroup", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveShortcutsByKeys(value: js.Array[String] => Callback): Self = StObject.set(x, "removeShortcutsByKeys", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    }
  }
  
  trait Shortcut extends StObject {
    
    def callback(event: Event): Boolean | Unit
    
    var captureCtrl: js.UndefOr[Boolean] = js.undefined
    
    var group: String
    
    var keys: js.Array[js.Array[String]]
    
    var position: js.UndefOr[before | after] = js.undefined
    
    var preventDefault: js.UndefOr[Boolean] = js.undefined
    
    var relativeToGroup: js.UndefOr[String] = js.undefined
    
    var runOnlyIf: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var stopPropagation: js.UndefOr[Boolean] = js.undefined
  }
  object Shortcut {
    
    inline def apply(callback: Event => Boolean | Unit, group: String, keys: js.Array[js.Array[String]]): Shortcut = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), group = group.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shortcut]
    }
    
    extension [Self <: Shortcut](x: Self) {
      
      inline def setCallback(value: Event => Boolean | Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCaptureCtrl(value: Boolean): Self = StObject.set(x, "captureCtrl", value.asInstanceOf[js.Any])
      
      inline def setCaptureCtrlUndefined: Self = StObject.set(x, "captureCtrl", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: js.Array[js.Array[String]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: js.Array[String]*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setPosition(value: before | after): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setRelativeToGroup(value: String): Self = StObject.set(x, "relativeToGroup", value.asInstanceOf[js.Any])
      
      inline def setRelativeToGroupUndefined: Self = StObject.set(x, "relativeToGroup", js.undefined)
      
      inline def setRunOnlyIf(value: CallbackTo[Boolean]): Self = StObject.set(x, "runOnlyIf", value.toJsFn)
      
      inline def setRunOnlyIfUndefined: Self = StObject.set(x, "runOnlyIf", js.undefined)
      
      inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
    }
  }
}
