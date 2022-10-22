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
  * This interface allows to generate the digest.
  *
  * The algorithm to generate the digest is specified on object creation.
  * @see XDigestContextSupplier
  * @since OOo 3.4
  */
trait XDigestContext
  extends StObject
     with XInterface {
  
  /** finalizes digest and disposes context. */
  def finalizeDigestAndDispose(): SafeArray[Double]
  
  /**
    * update the digest with the given data.
    * @param aData data that should be used to update the digest
    */
  def updateDigest(aData: SeqEquiv[Double]): Unit
}
object XDigestContext {
  
  inline def apply(
    acquire: Callback,
    finalizeDigestAndDispose: CallbackTo[SafeArray[Double]],
    queryInterface: `type` => Any,
    release: Callback,
    updateDigest: SeqEquiv[Double] => Callback
  ): XDigestContext = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, finalizeDigestAndDispose = finalizeDigestAndDispose.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, updateDigest = js.Any.fromFunction1((t0: SeqEquiv[Double]) => updateDigest(t0).runNow()))
    __obj.asInstanceOf[XDigestContext]
  }
  
  extension [Self <: XDigestContext](x: Self) {
    
    inline def setFinalizeDigestAndDispose(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "finalizeDigestAndDispose", value.toJsFn)
    
    inline def setUpdateDigest(value: SeqEquiv[Double] => Callback): Self = StObject.set(x, "updateDigest", js.Any.fromFunction1((t0: SeqEquiv[Double]) => value(t0).runNow()))
  }
}
