package typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a certificate store for an app. */
trait CertificateStore extends StObject {
  
  /**
    * Adds a certificate to the certificate store.
    * @param certificate The certificate to add to the certificate store.
    */
  def add(certificate: Certificate): Unit
  
  /**
    * Deletes a certificate from the certificate store.
    * @param certificate The certificate to delete from the certificate store.
    */
  def delete(certificate: Certificate): Unit
  
  /** Gets the name of the certificate store. */
  var name: String
}
object CertificateStore {
  
  inline def apply(add: Certificate => Callback, delete: Certificate => Callback, name: String): CertificateStore = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: Certificate) => add(t0).runNow()), delete = js.Any.fromFunction1((t0: Certificate) => delete(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateStore]
  }
  
  extension [Self <: CertificateStore](x: Self) {
    
    inline def setAdd(value: Certificate => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: Certificate) => value(t0).runNow()))
    
    inline def setDelete(value: Certificate => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: Certificate) => value(t0).runNow()))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
