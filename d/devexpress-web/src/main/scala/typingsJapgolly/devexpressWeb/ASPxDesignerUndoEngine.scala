package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerUndoEngine extends StObject {
  
  def clearHistory(): Unit
  
  var isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  
  def redo(): Unit
  
  var redoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  
  def undo(): Unit
  
  def undoAll(): Unit
  
  var undoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
}
object ASPxDesignerUndoEngine {
  
  inline def apply(
    clearHistory: Callback,
    isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    redo: Callback,
    redoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    undo: Callback,
    undoAll: Callback,
    undoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  ): ASPxDesignerUndoEngine = {
    val __obj = js.Dynamic.literal(clearHistory = clearHistory.toJsFn, isDirty = isDirty.asInstanceOf[js.Any], redo = redo.toJsFn, redoEnabled = redoEnabled.asInstanceOf[js.Any], undo = undo.toJsFn, undoAll = undoAll.toJsFn, undoEnabled = undoEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerUndoEngine]
  }
  
  extension [Self <: ASPxDesignerUndoEngine](x: Self) {
    
    inline def setClearHistory(value: Callback): Self = StObject.set(x, "clearHistory", value.toJsFn)
    
    inline def setIsDirty(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    inline def setRedo(value: Callback): Self = StObject.set(x, "redo", value.toJsFn)
    
    inline def setRedoEnabled(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "redoEnabled", value.asInstanceOf[js.Any])
    
    inline def setUndo(value: Callback): Self = StObject.set(x, "undo", value.toJsFn)
    
    inline def setUndoAll(value: Callback): Self = StObject.set(x, "undoAll", value.toJsFn)
    
    inline def setUndoEnabled(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "undoEnabled", value.asInstanceOf[js.Any])
  }
}
