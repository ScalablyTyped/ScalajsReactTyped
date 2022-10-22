package typingsJapgolly.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Connection Pool options
  *
  * @see Options
  */
trait PoolOptions extends StObject {
  
  /**
    * The maximum time, in milliseconds, that pool will try to get connection before throwing error
    */
  var acquire: js.UndefOr[Double] = js.undefined
  
  /*
    * The time interval, in milliseconds, for evicting stale connections
    */
  var evict: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum time, in milliseconds, that a connection can be idle before being released.
    */
  var idle: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum connections of the pool
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum connections of the pool
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * A function that validates a connection. Called with client. The default function checks that client is an
    * object, and that its state is not disconnected.
    */
  var validate: js.UndefOr[js.Function1[/* client */ js.UndefOr[Any], Boolean]] = js.undefined
}
object PoolOptions {
  
  inline def apply(): PoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolOptions]
  }
  
  extension [Self <: PoolOptions](x: Self) {
    
    inline def setAcquire(value: Double): Self = StObject.set(x, "acquire", value.asInstanceOf[js.Any])
    
    inline def setAcquireUndefined: Self = StObject.set(x, "acquire", js.undefined)
    
    inline def setEvict(value: Double): Self = StObject.set(x, "evict", value.asInstanceOf[js.Any])
    
    inline def setEvictUndefined: Self = StObject.set(x, "evict", js.undefined)
    
    inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    inline def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setValidate(value: /* client */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
