package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Service of {@link Decryptor} */
trait Decryptor
  extends StObject
     with XReferenceResolvedListener
     with XBlockerMonitor
     with XDecryptionResultBroadcaster
     with XKeyCollector
     with XMissionTaker
     with XInitialization
object Decryptor {
  
  inline def apply(
    acquire: Callback,
    addDecryptionResultListener: XDecryptionResultListener => Callback,
    endMission: CallbackTo[Boolean],
    initialize: SeqEquiv[Any] => Callback,
    queryInterface: `type` => Any,
    referenceResolved: Double => Callback,
    release: Callback,
    removeDecryptionResultListener: XDecryptionResultListener => Callback,
    setBlockerId: Double => Callback,
    setKeyId: Double => Callback
  ): Decryptor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addDecryptionResultListener = js.Any.fromFunction1((t0: XDecryptionResultListener) => addDecryptionResultListener(t0).runNow()), endMission = endMission.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), referenceResolved = js.Any.fromFunction1((t0: Double) => referenceResolved(t0).runNow()), release = release.toJsFn, removeDecryptionResultListener = js.Any.fromFunction1((t0: XDecryptionResultListener) => removeDecryptionResultListener(t0).runNow()), setBlockerId = js.Any.fromFunction1((t0: Double) => setBlockerId(t0).runNow()), setKeyId = js.Any.fromFunction1((t0: Double) => setKeyId(t0).runNow()))
    __obj.asInstanceOf[Decryptor]
  }
}
