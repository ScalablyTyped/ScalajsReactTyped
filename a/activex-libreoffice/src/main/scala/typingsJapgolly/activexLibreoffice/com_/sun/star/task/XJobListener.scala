package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** listener on finish states of asynchronous job execution */
trait XJobListener
  extends StObject
     with XEventListener {
  
  /**
    * indicates that the job is done
    * @param Job identifies the asynchronous job so that {@link theJobExecutor} can differ between more than ones.
    * @param Result should be the same like for the synchronous mode on {@link XJob.execute()} . It provides information about success or failure of job execu
    */
  def jobFinished(Job: XAsyncJob, Result: Any): Unit
}
object XJobListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    jobFinished: (XAsyncJob, Any) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XJobListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), jobFinished = js.Any.fromFunction2((t0: XAsyncJob, t1: Any) => (jobFinished(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XJobListener]
  }
  
  extension [Self <: XJobListener](x: Self) {
    
    inline def setJobFinished(value: (XAsyncJob, Any) => Callback): Self = StObject.set(x, "jobFinished", js.Any.fromFunction2((t0: XAsyncJob, t1: Any) => (value(t0, t1)).runNow()))
  }
}
