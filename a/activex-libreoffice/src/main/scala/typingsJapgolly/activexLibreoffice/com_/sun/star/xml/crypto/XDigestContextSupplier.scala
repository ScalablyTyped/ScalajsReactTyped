package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows to get an object to generate a digest of a specified format.
  * @since OOo 3.4
  */
trait XDigestContextSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns an object that allows to generate the specified digest.
    * @param nDigestID the internal ID specifying the algorithm, should take value from {@link DigestID}
    * @param aParams optional parameters that could be used to initialize the digest, for example, it could contain a key and etc.
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    */
  def getDigestContext(nDigestID: Double, aParams: SeqEquiv[NamedValue]): XDigestContext
}
object XDigestContextSupplier {
  
  inline def apply(
    acquire: Callback,
    getDigestContext: (Double, SeqEquiv[NamedValue]) => XDigestContext,
    queryInterface: `type` => Any,
    release: Callback
  ): XDigestContextSupplier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getDigestContext = js.Any.fromFunction2(getDigestContext), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDigestContextSupplier]
  }
  
  extension [Self <: XDigestContextSupplier](x: Self) {
    
    inline def setGetDigestContext(value: (Double, SeqEquiv[NamedValue]) => XDigestContext): Self = StObject.set(x, "getDigestContext", js.Any.fromFunction2(value))
  }
}
