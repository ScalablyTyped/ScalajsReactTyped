package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends {@link XStorable} . */
trait XStorable2
  extends StObject
     with XStorable {
  
  /**
    * stores the data to the URL from which it was loaded.
    *
    * Only objects which know their locations can be stored.
    *
    * This is an extension of the {@link XStorable.store()} . This method allows to specify some additional parameters for storing process.
    * @param lArguments optional parameters for saving, can take values from subset of {@link com.sun.star.document.MediaDescriptor}
    * @see XStorable.store
    * @throws com::sun::star::lang::IllegalArgumentException the optional parameters contain unacceptable for save entry
    * @throws com::sun::star::io::IOException if an IO error occurred during save operation
    */
  def storeSelf(lArguments: SeqEquiv[PropertyValue]): Unit
}
object XStorable2 {
  
  inline def apply(
    Location: String,
    acquire: Callback,
    getLocation: CallbackTo[String],
    hasLocation: CallbackTo[Boolean],
    isReadonly: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    store: Callback,
    storeAsURL: (String, SeqEquiv[PropertyValue]) => Callback,
    storeSelf: SeqEquiv[PropertyValue] => Callback,
    storeToURL: (String, SeqEquiv[PropertyValue]) => Callback
  ): XStorable2 = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLocation = getLocation.toJsFn, hasLocation = hasLocation.toJsFn, isReadonly = isReadonly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, store = store.toJsFn, storeAsURL = js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (storeAsURL(t0, t1)).runNow()), storeSelf = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => storeSelf(t0).runNow()), storeToURL = js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (storeToURL(t0, t1)).runNow()))
    __obj.asInstanceOf[XStorable2]
  }
  
  extension [Self <: XStorable2](x: Self) {
    
    inline def setStoreSelf(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "storeSelf", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
  }
}
