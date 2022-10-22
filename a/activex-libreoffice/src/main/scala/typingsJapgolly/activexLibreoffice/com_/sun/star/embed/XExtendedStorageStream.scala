package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XOutputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XSeekable
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface allows access to an extended storage stream that might be transacted. */
trait XExtendedStorageStream
  extends StObject
     with XStream
     with XComponent
     with XSeekable
     with XEncryptionProtectedSource
     with XPropertySet
     with XTransactedObject
     with XTransactionBroadcaster
object XExtendedStorageStream {
  
  inline def apply(
    InputStream: XInputStream,
    Length: Double,
    OutputStream: XOutputStream,
    Position: Double,
    PropertySetInfo: XPropertySetInfo,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addTransactionListener: XTransactionListener => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    commit: Callback,
    dispose: Callback,
    getInputStream: CallbackTo[XInputStream],
    getLength: CallbackTo[Double],
    getOutputStream: CallbackTo[XOutputStream],
    getPosition: CallbackTo[Double],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removeEncryption: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeTransactionListener: XTransactionListener => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    revert: Callback,
    seek: Double => Callback,
    setEncryptionPassword: String => Callback,
    setPropertyValue: (String, Any) => Callback
  ): XExtendedStorageStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addTransactionListener = js.Any.fromFunction1((t0: XTransactionListener) => addTransactionListener(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), commit = commit.toJsFn, dispose = dispose.toJsFn, getInputStream = getInputStream.toJsFn, getLength = getLength.toJsFn, getOutputStream = getOutputStream.toJsFn, getPosition = getPosition.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEncryption = removeEncryption.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeTransactionListener = js.Any.fromFunction1((t0: XTransactionListener) => removeTransactionListener(t0).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), revert = revert.toJsFn, seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), setEncryptionPassword = js.Any.fromFunction1((t0: String) => setEncryptionPassword(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[XExtendedStorageStream]
  }
}
