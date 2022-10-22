package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filemanager {
  
  trait FileManagerCommand
    extends StObject
       with Class {
    
    var exec: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object FileManagerCommand {
    
    inline def apply(): FileManagerCommand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileManagerCommand]
    }
    
    extension [Self <: FileManagerCommand](x: Self) {
      
      inline def setExec(value: Callback): Self = StObject.set(x, "exec", value.toJsFn)
      
      inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    }
  }
  
  object commands {
    
    trait ChangeViewCommand
      extends StObject
         with Class {
      
      var exec: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var init: js.UndefOr[js.Function1[/* options */ Any, Unit]] = js.undefined
    }
    object ChangeViewCommand {
      
      inline def apply(): ChangeViewCommand = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChangeViewCommand]
      }
      
      extension [Self <: ChangeViewCommand](x: Self) {
        
        inline def setExec(value: Callback): Self = StObject.set(x, "exec", value.toJsFn)
        
        inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
        
        inline def setInit(value: /* options */ Any => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* options */ Any) => value(t0).runNow()))
        
        inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      }
    }
    
    trait CopyCommand
      extends StObject
         with Class {
      
      var exec: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var init: js.UndefOr[js.Function1[/* options */ Any, Unit]] = js.undefined
    }
    object CopyCommand {
      
      inline def apply(): CopyCommand = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CopyCommand]
      }
      
      extension [Self <: CopyCommand](x: Self) {
        
        inline def setExec(value: Callback): Self = StObject.set(x, "exec", value.toJsFn)
        
        inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
        
        inline def setInit(value: /* options */ Any => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* options */ Any) => value(t0).runNow()))
        
        inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      }
    }
    
    trait CreateFolderCommand
      extends StObject
         with Class {
      
      var exec: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var init: js.UndefOr[js.Function1[/* options */ Any, Unit]] = js.undefined
    }
    object CreateFolderCommand {
      
      inline def apply(): CreateFolderCommand = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateFolderCommand]
      }
      
      extension [Self <: CreateFolderCommand](x: Self) {
        
        inline def setExec(value: Callback): Self = StObject.set(x, "exec", value.toJsFn)
        
        inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
        
        inline def setInit(value: /* options */ Any => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* options */ Any) => value(t0).runNow()))
        
        inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      }
    }
    
    trait DeleteCommand
      extends StObject
         with Class {
      
      var exec: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var init: js.UndefOr[js.Function1[/* options */ Any, Unit]] = js.undefined
      
      var removeItems: js.UndefOr[js.Function1[/* items */ Any, Unit]] = js.undefined
    }
    object DeleteCommand {
      
      inline def apply(): DeleteCommand = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeleteCommand]
      }
      
      extension [Self <: DeleteCommand](x: Self) {
        
        inline def setExec(value: Callback): Self = StObject.set(x, "exec", value.toJsFn)
        
        inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
        
        inline def setInit(value: /* options */ Any => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* options */ Any) => value(t0).runNow()))
        
        inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
        
        inline def setRemoveItems(value: /* items */ Any => Callback): Self = StObject.set(x, "removeItems", js.Any.fromFunction1((t0: /* items */ Any) => value(t0).runNow()))
        
        inline def setRemoveItemsUndefined: Self = StObject.set(x, "removeItems", js.undefined)
      }
    }
    
    trait MoveCommand
      extends StObject
         with Class {
      
      var exec: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var init: js.UndefOr[js.Function1[/* options */ Any, Unit]] = js.undefined
    }
    object MoveCommand {
      
      inline def apply(): MoveCommand = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MoveCommand]
      }
      
      extension [Self <: MoveCommand](x: Self) {
        
        inline def setExec(value: Callback): Self = StObject.set(x, "exec", value.toJsFn)
        
        inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
        
        inline def setInit(value: /* options */ Any => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* options */ Any) => value(t0).runNow()))
        
        inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      }
    }
    
    trait OpenDialogCommand
      extends StObject
         with Class {
      
      var exec: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var init: js.UndefOr[js.Function1[/* options */ Any, Unit]] = js.undefined
    }
    object OpenDialogCommand {
      
      inline def apply(): OpenDialogCommand = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OpenDialogCommand]
      }
      
      extension [Self <: OpenDialogCommand](x: Self) {
        
        inline def setExec(value: Callback): Self = StObject.set(x, "exec", value.toJsFn)
        
        inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
        
        inline def setInit(value: /* options */ Any => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* options */ Any) => value(t0).runNow()))
        
        inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      }
    }
    
    trait RenameCommand
      extends StObject
         with Class {
      
      var exec: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var init: js.UndefOr[js.Function1[/* options */ Any, Unit]] = js.undefined
    }
    object RenameCommand {
      
      inline def apply(): RenameCommand = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RenameCommand]
      }
      
      extension [Self <: RenameCommand](x: Self) {
        
        inline def setExec(value: Callback): Self = StObject.set(x, "exec", value.toJsFn)
        
        inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
        
        inline def setInit(value: /* options */ Any => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* options */ Any) => value(t0).runNow()))
        
        inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      }
    }
    
    trait SearchCommand
      extends StObject
         with Class {
      
      var exec: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var init: js.UndefOr[js.Function1[/* options */ Any, Unit]] = js.undefined
    }
    object SearchCommand {
      
      inline def apply(): SearchCommand = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchCommand]
      }
      
      extension [Self <: SearchCommand](x: Self) {
        
        inline def setExec(value: Callback): Self = StObject.set(x, "exec", value.toJsFn)
        
        inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
        
        inline def setInit(value: /* options */ Any => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* options */ Any) => value(t0).runNow()))
        
        inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      }
    }
    
    trait SortCommand
      extends StObject
         with Class {
      
      var exec: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var init: js.UndefOr[js.Function1[/* options */ Any, Unit]] = js.undefined
    }
    object SortCommand {
      
      inline def apply(): SortCommand = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SortCommand]
      }
      
      extension [Self <: SortCommand](x: Self) {
        
        inline def setExec(value: Callback): Self = StObject.set(x, "exec", value.toJsFn)
        
        inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
        
        inline def setInit(value: /* options */ Any => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* options */ Any) => value(t0).runNow()))
        
        inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      }
    }
    
    trait TogglePaneCommand
      extends StObject
         with Class {
      
      var exec: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      def getResizable(): Unit
      
      var init: js.UndefOr[js.Function1[/* options */ Any, Unit]] = js.undefined
    }
    object TogglePaneCommand {
      
      inline def apply(getResizable: Callback): TogglePaneCommand = {
        val __obj = js.Dynamic.literal(getResizable = getResizable.toJsFn)
        __obj.asInstanceOf[TogglePaneCommand]
      }
      
      extension [Self <: TogglePaneCommand](x: Self) {
        
        inline def setExec(value: Callback): Self = StObject.set(x, "exec", value.toJsFn)
        
        inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
        
        inline def setGetResizable(value: Callback): Self = StObject.set(x, "getResizable", value.toJsFn)
        
        inline def setInit(value: /* options */ Any => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* options */ Any) => value(t0).runNow()))
        
        inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      }
    }
  }
}
