package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Service of {@link XMLSignature} */
trait XMLSignature
  extends StObject
     with XXMLSignature
     with XInitialization
object XMLSignature {
  
  inline def apply(
    acquire: Callback,
    generate: (XXMLSignatureTemplate, XSecurityEnvironment) => XXMLSignatureTemplate,
    initialize: SeqEquiv[Any] => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    validate: (XXMLSignatureTemplate, XXMLSecurityContext) => XXMLSignatureTemplate
  ): XMLSignature = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, generate = js.Any.fromFunction2(generate), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, validate = js.Any.fromFunction2(validate))
    __obj.asInstanceOf[XMLSignature]
  }
}
