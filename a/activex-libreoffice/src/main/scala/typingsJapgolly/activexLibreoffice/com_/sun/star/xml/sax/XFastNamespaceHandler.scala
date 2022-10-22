package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 5.3 */
trait XFastNamespaceHandler
  extends StObject
     with XInterface {
  
  def getNamespaceURI(NamespacePrefix: String): String
  
  def registerNamespace(NamespacePrefix: String, NamespaceURI: String): Unit
}
object XFastNamespaceHandler {
  
  inline def apply(
    acquire: Callback,
    getNamespaceURI: String => String,
    queryInterface: `type` => Any,
    registerNamespace: (String, String) => Callback,
    release: Callback
  ): XFastNamespaceHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getNamespaceURI = js.Any.fromFunction1(getNamespaceURI), queryInterface = js.Any.fromFunction1(queryInterface), registerNamespace = js.Any.fromFunction2((t0: String, t1: String) => (registerNamespace(t0, t1)).runNow()), release = release.toJsFn)
    __obj.asInstanceOf[XFastNamespaceHandler]
  }
  
  extension [Self <: XFastNamespaceHandler](x: Self) {
    
    inline def setGetNamespaceURI(value: String => String): Self = StObject.set(x, "getNamespaceURI", js.Any.fromFunction1(value))
    
    inline def setRegisterNamespace(value: (String, String) => Callback): Self = StObject.set(x, "registerNamespace", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
