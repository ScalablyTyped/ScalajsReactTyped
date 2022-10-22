package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloseListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloseable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represent a synchronous job, which can be executed by the global {@link theJobExecutor} instance.
  * @see AsyncJob
  * @since OOo 1.1.2
  */
trait Job
  extends StObject
     with XJob
     with XCloseable
object Job {
  
  inline def apply(
    acquire: Callback,
    addCloseListener: XCloseListener => Callback,
    close: Boolean => Callback,
    execute: SeqEquiv[NamedValue] => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removeCloseListener: XCloseListener => Callback
  ): Job = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addCloseListener = js.Any.fromFunction1((t0: XCloseListener) => addCloseListener(t0).runNow()), close = js.Any.fromFunction1((t0: Boolean) => close(t0).runNow()), execute = js.Any.fromFunction1(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeCloseListener = js.Any.fromFunction1((t0: XCloseListener) => removeCloseListener(t0).runNow()))
    __obj.asInstanceOf[Job]
  }
}
