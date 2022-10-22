package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies common implementation for embedded objects and links persistence. */
trait XCommonEmbedPersist
  extends StObject
     with XInterface {
  
  /**
    * allows to detect if the data store is read-only.
    * @returns `TRUE` if the data store is readonly or opened readonly `FALSE` otherwise
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state ( has no entry )
    */
  def isReadonly(): Boolean
  
  /**
    * lets the object or the link reload itself.
    *
    * If the object has persistence it will be reloaded from its persistent entry.
    * @param aMediaArgs optional parameters for document reloading, see also {@link com.sun.star.document.MediaDescriptor}
    * @param aObjectArgs optional parameters for object reloading, see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def reload(aMediaArgs: SeqEquiv[PropertyValue], aObjectArgs: SeqEquiv[PropertyValue]): Unit
  
  /**
    * lets the object or the link store itself.
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during saving
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def storeOwn(): Unit
}
object XCommonEmbedPersist {
  
  inline def apply(
    acquire: Callback,
    isReadonly: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    reload: (SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Callback,
    storeOwn: Callback
  ): XCommonEmbedPersist = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, isReadonly = isReadonly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reload = js.Any.fromFunction2((t0: SeqEquiv[PropertyValue], t1: SeqEquiv[PropertyValue]) => (reload(t0, t1)).runNow()), storeOwn = storeOwn.toJsFn)
    __obj.asInstanceOf[XCommonEmbedPersist]
  }
  
  extension [Self <: XCommonEmbedPersist](x: Self) {
    
    inline def setIsReadonly(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReadonly", value.toJsFn)
    
    inline def setReload(value: (SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "reload", js.Any.fromFunction2((t0: SeqEquiv[PropertyValue], t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
    
    inline def setStoreOwn(value: Callback): Self = StObject.set(x, "storeOwn", value.toJsFn)
  }
}
