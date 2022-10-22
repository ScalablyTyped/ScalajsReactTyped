package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Register specially adjusted instances of content providers on URL templates and supplementary arguments.
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XParameterizedContentProvider
  extends StObject
     with XInterface {
  
  /**
    * Deregisters a content provider.
    * @param Template A URL template. If the input is malformed or too complex, an IllegalArgumentException may be raised.
    * @param Arguments Any supplementary arguments required by this {@link XContentProvider} , represented as a single string. If the input is malformed, an {
    * @returns Either this {@link XContentProvider} , or another, specially adjusted version of this {@link XContentProvider} (this flexibility allows for diffe
    */
  def deregisterInstance(Template: String, Arguments: String): XContentProvider
  
  /**
    * Register a content provider on a URL template and supplementary arguments.
    * @param Template A URL template. If the input is malformed or too complex, an {@link com.sun.star.lang.IllegalArgumentException} may be raised.
    * @param Arguments Any supplementary arguments required by this {@link XContentProvider} , represented as a single string. If the input is malformed, an {
    * @param ReplaceExisting If true, and if the given Template conflicts with an already registered instance, the old registration is replaced by the new one
    * @returns Either this {@link XContentProvider} , or another, specially adjusted version of this {@link XContentProvider} (this flexibility allows for diffe
    */
  def registerInstance(Template: String, Arguments: String, ReplaceExisting: Boolean): XContentProvider
}
object XParameterizedContentProvider {
  
  inline def apply(
    acquire: Callback,
    deregisterInstance: (String, String) => XContentProvider,
    queryInterface: `type` => Any,
    registerInstance: (String, String, Boolean) => XContentProvider,
    release: Callback
  ): XParameterizedContentProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, deregisterInstance = js.Any.fromFunction2(deregisterInstance), queryInterface = js.Any.fromFunction1(queryInterface), registerInstance = js.Any.fromFunction3(registerInstance), release = release.toJsFn)
    __obj.asInstanceOf[XParameterizedContentProvider]
  }
  
  extension [Self <: XParameterizedContentProvider](x: Self) {
    
    inline def setDeregisterInstance(value: (String, String) => XContentProvider): Self = StObject.set(x, "deregisterInstance", js.Any.fromFunction2(value))
    
    inline def setRegisterInstance(value: (String, String, Boolean) => XContentProvider): Self = StObject.set(x, "registerInstance", js.Any.fromFunction3(value))
  }
}
