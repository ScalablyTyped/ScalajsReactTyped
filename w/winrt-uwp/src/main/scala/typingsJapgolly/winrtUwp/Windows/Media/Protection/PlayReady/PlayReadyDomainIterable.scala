package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes the PlayReady PlayReadyDomain class iterator. */
trait PlayReadyDomainIterable extends StObject {
  
  /**
    * Returns an iterator that iterates over the items in the PlayReady domain collection.
    * @return The PlayReady domain iterator.
    */
  def first(): IIterator[IPlayReadyDomain]
}
object PlayReadyDomainIterable {
  
  inline def apply(first: CallbackTo[IIterator[IPlayReadyDomain]]): PlayReadyDomainIterable = {
    val __obj = js.Dynamic.literal(first = first.toJsFn)
    __obj.asInstanceOf[PlayReadyDomainIterable]
  }
  
  extension [Self <: PlayReadyDomainIterable](x: Self) {
    
    inline def setFirst(value: CallbackTo[IIterator[IPlayReadyDomain]]): Self = StObject.set(x, "first", value.toJsFn)
  }
}
