package typingsJapgolly.tesseractJs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scheduler extends StObject {
  
  def addJob(action: String, args: Any*): js.Promise[ConfigResult | RecognizeResult | DetectResult]
  
  def addWorker(worker: Worker): String
  
  def getNumWorkers(): Double
  
  def getQueueLen(): Double
  
  def terminate(): js.Promise[Any]
}
object Scheduler {
  
  inline def apply(
    addJob: (String, /* repeated */ Any) => js.Promise[ConfigResult | RecognizeResult | DetectResult],
    addWorker: Worker => String,
    getNumWorkers: CallbackTo[Double],
    getQueueLen: CallbackTo[Double],
    terminate: CallbackTo[js.Promise[Any]]
  ): Scheduler = {
    val __obj = js.Dynamic.literal(addJob = js.Any.fromFunction2(addJob), addWorker = js.Any.fromFunction1(addWorker), getNumWorkers = getNumWorkers.toJsFn, getQueueLen = getQueueLen.toJsFn, terminate = terminate.toJsFn)
    __obj.asInstanceOf[Scheduler]
  }
  
  extension [Self <: Scheduler](x: Self) {
    
    inline def setAddJob(value: (String, /* repeated */ Any) => js.Promise[ConfigResult | RecognizeResult | DetectResult]): Self = StObject.set(x, "addJob", js.Any.fromFunction2(value))
    
    inline def setAddWorker(value: Worker => String): Self = StObject.set(x, "addWorker", js.Any.fromFunction1(value))
    
    inline def setGetNumWorkers(value: CallbackTo[Double]): Self = StObject.set(x, "getNumWorkers", value.toJsFn)
    
    inline def setGetQueueLen(value: CallbackTo[Double]): Self = StObject.set(x, "getQueueLen", value.toJsFn)
    
    inline def setTerminate(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "terminate", value.toJsFn)
  }
}
