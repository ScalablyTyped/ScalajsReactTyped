package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * offers a simple way to store a component to an URL.
  *
  * It is usually only useful for two cases:
  *
  *  1. Large components which are wrapped up in UNO interfaces and for which distinct filters are not available separately as components. 2. Very small
  * components for which only one or very few hard coded file format filters make sense or even exist.
  */
trait XStorable
  extends StObject
     with XInterface {
  
  /**
    * After {@link XStorable.storeAsURL()} it returns the URL the object was stored to.
    * @returns the URL of the resource which is represented by this object.
    */
  val Location: String
  
  /**
    * After {@link XStorable.storeAsURL()} it returns the URL the object was stored to.
    * @returns the URL of the resource which is represented by this object.
    */
  def getLocation(): String
  
  /**
    * The object may know the location because it was loaded from there, or because it is stored there.
    * @returns `TRUE` if the object knows a location where it is persistent `FALSE` otherwise
    */
  def hasLocation(): Boolean
  
  /**
    * It is not possible to call {@link XStorable.store()} successfully when the data store is read-only.
    * @returns `TRUE` if the data store is readonly or opened readonly `FALSE` otherwise
    */
  def isReadonly(): Boolean
  
  /**
    * stores the data to the URL from which it was loaded.
    *
    * Only objects which know their locations can be stored.
    * @see XStorable.storeAsURL
    * @see XStorable.storeToURL
    * @throws com::sun::star::io::IOException if an IO error occurred during save operation (may the location is unknown)
    */
  def store(): Unit
  
  /**
    * stores the object's persistent data to a URL and makes this URL the new location of the object.
    *
    * This is the normal behavior for UI's "save-as" feature.
    *
    * The change of the location makes it necessary to store the document in a format that the object can load. For this reason the implementation of {@link
    * XStorable.storeAsURL()} will throw an exception if a pure export filter is used, it will accept only combined import/export filters. For such filters
    * the method {@link XStorable.storeToURL()} must be used that does not change the location of the object.
    * @param sURL specifies the new location of this component
    * @param lArguments optional parameters for saving (see {@link com.sun.star.document.MediaDescriptor} for further details)
    * @see XStorable.store
    * @see XStorable.storeToURL
    * @see com.sun.star.document.MediaDescriptor
    * @throws com::sun::star::io::IOException if an IO error occurred during save operation (may the location is unknown)
    */
  def storeAsURL(sURL: String, lArguments: SeqEquiv[PropertyValue]): Unit
  
  /**
    * stores the object's persistent data to a URL and continues to be a representation of the old URL.
    *
    * This is the normal behavior for UI's export feature.
    *
    * This method accepts all kinds of export filters, not only combined import/export filters because it implements an exporting capability, not a
    * persistence capability.
    * @param sURL specifies the location where to store the object
    * @param lArguments optional parameters for saving (see {@link com.sun.star.document.MediaDescriptor} for further details)
    * @see XStorable.store
    * @see XStorable.storeAsURL
    * @see com.sun.star.document.MediaDescriptor
    * @throws com::sun::star::io::IOException if an IO error occurred during save operation (may the location is unknown)
    */
  def storeToURL(sURL: String, lArguments: SeqEquiv[PropertyValue]): Unit
}
object XStorable {
  
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
    storeToURL: (String, SeqEquiv[PropertyValue]) => Callback
  ): XStorable = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLocation = getLocation.toJsFn, hasLocation = hasLocation.toJsFn, isReadonly = isReadonly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, store = store.toJsFn, storeAsURL = js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (storeAsURL(t0, t1)).runNow()), storeToURL = js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (storeToURL(t0, t1)).runNow()))
    __obj.asInstanceOf[XStorable]
  }
  
  extension [Self <: XStorable](x: Self) {
    
    inline def setGetLocation(value: CallbackTo[String]): Self = StObject.set(x, "getLocation", value.toJsFn)
    
    inline def setHasLocation(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasLocation", value.toJsFn)
    
    inline def setIsReadonly(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReadonly", value.toJsFn)
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setStore(value: Callback): Self = StObject.set(x, "store", value.toJsFn)
    
    inline def setStoreAsURL(value: (String, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "storeAsURL", js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
    
    inline def setStoreToURL(value: (String, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "storeToURL", js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
  }
}
