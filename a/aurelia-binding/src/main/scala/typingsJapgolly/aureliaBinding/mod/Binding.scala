package typingsJapgolly.aureliaBinding.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binding extends StObject {
  
  /**
    * Connects the binding to a scope.
    */
  def bind(source: Scope): Unit
  
  /**
    * Calls the source method with the specified args object. This method is present in event bindings like trigger/delegate.
    */
  var callSource: js.UndefOr[js.Function1[/* event */ Any, Any]] = js.undefined
  
  /**
    * Whether the binding is data-bound.
    */
  var isBound: Boolean
  
  /**
    * The directionality of the binding.
    */
  var mode: js.UndefOr[bindingMode] = js.undefined
  
  /**
    * The binding's source.
    */
  var source: Scope
  
  /**
    * The expression to access/assign/connect the binding source property.
    */
  var sourceExpression: js.UndefOr[Expression] = js.undefined
  
  /**
    * Disconnects the binding from a scope.
    */
  def unbind(): Unit
  
  /**
    * Assigns a value to the source.
    */
  var updateSource: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
  
  /**
    * Assigns a value to the target.
    */
  var updateTarget: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
}
object Binding {
  
  inline def apply(bind: Scope => Callback, isBound: Boolean, source: Scope, unbind: Callback): Binding = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1((t0: Scope) => bind(t0).runNow()), isBound = isBound.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], unbind = unbind.toJsFn)
    __obj.asInstanceOf[Binding]
  }
  
  extension [Self <: Binding](x: Self) {
    
    inline def setBind(value: Scope => Callback): Self = StObject.set(x, "bind", js.Any.fromFunction1((t0: Scope) => value(t0).runNow()))
    
    inline def setCallSource(value: /* event */ Any => Any): Self = StObject.set(x, "callSource", js.Any.fromFunction1(value))
    
    inline def setCallSourceUndefined: Self = StObject.set(x, "callSource", js.undefined)
    
    inline def setIsBound(value: Boolean): Self = StObject.set(x, "isBound", value.asInstanceOf[js.Any])
    
    inline def setMode(value: bindingMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSource(value: Scope): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceExpression(value: Expression): Self = StObject.set(x, "sourceExpression", value.asInstanceOf[js.Any])
    
    inline def setSourceExpressionUndefined: Self = StObject.set(x, "sourceExpression", js.undefined)
    
    inline def setUnbind(value: Callback): Self = StObject.set(x, "unbind", value.toJsFn)
    
    inline def setUpdateSource(value: /* value */ Any => Callback): Self = StObject.set(x, "updateSource", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
    
    inline def setUpdateSourceUndefined: Self = StObject.set(x, "updateSource", js.undefined)
    
    inline def setUpdateTarget(value: /* value */ Any => Callback): Self = StObject.set(x, "updateTarget", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
    
    inline def setUpdateTargetUndefined: Self = StObject.set(x, "updateTarget", js.undefined)
  }
}
