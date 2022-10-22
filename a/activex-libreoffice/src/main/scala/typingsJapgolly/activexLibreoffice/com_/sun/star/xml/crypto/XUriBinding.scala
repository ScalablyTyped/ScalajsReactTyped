package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Uri Binding.
  *
  * This interface is used to dynamically bind a uri with a XInputStream interface.
  */
trait XUriBinding
  extends StObject
     with XInterface {
  
  /**
    * Gets the XInputStream interface for a uri.
    * @param uri the uri whose binding is to get
    * @returns the XInputStream bound with the uri
    */
  def getUriBinding(uri: String): XInputStream
  
  /**
    * Sets the XInputStream interface for a uri.
    * @param uri the uri to bind
    * @param InputStream the XInputStream to be bound
    */
  def setUriBinding(uri: String, InputStream: XInputStream): Unit
}
object XUriBinding {
  
  inline def apply(
    acquire: Callback,
    getUriBinding: String => XInputStream,
    queryInterface: `type` => Any,
    release: Callback,
    setUriBinding: (String, XInputStream) => Callback
  ): XUriBinding = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getUriBinding = js.Any.fromFunction1(getUriBinding), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setUriBinding = js.Any.fromFunction2((t0: String, t1: XInputStream) => (setUriBinding(t0, t1)).runNow()))
    __obj.asInstanceOf[XUriBinding]
  }
  
  extension [Self <: XUriBinding](x: Self) {
    
    inline def setGetUriBinding(value: String => XInputStream): Self = StObject.set(x, "getUriBinding", js.Any.fromFunction1(value))
    
    inline def setSetUriBinding(value: (String, XInputStream) => Callback): Self = StObject.set(x, "setUriBinding", js.Any.fromFunction2((t0: String, t1: XInputStream) => (value(t0, t1)).runNow()))
  }
}
