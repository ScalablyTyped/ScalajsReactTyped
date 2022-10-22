package typingsJapgolly.ink

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ink.anon.AutoFocus
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildComponentsFocusContextMod extends Shortcut {
  
  @JSImport("ink/build/components/FocusContext", JSImport.Default)
  @js.native
  val default: Context[Props] = js.native
  
  trait Props extends StObject {
    
    def activate(id: String): Unit
    
    val activeId: js.UndefOr[String] = js.undefined
    
    def add(id: String, options: AutoFocus): Unit
    
    def deactivate(id: String): Unit
    
    def disableFocus(): Unit
    
    def enableFocus(): Unit
    
    def focus(id: String): Unit
    
    def focusNext(): Unit
    
    def focusPrevious(): Unit
    
    def remove(id: String): Unit
  }
  object Props {
    
    inline def apply(
      activate: String => Callback,
      add: (String, AutoFocus) => Callback,
      deactivate: String => Callback,
      disableFocus: Callback,
      enableFocus: Callback,
      focus: String => Callback,
      focusNext: Callback,
      focusPrevious: Callback,
      remove: String => Callback
    ): Props = {
      val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1((t0: String) => activate(t0).runNow()), add = js.Any.fromFunction2((t0: String, t1: AutoFocus) => (add(t0, t1)).runNow()), deactivate = js.Any.fromFunction1((t0: String) => deactivate(t0).runNow()), disableFocus = disableFocus.toJsFn, enableFocus = enableFocus.toJsFn, focus = js.Any.fromFunction1((t0: String) => focus(t0).runNow()), focusNext = focusNext.toJsFn, focusPrevious = focusPrevious.toJsFn, remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setActivate(value: String => Callback): Self = StObject.set(x, "activate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setActiveIdUndefined: Self = StObject.set(x, "activeId", js.undefined)
      
      inline def setAdd(value: (String, AutoFocus) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: String, t1: AutoFocus) => (value(t0, t1)).runNow()))
      
      inline def setDeactivate(value: String => Callback): Self = StObject.set(x, "deactivate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setDisableFocus(value: Callback): Self = StObject.set(x, "disableFocus", value.toJsFn)
      
      inline def setEnableFocus(value: Callback): Self = StObject.set(x, "enableFocus", value.toJsFn)
      
      inline def setFocus(value: String => Callback): Self = StObject.set(x, "focus", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setFocusNext(value: Callback): Self = StObject.set(x, "focusNext", value.toJsFn)
      
      inline def setFocusPrevious(value: Callback): Self = StObject.set(x, "focusPrevious", value.toJsFn)
      
      inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  type _To = Context[Props]
  
  /* This means you don't have to write `default`, but can instead just say `buildComponentsFocusContextMod.foo` */
  override def _to: Context[Props] = default
}
