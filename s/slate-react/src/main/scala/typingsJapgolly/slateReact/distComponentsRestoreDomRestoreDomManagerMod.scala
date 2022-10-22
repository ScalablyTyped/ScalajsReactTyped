package typingsJapgolly.slateReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.MutationRecord
import typingsJapgolly.slateReact.distPluginReactEditorMod.ReactEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsRestoreDomRestoreDomManagerMod {
  
  @JSImport("slate-react/dist/components/restore-dom/restore-dom-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRestoreDomManager(editor: ReactEditor, receivedUserInput: RefHandle[Boolean]): RestoreDOMManager = (^.asInstanceOf[js.Dynamic].applyDynamic("createRestoreDomManager")(editor.asInstanceOf[js.Any], receivedUserInput.asInstanceOf[js.Any])).asInstanceOf[RestoreDOMManager]
  
  trait RestoreDOMManager extends StObject {
    
    def clear(): Unit
    
    def registerMutations(mutations: js.Array[MutationRecord]): Unit
    
    def restoreDOM(): Unit
  }
  object RestoreDOMManager {
    
    inline def apply(clear: Callback, registerMutations: js.Array[MutationRecord] => Callback, restoreDOM: Callback): RestoreDOMManager = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, registerMutations = js.Any.fromFunction1((t0: js.Array[MutationRecord]) => registerMutations(t0).runNow()), restoreDOM = restoreDOM.toJsFn)
      __obj.asInstanceOf[RestoreDOMManager]
    }
    
    extension [Self <: RestoreDOMManager](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setRegisterMutations(value: js.Array[MutationRecord] => Callback): Self = StObject.set(x, "registerMutations", js.Any.fromFunction1((t0: js.Array[MutationRecord]) => value(t0).runNow()))
      
      inline def setRestoreDOM(value: Callback): Self = StObject.set(x, "restoreDOM", value.toJsFn)
    }
  }
}
