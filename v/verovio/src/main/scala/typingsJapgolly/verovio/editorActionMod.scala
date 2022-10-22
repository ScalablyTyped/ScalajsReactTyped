package typingsJapgolly.verovio

import typingsJapgolly.verovio.anon.Attribute
import typingsJapgolly.verovio.anon.CtrlKey
import typingsJapgolly.verovio.anon.ElementId
import typingsJapgolly.verovio.anon.ElementType
import typingsJapgolly.verovio.anon.X
import typingsJapgolly.verovio.verovioStrings.chain
import typingsJapgolly.verovio.verovioStrings.commit
import typingsJapgolly.verovio.verovioStrings.delete
import typingsJapgolly.verovio.verovioStrings.drag
import typingsJapgolly.verovio.verovioStrings.insert
import typingsJapgolly.verovio.verovioStrings.keyDown
import typingsJapgolly.verovio.verovioStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editorActionMod {
  
  trait ChainAction
    extends StObject
       with EditorAction {
    
    var action: chain
    
    var param: js.Array[EditorAction]
  }
  object ChainAction {
    
    inline def apply(param: js.Array[EditorAction]): ChainAction = {
      val __obj = js.Dynamic.literal(action = "chain", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChainAction]
    }
    
    extension [Self <: ChainAction](x: Self) {
      
      inline def setAction(value: chain): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setParam(value: js.Array[EditorAction]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def setParamVarargs(value: EditorAction*): Self = StObject.set(x, "param", js.Array(value*))
    }
  }
  
  trait CommitAction
    extends StObject
       with EditorAction {
    
    var action: commit
  }
  object CommitAction {
    
    inline def apply(): CommitAction = {
      val __obj = js.Dynamic.literal(action = "commit")
      __obj.asInstanceOf[CommitAction]
    }
    
    extension [Self <: CommitAction](x: Self) {
      
      inline def setAction(value: commit): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteAction
    extends StObject
       with EditorAction {
    
    var action: delete
    
    var param: ElementId
  }
  object DeleteAction {
    
    inline def apply(param: ElementId): DeleteAction = {
      val __obj = js.Dynamic.literal(action = "delete", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteAction]
    }
    
    extension [Self <: DeleteAction](x: Self) {
      
      inline def setAction(value: delete): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setParam(value: ElementId): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
  
  trait DragAction
    extends StObject
       with EditorAction {
    
    var action: drag
    
    var param: X
  }
  object DragAction {
    
    inline def apply(param: X): DragAction = {
      val __obj = js.Dynamic.literal(action = "drag", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragAction]
    }
    
    extension [Self <: DragAction](x: Self) {
      
      inline def setAction(value: drag): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setParam(value: X): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.verovio.editorActionMod.CommitAction
    - typingsJapgolly.verovio.editorActionMod.ChainAction
    - typingsJapgolly.verovio.editorActionMod.DeleteAction
    - typingsJapgolly.verovio.editorActionMod.DragAction
    - typingsJapgolly.verovio.editorActionMod.KeyDownAction
    - typingsJapgolly.verovio.editorActionMod.InsertAction
    - typingsJapgolly.verovio.editorActionMod.SetAction
  */
  trait EditorAction extends StObject
  object EditorAction {
    
    inline def ChainAction(param: js.Array[EditorAction]): typingsJapgolly.verovio.editorActionMod.ChainAction = {
      val __obj = js.Dynamic.literal(action = "chain", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.verovio.editorActionMod.ChainAction]
    }
    
    inline def CommitAction(): typingsJapgolly.verovio.editorActionMod.CommitAction = {
      val __obj = js.Dynamic.literal(action = "commit")
      __obj.asInstanceOf[typingsJapgolly.verovio.editorActionMod.CommitAction]
    }
    
    inline def DeleteAction(param: ElementId): typingsJapgolly.verovio.editorActionMod.DeleteAction = {
      val __obj = js.Dynamic.literal(action = "delete", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.verovio.editorActionMod.DeleteAction]
    }
    
    inline def DragAction(param: X): typingsJapgolly.verovio.editorActionMod.DragAction = {
      val __obj = js.Dynamic.literal(action = "drag", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.verovio.editorActionMod.DragAction]
    }
    
    inline def InsertAction(param: ElementType): typingsJapgolly.verovio.editorActionMod.InsertAction = {
      val __obj = js.Dynamic.literal(action = "insert", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.verovio.editorActionMod.InsertAction]
    }
    
    inline def KeyDownAction(param: CtrlKey): typingsJapgolly.verovio.editorActionMod.KeyDownAction = {
      val __obj = js.Dynamic.literal(action = "keyDown", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.verovio.editorActionMod.KeyDownAction]
    }
    
    inline def SetAction(param: Attribute): typingsJapgolly.verovio.editorActionMod.SetAction = {
      val __obj = js.Dynamic.literal(action = "set", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.verovio.editorActionMod.SetAction]
    }
  }
  
  trait InsertAction
    extends StObject
       with EditorAction {
    
    var action: insert
    
    var param: ElementType
  }
  object InsertAction {
    
    inline def apply(param: ElementType): InsertAction = {
      val __obj = js.Dynamic.literal(action = "insert", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[InsertAction]
    }
    
    extension [Self <: InsertAction](x: Self) {
      
      inline def setAction(value: insert): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setParam(value: ElementType): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyDownAction
    extends StObject
       with EditorAction {
    
    var action: keyDown
    
    var param: CtrlKey
  }
  object KeyDownAction {
    
    inline def apply(param: CtrlKey): KeyDownAction = {
      val __obj = js.Dynamic.literal(action = "keyDown", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyDownAction]
    }
    
    extension [Self <: KeyDownAction](x: Self) {
      
      inline def setAction(value: keyDown): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setParam(value: CtrlKey): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetAction
    extends StObject
       with EditorAction {
    
    var action: set
    
    var param: Attribute
  }
  object SetAction {
    
    inline def apply(param: Attribute): SetAction = {
      val __obj = js.Dynamic.literal(action = "set", param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetAction]
    }
    
    extension [Self <: SetAction](x: Self) {
      
      inline def setAction(value: set): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setParam(value: Attribute): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
}
