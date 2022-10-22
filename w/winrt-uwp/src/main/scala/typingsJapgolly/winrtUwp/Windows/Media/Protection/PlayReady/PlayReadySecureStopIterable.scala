package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enumerates PlayReady secure stop service requests. */
trait PlayReadySecureStopIterable extends StObject {
  
  /**
    * Returns an iterator that iterates over the items in the PlayReady secure stop collection.
    * @return The PlayReady secure stop iterator.
    */
  def first(): IIterator[IPlayReadySecureStopServiceRequest]
}
object PlayReadySecureStopIterable {
  
  inline def apply(first: CallbackTo[IIterator[IPlayReadySecureStopServiceRequest]]): PlayReadySecureStopIterable = {
    val __obj = js.Dynamic.literal(first = first.toJsFn)
    __obj.asInstanceOf[PlayReadySecureStopIterable]
  }
  
  extension [Self <: PlayReadySecureStopIterable](x: Self) {
    
    inline def setFirst(value: CallbackTo[IIterator[IPlayReadySecureStopServiceRequest]]): Self = StObject.set(x, "first", value.toJsFn)
  }
}
