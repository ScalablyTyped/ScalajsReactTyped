package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes the PlayReadyLicense class iterator. */
trait PlayReadyLicenseIterable extends StObject {
  
  /**
    * Returns an iterator that iterates over the items in the PlayReady license collection.
    * @return The PlayReady license iterator.
    */
  def first(): IIterator[IPlayReadyLicense]
}
object PlayReadyLicenseIterable {
  
  inline def apply(first: CallbackTo[IIterator[IPlayReadyLicense]]): PlayReadyLicenseIterable = {
    val __obj = js.Dynamic.literal(first = first.toJsFn)
    __obj.asInstanceOf[PlayReadyLicenseIterable]
  }
  
  extension [Self <: PlayReadyLicenseIterable](x: Self) {
    
    inline def setFirst(value: CallbackTo[IIterator[IPlayReadyLicense]]): Self = StObject.set(x, "first", value.toJsFn)
  }
}
