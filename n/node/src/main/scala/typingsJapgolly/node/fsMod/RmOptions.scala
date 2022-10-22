package typingsJapgolly.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RmOptions extends StObject {
  
  /**
    * When `true`, exceptions will be ignored if `path` does not exist.
    * @default false
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If an `EBUSY`, `EMFILE`, `ENFILE`, `ENOTEMPTY`, or
    * `EPERM` error is encountered, Node.js will retry the operation with a linear
    * backoff wait of `retryDelay` ms longer on each try. This option represents the
    * number of retries. This option is ignored if the `recursive` option is not
    * `true`.
    * @default 0
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  /**
    * If `true`, perform a recursive directory removal. In
    * recursive mode, operations are retried on failure.
    * @default false
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The amount of time in milliseconds to wait between retries.
    * This option is ignored if the `recursive` option is not `true`.
    * @default 100
    */
  var retryDelay: js.UndefOr[Double] = js.undefined
}
object RmOptions {
  
  inline def apply(): RmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RmOptions]
  }
  
  extension [Self <: RmOptions](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
    
    inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
  }
}
