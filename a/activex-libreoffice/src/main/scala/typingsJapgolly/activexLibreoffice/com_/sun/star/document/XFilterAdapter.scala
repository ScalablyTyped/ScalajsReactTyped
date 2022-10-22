package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XOutputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is an interface that can be used to link a filter to the {@link FilterAdapter}
  * @since OOo 1.1.2
  * @throws com::sun::star::uno::RuntimeException
  */
trait XFilterAdapter
  extends StObject
     with XInterface {
  
  def convert(
    xml: XInputStream,
    device: XOutputStream,
    convertToOffice: Boolean,
    pluginUrl: String,
    fileName: String
  ): Unit
}
object XFilterAdapter {
  
  inline def apply(
    acquire: Callback,
    convert: (XInputStream, XOutputStream, Boolean, String, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XFilterAdapter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, convert = js.Any.fromFunction5((t0: XInputStream, t1: XOutputStream, t2: Boolean, t3: String, t4: String) => (convert(t0, t1, t2, t3, t4)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFilterAdapter]
  }
  
  extension [Self <: XFilterAdapter](x: Self) {
    
    inline def setConvert(value: (XInputStream, XOutputStream, Boolean, String, String) => Callback): Self = StObject.set(x, "convert", js.Any.fromFunction5((t0: XInputStream, t1: XOutputStream, t2: Boolean, t3: String, t4: String) => (value(t0, t1, t2, t3, t4)).runNow()))
  }
}
