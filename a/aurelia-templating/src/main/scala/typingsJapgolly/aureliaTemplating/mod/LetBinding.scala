package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.aureliaBinding.mod.Expression
import typingsJapgolly.aureliaBinding.mod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetBinding extends StObject {
  
  /**
  	 * Connects the binding to a scope.
  	 */
  def bind(source: Scope): Unit
  
  var isBound: Boolean
  
  var source: Scope
  
  /**
  	 * The expression to access/assign/connect the binding source property.
  	 */
  var sourceExpression: Expression
  
  /**
  	 * Disconnects the binding from a scope.
  	 */
  def unbind(): Unit
  
  /**
  	 * Assigns a value to the target.
  	 */
  def updateTarget(value: Any): Unit
}
object LetBinding {
  
  inline def apply(
    bind: Scope => Callback,
    isBound: Boolean,
    source: Scope,
    sourceExpression: Expression,
    unbind: Callback,
    updateTarget: Any => Callback
  ): LetBinding = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1((t0: Scope) => bind(t0).runNow()), isBound = isBound.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceExpression = sourceExpression.asInstanceOf[js.Any], unbind = unbind.toJsFn, updateTarget = js.Any.fromFunction1((t0: Any) => updateTarget(t0).runNow()))
    __obj.asInstanceOf[LetBinding]
  }
  
  extension [Self <: LetBinding](x: Self) {
    
    inline def setBind(value: Scope => Callback): Self = StObject.set(x, "bind", js.Any.fromFunction1((t0: Scope) => value(t0).runNow()))
    
    inline def setIsBound(value: Boolean): Self = StObject.set(x, "isBound", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Scope): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceExpression(value: Expression): Self = StObject.set(x, "sourceExpression", value.asInstanceOf[js.Any])
    
    inline def setUnbind(value: Callback): Self = StObject.set(x, "unbind", value.toJsFn)
    
    inline def setUpdateTarget(value: Any => Callback): Self = StObject.set(x, "updateTarget", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
