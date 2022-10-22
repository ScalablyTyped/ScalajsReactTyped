package typingsJapgolly.rxLite.Rx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefCountDisposable
  extends StObject
     with IDisposable {
  
  def getDisposable(): IDisposable
  
  var isDisposed: Boolean
}
object RefCountDisposable {
  
  inline def apply(dispose: Callback, getDisposable: CallbackTo[IDisposable], isDisposed: Boolean): RefCountDisposable = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, getDisposable = getDisposable.toJsFn, isDisposed = isDisposed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefCountDisposable]
  }
  
  extension [Self <: RefCountDisposable](x: Self) {
    
    inline def setGetDisposable(value: CallbackTo[IDisposable]): Self = StObject.set(x, "getDisposable", value.toJsFn)
    
    inline def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
  }
}
