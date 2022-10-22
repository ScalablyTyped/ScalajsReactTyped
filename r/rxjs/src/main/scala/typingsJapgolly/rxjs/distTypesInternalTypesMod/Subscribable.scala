package typingsJapgolly.rxjs.distTypesInternalTypesMod

import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscribable[T] extends StObject {
  
  def subscribe(observer: Partial[Observer[T]]): Unsubscribable
}
object Subscribable {
  
  inline def apply[T](subscribe: Partial[Observer[T]] => Unsubscribable): Subscribable[T] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Subscribable[T]]
  }
  
  extension [Self <: Subscribable[?], T](x: Self & Subscribable[T]) {
    
    inline def setSubscribe(value: Partial[Observer[T]] => Unsubscribable): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
  }
}
