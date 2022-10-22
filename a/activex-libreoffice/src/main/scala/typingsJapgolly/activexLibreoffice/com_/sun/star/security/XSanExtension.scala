package typingsJapgolly.activexLibreoffice.com_.sun.star.security

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of a X509 Subject Alternative Name Certificate Extension
  *
  * This interface represents a x509 certificate extension.
  */
trait XSanExtension
  extends StObject
     with XCertificateExtension {
  
  /** Contains the alternative names of a certificate */
  var AlternativeNames: SafeArray[CertAltNameEntry]
}
object XSanExtension {
  
  inline def apply(
    AlternativeNames: SafeArray[CertAltNameEntry],
    ExtensionId: SafeArray[Double],
    ExtensionValue: SafeArray[Double],
    acquire: Callback,
    isCritical: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XSanExtension = {
    val __obj = js.Dynamic.literal(AlternativeNames = AlternativeNames.asInstanceOf[js.Any], ExtensionId = ExtensionId.asInstanceOf[js.Any], ExtensionValue = ExtensionValue.asInstanceOf[js.Any], acquire = acquire.toJsFn, isCritical = isCritical.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSanExtension]
  }
  
  extension [Self <: XSanExtension](x: Self) {
    
    inline def setAlternativeNames(value: SafeArray[CertAltNameEntry]): Self = StObject.set(x, "AlternativeNames", value.asInstanceOf[js.Any])
  }
}
