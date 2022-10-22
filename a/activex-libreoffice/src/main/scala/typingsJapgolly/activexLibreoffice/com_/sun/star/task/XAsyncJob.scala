package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a job which must be executed asynchronously
  *
  * Instead of {@link XJob} the implementation of this interface must be aware, that execution can be made real asynchronous (e.g. by using threads).
  * Because the environment wish to have creation and using of threads under control, it's not allowed for a real job implementation to use such mechanism
  * by itself. The outside code decide, if it's possible and how it can be made asynchronous. In some special cases it can be, that asynchronous jobs will
  * be executed synchronously.
  * @see XJob
  */
trait XAsyncJob
  extends StObject
     with XInterface {
  
  /**
    * executes the job asynchronously
    * @param Arguments are arguments for executing the job. Their semantics is completely implementation dependent. Usually, a concrete implementation of a jo
    * @param Listener specifies a listener which should be notified on events. May be `NULL` .
    * @throws com::sun::star::lang::IllegalArgumentException if some of given arguments doesn't fill out the service specification or was corrupt so the servic
    */
  def executeAsync(Arguments: SeqEquiv[NamedValue], Listener: XJobListener): Unit
}
object XAsyncJob {
  
  inline def apply(
    acquire: Callback,
    executeAsync: (SeqEquiv[NamedValue], XJobListener) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XAsyncJob = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, executeAsync = js.Any.fromFunction2((t0: SeqEquiv[NamedValue], t1: XJobListener) => (executeAsync(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAsyncJob]
  }
  
  extension [Self <: XAsyncJob](x: Self) {
    
    inline def setExecuteAsync(value: (SeqEquiv[NamedValue], XJobListener) => Callback): Self = StObject.set(x, "executeAsync", js.Any.fromFunction2((t0: SeqEquiv[NamedValue], t1: XJobListener) => (value(t0, t1)).runNow()))
  }
}
