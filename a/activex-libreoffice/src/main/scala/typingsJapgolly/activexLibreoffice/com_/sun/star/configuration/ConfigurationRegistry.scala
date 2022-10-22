package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.registry.XRegistryKey
import typingsJapgolly.activexLibreoffice.com_.sun.star.registry.XSimpleRegistry
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XFlushListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XFlushable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationRegistry
  extends StObject
     with XSimpleRegistry
     with XFlushable
object ConfigurationRegistry {
  
  inline def apply(
    RootKey: XRegistryKey,
    URL: String,
    acquire: Callback,
    addFlushListener: XFlushListener => Callback,
    close: Callback,
    destroy: Callback,
    flush: Callback,
    getRootKey: CallbackTo[XRegistryKey],
    getURL: CallbackTo[String],
    isReadOnly: CallbackTo[Boolean],
    isValid: CallbackTo[Boolean],
    mergeKey: (String, String) => Callback,
    open: (String, Boolean, Boolean) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeFlushListener: XFlushListener => Callback
  ): ConfigurationRegistry = {
    val __obj = js.Dynamic.literal(RootKey = RootKey.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, addFlushListener = js.Any.fromFunction1((t0: XFlushListener) => addFlushListener(t0).runNow()), close = close.toJsFn, destroy = destroy.toJsFn, flush = flush.toJsFn, getRootKey = getRootKey.toJsFn, getURL = getURL.toJsFn, isReadOnly = isReadOnly.toJsFn, isValid = isValid.toJsFn, mergeKey = js.Any.fromFunction2((t0: String, t1: String) => (mergeKey(t0, t1)).runNow()), open = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (open(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeFlushListener = js.Any.fromFunction1((t0: XFlushListener) => removeFlushListener(t0).runNow()))
    __obj.asInstanceOf[ConfigurationRegistry]
  }
}
