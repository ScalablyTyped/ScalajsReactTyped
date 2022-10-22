package typingsJapgolly.atom

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.EventTarget
import org.scalajs.dom.Node
import typingsJapgolly.atom.anon.Description
import typingsJapgolly.atom.anon.DidDispatch
import typingsJapgolly.atom.anon.Target
import typingsJapgolly.atom.atomStrings.`atom-text-editor`
import typingsJapgolly.atom.mod.CompositeDisposable
import typingsJapgolly.atom.mod.Disposable
import typingsJapgolly.atom.mod.global.HTMLElementTagNameMap
import typingsJapgolly.atom.srcOtherTypesMod.CommandEvent
import typingsJapgolly.atom.srcTextEditorElementMod.TextEditorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandRegistryMod {
  
  @js.native
  trait CommandRegistry extends StObject {
    
    /** Register a single command. */
    def add[T /* <: Node */](target: T, commandName: String, listener: CommandRegistryListener[T]): Disposable = js.native
    /** Register multiple commands. */
    def add[T /* <: Node */](target: T, commands: StringDictionary[CommandRegistryListener[T]]): CompositeDisposable = js.native
    /** Register a single command. */
    @JSName("add")
    def add_atomtexteditor(
      target: `atom-text-editor`,
      commandName: String,
      listener: CommandRegistryListener[TextEditorElement]
    ): Disposable = js.native
    /** Register multiple commands. */
    @JSName("add")
    def add_atomtexteditor(target: `atom-text-editor`, commands: StringDictionary[CommandRegistryListener[TextEditorElement]]): CompositeDisposable = js.native
    
    /**
      *  Simulate the dispatch of a command on a DOM node.
      *  @return Either a Promise that resolves after all handlers complete or null if
      *  no handlers were matched.
      */
    def dispatch(target: Node, commandName: String): js.Promise[Unit] | Null = js.native
    
    /** Find all registered commands matching a query. */
    def findCommands(params: Target): js.Array[Description] = js.native
    
    /** Invoke the given callback after dispatching a command event. */
    def onDidDispatch(callback: js.Function1[/* event */ CommandEvent[EventTarget], Unit]): Disposable = js.native
    
    /** Invoke the given callback before dispatching a command event. */
    def onWillDispatch(callback: js.Function1[/* event */ CommandEvent[EventTarget], Unit]): Disposable = js.native
  }
  
  type CommandRegistryListener[TargetType /* <: EventTarget */] = DidDispatch[TargetType] | (js.Function1[/* event */ CommandEvent[TargetType], Unit | js.Promise[Unit]])
  
  trait CommandRegistryTargetMap
    extends StObject
       with HTMLElementTagNameMap
       with /* key */ StringDictionary[EventTarget]
  object CommandRegistryTargetMap {
    
    inline def apply(`atom-text-editor`: TextEditorElement): CommandRegistryTargetMap = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("atom-text-editor")(`atom-text-editor`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandRegistryTargetMap]
    }
  }
}
