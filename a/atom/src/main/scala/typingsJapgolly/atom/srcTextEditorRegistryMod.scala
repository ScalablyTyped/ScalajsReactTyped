package typingsJapgolly.atom

import japgolly.scalajs.react.Callback
import typingsJapgolly.atom.mod.Disposable
import typingsJapgolly.atom.mod.TextEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTextEditorRegistryMod {
  
  trait TextEditorRegistry extends StObject {
    
    /** Register a TextEditor. */
    def add(editor: TextEditor): Disposable
    
    // Managing Text Editors
    /** Remove all editors from the registry. */
    def clear(): Unit
    
    /** Remove any grammar override that has been set for the given TextEditor. */
    def clearGrammarOverride(editor: TextEditor): Unit
    
    /**
      *  Retrieve the grammar scope name that has been set as a grammar override
      *  for the given TextEditor.
      */
    def getGrammarOverride(editor: TextEditor): String | Null
    
    /** Keep a TextEditor's configuration in sync with Atom's settings. */
    def maintainConfig(editor: TextEditor): Disposable
    
    /**
      *  Set a TextEditor's grammar based on its path and content, and continue
      *  to update its grammar as gramamrs are added or updated, or the editor's
      *  file path changes.
      */
    def maintainGrammar(editor: TextEditor): Disposable
    
    // Event Subscription
    /** Invoke the given callback with all the current and future registered TextEditors. */
    def observe(callback: js.Function1[/* editor */ TextEditor, Unit]): Disposable
    
    /** Remove the given TextEditor from the registry. */
    def remove(editor: TextEditor): Boolean
    
    /**
      *  Force a TextEditor to use a different grammar than the one that would
      *  otherwise be selected for it.
      */
    def setGrammarOverride(editor: TextEditor, scopeName: String): Unit
  }
  object TextEditorRegistry {
    
    inline def apply(
      add: TextEditor => Disposable,
      clear: Callback,
      clearGrammarOverride: TextEditor => Callback,
      getGrammarOverride: TextEditor => String | Null,
      maintainConfig: TextEditor => Disposable,
      maintainGrammar: TextEditor => Disposable,
      observe: js.Function1[/* editor */ TextEditor, Unit] => Disposable,
      remove: TextEditor => Boolean,
      setGrammarOverride: (TextEditor, String) => Callback
    ): TextEditorRegistry = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = clear.toJsFn, clearGrammarOverride = js.Any.fromFunction1((t0: TextEditor) => clearGrammarOverride(t0).runNow()), getGrammarOverride = js.Any.fromFunction1(getGrammarOverride), maintainConfig = js.Any.fromFunction1(maintainConfig), maintainGrammar = js.Any.fromFunction1(maintainGrammar), observe = js.Any.fromFunction1(observe), remove = js.Any.fromFunction1(remove), setGrammarOverride = js.Any.fromFunction2((t0: TextEditor, t1: String) => (setGrammarOverride(t0, t1)).runNow()))
      __obj.asInstanceOf[TextEditorRegistry]
    }
    
    extension [Self <: TextEditorRegistry](x: Self) {
      
      inline def setAdd(value: TextEditor => Disposable): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setClearGrammarOverride(value: TextEditor => Callback): Self = StObject.set(x, "clearGrammarOverride", js.Any.fromFunction1((t0: TextEditor) => value(t0).runNow()))
      
      inline def setGetGrammarOverride(value: TextEditor => String | Null): Self = StObject.set(x, "getGrammarOverride", js.Any.fromFunction1(value))
      
      inline def setMaintainConfig(value: TextEditor => Disposable): Self = StObject.set(x, "maintainConfig", js.Any.fromFunction1(value))
      
      inline def setMaintainGrammar(value: TextEditor => Disposable): Self = StObject.set(x, "maintainGrammar", js.Any.fromFunction1(value))
      
      inline def setObserve(value: js.Function1[/* editor */ TextEditor, Unit] => Disposable): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
      
      inline def setRemove(value: TextEditor => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setSetGrammarOverride(value: (TextEditor, String) => Callback): Self = StObject.set(x, "setGrammarOverride", js.Any.fromFunction2((t0: TextEditor, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
