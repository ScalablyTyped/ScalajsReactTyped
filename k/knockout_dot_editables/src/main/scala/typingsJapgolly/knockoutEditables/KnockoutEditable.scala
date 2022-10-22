package typingsJapgolly.knockoutEditables

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// bestowed by ko.editable(target)
trait KnockoutEditable extends StObject {
  
  def addEditable(target: Any): Any
  
  def beginEdit(): Unit
  
  def commit(): Unit
  
  def hasChanges(): Boolean
  
  def rollback(): Unit
}
object KnockoutEditable {
  
  inline def apply(
    addEditable: Any => Any,
    beginEdit: Callback,
    commit: Callback,
    hasChanges: CallbackTo[Boolean],
    rollback: Callback
  ): KnockoutEditable = {
    val __obj = js.Dynamic.literal(addEditable = js.Any.fromFunction1(addEditable), beginEdit = beginEdit.toJsFn, commit = commit.toJsFn, hasChanges = hasChanges.toJsFn, rollback = rollback.toJsFn)
    __obj.asInstanceOf[KnockoutEditable]
  }
  
  extension [Self <: KnockoutEditable](x: Self) {
    
    inline def setAddEditable(value: Any => Any): Self = StObject.set(x, "addEditable", js.Any.fromFunction1(value))
    
    inline def setBeginEdit(value: Callback): Self = StObject.set(x, "beginEdit", value.toJsFn)
    
    inline def setCommit(value: Callback): Self = StObject.set(x, "commit", value.toJsFn)
    
    inline def setHasChanges(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasChanges", value.toJsFn)
    
    inline def setRollback(value: Callback): Self = StObject.set(x, "rollback", value.toJsFn)
  }
}
