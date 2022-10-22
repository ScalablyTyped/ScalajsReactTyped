package typingsJapgolly.reactAce

import typingsJapgolly.reactAce.anon.TypeofAceBuilds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEditorOptionsMod {
  
  @JSImport("react-ace/lib/editorOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debounce(fn: js.Function1[/* repeated */ Any, Unit], delay: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("react-ace/lib/editorOptions", "editorEvents")
  @js.native
  val editorEvents: js.Array[EditorEvent] = js.native
  
  @JSImport("react-ace/lib/editorOptions", "editorOptions")
  @js.native
  val editorOptions: js.Array[EditorOption] = js.native
  
  inline def getAceInstance(): TypeofAceBuilds = ^.asInstanceOf[js.Dynamic].applyDynamic("getAceInstance")().asInstanceOf[TypeofAceBuilds]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactAce.reactAceStrings.onChange
    - typingsJapgolly.reactAce.reactAceStrings.onFocus
    - typingsJapgolly.reactAce.reactAceStrings.onInput
    - typingsJapgolly.reactAce.reactAceStrings.onBlur
    - typingsJapgolly.reactAce.reactAceStrings.onCopy
    - typingsJapgolly.reactAce.reactAceStrings.onPaste
    - typingsJapgolly.reactAce.reactAceStrings.onSelectionChange
    - typingsJapgolly.reactAce.reactAceStrings.onCursorChange
    - typingsJapgolly.reactAce.reactAceStrings.onScroll
    - typingsJapgolly.reactAce.reactAceStrings.handleOptions
    - typingsJapgolly.reactAce.reactAceStrings.updateRef
  */
  trait EditorEvent extends StObject
  object EditorEvent {
    
    inline def handleOptions: typingsJapgolly.reactAce.reactAceStrings.handleOptions = "handleOptions".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.handleOptions]
    
    inline def onBlur: typingsJapgolly.reactAce.reactAceStrings.onBlur = "onBlur".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.onBlur]
    
    inline def onChange: typingsJapgolly.reactAce.reactAceStrings.onChange = "onChange".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.onChange]
    
    inline def onCopy: typingsJapgolly.reactAce.reactAceStrings.onCopy = "onCopy".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.onCopy]
    
    inline def onCursorChange: typingsJapgolly.reactAce.reactAceStrings.onCursorChange = "onCursorChange".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.onCursorChange]
    
    inline def onFocus: typingsJapgolly.reactAce.reactAceStrings.onFocus = "onFocus".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.onFocus]
    
    inline def onInput: typingsJapgolly.reactAce.reactAceStrings.onInput = "onInput".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.onInput]
    
    inline def onPaste: typingsJapgolly.reactAce.reactAceStrings.onPaste = "onPaste".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.onPaste]
    
    inline def onScroll: typingsJapgolly.reactAce.reactAceStrings.onScroll = "onScroll".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.onScroll]
    
    inline def onSelectionChange: typingsJapgolly.reactAce.reactAceStrings.onSelectionChange = "onSelectionChange".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.onSelectionChange]
    
    inline def updateRef: typingsJapgolly.reactAce.reactAceStrings.updateRef = "updateRef".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.updateRef]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactAce.reactAceStrings.minLines
    - typingsJapgolly.reactAce.reactAceStrings.maxLines
    - typingsJapgolly.reactAce.reactAceStrings.readOnly
    - typingsJapgolly.reactAce.reactAceStrings.highlightActiveLine
    - typingsJapgolly.reactAce.reactAceStrings.tabSize
    - typingsJapgolly.reactAce.reactAceStrings.enableBasicAutocompletion
    - typingsJapgolly.reactAce.reactAceStrings.enableLiveAutocompletion
    - typingsJapgolly.reactAce.reactAceStrings.enableSnippets
  */
  trait EditorOption extends StObject
  object EditorOption {
    
    inline def enableBasicAutocompletion: typingsJapgolly.reactAce.reactAceStrings.enableBasicAutocompletion = "enableBasicAutocompletion".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.enableBasicAutocompletion]
    
    inline def enableLiveAutocompletion: typingsJapgolly.reactAce.reactAceStrings.enableLiveAutocompletion = "enableLiveAutocompletion".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.enableLiveAutocompletion]
    
    inline def enableSnippets: typingsJapgolly.reactAce.reactAceStrings.enableSnippets = "enableSnippets".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.enableSnippets]
    
    inline def highlightActiveLine: typingsJapgolly.reactAce.reactAceStrings.highlightActiveLine = "highlightActiveLine".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.highlightActiveLine]
    
    inline def maxLines: typingsJapgolly.reactAce.reactAceStrings.maxLines = "maxLines".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.maxLines]
    
    inline def minLines: typingsJapgolly.reactAce.reactAceStrings.minLines = "minLines".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.minLines]
    
    inline def readOnly: typingsJapgolly.reactAce.reactAceStrings.readOnly = "readOnly".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.readOnly]
    
    inline def tabSize: typingsJapgolly.reactAce.reactAceStrings.tabSize = "tabSize".asInstanceOf[typingsJapgolly.reactAce.reactAceStrings.tabSize]
  }
  
  object global {
    
    object NodeJS {
      
      trait Global extends StObject {
        
        var window: Any
      }
      object Global {
        
        inline def apply(window: Any): Global = {
          val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
          __obj.asInstanceOf[Global]
        }
        
        extension [Self <: Global](x: Self) {
          
          inline def setWindow(value: Any): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
