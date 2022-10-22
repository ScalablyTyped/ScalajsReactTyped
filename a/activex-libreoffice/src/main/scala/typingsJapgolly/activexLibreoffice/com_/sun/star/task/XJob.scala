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
  * specifies a job which is to be executed synchronously
  *
  * Instead of {@link XAsyncJob} the implementation of this interface will be executed synchronously every time. That means: they can be sure that the
  * current stack context will be blocked till this job finish it's work.
  * @see XAsyncJob
  */
trait XJob
  extends StObject
     with XInterface {
  
  /**
    * executes the job synchronously
    * @param Arguments are arguments for executing the job. Their semantics is completely implementation dependent. Usually, a concrete implementation of a jo
    * @returns the result of the job. The concrete semantics is service-dependent. But it should be possible to deregister the joblet it registered although ex
    * @throws com::sun::star::lang::IllegalArgumentException if some of given arguments doesn't fill out the service specification or was corrupt so the servic
    * @throws com::sun::star::uno::Exception to notify the executor about failed operation; otherwise the return value indicates a successful finishing.
    */
  def execute(Arguments: SeqEquiv[NamedValue]): Any
}
object XJob {
  
  inline def apply(
    acquire: Callback,
    execute: SeqEquiv[NamedValue] => Any,
    queryInterface: `type` => Any,
    release: Callback
  ): XJob = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, execute = js.Any.fromFunction1(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XJob]
  }
  
  extension [Self <: XJob](x: Self) {
    
    inline def setExecute(value: SeqEquiv[NamedValue] => Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
