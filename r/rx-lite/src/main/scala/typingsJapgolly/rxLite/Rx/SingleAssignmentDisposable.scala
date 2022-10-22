package typingsJapgolly.rxLite.Rx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Single assignment
trait SingleAssignmentDisposable
  extends StObject
     with IDisposable {
  
  var current: IDisposable
  
  def getDisposable(): IDisposable
  
  var isDisposed: Boolean
  
  def setDisposable(value: IDisposable): Unit
}
object SingleAssignmentDisposable {
  
  inline def apply(
    current: IDisposable,
    dispose: Callback,
    getDisposable: CallbackTo[IDisposable],
    isDisposed: Boolean,
    setDisposable: IDisposable => Callback
  ): SingleAssignmentDisposable = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], dispose = dispose.toJsFn, getDisposable = getDisposable.toJsFn, isDisposed = isDisposed.asInstanceOf[js.Any], setDisposable = js.Any.fromFunction1((t0: IDisposable) => setDisposable(t0).runNow()))
    __obj.asInstanceOf[SingleAssignmentDisposable]
  }
  
  extension [Self <: SingleAssignmentDisposable](x: Self) {
    
    inline def setCurrent(value: IDisposable): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setGetDisposable(value: CallbackTo[IDisposable]): Self = StObject.set(x, "getDisposable", value.toJsFn)
    
    inline def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
    
    inline def setSetDisposable(value: IDisposable => Callback): Self = StObject.set(x, "setDisposable", js.Any.fromFunction1((t0: IDisposable) => value(t0).runNow()))
  }
}
