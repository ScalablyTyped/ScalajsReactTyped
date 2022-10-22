package typingsJapgolly.activexLibreoffice.com_.sun.star.security

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of a PKI Certificate
  *
  * This interface represents a x509 certificate.
  */
trait XCertificateExtension
  extends StObject
     with XInterface {
  
  /** Get the extension object identifier in string. */
  var ExtensionId: SafeArray[Double]
  
  /** Get the extension value */
  var ExtensionValue: SafeArray[Double]
  
  /** Check whether it is a critical extension */
  def isCritical(): Boolean
}
object XCertificateExtension {
  
  inline def apply(
    ExtensionId: SafeArray[Double],
    ExtensionValue: SafeArray[Double],
    acquire: Callback,
    isCritical: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XCertificateExtension = {
    val __obj = js.Dynamic.literal(ExtensionId = ExtensionId.asInstanceOf[js.Any], ExtensionValue = ExtensionValue.asInstanceOf[js.Any], acquire = acquire.toJsFn, isCritical = isCritical.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCertificateExtension]
  }
  
  extension [Self <: XCertificateExtension](x: Self) {
    
    inline def setExtensionId(value: SafeArray[Double]): Self = StObject.set(x, "ExtensionId", value.asInstanceOf[js.Any])
    
    inline def setExtensionValue(value: SafeArray[Double]): Self = StObject.set(x, "ExtensionValue", value.asInstanceOf[js.Any])
    
    inline def setIsCritical(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCritical", value.toJsFn)
  }
}
