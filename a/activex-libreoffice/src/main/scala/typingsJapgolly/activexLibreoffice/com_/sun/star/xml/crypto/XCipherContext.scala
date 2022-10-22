package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows to encrypt/decrypt data using the cipher context.
  *
  * The algorithm as well as encryption data are specified on object creation.
  * @see XCipherContextSupplier
  * @since OOo 3.4
  */
trait XCipherContext
  extends StObject
     with XInterface {
  
  /**
    * encrypts/decrypts the data using the cipher.
    *
    * Please have in mind, the cipher object state might depend from the already encrypted/decrypted data ( it depends from the used algorithm ).
    *
    * Whether the object does encryption or decryption is specified by creation of the object.
    * @param aData data that should be encrypted/decrypted
    */
  def convertWithCipherContext(aData: SeqEquiv[Double]): SafeArray[Double]
  
  /** finalizes cipher and disposes context. */
  def finalizeCipherContextAndDispose(): SafeArray[Double]
}
object XCipherContext {
  
  inline def apply(
    acquire: Callback,
    convertWithCipherContext: SeqEquiv[Double] => SafeArray[Double],
    finalizeCipherContextAndDispose: CallbackTo[SafeArray[Double]],
    queryInterface: `type` => Any,
    release: Callback
  ): XCipherContext = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, convertWithCipherContext = js.Any.fromFunction1(convertWithCipherContext), finalizeCipherContextAndDispose = finalizeCipherContextAndDispose.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCipherContext]
  }
  
  extension [Self <: XCipherContext](x: Self) {
    
    inline def setConvertWithCipherContext(value: SeqEquiv[Double] => SafeArray[Double]): Self = StObject.set(x, "convertWithCipherContext", js.Any.fromFunction1(value))
    
    inline def setFinalizeCipherContextAndDispose(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "finalizeCipherContextAndDispose", value.toJsFn)
  }
}
