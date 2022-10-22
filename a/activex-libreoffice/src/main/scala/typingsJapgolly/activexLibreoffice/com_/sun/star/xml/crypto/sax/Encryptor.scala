package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Service of {@link Encryptor} */
trait Encryptor
  extends StObject
     with XReferenceResolvedListener
     with XReferenceCollector
     with XBlockerMonitor
     with XEncryptionResultBroadcaster
     with XKeyCollector
     with XMissionTaker
     with XInitialization
object Encryptor {
  
  inline def apply(
    acquire: Callback,
    addEncryptionResultListener: XEncryptionResultListener => Callback,
    endMission: CallbackTo[Boolean],
    initialize: SeqEquiv[Any] => Callback,
    queryInterface: `type` => Any,
    referenceResolved: Double => Callback,
    release: Callback,
    removeEncryptionResultListener: XEncryptionResultListener => Callback,
    setBlockerId: Double => Callback,
    setKeyId: Double => Callback,
    setReferenceCount: Double => Callback,
    setReferenceId: Double => Callback
  ): Encryptor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addEncryptionResultListener = js.Any.fromFunction1((t0: XEncryptionResultListener) => addEncryptionResultListener(t0).runNow()), endMission = endMission.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), referenceResolved = js.Any.fromFunction1((t0: Double) => referenceResolved(t0).runNow()), release = release.toJsFn, removeEncryptionResultListener = js.Any.fromFunction1((t0: XEncryptionResultListener) => removeEncryptionResultListener(t0).runNow()), setBlockerId = js.Any.fromFunction1((t0: Double) => setBlockerId(t0).runNow()), setKeyId = js.Any.fromFunction1((t0: Double) => setKeyId(t0).runNow()), setReferenceCount = js.Any.fromFunction1((t0: Double) => setReferenceCount(t0).runNow()), setReferenceId = js.Any.fromFunction1((t0: Double) => setReferenceId(t0).runNow()))
    __obj.asInstanceOf[Encryptor]
  }
}
