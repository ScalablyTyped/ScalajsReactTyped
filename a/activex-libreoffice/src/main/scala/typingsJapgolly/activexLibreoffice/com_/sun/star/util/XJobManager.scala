package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manage cancelable jobs. */
trait XJobManager
  extends StObject
     with XInterface {
  
  /** cancel all registered jobs. */
  def cancelAllJobs(): Unit
  
  /** registers a cancelable job. */
  def registerJob(Job: XCancellable): Unit
  
  /** deregisters a cancelable jobs. */
  def releaseJob(Job: XCancellable): Unit
}
object XJobManager {
  
  inline def apply(
    acquire: Callback,
    cancelAllJobs: Callback,
    queryInterface: `type` => Any,
    registerJob: XCancellable => Callback,
    release: Callback,
    releaseJob: XCancellable => Callback
  ): XJobManager = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, cancelAllJobs = cancelAllJobs.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), registerJob = js.Any.fromFunction1((t0: XCancellable) => registerJob(t0).runNow()), release = release.toJsFn, releaseJob = js.Any.fromFunction1((t0: XCancellable) => releaseJob(t0).runNow()))
    __obj.asInstanceOf[XJobManager]
  }
  
  extension [Self <: XJobManager](x: Self) {
    
    inline def setCancelAllJobs(value: Callback): Self = StObject.set(x, "cancelAllJobs", value.toJsFn)
    
    inline def setRegisterJob(value: XCancellable => Callback): Self = StObject.set(x, "registerJob", js.Any.fromFunction1((t0: XCancellable) => value(t0).runNow()))
    
    inline def setReleaseJob(value: XCancellable => Callback): Self = StObject.set(x, "releaseJob", js.Any.fromFunction1((t0: XCancellable) => value(t0).runNow()))
  }
}
