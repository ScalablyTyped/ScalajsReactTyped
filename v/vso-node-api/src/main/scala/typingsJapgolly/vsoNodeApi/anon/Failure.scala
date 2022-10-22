package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Failure extends StObject {
  
  var canceled: scala.Double
  
  var failed: scala.Double
  
  var failure: scala.Double
  
  var inProgress: scala.Double
  
  var partiallySucceeded: scala.Double
  
  var pending: scala.Double
  
  var skipped: scala.Double
  
  var succeeded: scala.Double
  
  var success: scala.Double
  
  var unknown: scala.Double
}
object Failure {
  
  inline def apply(
    canceled: scala.Double,
    failed: scala.Double,
    failure: scala.Double,
    inProgress: scala.Double,
    partiallySucceeded: scala.Double,
    pending: scala.Double,
    skipped: scala.Double,
    succeeded: scala.Double,
    success: scala.Double,
    unknown: scala.Double
  ): Failure = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failure]
  }
  
  extension [Self <: Failure](x: Self) {
    
    inline def setCanceled(value: scala.Double): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: scala.Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailure(value: scala.Double): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    inline def setInProgress(value: scala.Double): Self = StObject.set(x, "inProgress", value.asInstanceOf[js.Any])
    
    inline def setPartiallySucceeded(value: scala.Double): Self = StObject.set(x, "partiallySucceeded", value.asInstanceOf[js.Any])
    
    inline def setPending(value: scala.Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setSkipped(value: scala.Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: scala.Double): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: scala.Double): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
  }
}
