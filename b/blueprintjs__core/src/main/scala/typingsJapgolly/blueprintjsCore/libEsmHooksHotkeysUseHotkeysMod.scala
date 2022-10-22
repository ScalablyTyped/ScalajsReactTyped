package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.blueprintjsCore.libEsmHooksHotkeysHotkeyConfigMod.HotkeyConfig
import typingsJapgolly.react.mod.KeyboardEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmHooksHotkeysUseHotkeysMod {
  
  @JSImport("@blueprintjs/core/lib/esm/hooks/hotkeys/useHotkeys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useHotkeys(keys: js.Array[HotkeyConfig]): UseHotkeysReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useHotkeys")(keys.asInstanceOf[js.Any]).asInstanceOf[UseHotkeysReturnValue]
  inline def useHotkeys(keys: js.Array[HotkeyConfig], options: UseHotkeysOptions): UseHotkeysReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useHotkeys")(keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseHotkeysReturnValue]
  
  trait UseHotkeysOptions extends StObject {
    
    /**
      * A custom document to reference when binding global event handlers.
      * This can be useful when using iframes in an application.
      *
      * @default window.document
      */
    var document: js.UndefOr[Document] = js.undefined
    
    /**
      * The key combo which will trigger the hotkeys dialog to open.
      *
      * @default "?"
      */
    var showDialogKeyCombo: js.UndefOr[String] = js.undefined
  }
  object UseHotkeysOptions {
    
    inline def apply(): UseHotkeysOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseHotkeysOptions]
    }
    
    extension [Self <: UseHotkeysOptions](x: Self) {
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setShowDialogKeyCombo(value: String): Self = StObject.set(x, "showDialogKeyCombo", value.asInstanceOf[js.Any])
      
      inline def setShowDialogKeyComboUndefined: Self = StObject.set(x, "showDialogKeyCombo", js.undefined)
    }
  }
  
  trait UseHotkeysReturnValue extends StObject {
    
    var handleKeyDown: KeyboardEventHandler[HTMLElement]
    
    var handleKeyUp: KeyboardEventHandler[HTMLElement]
  }
  object UseHotkeysReturnValue {
    
    inline def apply(
      handleKeyDown: ReactKeyboardEventFrom[HTMLElement & Element] => Callback,
      handleKeyUp: ReactKeyboardEventFrom[HTMLElement & Element] => Callback
    ): UseHotkeysReturnValue = {
      val __obj = js.Dynamic.literal(handleKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & Element]) => handleKeyDown(t0).runNow()), handleKeyUp = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & Element]) => handleKeyUp(t0).runNow()))
      __obj.asInstanceOf[UseHotkeysReturnValue]
    }
    
    extension [Self <: UseHotkeysReturnValue](x: Self) {
      
      inline def setHandleKeyDown(value: ReactKeyboardEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "handleKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setHandleKeyUp(value: ReactKeyboardEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "handleKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    }
  }
}
