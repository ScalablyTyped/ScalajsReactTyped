package typingsJapgolly.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of the Platform's 'TextEncoder' implementation.
  */
/**
  * A helper for running delayed tasks following an exponential backoff curve
  * between attempts.
  *
  * Each delay is made up of a "base" delay which follows the exponential
  * backoff curve, and a +/- 50% "jitter" that is calculated and added to the
  * base delay. This prevents clients from accidentally synchronizing their
  * delays causing spikes of load to the backend.
  */
trait tu extends StObject {
  
  /**
    * Resets the backoff delay to the maximum delay (e.g. for use after a
    * RESOURCE_EXHAUSTED error).
    */ def Ao(): Unit
  
  /** The last backoff attempt, as epoch milliseconds. */
  var Eo: Double
  
  var Hs: Any
  
  var Io: Double
  
  def Po(): Unit
  
  /**
    * Returns a promise that resolves after currentDelayMs, and increases the
    * delay for any subsequent attempts. If there was a pending backoff operation
    * already, it will be canceled.
    */ def Ro(t: Any): Unit
  
  var To: Any
  
  /** Returns a random value in the range [-currentBaseMs/2, currentBaseMs/2] */ def bo(): Double
  
  def cancel(): Unit
  
  var mo: Double
  
  var po: Double
  
  /**
    * Resets the backoff delay.
    *
    * The very next backoffAndWait() will have no delay. If it is called again
    * (i.e. due to an error), initialDelayMs (plus jitter) will be used, and
    * subsequent ones will increase according to the backoffFactor.
    */ def reset(): Unit
  
  var timerId: Any
  
  var yo: Double
}
object tu {
  
  inline def apply(
    Ao: Callback,
    Eo: Double,
    Hs: Any,
    Io: Double,
    Po: Callback,
    Ro: Any => Callback,
    To: Any,
    bo: CallbackTo[Double],
    cancel: Callback,
    mo: Double,
    po: Double,
    reset: Callback,
    timerId: Any,
    yo: Double
  ): tu = {
    val __obj = js.Dynamic.literal(Ao = Ao.toJsFn, Eo = Eo.asInstanceOf[js.Any], Hs = Hs.asInstanceOf[js.Any], Io = Io.asInstanceOf[js.Any], Po = Po.toJsFn, Ro = js.Any.fromFunction1((t0: Any) => Ro(t0).runNow()), To = To.asInstanceOf[js.Any], bo = bo.toJsFn, cancel = cancel.toJsFn, mo = mo.asInstanceOf[js.Any], po = po.asInstanceOf[js.Any], reset = reset.toJsFn, timerId = timerId.asInstanceOf[js.Any], yo = yo.asInstanceOf[js.Any])
    __obj.asInstanceOf[tu]
  }
  
  extension [Self <: tu](x: Self) {
    
    inline def setAo(value: Callback): Self = StObject.set(x, "Ao", value.toJsFn)
    
    inline def setBo(value: CallbackTo[Double]): Self = StObject.set(x, "bo", value.toJsFn)
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setEo(value: Double): Self = StObject.set(x, "Eo", value.asInstanceOf[js.Any])
    
    inline def setHs(value: Any): Self = StObject.set(x, "Hs", value.asInstanceOf[js.Any])
    
    inline def setIo(value: Double): Self = StObject.set(x, "Io", value.asInstanceOf[js.Any])
    
    inline def setMo(value: Double): Self = StObject.set(x, "mo", value.asInstanceOf[js.Any])
    
    inline def setPo(value: Callback): Self = StObject.set(x, "Po", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setRo(value: Any => Callback): Self = StObject.set(x, "Ro", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setTimerId(value: Any): Self = StObject.set(x, "timerId", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Any): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    inline def setYo(value: Double): Self = StObject.set(x, "yo", value.asInstanceOf[js.Any])
  }
}
