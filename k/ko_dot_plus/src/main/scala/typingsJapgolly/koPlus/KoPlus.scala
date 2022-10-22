package typingsJapgolly.koPlus

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// namespace for ko.plus types
//
object KoPlus {
  
  @js.native
  trait Command extends StObject {
    
    // execute the command
    def apply(): Unit = js.native
    
    def always(callback: js.Function): Command = js.native
    
    var canExecute: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any = js.native
    
    var completed: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any = js.native
    
    //
    // functions
    // see https://github.com/stevegreatrex/ko.plus#functions
    //
    def done(callback: js.Function1[/* data */ Any, Unit]): Command = js.native
    
    def fail(
      callback: js.Function3[
          /* response */ Any, 
          /* status */ js.UndefOr[String], 
          /* statusText */ js.UndefOr[String], 
          Unit
        ]
    ): Command = js.native
    
    var failed: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any = js.native
    
    //
    // properties: https://github.com/stevegreatrex/ko.plus#properties
    //
    var isRunning: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any = js.native
    
    def `then`(resolve: js.Function, reject: js.Function): Command = js.native
  }
  
  trait CommandOptions extends StObject {
    
    // [required] sets the command action method
    var action: js.Function
    
    // [optional] function to determine if command can be executed
    var canExecute: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    // [optional] context to use in the command
    var context: js.UndefOr[Any] = js.undefined
  }
  object CommandOptions {
    
    inline def apply(action: js.Function): CommandOptions = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandOptions]
    }
    
    extension [Self <: CommandOptions](x: Self) {
      
      inline def setAction(value: js.Function): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCanExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "canExecute", value.toJsFn)
      
      inline def setCanExecuteUndefined: Self = StObject.set(x, "canExecute", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<T> * / any */ trait Editable[T]
    extends StObject
       with EditableFunctions
  object Editable {
    
    inline def apply[T](
      beginEdit: Callback,
      cancelEdit: Callback,
      endEdit: Callback,
      isEditing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
      rollback: Callback
    ): Editable[T] = {
      val __obj = js.Dynamic.literal(beginEdit = beginEdit.toJsFn, cancelEdit = cancelEdit.toJsFn, endEdit = endEdit.toJsFn, isEditing = isEditing.asInstanceOf[js.Any], rollback = rollback.toJsFn)
      __obj.asInstanceOf[Editable[T]]
    }
  }
  
  trait EditableArray[T]
    extends StObject
       with KnockoutObservableArray[T]
       with EditableFunctions
  object EditableArray {
    
    inline def apply[T](
      beginEdit: Callback,
      cancelEdit: Callback,
      endEdit: Callback,
      isEditing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
      rollback: Callback,
      setSourceKey: String => Callback,
      sortDescending: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
      sortKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any
    ): EditableArray[T] = {
      val __obj = js.Dynamic.literal(beginEdit = beginEdit.toJsFn, cancelEdit = cancelEdit.toJsFn, endEdit = endEdit.toJsFn, isEditing = isEditing.asInstanceOf[js.Any], rollback = rollback.toJsFn, setSourceKey = js.Any.fromFunction1((t0: String) => setSourceKey(t0).runNow()), sortDescending = sortDescending.asInstanceOf[js.Any], sortKey = sortKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditableArray[T]]
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArrayStatic * / any */ @js.native
  trait EditableArrayStatic extends StObject {
    
    def apply[T](): EditableArray[T] = js.native
    def apply[T](value: js.Array[T]): EditableArray[T] = js.native
    
    def makeEditable(target: Any): Unit = js.native
  }
  
  trait EditableFunctions extends StObject {
    
    def beginEdit(): Unit
    
    def cancelEdit(): Unit
    
    def endEdit(): Unit
    
    var isEditing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    
    def rollback(): Unit
  }
  object EditableFunctions {
    
    inline def apply(
      beginEdit: Callback,
      cancelEdit: Callback,
      endEdit: Callback,
      isEditing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
      rollback: Callback
    ): EditableFunctions = {
      val __obj = js.Dynamic.literal(beginEdit = beginEdit.toJsFn, cancelEdit = cancelEdit.toJsFn, endEdit = endEdit.toJsFn, isEditing = isEditing.asInstanceOf[js.Any], rollback = rollback.toJsFn)
      __obj.asInstanceOf[EditableFunctions]
    }
    
    extension [Self <: EditableFunctions](x: Self) {
      
      inline def setBeginEdit(value: Callback): Self = StObject.set(x, "beginEdit", value.toJsFn)
      
      inline def setCancelEdit(value: Callback): Self = StObject.set(x, "cancelEdit", value.toJsFn)
      
      inline def setEndEdit(value: Callback): Self = StObject.set(x, "endEdit", value.toJsFn)
      
      inline def setIsEditing(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
      ): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      inline def setRollback(value: Callback): Self = StObject.set(x, "rollback", value.toJsFn)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableStatic * / any */ @js.native
  trait EditableStatic extends StObject {
    
    def apply[T](): Editable[T] = js.native
    def apply[T](value: T): Editable[T] = js.native
    
    def makeEditable(target: Any): Unit = js.native
  }
}
