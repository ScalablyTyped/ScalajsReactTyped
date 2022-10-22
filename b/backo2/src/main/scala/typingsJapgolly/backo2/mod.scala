package typingsJapgolly.backo2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("backo2", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Backoff {
    def this(opts: BackoffOptions) = this()
    
    /**
      * The number of previous attempts
      */
    /* CompleteClass */
    var attempts: Double = js.native
    
    /**
      * Compute the backoff duration and increment the number of attempts
      */
    /* CompleteClass */
    override def duration(): Double = js.native
    
    /**
      * The base to which the attempt is raised as an exponent
      */
    /* CompleteClass */
    var factor: Double = js.native
    
    /**
      * An upper bound on the variance around the duration between attempts
      */
    /* CompleteClass */
    var jitter: Double = js.native
    
    /**
      * An upper bound on the duration between attempts
      */
    /* CompleteClass */
    var max: Double = js.native
    
    /**
      * A lower bound on the duration between attempts
      */
    /* CompleteClass */
    var ms: Double = js.native
    
    /**
      * Reset the number of attempts
      */
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /**
      * Set the jitter
      */
    /* CompleteClass */
    override def setJitter(jitter: Double): Unit = js.native
    
    /**
      * Set the maximum duration between attempts
      */
    /* CompleteClass */
    override def setMax(max: Double): Unit = js.native
    
    /**
      * Set the minimum duration between attempts
      */
    /* CompleteClass */
    override def setMin(min: Double): Unit = js.native
  }
  
  trait Backoff extends StObject {
    
    /**
      * The number of previous attempts
      */
    var attempts: Double
    
    /**
      * Compute the backoff duration and increment the number of attempts
      */
    def duration(): Double
    
    /**
      * The base to which the attempt is raised as an exponent
      */
    var factor: Double
    
    /**
      * An upper bound on the variance around the duration between attempts
      */
    var jitter: Double
    
    /**
      * An upper bound on the duration between attempts
      */
    var max: Double
    
    /**
      * A lower bound on the duration between attempts
      */
    var ms: Double
    
    /**
      * Reset the number of attempts
      */
    def reset(): Unit
    
    /**
      * Set the jitter
      */
    def setJitter(jitter: Double): Unit
    
    /**
      * Set the maximum duration between attempts
      */
    def setMax(max: Double): Unit
    
    /**
      * Set the minimum duration between attempts
      */
    def setMin(min: Double): Unit
  }
  object Backoff {
    
    inline def apply(
      attempts: Double,
      duration: CallbackTo[Double],
      factor: Double,
      jitter: Double,
      max: Double,
      ms: Double,
      reset: Callback,
      setJitter: Double => Callback,
      setMax: Double => Callback,
      setMin: Double => Callback
    ): Backoff = {
      val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], duration = duration.toJsFn, factor = factor.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], ms = ms.asInstanceOf[js.Any], reset = reset.toJsFn, setJitter = js.Any.fromFunction1((t0: Double) => setJitter(t0).runNow()), setMax = js.Any.fromFunction1((t0: Double) => setMax(t0).runNow()), setMin = js.Any.fromFunction1((t0: Double) => setMin(t0).runNow()))
      __obj.asInstanceOf[Backoff]
    }
    
    extension [Self <: Backoff](x: Self) {
      
      inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: CallbackTo[Double]): Self = StObject.set(x, "duration", value.toJsFn)
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setSetJitter(value: Double => Callback): Self = StObject.set(x, "setJitter", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetMax(value: Double => Callback): Self = StObject.set(x, "setMax", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetMin(value: Double => Callback): Self = StObject.set(x, "setMin", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  /* Inlined std.Partial<{  min :number,   max :number,   jitter :number,   factor :number}> */
  trait BackoffOptions extends StObject {
    
    var factor: js.UndefOr[Double] = js.undefined
    
    var jitter: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
  }
  object BackoffOptions {
    
    inline def apply(): BackoffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackoffOptions]
    }
    
    extension [Self <: BackoffOptions](x: Self) {
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      inline def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
      
      inline def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
}
