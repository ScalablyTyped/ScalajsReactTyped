package typingsJapgolly.sphereEngineBrowser

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides proof of a scheduled Dispatch job and allows its scheduling to be manipulated.
  */
trait JobToken extends StObject {
  
  /**
    * Cancels the job. For one-time jobs, if the job has already fired, calling this has no
    * effect.
    */
  def cancel(): Unit
  
  /** Pauses the job, preventing it from firing until `resume` is called. */
  def pause(): Unit
  
  /** Resumes a job whose scheduling was paused with `pause`. */
  def resume(): Unit
}
object JobToken {
  
  inline def apply(cancel: Callback, pause: Callback, resume: Callback): JobToken = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, pause = pause.toJsFn, resume = resume.toJsFn)
    __obj.asInstanceOf[JobToken]
  }
  
  extension [Self <: JobToken](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
  }
}
