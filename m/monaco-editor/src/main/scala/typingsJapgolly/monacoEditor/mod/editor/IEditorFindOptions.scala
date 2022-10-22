package typingsJapgolly.monacoEditor.mod.editor

import typingsJapgolly.monacoEditor.monacoEditorStrings.always
import typingsJapgolly.monacoEditor.monacoEditorStrings.multiline
import typingsJapgolly.monacoEditor.monacoEditorStrings.never
import typingsJapgolly.monacoEditor.monacoEditorStrings.selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorFindOptions extends StObject {
  
  var addExtraSpaceOnTop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls if Find in Selection flag is turned on in the editor.
    */
  var autoFindInSelection: js.UndefOr[never | always | multiline] = js.undefined
  
  /**
    * Controls whether the cursor should move to find matches while typing.
    */
  var cursorMoveOnType: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether the search automatically restarts from the beginning (or the end) when no further matches can be found
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls if we seed search string in the Find Widget with editor selection.
    */
  var seedSearchStringFromSelection: js.UndefOr[never | always | selection] = js.undefined
}
object IEditorFindOptions {
  
  inline def apply(): IEditorFindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorFindOptions]
  }
  
  extension [Self <: IEditorFindOptions](x: Self) {
    
    inline def setAddExtraSpaceOnTop(value: Boolean): Self = StObject.set(x, "addExtraSpaceOnTop", value.asInstanceOf[js.Any])
    
    inline def setAddExtraSpaceOnTopUndefined: Self = StObject.set(x, "addExtraSpaceOnTop", js.undefined)
    
    inline def setAutoFindInSelection(value: never | always | multiline): Self = StObject.set(x, "autoFindInSelection", value.asInstanceOf[js.Any])
    
    inline def setAutoFindInSelectionUndefined: Self = StObject.set(x, "autoFindInSelection", js.undefined)
    
    inline def setCursorMoveOnType(value: Boolean): Self = StObject.set(x, "cursorMoveOnType", value.asInstanceOf[js.Any])
    
    inline def setCursorMoveOnTypeUndefined: Self = StObject.set(x, "cursorMoveOnType", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setSeedSearchStringFromSelection(value: never | always | selection): Self = StObject.set(x, "seedSearchStringFromSelection", value.asInstanceOf[js.Any])
    
    inline def setSeedSearchStringFromSelectionUndefined: Self = StObject.set(x, "seedSearchStringFromSelection", js.undefined)
  }
}
