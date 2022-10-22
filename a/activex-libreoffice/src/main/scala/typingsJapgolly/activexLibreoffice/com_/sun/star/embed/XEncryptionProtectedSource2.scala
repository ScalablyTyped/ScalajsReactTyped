package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows to set a password for an object.
  * @since OOo 3.4
  */
trait XEncryptionProtectedSource2
  extends StObject
     with XEncryptionProtectedSource {
  
  /**
    * determine if an encryption data is set for this object.
    * @returns true if some encryption data was set, false otherwise
    */
  def hasEncryptionData(): Boolean
  
  /**
    * sets an encryption data for the object.
    * @param aEncryptionData the new encryption data
    * @throws com::sun::star::io::IOException in case the data could not be set
    */
  def setEncryptionData(aEncryptionData: SeqEquiv[NamedValue]): Unit
}
object XEncryptionProtectedSource2 {
  
  inline def apply(
    acquire: Callback,
    hasEncryptionData: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeEncryption: Callback,
    setEncryptionData: SeqEquiv[NamedValue] => Callback,
    setEncryptionPassword: String => Callback
  ): XEncryptionProtectedSource2 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, hasEncryptionData = hasEncryptionData.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEncryption = removeEncryption.toJsFn, setEncryptionData = js.Any.fromFunction1((t0: SeqEquiv[NamedValue]) => setEncryptionData(t0).runNow()), setEncryptionPassword = js.Any.fromFunction1((t0: String) => setEncryptionPassword(t0).runNow()))
    __obj.asInstanceOf[XEncryptionProtectedSource2]
  }
  
  extension [Self <: XEncryptionProtectedSource2](x: Self) {
    
    inline def setHasEncryptionData(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasEncryptionData", value.toJsFn)
    
    inline def setSetEncryptionData(value: SeqEquiv[NamedValue] => Callback): Self = StObject.set(x, "setEncryptionData", js.Any.fromFunction1((t0: SeqEquiv[NamedValue]) => value(t0).runNow()))
  }
}
