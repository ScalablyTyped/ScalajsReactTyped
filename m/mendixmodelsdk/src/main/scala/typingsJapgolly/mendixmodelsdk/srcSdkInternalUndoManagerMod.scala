package typingsJapgolly.mendixmodelsdk

import japgolly.scalajs.react.Callback
import typingsJapgolly.mendixmodelsdk.anon.Action
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltaManagerMod.IDeltaManager
import typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.Delta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalUndoManagerMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/UndoManager", "UndoManager")
  @js.native
  open class UndoManager protected () extends StObject {
    def this(_model: IAbstractModel) = this()
    
    /* private */ val deltaManager: Any = js.native
    
    def getUndoState(modelUnitId: String): UndoState = js.native
    
    /* private */ var onChangeCompleted: Any = js.native
    
    /* private */ var onChangeDiscarded: Any = js.native
    
    /* private */ var onNewDelta: Any = js.native
    
    /* private */ var onUnitLoaded: Any = js.native
    
    def withCustomUndoRedo[T](unitId: String, customAction: Action[T]): T = js.native
    
    def withoutUndo[T](performAction: js.Function0[T]): T = js.native
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/UndoManager", "UndoState")
  @js.native
  open class UndoState protected () extends StObject {
    def this(deltaManager: IDeltaManager) = this()
    
    def canRedo: Boolean = js.native
    
    def canUndo: Boolean = js.native
    
    def clear(): Unit = js.native
    
    /* private */ var deltaManager: Any = js.native
    
    /* private */ var processRedo: Any = js.native
    
    /* private */ var processUndo: Any = js.native
    
    def redo(): Unit = js.native
    
    /* private */ var runAction: Any = js.native
    
    def undo(): Unit = js.native
  }
  
  type Change = js.Array[IDeltaChange] | ICustomActionChange
  
  trait ICustomActionChange extends StObject {
    
    def redoAction(): Unit
    
    def undoAction(): Unit
  }
  object ICustomActionChange {
    
    inline def apply(redoAction: Callback, undoAction: Callback): ICustomActionChange = {
      val __obj = js.Dynamic.literal(redoAction = redoAction.toJsFn, undoAction = undoAction.toJsFn)
      __obj.asInstanceOf[ICustomActionChange]
    }
    
    extension [Self <: ICustomActionChange](x: Self) {
      
      inline def setRedoAction(value: Callback): Self = StObject.set(x, "redoAction", value.toJsFn)
      
      inline def setUndoAction(value: Callback): Self = StObject.set(x, "undoAction", value.toJsFn)
    }
  }
  
  trait IDeltaChange extends StObject {
    
    var delta: Delta
    
    var reversedDelta: Delta
  }
  object IDeltaChange {
    
    inline def apply(delta: Delta, reversedDelta: Delta): IDeltaChange = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], reversedDelta = reversedDelta.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDeltaChange]
    }
    
    extension [Self <: IDeltaChange](x: Self) {
      
      inline def setDelta(value: Delta): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setReversedDelta(value: Delta): Self = StObject.set(x, "reversedDelta", value.asInstanceOf[js.Any])
    }
  }
}
