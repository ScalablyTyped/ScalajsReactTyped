package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.XUriBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureCreator
  extends StObject
     with XReferenceResolvedListener
     with XReferenceCollector
     with XSignatureCreationResultBroadcaster
     with XBlockerMonitor
     with XKeyCollector
     with XMissionTaker
     with XUriBinding
     with XInitialization
object SignatureCreator {
  
  inline def apply(
    acquire: Callback,
    addSignatureCreationResultListener: XSignatureCreationResultListener => Callback,
    endMission: CallbackTo[Boolean],
    getUriBinding: String => XInputStream,
    initialize: SeqEquiv[Any] => Callback,
    queryInterface: `type` => Any,
    referenceResolved: Double => Callback,
    release: Callback,
    removeSignatureCreationResultListener: XSignatureCreationResultListener => Callback,
    setBlockerId: Double => Callback,
    setKeyId: Double => Callback,
    setReferenceCount: Double => Callback,
    setReferenceId: Double => Callback,
    setUriBinding: (String, XInputStream) => Callback
  ): SignatureCreator = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addSignatureCreationResultListener = js.Any.fromFunction1((t0: XSignatureCreationResultListener) => addSignatureCreationResultListener(t0).runNow()), endMission = endMission.toJsFn, getUriBinding = js.Any.fromFunction1(getUriBinding), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), referenceResolved = js.Any.fromFunction1((t0: Double) => referenceResolved(t0).runNow()), release = release.toJsFn, removeSignatureCreationResultListener = js.Any.fromFunction1((t0: XSignatureCreationResultListener) => removeSignatureCreationResultListener(t0).runNow()), setBlockerId = js.Any.fromFunction1((t0: Double) => setBlockerId(t0).runNow()), setKeyId = js.Any.fromFunction1((t0: Double) => setKeyId(t0).runNow()), setReferenceCount = js.Any.fromFunction1((t0: Double) => setReferenceCount(t0).runNow()), setReferenceId = js.Any.fromFunction1((t0: Double) => setReferenceId(t0).runNow()), setUriBinding = js.Any.fromFunction2((t0: String, t1: XInputStream) => (setUriBinding(t0, t1)).runNow()))
    __obj.asInstanceOf[SignatureCreator]
  }
}
